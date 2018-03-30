package com.kong.model;

import com.github.io.protocol.annotation.*;
import com.github.io.protocol.annotation.Number;

/**
 * @Title: TripData.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: 车辆行程数据
 * @author: chenz
 * @date: 2017年11月27日 上午10:05:45
 * @version: V1.0
 */
public class TripData {
	/**
	 * 包头
	 */
	@Element
	private Header header = new Header();
	/**
	 * 行程开始时间
	 */
	@DateTime
	private long startTime;
	/**
	 * 行程结束时间
	 */
	@DateTime
	private long endTime;
	/**
	 * 平均油耗<br>
	 * 有效值范围： 0～1000，（数值偏移量n/10，表示
	 * 0～100升/百公里），最小计量单元：0.1升/百公里，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
	 */
	@Decimal(width = 16, order = ByteOrder.BigEndian, scale = 0.1)
	private float oilWearAvg;

	/**
	 * 平均车速<br>
	 * 有效值范围：0～2200（表示0 km/h～220
	 * km/h），最小计量单元：0.1km/h，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。<br>
	 */
	@Decimal(width = 16, order = ByteOrder.BigEndian, scale = 0.1)
	private float speedAvg;
	/**
	 * 最高车速<br>
	 * 有效值范围：0～2200（表示0 km/h～220
	 * km/h），最小计量单元：0.1km/h，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。<br>
	 */
	@Decimal(width = 16, order = ByteOrder.BigEndian, scale = 0.1)
	private float speedMax;
	/**
	 * 行程时长<br>
	 * 有效值范围： 0～500000单位：分钟，“0xFE”表示异常，“0xFF”表示无效。
	 */
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int tripDuration;
	/**
	 * 行程行驶里程<br>
	 * 有效值范围： 0～100000单位：公里，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效
	 */
	@Decimal(width = 32, order = ByteOrder.BigEndian, scale = 0.1)
	private float mileage;
	/**
	 * 急加速次数<br>
	 * 有效值范围： 0～255单位：次，“0xFE”表示异常，“0xFF”表示无效。
	 */
	@Number(width = 8)
	private int rapidAccelerationTimes;
	/**
	 * 急减速次数<br>
	 * 有效值范围： 0～255单位：次，“0xFE”表示异常，“0xFF”表示无效。
	 */
	@Number(width = 8)
	private int rapidDecelerationTimes;
	/**
	 * 急转弯次数<br>
	 * 有效值范围： 0～255单位：次，“0xFE”表示异常，“0xFF”表示无效。
	 */
	@Number(width = 8)
	private int sharpTurnTimes;

	/**
	 * 包尾
	 */
	@Element
	private Tail tail = new Tail();

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public float getOilWearAvg() {
		return oilWearAvg;
	}

	public void setOilWearAvg(float oilWearAvg) {
		this.oilWearAvg = oilWearAvg;
	}

	public float getSpeedAvg() {
		return speedAvg;
	}

	public void setSpeedAvg(float speedAvg) {
		this.speedAvg = speedAvg;
	}

	public float getSpeedMax() {
		return speedMax;
	}

	public void setSpeedMax(float speedMax) {
		this.speedMax = speedMax;
	}

	public int getTripDuration() {
		return tripDuration;
	}

	public void setTripDuration(int tripDuration) {
		this.tripDuration = tripDuration;
	}

	public float getMileage() {
		return mileage;
	}

	public void setMileage(float mileage) {
		this.mileage = mileage;
	}

	public int getRapidAccelerationTimes() {
		return rapidAccelerationTimes;
	}

	public void setRapidAccelerationTimes(int rapidAccelerationTimes) {
		this.rapidAccelerationTimes = rapidAccelerationTimes;
	}

	public int getRapidDecelerationTimes() {
		return rapidDecelerationTimes;
	}

	public void setRapidDecelerationTimes(int rapidDecelerationTimes) {
		this.rapidDecelerationTimes = rapidDecelerationTimes;
	}

	public int getSharpTurnTimes() {
		return sharpTurnTimes;
	}

	public void setSharpTurnTimes(int sharpTurnTimes) {
		this.sharpTurnTimes = sharpTurnTimes;
	}

	public Tail getTail() {
		return tail;
	}

	public void setTail(Tail tail) {
		this.tail = tail;
	}

	@Override
	public String toString() {
		return "TripData [header=" + header + ", startTime=" + startTime + ", endTime=" + endTime + ", oilWearAvg="
				+ oilWearAvg + ", speedAvg=" + speedAvg + ", speedMax=" + speedMax + ", tripDuration=" + tripDuration
				+ ", mileage=" + mileage + ", rapidAccelerationTimes=" + rapidAccelerationTimes
				+ ", rapidDecelerationTimes=" + rapidDecelerationTimes + ", sharpTurnTimes=" + sharpTurnTimes
				+ ", tail=" + tail + "]";
	}

//	public static void main(String[] args) throws Exception {
//		ProtocolEngine engine = new ProtocolEngine();
//		TripData data = new TripData();
//		data.setEndTime(1495550807000L);
//		data.setStartTime(1495550807000L);
//
//		Date date = new Date(1495550807000l);
//		Instant timestamp = date.toInstant();
//		LocalDateTime time = LocalDateTime.ofInstant(timestamp, ZoneId.of(ZoneId.SHORT_IDS.get("PST")));
//		System.out.println(time.getYear());
//		System.out.println(time.getMonth().getValue());
//		System.out.println(time.getDayOfMonth());
//		System.out.println(time.getHour());
//		System.out.println(time.getMinute());
//		System.out.println(time.getSecond());
//
//		System.out.println(HexStringUtil.toHexString(engine.encode(data)));
//	}

}
