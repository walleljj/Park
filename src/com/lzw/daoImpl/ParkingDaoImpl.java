package com.lzw.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lzw.dao.ParkingDao;
import com.lzw.db.DBUtil;
import com.lzw.entity.Parking;

public class ParkingDaoImpl implements ParkingDao{

	@Override
	public int addPark(Parking pk) {
		// TODO 自动生成的方法存根
		String sql = "insert into parking(code,id,carId,startTime,endTime)"
				+ "values(?,?,?,?,?)";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pk.getCode());
			pstmt.setInt(2, pk.getId());
			pstmt.setString(3, pk.getCarId());
			pstmt.setTimestamp(4, pk.getStartTime());
			pstmt.setTimestamp(5, pk.getEndTime());
			pstmt.executeUpdate();
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return 0;
		
	}

	@Override
	public int removePark(Parking pk) {
		int id = pk.getId();
		String sql = "delete from parking where id="+id;
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return 0;
		
	}

	@Override
	public Parking findParkById(int id) {
		// TODO 自动生成的方法存根
		String sql = "select * from parking where id='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			Parking c=null;
			if(re.next()){
				c = new Parking(re.getString("code"),re.getInt("id"),re.getString("carId"),re.getTimestamp("startTime"),re.getTimestamp("endTime"));
			}
			return c;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}

	@Override
	public List<Parking> findAll() {
		String sql = "select * from parking";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<Parking> list = new ArrayList<Parking>();
			while(re.next()){
				Parking c=null;
				c = new Parking(re.getString("code"),re.getInt("id"),re.getString("carId"),re.getTimestamp("startTime"),re.getTimestamp("endTime"));
				list.add(c);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}

	@Override
	public int update(int id) {
		String sql = "update parking set id=? where id='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id-1);
			
			pstmt.executeUpdate();
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return 0;
		
	}
	public Parking findParkByCode(String code) {
		// TODO 自动生成的方法存根
		String sql = "select * from parking where code='"+code+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			Parking c=null;
			if(re.next()){
				c = new Parking(re.getString("code"),re.getInt("id"),re.getString("carId"),re.getTimestamp("startTime"),re.getTimestamp("endTime"));
			}
			return c;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}
	
	public Parking findParkByCarId(String carId) {
		// TODO 自动生成的方法存根
		String sql = "select * from parking where carId='"+carId+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			Parking c=null;
			if(re.next()){
				c = new Parking(re.getString("code"),re.getInt("id"),re.getString("carId"),re.getTimestamp("startTime"),re.getTimestamp("endTime"));
			}
			return c;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}
	
}
