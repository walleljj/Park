package com.lzw.entity;

import java.sql.Timestamp;

public class Parking {
	private String code;
	private int id;
	private String carId;
	private Timestamp startTime;
	private Timestamp endTime;
	
	
	public Parking(String code, int id, String carId, Timestamp startTime, Timestamp endTime) {
		super();
		this.code = code;
		this.id = id;
		this.carId = carId;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Parking() {
		super();
	}

	public String getCode() {
		return code;
	}
	
	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp timeStamp) {
		this.startTime = timeStamp;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Parking [code=" + code + ", id=" + id + ", carId=" + carId + ", startTime=" + startTime + ", endTime="
				+ endTime + "]";
	}
	

}
