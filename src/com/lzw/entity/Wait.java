package com.lzw.entity;

public class Wait {
	private int id;
	private String code;
	private String carId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Wait(int id, String code, String carId) {
		super();
		this.id = id;
		this.code = code;
		this.carId = carId;
	}
	public Wait() {
		super();
	}
	

}
