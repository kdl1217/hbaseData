package com.kong.model;

import com.github.io.protocol.annotation.DateTime;
import com.github.io.protocol.annotation.Element;
import com.github.io.protocol.annotation.Number;

/**
 * @Title: DownlinkControlData.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: 下行控制(远程门锁上/解锁，远程后备箱解锁，远程寻车，左前车窗控制，右前车窗控制，车辆动力通断控制，小灯控制，车机唤醒)
 * @author: chenz
 * @date: 2018年1月16日 上午9:56:04
 * @version: V1.0
 */
public class DownlinkControlData {
	/**
	 * 包头
	 */
	@Element
	private Header header;
	/**
	 * 报文时间
	 */
	@DateTime
	private long gatherTime;
	/**
	 * 流水号
	 */
	@Number(width = 16)
	private int serialNumber;
	/**
	 * 指令数量
	 */
	@Number(width = 8)
	private int cmdNumber;

	/**
	 * 指令ID
	 */
	@Number(width = 8)
	private int cmdId;

	/**
	 * 指令长度
	 */
	@Number(width = 8)
	private int cmdLength;

	/**
	 * 指令参数
	 */
	@Number(width = 8)
	private int cmdContent;

	/**
	 * 包尾
	 */
	@Element
	private Tail tail;

	@Override
	public String toString() {
		return "DownlinkControlData [header=" + header + ", gatherTime=" + gatherTime + ", serialNumber=" + serialNumber
				+ ", cmdNumber=" + cmdNumber + ", cmdId=" + cmdId + ", cmdLength=" + cmdLength + ", cmdContent="
				+ cmdContent + ", tail=" + tail + "]";
	}

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

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getCmdNumber() {
		return cmdNumber;
	}

	public void setCmdNumber(int cmdNumber) {
		this.cmdNumber = cmdNumber;
	}

	public int getCmdId() {
		return cmdId;
	}

	public void setCmdId(int cmdId) {
		this.cmdId = cmdId;
	}

	public int getCmdLength() {
		return cmdLength;
	}

	public void setCmdLength(int cmdLength) {
		this.cmdLength = cmdLength;
	}

	public int getCmdContent() {
		return cmdContent;
	}

	public void setCmdContent(int cmdContent) {
		this.cmdContent = cmdContent;
	}

	public Tail getTail() {
		return tail;
	}

	public void setTail(Tail tail) {
		this.tail = tail;
	}

}
