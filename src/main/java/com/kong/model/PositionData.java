package com.kong.model;

import com.github.io.protocol.annotation.ByteOrder;
import com.github.io.protocol.annotation.Decimal;
import com.github.io.protocol.annotation.Number;

/**
 * @Title: PositionData.java
 * @Project: rooster-datapack-gmmc
 * @Package: com.incarcloud.rooster.datapack.model
 * @Description: 车辆位置信息
 * @author: chenz
 * @date: 2017年12月1日 上午11:24:43
 * @version: V1.0
 */
public class PositionData {
	/**
	 * 0:有效定位；1:无效定位（当数据通信正常，而不能获取定位信息时，发送最后一次有效定位信息，并将定位状态置为无效。）
	 */
	@Number(width = 1, order = ByteOrder.BigEndian)
	private int isValidate;
	/**
	 * 0:北纬；1:南纬
	 */
	@Number(width = 1, order = ByteOrder.BigEndian)
	private int latType;
	/**
	 * 0:东经；1:西经
	 */
	@Number(width = 1, order = ByteOrder.BigEndian)
	private int lngType;
	/**
	 * 保留
	 */
	@Number(width = 5, order = ByteOrder.BigEndian)
	private int reserveBit;
	/**
	 * 经度 以度为单位的纬度值乘以10的6次方，精确到百万分之一度
	 */
	@Decimal(width = 32, order = ByteOrder.BigEndian, scale = 0.000001, precision = 6)
	private double longitude;
	/**
	 * 纬度 以度为单位的纬度值乘以10的6次方，精确到百万分之一度
	 */
	@Decimal(width = 32, order = ByteOrder.BigEndian, scale = 0.000001, precision = 6)
	private double latitude;
	/**
	 * 速度 有效值范围：0～2200（表示0km/h～220
	 * km/h），最小计量单元：0.1km/h。“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
	 */
	@Decimal(width = 16, order = ByteOrder.BigEndian, scale = 0.1)
	private float speed;
	/**
	 * 海拔 以米为单位，最小计量单元：0.1m
	 */
	@Decimal(width = 32, order = ByteOrder.BigEndian, scale = 0.1)
	private double altitude;
	/**
	 * 方向 有效值范围：0～359，正北为0，顺时针
	 */
	@Number(width = 16, order = ByteOrder.BigEndian)
	private int direction;
	/**
	 * 保留位
	 */
	@Number(width = 16, order = ByteOrder.BigEndian)
	private long reserve;

	@Override
	public String toString() {
		return "PositionData [isValidate=" + isValidate + ", latType=" + latType + ", lngType=" + lngType
				+ ", reserveBit=" + reserveBit + ", longitude=" + longitude + ", latitude=" + latitude + ", speed="
				+ speed + ", altitude=" + altitude + ", direction=" + direction + ", reserve=" + reserve + "]";
	}

	public Integer getIsValidate() {
		return isValidate;
	}

	public void setIsValidate(Integer isValidate) {
		this.isValidate = isValidate;
	}

	public Integer getLatType() {
		return latType;
	}

	public void setLatType(Integer latType) {
		this.latType = latType;
	}

	public Integer getLngType() {
		return lngType;
	}

	public void setLngType(Integer lngType) {
		this.lngType = lngType;
	}

	public Integer getReserveBit() {
		return reserveBit;
	}

	public void setReserveBit(Integer reserveBit) {
		this.reserveBit = reserveBit;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Float getSpeed() {
		return speed;
	}

	public void setSpeed(Float speed) {
		this.speed = speed;
	}

	public Double getAltitude() {
		return altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	public Integer getDirection() {
		return direction;
	}

	public void setDirection(Integer direction) {
		this.direction = direction;
	}

	public Long getReserve() {
		return reserve;
	}

	public void setReserve(Long reserve) {
		this.reserve = reserve;
	}

}
