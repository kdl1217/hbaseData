package com.kong.model;

import com.github.io.protocol.annotation.DateTime;
import com.github.io.protocol.annotation.Element;
import com.github.io.protocol.annotation.Number;

/**
 * @Title: DownlinkControlAirData.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: 下行控制(空调系统自动模式控制)
 * @author: chenz
 * @date: 2018年1月16日 上午9:56:04
 * @version: V1.0
 */
public class DownlinkControlAirMoreData {
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
	 * 控制指令数量
	 */
	@Number(width = 8)
	private int cmdNumber;

	/**
	 * 指令ID
	 */
	@Number(width = 8)
	private int cmdId;

	/**
	 * 指令参数长度
	 */
	@Number(width = 8)
	private int cmdLength;

	/**
	 * 指令参数-空调制热控制：1 开启 2关闭
	 */
	@Number(width = 8)
	private int cmdMode;

	/**
	 * 时间设定
	 */
	@Number(width = 32)
	private int timeSetting;
	/**
	 * 温度设定
	 */
	@Number(width = 8)
	private int temSetting;

	/**
	 * 包尾
	 */
	@Element
	private Tail tail;

	@Override
	public String toString() {
		return "DownlinkControlAirMoreData [header=" + header + ", gatherTime=" + gatherTime + ", serialNumber="
				+ serialNumber + ", cmdNumber=" + cmdNumber + ", cmdId=" + cmdId + ", cmdLength=" + cmdLength
				+ ", cmdMode=" + cmdMode + ", timeSetting=" + timeSetting + ", temSetting=" + temSetting + ", tail="
				+ tail + "]";
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

	public int getCmdMode() {
		return cmdMode;
	}

	public void setCmdMode(int cmdMode) {
		this.cmdMode = cmdMode;
	}

	public int getTimeSetting() {
		return timeSetting;
	}

	public void setTimeSetting(int timeSetting) {
		this.timeSetting = timeSetting;
	}

	public int getTemSetting() {
		return temSetting;
	}

	public void setTemSetting(int temSetting) {
		this.temSetting = temSetting;
	}

	public Tail getTail() {
		return tail;
	}

	public void setTail(Tail tail) {
		this.tail = tail;
	}

}
