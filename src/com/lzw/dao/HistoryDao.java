package com.lzw.dao;

import java.util.List;

import com.lzw.entity.History;

public interface HistoryDao {
	public int addHistory(History h);
	public int removeHistory(History h);
	public History findHistoryByCarId(String carId);
	public List<History> findAll();
	public int removeAll();

}
