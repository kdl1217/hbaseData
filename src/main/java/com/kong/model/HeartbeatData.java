package com.kong.model;

import com.github.io.protocol.annotation.Element;

/**
 * @Title: HeartbeatData.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: 心跳包
 * @author: chenz
 * @date: 2017年11月30日 下午2:50:36
 * @version: V1.0
 */
public class HeartbeatData {
	@Element
	private Header header;
	@Element
	private Tail tail;

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
		return "HeartbeatData [header=" + header + ", tail=" + tail + "]";
	}

}
