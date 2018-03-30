package com.kong.model;

import com.github.io.protocol.annotation.ByteOrder;
import com.github.io.protocol.annotation.DateTime;
import com.github.io.protocol.annotation.Element;
import com.github.io.protocol.annotation.Number;

import java.util.Arrays;

/**
 * 激活成功应答
 * Created by Kong on 2018/2/26.
 */
public class ActivationRespData {
    /**
     * 包头
     */
    @Element
    private Header header;
    /**
     * 数据采集时间
     */
    @DateTime
    private long gatherTime;

    /**
     * RSA公钥{e,n}中的 e
     *
     * @return
     */
    @Number(width = 32,order = ByteOrder.BigEndian)
    private long publicKeyExponent;

    /**
     * RSA公钥{e,n}中的 n, 128位bytes
     *
     * @return
     */
    @Number(width = 8,length = "128")
    private int[] publicKeyModulusBytes;

    @Element
    private Tail tail;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public long getGatherTime() {
        return gatherTime;
    }

    public void setGatherTime(long gatherTime) {
        this.gatherTime = gatherTime;
    }

    public long getPublicKeyExponent() {
        return publicKeyExponent;
    }

    public void setPublicKeyExponent(long publicKeyExponent) {
        this.publicKeyExponent = publicKeyExponent;
    }

    public int[] getPublicKeyModulusBytes() {
        return publicKeyModulusBytes;
    }

    public void setPublicKeyModulusBytes(int[] publicKeyModulusBytes) {
        this.publicKeyModulusBytes = publicKeyModulusBytes;
    }

    public Tail getTail() {
        return tail;
    }

    public void setTail(Tail tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "ActivationRespData{" +
                "header=" + header +
                ", gatherTime=" + gatherTime +
                ", publicKeyExponent=" + publicKeyExponent +
                ", publicKeyModulusBytes=" + Arrays.toString(publicKeyModulusBytes) +
                ", tail=" + tail +
                '}';
    }
}
