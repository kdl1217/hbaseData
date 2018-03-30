package com.kong.model;

import com.github.io.protocol.annotation.DateTime;
import com.github.io.protocol.annotation.Element;

/**
 * @Title: ElectricalCheckData.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: 电检
 * @author: chenz
 * @date: 2017年11月27日 下午2:57:56
 * @version: V1.0
 */
public class ElectricalCheckData {
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

	public Long getGatherTime() {
		return gatherTime;
	}

	public void setGatherTime(Long gatherTime) {
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
		return "ElectricalCheckData [header=" + header + ", gatherTime=" + gatherTime + ", tail=" + tail + "]";
	}

}
