package com.kong.model;

import com.github.io.protocol.annotation.DateTime;
import com.github.io.protocol.annotation.Element;

/**
 * @Title: CommonRespData.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: 通用应答
 * @author: chenz
 * @date: 2017年11月27日 下午2:56:36
 * @version: V1.0
 */
public class CommonRespData {
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
	 * 包尾
	 */
	@Element
	private Tail tail;

	public long getGatherTime() {
		return gatherTime;
	}

	public void setGatherTime(long gatherTime) {
		this.gatherTime = gatherTime;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Tail getTail() {
		return tail;
	}

	public void setTail(Tail tail) {
		this.tail = tail;
	}

	@Override
	public String toString() {
		return "CommonRespData [header=" + header + ", gatherTime=" + gatherTime + ", tail=" + tail + "]";
	}

}
