package com.kong.model;

import com.github.io.protocol.annotation.Element;
import com.github.io.protocol.annotation.Number;

import java.util.Arrays;

/**
 * @Title: GmmcPakcage.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: 报文包体结构
 * @author: chenz
 * @date: 2018年1月11日 下午5:01:54
 * @version: V1.0
 */
public class GmmcPackage {
	/**
	 * 包头
	 */
	@Element
	private Header header;
	/**
	 * 包体
	 */
	@Number(width = 8, length = "getBodyBufferLength")
	private int[] bodyBuffer;
	/**
	 * 包尾
	 */
	@Element
	private Tail tail;

	@Override
	public String toString() {
		return "GmmcPakcage [header=" + header + ", bodyBuffer=" + Arrays.toString(bodyBuffer) + ", tail=" + tail + "]";
	}

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
