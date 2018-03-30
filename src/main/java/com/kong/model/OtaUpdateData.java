package com.kong.model;

import com.github.io.protocol.annotation.*;
import com.github.io.protocol.annotation.Number;

/**
 * @Title: OtaUpdateData.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: ota升级/ota升级完成
 * @author: chenz
 * @date: 2017年11月27日 下午4:09:30
 * @version: V1.0
 */
public class OtaUpdateData {
	@Element
	private Header header;

	/**
	 * 数据采集时间
	 */
	@DateTime
	private long gatherTime;

	/**
	 * 软件版本长度
	 */
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int softwareVersionLength;
	/**
	 * 当前软件版本
	 */
	@AsciiString(length = "getLength1")
	private String softwareVersion;

	/**
	 * 文件名长度
	 */
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int updatePackageNameLength;
	/**
	 * 升级包文件名
	 */
	@AsciiString(length = "getLength2")
	private String updatePackageName;

	/**
	 * URL长度
	 */
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int urlLength;
	/**
	 * 下载链接URL
	 */
	@AsciiString(length = "getLength3")
	private String url;

	@Element
	private Tail tail;

	public int getLength1() {
		return getSoftwareVersionLength();
	}

	public int getLength2() {
		return getUpdatePackageNameLength();
	}

	public int getLength3() {
		return urlLength;
	}

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
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

	public Tail getTail() {
		return tail;
	}

	public void setTail(Tail tail) {
		this.tail = tail;
	}

	public String getUpdatePackageName() {
		return updatePackageName;
	}

	public void setUpdatePackageName(String updatePackageName) {
		this.updatePackageName = updatePackageName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSoftwareVersionLength() {
		return softwareVersionLength;
	}

	public void setSoftwareVersionLength(int softwareVersionLength) {
		this.softwareVersionLength = softwareVersionLength;
	}

	public int getUpdatePackageNameLength() {
		return updatePackageNameLength;
	}

	public void setUpdatePackageNameLength(int updatePackageNameLength) {
		this.updatePackageNameLength = updatePackageNameLength;
	}

	public int getUrlLength() {
		return urlLength;
	}

	public void setUrlLength(int urlLength) {
		this.urlLength = urlLength;
	}

	@Override
	public String toString() {
		return "OtaUpdateData [header=" + header + ", gatherTime=" + gatherTime + ", softwareVersionLength="
				+ softwareVersionLength + ", softwareVersion=" + softwareVersion + ", updatePackageNameLength="
				+ updatePackageNameLength + ", updatePackageName=" + updatePackageName + ", urlLength=" + urlLength
				+ ", url=" + url + ", tail=" + tail + "]";
	}

}
