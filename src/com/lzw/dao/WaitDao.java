package com.lzw.dao;

import java.util.List;

import com.lzw.entity.Wait;

public interface WaitDao {
	public int addWait(Wait w);
	public int removeWait(int id);
	public int update(int id);
	public List<Wait> findAll();
	

}
