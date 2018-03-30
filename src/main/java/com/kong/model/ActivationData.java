package com.kong.model;

import com.github.io.protocol.annotation.AsciiString;
import com.github.io.protocol.annotation.DateTime;
import com.github.io.protocol.annotation.Element;

/**
 * @Title: ActivationData.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: tbox激活/publicKey重置
 * @author: chenz
 * @date: 2017年11月27日 下午3:13:17
 * @version: V1.0
 */
public class ActivationData {
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
//	/**
//	 * 公钥长度<br>
//	 * TBox公钥长度。范围（0-255）
//	 */
//	@Number(width = 16, order = ByteOrder.BigEndian)
//	private int publicKeyLength;
//	/**
//	 * 公钥<br>
//	 * TBox公钥,长度为公钥长度定义的长度
//	 */
//	@Number(width = 8, length = "getKeyLength")
//	private int[] publicKey;
	/**
	 * vin<br>
	 * 车辆识别码是识别的唯一标识，由17位字码构成
	 */
	@AsciiString(length = "17")
	private String vin;

//	public int getKeyLength() {
//		return publicKeyLength;
//	}

	/**
	 * 包尾
	 */
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

//	public int getPublicKeyLength() {
//		return publicKeyLength;
//	}
//
//	public void setPublicKeyLength(int publicKeyLength) {
//		this.publicKeyLength = publicKeyLength;
//	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public Tail getTail() {
		return tail;
	}

	public void setTail(Tail tail) {
		this.tail = tail;
	}

	@Override
	public String toString() {
		return "ActivationData{" +
				"header=" + header +
				", gatherTime=" + gatherTime +
				", vin='" + vin + '\'' +
				", tail=" + tail +
				'}';
	}
}
