package com.lzw.entity;

public class Shezhi {
	private String pass;
	private int maxP;
	private int maxW;
	private int nowP;
	private int nowW;
	private double price;
	@Override
	public String toString() {
		return "Shezhi [pass=" + pass + ", maxP=" + maxP + ", maxW=" + maxW + ", nowP=" + nowP + ", nowW=" + nowW + "]";
	}
	public Shezhi(String pass, int maxP, int maxW, int nowP, int nowW,double price) {
		super();
		this.pass = pass;
		this.maxP = maxP;
		this.maxW = maxW;
		this.nowP = nowP;
		this.nowW = nowW;
		this.price = price;
	}
	public Shezhi() {
		super();
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getMaxP() {
		return maxP;
	}
	public void setMaxP(int maxP) {
		this.maxP = maxP;
	}
	public int getMaxW() {
		return maxW;
	}
	public void setMaxW(int maxW) {
		this.maxW = maxW;
	}
	public int getNowP() {
		return nowP;
	}
	public void setNowP(int nowP) {
		this.nowP = nowP;
	}
	public int getNowW() {
		return nowW;
	}
	public void setNowW(int nowW) {
		this.nowW = nowW;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
