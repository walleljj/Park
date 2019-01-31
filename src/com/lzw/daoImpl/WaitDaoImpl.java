package com.lzw.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lzw.dao.WaitDao;
import com.lzw.db.DBUtil;
import com.lzw.entity.Parking;
import com.lzw.entity.Wait;

public class WaitDaoImpl implements WaitDao {

	@Override
	public int addWait(Wait w) {
		String sql = "insert into wait(id,code,carId)"
				+ "values(?,?,?)";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, w.getId());
			pstmt.setString(2, w.getCode());
			pstmt.setString(3, w.getCarId());
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
	public int removeWait(int id) {
		String sql = "delete from wait where id="+id;
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
	public int update(int id) {
		
		String sql = "update wait set id=? where id='"+id+"'";
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

	@Override
	public List<Wait> findAll() {
		String sql = "select * from wait";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<Wait> list = new ArrayList<Wait>();
			while(re.next()){
				Wait c=null;
				c = new Wait(re.getInt("id"),re.getString("code"),re.getString("carId"));
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
	public Wait findWaitById(int id) {
		// TODO 自动生成的方法存根
		String sql = "select * from wait where id='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			Wait c=null;
			if(re.next()){
				c = new Wait(re.getInt("id"),re.getString("code"),re.getString("carId"));
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
