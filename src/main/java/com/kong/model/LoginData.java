package com.kong.model;

import com.github.io.protocol.annotation.*;
import com.github.io.protocol.annotation.Number;

import java.util.Arrays;

/**
 * @Title: LoginData.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: 车辆登入
 * @author: chenz
 * @date: 2017年11月27日 下午3:26:14
 * @version: V1.0
 */
public class LoginData {
	/**
	 * 包头
	 */
	@Element
	private Header header = new Header();
	/**
	 * 数据采集时间
	 */
	@DateTime
	private long gatherTime;
	/**
	 * 登入流水号<br>
	 * <p>
	 * 车载终端每登入一次，登入流水号自动加1，从1开始循环累加，最大值为65531，循环周期为天。
	 */
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int serialNumber;
	/**
	 * 加密秘钥<br>
	 * <p>
	 * 128位的密钥，用于对称加密。SecurityKey
	 */
	@Number(width = 8, length = "16")
	private int[] securityKey;
	/**
	 * 软件版本号
	 */
	@AsciiString(length = "20")
	private String softwareVersion;
	/**
	 * 车辆识别码是识别的唯一标识，由17位字码构成。
	 */
	@AsciiString(length = "17")
	private String vin;
	/**
	 * 可充电储能子系统数<br>
	 * <p>
	 * 预留，可充电储能子系统数n，有效值范围：0~250
	 */
	@Number(width = 8)
	private int electricalCount;
	/**
	 * 可充电储能系统编码长度<br>
	 * <p>
	 * 预留，可充电储能系统编码长度m，有效范围：0~50，“0”表示不上传该编码
	 */
	@Number(width = 8)
	private int electricalLenth;
	/**
	 * 可充电储能系统编码<br>
	 * <p>
	 * 预留，可充电储能系统编码宜为终端从车辆获取的值
	 */
	@AsciiString(length = "getLength")
	private String electricalSysCode;

	/**
	 * 包尾
	 */
	@Element
	private Tail tail = new Tail();

	/**
	 * 获取可充电系统编码长度
	 * 
	 * @return
	 */
	public int getLength() {
		return electricalCount * electricalLenth;
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

	public int[] getSecurityKey() {
		return securityKey;
	}

	public void setSecurityKey(int[] securityKey) {
		this.securityKey = securityKey;
	}

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public int getElectricalCount() {
		return electricalCount;
	}

	public void setElectricalCount(int electricalCount) {
		this.electricalCount = electricalCount;
	}

	public int getElectricalLenth() {
		return electricalLenth;
	}

	public void setElectricalLenth(int electricalLenth) {
		this.electricalLenth = electricalLenth;
	}

	public String getElectricalSysCode() {
		return electricalSysCode;
	}

	public void setElectricalSysCode(String electricalSysCode) {
		this.electricalSysCode = electricalSysCode;
	}

	public Tail getTail() {
		return tail;
	}

	public void setTail(Tail tail) {
		this.tail = tail;
	}

	@Override
	public String toString() {
		return "LoginData [header=" + header + ", gatherTime=" + gatherTime + ", serialNumber=" + serialNumber
				+ ", securityKey=" + Arrays.toString(securityKey) + ", softwareVersion=" + softwareVersion + ", vin="
				+ vin + ", electricalCount=" + electricalCount + ", electricalLenth=" + electricalLenth
				+ ", electricalSysCode=" + electricalSysCode + ", tail=" + tail + "]";
	}

}
