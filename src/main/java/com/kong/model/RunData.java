package com.kong.model;

import com.github.io.protocol.annotation.DateTime;
import com.github.io.protocol.annotation.Element;
import com.github.io.protocol.annotation.Number;

/**
 * @Title: RunData.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: 车辆运行数据
 * @author: chenz
 * @date: 2017年12月1日 上午9:42:00
 * @version: V1.0
 */
public class
RunData {
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
	 * 数据单元
	 */
	@Number(width = 8, length = "getBodyBufferLength")
	private int[] bodyBuffer;
	/**
	 * 包尾
	 */
	@Element
	private Tail tail;

	/**
	 * 获取数据单元长度
	 * 
	 * @return 数据单元长度-采集日期长度(6)
	 */
	public int getBodyBufferLength() {
		int length = header.getLength() - 6;
		return length;
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

	public int[] getBodyBuffer() {
		return bodyBuffer;
	}

	public void setBodyBuffer(int[] bodyBuffer) {
		this.bodyBuffer = bodyBuffer;
	}

	public Tail getTail() {
		return tail;
	}

	public void setTail(Tail tail) {
		this.tail = tail;
	}

}
