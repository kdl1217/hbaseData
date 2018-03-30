package com.kong.model;

import com.github.io.protocol.annotation.ByteOrder;
import com.github.io.protocol.annotation.Decimal;
import com.github.io.protocol.annotation.Number;

/**
 * @Title: OverviewData.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: 整车数据
 * @author: chenz
 * @date: 2017年11月29日 下午2:38:35
 * @version: V1.0
 */
public class OverviewData {
	/**
	 * <i>车辆状态</i><br>
	 * <ul>
	 * <li>0x01-发动机点火时</li>
	 * <li>0x02-发动机运行中</li>
	 * <li>0x03-发动机熄火时</li>
	 * <li>0x04-发动机熄火后</li>
	 * <li>0x05-车辆不能检测</li>
	 * </ul>
	 */
	@Number(width = 8)
	private int carStatus;
	/**
	 * <i>充电状态</i><br>
	 * <ul>
	 * <li>0x01： 停车充电</li>
	 * <li>0x02： 行驶充电</li>
	 * <li>0x03： 未充电状态</li>
	 * <li>0x04： 充电完成</li>
	 * <li>0xFE：表示异常</li>
	 * <li>0xFF：表示无效</li>
	 * </ul>
	 */
	@Number(width = 8)
	private int chargeStatus;

	/**
	 * <i>运行模式</i><br>
	 * <ul>
	 * <li>0x01: 纯电</li>
	 * <li>0x02：混动</li>
	 * <li>0x03：燃油</li>
	 * <li>0xFE：表示异常</li>
	 * <li>0xFF：表示无效</li>
	 * <ul>
	 */
	@Number(width = 8)
	private Integer runStatus;

	/**
	 * 实时车速<br>
	 * 有效值范围： 0～2200（表示 0 km/h～220 km/h）<br>
	 * 最小计量单元：0.1km/h<br>
	 * 0xFF,0xFE表示异常<br>
	 * 0xFF,0xFF表示无效<br>
	 */
	@Decimal(width = 16, order = ByteOrder.BigEndian, scale = 0.1)
	private float vehicleSpeed;

	/**
	 * 累计行驶里程(km)
	 */
	@Decimal(width = 32, order = ByteOrder.BigEndian, scale = 0.1)
	private double mileage;

	/**
	 * 电压（V）
	 */
	@Decimal(width = 16, order = ByteOrder.BigEndian, scale = 0.1)
	private float voltage;

	/**
	 * 电流（A）
	 */
	@Decimal(width = 16, order = ByteOrder.BigEndian, scale = 0.1)
	private float current;

	/**
	 * SOC 有效值范围： 0～100（表示 0%～100%）<br>
	 * 最小计量单元： 1%<br>
	 * 0xFE 表示异常<br>
	 * 0xFF 表示无效<br>
	 */
	@Number(width = 8)
	private int soc;
	/**
	 * DC-DC 状态 0x01： 工作<br>
	 * 0x02： 断开<br>
	 * 0xFE表：示异常<br>
	 * 0xFF：表示无效<br>
	 */
	@Number(width = 8)
	private int dcdcStatus;
	/**
	 * <i>档位 bit0-bit3</i><br>
	 * <ul>
	 * <li>=0000 空档</li>
	 * <li>=0001 1 档</li>
	 * <li>=0010 2 档</li>
	 * <li>=0011 3 档</li>
	 * <li>=0100 4 档</li>
	 * <li>=0101 5 档</li>
	 * <li>=0110 6 档</li>
	 * <li>=1101 倒档</li>
	 * <li>=1110 自动 D 档</li>
	 * <li>=1111 停车 P 档</li>
	 * </ul>
	 */
	@Number(width = 8)
	private int clutchStatus;

	/**
	 * 绝缘电阻<br>
	 * 有效范围 0~60000（表示 0KΩ~60000KΩ），最小计量单元： 1KΩ<br>
	 * 0xFF,0xFF 表示无效<br>
	 */
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int issueValue;

	/**
	 * 燃油量<br>
	 * 有效值范围：0～250，最小计量单元：1升<br>
	 * “0xFE”表示异常<br>
	 * “0xFF”表示无效<br>
	 */
	@Number(width = 8)
	private int fuelQuantity;

	/**
	 * 累计平均油耗<br>
	 * (0.01L/100km)/100F转Float
	 */
	@Decimal(width = 16, order = ByteOrder.BigEndian, scale = 0.01)
	private float avgOilUsed;

	/**
	 * 左前轮胎压<br>
	 * 有效值范围：0～250，最小计量单元：kpa，“0xFE”表示异常，“0xFF”表示无效。
	 */
	@Number(width = 8)
	private int leftFrontTirePressure;

	/**
	 * 右前轮胎压<br>
	 * 有效值范围：0～250，最小计量单元：kpa，“0xFE”表示异常，“0xFF”表示无效。
	 */
	@Number(width = 8)
	private int rightFrontTirePressure;

	/**
	 * 左后轮胎压<br>
	 * 有效值范围：0～250，最小计量单元：kpa，“0xFE”表示异常，“0xFF”表示无效。
	 */
	@Number(width = 8)
	private int leftRearTirePressure;

	/**
	 * 右后轮胎压<br>
	 * 有效值范围：0～250，最小计量单元：kpa，“0xFE”表示异常，“0xFF”表示无效。
	 */
	@Number(width = 8)
	private int rightRearTirePressure;
	/**
	 * <i>左前门状态<i><br>
	 * <ul>
	 * <li>0x01：开</li>
	 * <li>0x02：关</li>
	 * <li>“0xFE”表示异常，“0xFF”表示无效</li>
	 * </ul>
	 */
	@Number(width = 8)
	private int leftFrontDoorStatus;

	/**
	 * 左后门状态
	 * <ul>
	 * <li>0x01：开</li>
	 * <li>0x02：关</li>
	 * <li>“0xFE”表示异常，“0xFF”表示无效</li>
	 * </ul>
	 */
	@Number(width = 8)
	private int leftBackDoorStatus;

	/**
	 * 右前门状态
	 * <ul>
	 * <li>0x01：开</li>
	 * <li>0x02：关</li>
	 * <li>“0xFE”表示异常，“0xFF”表示无效</li>
	 * </ul>
	 */
	@Number(width = 8)
	private int rightFrontDoorStatus;

	/**
	 * 右后门状态
	 * <ul>
	 * <li>0x01：开</li>
	 * <li>0x02：关</li>
	 * <li>“0xFE”表示异常，“0xFF”表示无效</li>
	 * </ul>
	 */
	@Number(width = 8)
	private int rightBackDoorStatus;

	/**
	 * 前盖状态
	 * <ul>
	 * <li>0x01：开</li>
	 * <li>0x02：关</li>
	 * <li>“0xFE”表示异常，“0xFF”表示无效</li>
	 * </ul>
	 */
	@Number(width = 8)
	private int frontCover;

	/**
	 * 后备箱状态
	 * <ul>
	 * <li>0x01：开</li>
	 * <li>0x02：关</li>
	 * <li>“0xFE”表示异常，“0xFF”表示无效</li>
	 * </ul>
	 */
	@Number(width = 8)
	private int trunkStatus;

	/**
	 * 左前窗状态
	 * <ul>
	 * <li>0x01：开</li>
	 * <li>0x02：关</li>
	 * <li>“0xFE”表示异常，“0xFF”表示无效</li>
	 * </ul>
	 */
	@Number(width = 8)
	private int leftFrontWindowStatus;

	/**
	 * 右前窗状态
	 * <ul>
	 * <li>0x01：开</li>
	 * <li>0x02：关</li>
	 * <li>“0xFE”表示异常，“0xFF”表示无效</li>
	 * </ul>
	 */
	@Number(width = 8)
	private int rightFrontWindowStatus;

	/**
	 * 左后窗状态
	 * <ul>
	 * <li>0x01：开</li>
	 * <li>0x02：关</li>
	 * <li>“0xFE”表示异常，“0xFF”表示无效</li>
	 * </ul>
	 */
	@Number(width = 8)
	private int leftBackWindowStatus;

	/**
	 * 右后窗状态
	 * <ul>
	 * <li>0x01：开</li>
	 * <li>0x02：关</li>
	 * <li>“0xFE”表示异常，“0xFF”表示无效</li>
	 * </ul>
	 */
	@Number(width = 8)
	private int rightBackWindowStatus;

	/**
	 * 车外温度<br>
	 * 有效值范围：0～250 （数值偏移量40℃，表示-40℃～+210℃）<br>
	 * 最小计量单元：1℃<br>
	 * “0xFE”表示异常，“0xFF”表示无效<br>
	 */
	@Number(width = 8)
	private int outsideTemperature;

	/**
	 * 车内温度<br>
	 * 有效值范围：0～250 （数值偏移量40℃，表示-40℃～+210℃）<br>
	 * 最小计量单元：1℃<br>
	 * “0xFE”表示异常，“0xFF”表示无效<br>
	 */
	@Number(width = 8)
	private int insideTemperature;

	/**
	 * 续航里程 有效值范围： 0～20000<br>
	 * 单位：公里<br>
	 * 0xFF,0xFE 表示异常<br>
	 * 0xFF,0xFF 表示无效<br>
	 */
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int rechargeMileage;

	/**
	 * 车灯状态<br>
	 * 0x01：开<br>
	 * 0x02：关<br>
	 * “0xFE”表示异常<br>
	 * “0xFF”表示无效<br>
	 */
	@Number(width = 8)
	private int lightStatus;

	/**
	 * 预留字段
	 */
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int reserve;

	public int getCarStatus() {
		return carStatus;
	}

	public void setCarStatus(int carStatus) {
		this.carStatus = carStatus;
	}

	public int getChargeStatus() {
		return chargeStatus;
	}

	public void setChargeStatus(int chargeStatus) {
		this.chargeStatus = chargeStatus;
	}

	public Integer getRunStatus() {
		return runStatus;
	}

	public void setRunStatus(Integer runStatus) {
		this.runStatus = runStatus;
	}

	public float getVehicleSpeed() {
		return vehicleSpeed;
	}

	public void setVehicleSpeed(float vehicleSpeed) {
		this.vehicleSpeed = vehicleSpeed;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public float getVoltage() {
		return voltage;
	}

	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}

	public float getCurrent() {
		return current;
	}

	public void setCurrent(float current) {
		this.current = current;
	}

	public int getSoc() {
		return soc;
	}

	public void setSoc(int soc) {
		this.soc = soc;
	}

	public int getDcdcStatus() {
		return dcdcStatus;
	}

	public void setDcdcStatus(int dcdcStatus) {
		this.dcdcStatus = dcdcStatus;
	}

	public int getClutchStatus() {
		return clutchStatus;
	}

	public void setClutchStatus(int clutchStatus) {
		this.clutchStatus = clutchStatus;
	}

	public int getIssueValue() {
		return issueValue;
	}

	public void setIssueValue(int issueValue) {
		this.issueValue = issueValue;
	}

	public int getFuelQuantity() {
		return fuelQuantity;
	}

	public void setFuelQuantity(int fuelQuantity) {
		this.fuelQuantity = fuelQuantity;
	}

	public float getAvgOilUsed() {
		return avgOilUsed;
	}

	public void setAvgOilUsed(float avgOilUsed) {
		this.avgOilUsed = avgOilUsed;
	}

	public int getLeftFrontTirePressure() {
		return leftFrontTirePressure;
	}

	public void setLeftFrontTirePressure(int leftFrontTirePressure) {
		this.leftFrontTirePressure = leftFrontTirePressure;
	}

	public int getRightFrontTirePressure() {
		return rightFrontTirePressure;
	}

	public void setRightFrontTirePressure(int rightFrontTirePressure) {
		this.rightFrontTirePressure = rightFrontTirePressure;
	}

	public int getLeftRearTirePressure() {
		return leftRearTirePressure;
	}

	public void setLeftRearTirePressure(int leftRearTirePressure) {
		this.leftRearTirePressure = leftRearTirePressure;
	}

	public int getRightRearTirePressure() {
		return rightRearTirePressure;
	}

	public void setRightRearTirePressure(int rightRearTirePressure) {
		this.rightRearTirePressure = rightRearTirePressure;
	}

	public int getLeftFrontDoorStatus() {
		return leftFrontDoorStatus;
	}

	public void setLeftFrontDoorStatus(int leftFrontDoorStatus) {
		this.leftFrontDoorStatus = leftFrontDoorStatus;
	}

	public int getLeftBackDoorStatus() {
		return leftBackDoorStatus;
	}

	public void setLeftBackDoorStatus(int leftBackDoorStatus) {
		this.leftBackDoorStatus = leftBackDoorStatus;
	}

	public int getRightFrontDoorStatus() {
		return rightFrontDoorStatus;
	}

	public void setRightFrontDoorStatus(int rightFrontDoorStatus) {
		this.rightFrontDoorStatus = rightFrontDoorStatus;
	}

	public int getRightBackDoorStatus() {
		return rightBackDoorStatus;
	}

	public void setRightBackDoorStatus(int rightBackDoorStatus) {
		this.rightBackDoorStatus = rightBackDoorStatus;
	}

	public int getFrontCover() {
		return frontCover;
	}

	public void setFrontCover(int frontCover) {
		this.frontCover = frontCover;
	}

	public int getTrunkStatus() {
		return trunkStatus;
	}

	public void setTrunkStatus(int trunkStatus) {
		this.trunkStatus = trunkStatus;
	}

	public int getLeftFrontWindowStatus() {
		return leftFrontWindowStatus;
	}

	public void setLeftFrontWindowStatus(int leftFrontWindowStatus) {
		this.leftFrontWindowStatus = leftFrontWindowStatus;
	}

	public int getRightFrontWindowStatus() {
		return rightFrontWindowStatus;
	}

	public void setRightFrontWindowStatus(int rightFrontWindowStatus) {
		this.rightFrontWindowStatus = rightFrontWindowStatus;
	}

	public int getLeftBackWindowStatus() {
		return leftBackWindowStatus;
	}

	public void setLeftBackWindowStatus(int leftBackWindowStatus) {
		this.leftBackWindowStatus = leftBackWindowStatus;
	}

	public int getRightBackWindowStatus() {
		return rightBackWindowStatus;
	}

	public void setRightBackWindowStatus(int rightBackWindowStatus) {
		this.rightBackWindowStatus = rightBackWindowStatus;
	}

	public int getOutsideTemperature() {
		return outsideTemperature;
	}

	public void setOutsideTemperature(int outsideTemperature) {
		this.outsideTemperature = outsideTemperature;
	}

	public int getInsideTemperature() {
		return insideTemperature;
	}

	public void setInsideTemperature(int insideTemperature) {
		this.insideTemperature = insideTemperature;
	}

	public int getRechargeMileage() {
		return rechargeMileage;
	}

	public void setRechargeMileage(int rechargeMileage) {
		this.rechargeMileage = rechargeMileage;
	}

	public int getLightStatus() {
		return lightStatus;
	}

	public void setLightStatus(int lightStatus) {
		this.lightStatus = lightStatus;
	}

	public int getReserve() {
		return reserve;
	}

	public void setReserve(int reserve) {
		this.reserve = reserve;
	}

	@Override
	public String toString() {
		return "OverviewData [carStatus=" + carStatus + ", chargeStatus=" + chargeStatus + ", runStatus=" + runStatus
				+ ", vehicleSpeed=" + vehicleSpeed + ", mileage=" + mileage + ", voltage=" + voltage + ", current="
				+ current + ", soc=" + soc + ", dcdcStatus=" + dcdcStatus + ", clutchStatus=" + clutchStatus
				+ ", issueValue=" + issueValue + ", fuelQuantity=" + fuelQuantity + ", avgOilUsed=" + avgOilUsed
				+ ", leftFrontTirePressure=" + leftFrontTirePressure + ", rightFrontTirePressure="
				+ rightFrontTirePressure + ", leftRearTirePressure=" + leftRearTirePressure + ", rightRearTirePressure="
				+ rightRearTirePressure + ", leftFrontDoorStatus=" + leftFrontDoorStatus + ", leftBackDoorStatus="
				+ leftBackDoorStatus + ", rightFrontDoorStatus=" + rightFrontDoorStatus + ", rightBackDoorStatus="
				+ rightBackDoorStatus + ", frontCover=" + frontCover + ", trunkStatus=" + trunkStatus
				+ ", leftFrontWindowStatus=" + leftFrontWindowStatus + ", rightFrontWindowStatus="
				+ rightFrontWindowStatus + ", leftBackWindowStatus=" + leftBackWindowStatus + ", rightBackWindowStatus="
				+ rightBackWindowStatus + ", outsideTemperature=" + outsideTemperature + ", insideTemperature="
				+ insideTemperature + ", rechargeMileage=" + rechargeMileage + ", lightStatus=" + lightStatus
				+ ", reserve=" + reserve + "]";
	}

}
