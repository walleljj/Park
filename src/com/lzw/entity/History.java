package com.lzw.entity;

import java.sql.Timestamp;
import java.util.Date;

public class History {
	private String code;
	private String carId;
	private Timestamp startTime;
	private Timestamp endTime;
	private double spend;
	
	public History(String code, String carId, Timestamp startTime, Timestamp endTime, double spend) {
		super();
		this.code = code;
		this.carId = carId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.spend = spend;
	}
	
	public History() {
		super();
	}
	 

	@Override
	public String toString() {
		return "History [code=" + code +  ", carId=" + carId + ", startTime=" + startTime + ", endTime="
				+ endTime + ", spend=" + spend + "]";
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	public double getSpend() {
		return spend;
	}
	public void setSpend(double spend) {
		this.spend = spend;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	
	}
