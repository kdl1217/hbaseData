package com.kong.model;

import com.github.io.protocol.annotation.Number;

/**
 * @Title: Tail.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: 包尾
 * @author: chenz
 * @date: 2017年11月24日 下午4:02:50
 * @version: V1.0
 */
public class Tail {
	/**
	 * 校验码 采用BCC（异或校验）法，校验范围从命令单元的第一个字节开始，同后一字节异或，直到校验码前一字节为止，校验码占用一个字节
	 */
	@Number(width = 8)
	private int check = 0;

	@Override
	public String toString() {
		return "Tail [check=" + check + "]";
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

}
