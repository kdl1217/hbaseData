package com.kong.socket;

import com.kong.calc.PackDataGenerateBatch;
import com.kong.util.HexEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SHTcpClient {
    private Logger logger = LoggerFactory.getLogger("[SHTcpClient]");

    private static String serverAddr = "10.0.11.26";
    Integer serverPort = 31234;

    private Socket mSocket = null;
    private InputStream mSocketIn;
    private OutputStream mSocketOut;

    public SHTcpClient start() throws Exception {
        initConnection();

        new ReaderTask().start();
        new SenderTask().start();
        return this;
    }


    /**
     * 连接套接字
     * @throws Exception
     */
    public void initConnection() throws Exception {
        if(mSocket != null)
            mSocket.close();
        mSocket = new Socket(serverAddr, serverPort);
        mSocketIn = mSocket.getInputStream();
        mSocketOut = mSocket.getOutputStream();
    }
    /**
     * 向套接字发送消息
     */
    public void sendMessage(byte[] buf) throws Exception {
       if(mSocket.isConnected()) {
           mSocketOut.write(buf);
           mSocketOut.flush();
       }
    }

    /**
     * 阻塞读取tcp消息
     * @return
     * @throws IOException
     */
    public byte[] readMessage() throws Exception {
        int bytesRcvd = 1024;
        byte[] recData = new byte[1024];
        bytesRcvd = mSocketIn.read(recData);
        if (bytesRcvd == -1) {
            throw new SocketException("Connection closed prematurely");
        }

        byte[] buffer = new byte[bytesRcvd];
        System.arraycopy(recData, 0, buffer, 0, bytesRcvd);
        return buffer;
    }

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     *
     * @param msg
     */
    public void log(String msg) {
//        logger.info(msg);
        String template = "[%s][%s]";
        System.out.println(String.format(template, sdf.format(new Date()), msg));
    }

    public class ReaderTask extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    byte[] buffer = readMessage();
                    logger.info("<--:{}" , HexEncoder.encode(buffer));
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }

    public class SenderTask extends Thread {
        @Override
        public void run() {
            PackDataGenerateBatch pack = new PackDataGenerateBatch() ;
            int num = 0 ;
            while (true) {
                try {
                    String buffer = "" ;
                    if (num%26==0){
                        buffer = pack.login();
                    }else if (num%26 != 0 && num %26 != 25){
                        buffer = pack.generateRunData() ;
                    }else if (num %26 == 25){
                        buffer = pack.generateLogOut() ;
                    }
                    System.out.println(buffer);
                    buffer = buffer.replaceAll(" ", "");
                    byte[] buf = HexEncoder.decode(buffer);
                    sendMessage(buf);
                    Thread.sleep(10000);
                    num ++ ;
//                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }

//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//        // create socket that is connected to server on specified port
//        new SHTcpClient().start();
//	}
}
