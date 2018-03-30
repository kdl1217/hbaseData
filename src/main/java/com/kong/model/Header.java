package com.kong.model;

import com.github.io.protocol.annotation.AsciiString;
import com.github.io.protocol.annotation.ByteOrder;
import com.github.io.protocol.annotation.Number;

/**
 * @Title: Header.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: 包头
 * @author: chenz
 * @date: 2017年11月24日 下午4:03:16
 * @version: V1.0
 */
public class Header {
	/**
	 * 起始符 固定为ASCII字符‘##’，用“0x23,0x23”表示
	 */
	@Number(width = 16)
	private int startFiled = 0x2323;

	/**
	 * 车辆类型标识 0x01燃油车 ；0x02 新能源车
	 */
	@Number(width = 8)
	private int carFlag;

	/**
	 * 车型 0x01 ZC；0xRE NS；0x03 NS
	 */
	@Number(width = 8)
	private int carType;

	/**
	 * 命令标识
	 */
	@Number(width = 8)
	private int cmdFlag;

	/**
	 * 应答标志
	 */
	@Number(width = 8)
	private int responeFlag;

	/**
	 * IMEI TBOX硬件的IMEI号码
	 */
	@AsciiString(length = "15")
	private String imei;

	/**
	 * 0x00：数据不加密；0x01：数据经过RSA算法加密；0x02：数据经过AES加密算法加密，0xFF：无效数据；其他预留
	 */
	@Number(width = 8)
	private int encryptType;

	/**
	 * 数据单元长度 数据单元长度是数据单元的总字节数，有效值范围：0～65534
	 */
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int length = 0;

	/**
	 * 默认构造器
	 */
	public Header() {
	}

	@Override
	public String toString() {
		return "Header [startFiled=" + startFiled + ", carFlag=" + carFlag + ", carType=" + carType + ", cmdFlag="
				+ cmdFlag + ", responeFlag=" + responeFlag + ", imei=" + imei + ", encryptType=" + encryptType
				+ ", length=" + length + "]";
	}

	public int getStartFiled() {
		return startFiled;
	}

	public void setStartFiled(int startFiled) {
		this.startFiled = startFiled;
	}

	public int getCarFlag() {
		return carFlag;
	}

	public void setCarFlag(int carFlag) {
		this.carFlag = carFlag;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public int getCmdFlag() {
		return cmdFlag;
	}

	public void setCmdFlag(int cmdFlag) {
		this.cmdFlag = cmdFlag;
	}

	public int getResponeFlag() {
		return responeFlag;
	}

	public void setResponeFlag(int responeFlag) {
		this.responeFlag = responeFlag;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public int getEncryptType() {
		return encryptType;
	}

	public void setEncryptType(int encryptType) {
		this.encryptType = encryptType;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
