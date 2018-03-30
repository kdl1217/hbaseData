package com.kong.model;

import com.github.io.protocol.annotation.AsciiString;
import com.github.io.protocol.annotation.DateTime;
import com.github.io.protocol.annotation.Element;

/**
 * @Title: OtaUpdateResp.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: ota升级反馈
 * @author: chenz
 * @date: 2018年1月9日 下午3:02:54
 * @version: V1.0
 */
public class OtaUpdateResp {

	@Element
	private Header header;

	/**
	 * 数据采集时间
	 */
	@DateTime
	private long gatherTime;
	/**
	 * TBOX当前版本号
	 */
	@AsciiString(length = "10")
	private String softwareVersion;

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

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion ;
	}

	public Tail getTail() {
		return tail;
	}

	public void setTail(Tail tail) {
		this.tail = tail;
	}

	@Override
	public String toString() {
		return "OtaUpdateResp{" +
				"header=" + header +
				", gatherTime=" + gatherTime +
				", softwareVersion='" + softwareVersion + '\'' +
				", tail=" + tail +
				'}';
	}
}
