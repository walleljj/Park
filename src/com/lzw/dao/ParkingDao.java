package com.lzw.dao;

import java.util.List;

import com.lzw.entity.Parking;

public interface ParkingDao {
	public int addPark(Parking pk);
	public int removePark(Parking pk);
	public Parking findParkById(int id);
	public List<Parking> findAll();
	public int update(int id);
}
