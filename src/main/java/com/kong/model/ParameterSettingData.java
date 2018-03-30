package com.kong.model;

import com.github.io.protocol.annotation.*;
import com.github.io.protocol.annotation.Number;

/**
 * @Title: ParamSettingData.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: 参数设置
 * @author: chenz
 * @date: 2017年11月27日 下午3:55:59
 * @version: V1.0
 */
public class ParameterSettingData {
	@Element
	private Header header;
	/**
	 * 报文时间
	 */
	@DateTime
	private long gatherTime;
	/**
	 * 参数版本 0～60000 整型
	 */
	@Number(width = 8)
	private int pid2 = 0x02;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int version;
	/**
	 * 车载终端本地存储时间周期
	 */
	@Number(width = 8)
	private int pid3 = 0x03;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int tboxSaveCycle;
	/**
	 * 正常时，CAN信息上报时间周期
	 */
	@Number(width = 8)
	private int pid4 = 0x04;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int canUpDataCycle;
	/**
	 * 出现报警时，CAN信息上报时间周期
	 */
	@Number(width = 8)
	private int pid5 = 0x05;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int canErrorDataCycle;
	/**
	 * 远程服务与管理平台域名或ip地址长度m
	 */
	@Number(width = 8)
	private int pid6 = 0x06;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int ipLength;
	/**
	 * 远程服务与管理平台域名或ip地址
	 */
	@Number(width = 8)
	private int pid7 = 0x07;
	@AsciiString(length = "getIpLength")
	private String ip;
	/**
	 * 远程服务与管理平台端口
	 */
	@Number(width = 8)
	private int pid8 = 0x08;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int port;
	/**
	 * 车载终端心跳发送周期
	 */
	@Number(width = 8)
	private int pid9 = 0x09;
	@Number(width = 8, order = ByteOrder.BigEndian)
	private int heartBeatCycle;
	/**
	 * 终端应答超时时间
	 */
	@Number(width = 8)
	private int pid10 = 0x0a;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int tboxResp;
	/**
	 * 平台应答超时时间
	 */
	@Number(width = 8)
	private int pid11 = 0x0b;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int platTimeout;
	/**
	 * 连续三次登入失败后，到下一次登入的间隔时间
	 */
	@Number(width = 8)
	private int pid12 = 0x0c;
	@Number(width = 8)
	private int threeErrPeriod;
	/**
	 * 政府平台域名长度p
	 */
	@Number(width = 8)
	private int pid13 = 0x0d;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int govHostnameLength;
	/**
	 * 政府平台域名
	 */
	@Number(width = 8)
	private int pid14 = 0x0e;
	@AsciiString(length = "getGovHostnameLength")
	private String govHostname;
	/**
	 * 政府平台端口
	 */
	@Number(width = 8)
	private int pid15 = 0x0f;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int govPort;
	/**
	 * 否处于抽样监测中“0x01”表示是，“0x02”表示否，“0xFE”表示异常，“0xFF”表示无效
	 */
	@Number(width = 8)
	private int pid16 = 0x10;
	@Number(width = 8)
	private int sample;
	/**
	 * 延时工作模式下，心跳发送周期
	 */
	@Number(width = 8)
	private int pid17 = 0x82;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int canDelay;
	/**
	 * 休眠时，定位信息上报时间周期
	 */
	@Number(width = 8)
	private int pid18 = 0x83;
	@Number(width = 8)
	private int heartbeatDelay;
	/**
	 * 休眠时，定位信息上报时间周期
	 */
	@Number(width = 8)
	private int pid19 = 0x84;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int sleepUpDataCycle;
	/**
	 * 充电时，CAN信息上报时间周期
	 */
	@Number(width = 8)
	private int pid20 = 0x85;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int chargeUpDataCycle;
	/**
	 * 延时时间
	 */
	@Number(width = 8)
	private int pid21 = 0x86;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int delay;
	/**
	 * 正常时，定位信息上报时间周期，
	 */
	@Number(width = 8)
	private int pid22 = 0x87;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int gpsUpCycle;
	/**
	 * 出现报警时，定位信息上报时间周期
	 */
	@Number(width = 8)
	private int pid23 = 0x88;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int alarmGpsCycle;
	/**
	 * 延时工作模式下，定位信息上报时间周期
	 */
	@Number(width = 8)
	private int pid24 = 0x89;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int delayGpsCycle;
	/**
	 * 充电时，定位信息上报时间周期
	 */
	@Number(width = 8)
	private int pid25 = 0x8a;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int chargeGpsCycle;
	/**
	 * 超速报警阀值
	 */
	@Number(width = 8)
	private int pid26 = 0x8b;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int overspeed;
	/**
	 * 租赁平台域名或IP长度
	 */
	@Number(width = 8)
	private int pid27 = 0x8c;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int rentIplength;
	/**
	 * 租赁平台域名或IP
	 */
	@Number(width = 8)
	private int pid28 = 0x8d;
	@AsciiString(length = "getRentIplength")
	private String rentIp;
	/**
	 * 租赁平台端口
	 */
	@Number(width = 8)
	private int pid29 = 0x8e;
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int rentPort;
	/**
	 * APN，1移动CMNET，2联通UNINET 3 电信
	 */
	@Number(width = 8)
	private int pid30 = 0x8f;
	@Number(width = 8)
	private int apn;
	/**
	 * PublicKey更新周期
	 */
	@Number(width = 8)
	private int pid31 = 0x99;
	@Number(width = 8)
	private int publicKeyUpdateCycle;

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

	public int getPid2() {
		return pid2;
	}

	public void setPid2(int pid2) {
		this.pid2 = pid2;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getPid3() {
		return pid3;
	}

	public void setPid3(int pid3) {
		this.pid3 = pid3;
	}

	public int getTboxSaveCycle() {
		return tboxSaveCycle;
	}

	public void setTboxSaveCycle(int tboxSaveCycle) {
		this.tboxSaveCycle = tboxSaveCycle;
	}

	public int getPid4() {
		return pid4;
	}

	public void setPid4(int pid4) {
		this.pid4 = pid4;
	}

	public int getCanUpDataCycle() {
		return canUpDataCycle;
	}

	public void setCanUpDataCycle(int canUpDataCycle) {
		this.canUpDataCycle = canUpDataCycle;
	}

	public int getPid5() {
		return pid5;
	}

	public void setPid5(int pid5) {
		this.pid5 = pid5;
	}

	public int getCanErrorDataCycle() {
		return canErrorDataCycle;
	}

	public void setCanErrorDataCycle(int canErrorDataCycle) {
		this.canErrorDataCycle = canErrorDataCycle;
	}

	public int getPid6() {
		return pid6;
	}

	public void setPid6(int pid6) {
		this.pid6 = pid6;
	}

	public int getIpLength() {
		return ipLength;
	}

	public void setIpLength(int ipLength) {
		this.ipLength = ipLength;
	}

	public int getPid7() {
		return pid7;
	}

	public void setPid7(int pid7) {
		this.pid7 = pid7;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPid8() {
		return pid8;
	}

	public void setPid8(int pid8) {
		this.pid8 = pid8;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getPid9() {
		return pid9;
	}

	public void setPid9(int pid9) {
		this.pid9 = pid9;
	}

	public int getHeartBeatCycle() {
		return heartBeatCycle;
	}

	public void setHeartBeatCycle(int heartBeatCycle) {
		this.heartBeatCycle = heartBeatCycle;
	}

	public int getPid10() {
		return pid10;
	}

	public void setPid10(int pid10) {
		this.pid10 = pid10;
	}

	public int getTboxResp() {
		return tboxResp;
	}

	public void setTboxResp(int tboxResp) {
		this.tboxResp = tboxResp;
	}

	public int getPid11() {
		return pid11;
	}

	public void setPid11(int pid11) {
		this.pid11 = pid11;
	}

	public int getPlatTimeout() {
		return platTimeout;
	}

	public void setPlatTimeout(int platTimeout) {
		this.platTimeout = platTimeout;
	}

	public int getPid12() {
		return pid12;
	}

	public void setPid12(int pid12) {
		this.pid12 = pid12;
	}

	public int getThreeErrPeriod() {
		return threeErrPeriod;
	}

	public void setThreeErrPeriod(int threeErrPeriod) {
		this.threeErrPeriod = threeErrPeriod;
	}

	public int getPid13() {
		return pid13;
	}

	public void setPid13(int pid13) {
		this.pid13 = pid13;
	}

	public int getGovHostnameLength() {
		return govHostnameLength;
	}

	public void setGovHostnameLength(int govHostnameLength) {
		this.govHostnameLength = govHostnameLength;
	}

	public int getPid14() {
		return pid14;
	}

	public void setPid14(int pid14) {
		this.pid14 = pid14;
	}

	public String getGovHostname() {
		return govHostname;
	}

	public void setGovHostname(String govHostname) {
		this.govHostname = govHostname;
	}

	public int getPid15() {
		return pid15;
	}

	public void setPid15(int pid15) {
		this.pid15 = pid15;
	}

	public int getGovPort() {
		return govPort;
	}

	public void setGovPort(int govPort) {
		this.govPort = govPort;
	}

	public int getPid16() {
		return pid16;
	}

	public void setPid16(int pid16) {
		this.pid16 = pid16;
	}

	public int getSample() {
		return sample;
	}

	public void setSample(int sample) {
		this.sample = sample;
	}

	public int getPid17() {
		return pid17;
	}

	public void setPid17(int pid17) {
		this.pid17 = pid17;
	}

	public int getCanDelay() {
		return canDelay;
	}

	public void setCanDelay(int canDelay) {
		this.canDelay = canDelay;
	}

	public int getPid18() {
		return pid18;
	}

	public void setPid18(int pid18) {
		this.pid18 = pid18;
	}

	public int getHeartbeatDelay() {
		return heartbeatDelay;
	}

	public void setHeartbeatDelay(int heartbeatDelay) {
		this.heartbeatDelay = heartbeatDelay;
	}

	public int getPid19() {
		return pid19;
	}

	public void setPid19(int pid19) {
		this.pid19 = pid19;
	}

	public int getSleepUpDataCycle() {
		return sleepUpDataCycle;
	}

	public void setSleepUpDataCycle(int sleepUpDataCycle) {
		this.sleepUpDataCycle = sleepUpDataCycle;
	}

	public int getPid20() {
		return pid20;
	}

	public void setPid20(int pid20) {
		this.pid20 = pid20;
	}

	public int getChargeUpDataCycle() {
		return chargeUpDataCycle;
	}

	public void setChargeUpDataCycle(int chargeUpDataCycle) {
		this.chargeUpDataCycle = chargeUpDataCycle;
	}

	public int getPid21() {
		return pid21;
	}

	public void setPid21(int pid21) {
		this.pid21 = pid21;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	public int getPid22() {
		return pid22;
	}

	public void setPid22(int pid22) {
		this.pid22 = pid22;
	}

	public int getGpsUpCycle() {
		return gpsUpCycle;
	}

	public void setGpsUpCycle(int gpsUpCycle) {
		this.gpsUpCycle = gpsUpCycle;
	}

	public int getPid23() {
		return pid23;
	}

	public void setPid23(int pid23) {
		this.pid23 = pid23;
	}

	public int getAlarmGpsCycle() {
		return alarmGpsCycle;
	}

	public void setAlarmGpsCycle(int alarmGpsCycle) {
		this.alarmGpsCycle = alarmGpsCycle;
	}

	public int getPid24() {
		return pid24;
	}

	public void setPid24(int pid24) {
		this.pid24 = pid24;
	}

	public int getDelayGpsCycle() {
		return delayGpsCycle;
	}

	public void setDelayGpsCycle(int delayGpsCycle) {
		this.delayGpsCycle = delayGpsCycle;
	}

	public int getPid25() {
		return pid25;
	}

	public void setPid25(int pid25) {
		this.pid25 = pid25;
	}

	public int getChargeGpsCycle() {
		return chargeGpsCycle;
	}

	public void setChargeGpsCycle(int chargeGpsCycle) {
		this.chargeGpsCycle = chargeGpsCycle;
	}

	public int getPid26() {
		return pid26;
	}

	public void setPid26(int pid26) {
		this.pid26 = pid26;
	}

	public int getOverspeed() {
		return overspeed;
	}

	public void setOverspeed(int overspeed) {
		this.overspeed = overspeed;
	}

	public int getPid27() {
		return pid27;
	}

	public void setPid27(int pid27) {
		this.pid27 = pid27;
	}

	public int getRentIplength() {
		return rentIplength;
	}

	public void setRentIplength(int rentIplength) {
		this.rentIplength = rentIplength;
	}

	public int getPid28() {
		return pid28;
	}

	public void setPid28(int pid28) {
		this.pid28 = pid28;
	}

	public String getRentIp() {
		return rentIp;
	}

	public void setRentIp(String rentIp) {
		this.rentIp = rentIp;
	}

	public int getPid29() {
		return pid29;
	}

	public void setPid29(int pid29) {
		this.pid29 = pid29;
	}

	public int getRentPort() {
		return rentPort;
	}

	public void setRentPort(int rentPort) {
		this.rentPort = rentPort;
	}

	public int getPid30() {
		return pid30;
	}

	public void setPid30(int pid30) {
		this.pid30 = pid30;
	}

	public int getApn() {
		return apn;
	}

	public void setApn(int apn) {
		this.apn = apn;
	}

	public int getPid31() {
		return pid31;
	}

	public void setPid31(int pid31) {
		this.pid31 = pid31;
	}

	public int getPublicKeyUpdateCycle() {
		return publicKeyUpdateCycle;
	}

	public void setPublicKeyUpdateCycle(int publicKeyUpdateCycle) {
		this.publicKeyUpdateCycle = publicKeyUpdateCycle;
	}

	public Tail getTail() {
		return tail;
	}

	public void setTail(Tail tail) {
		this.tail = tail;
	}

}
