package com.lzw.dao;

import com.lzw.entity.Shezhi;

public interface ShezhiDao {
	public int updateMaxP(int maxP);
	public int updateMaxW(int maxw);
	public int updateNowP(int p);
	public int updateNowW(int w);
	public int updatePrice(double pr);
	public int changePassWord(String pass);
	public Shezhi find();
	

}
