package com.lzw.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lzw.dao.ShezhiDao;
import com.lzw.db.DBUtil;
import com.lzw.entity.Shezhi;

public class ShezhiDaoImpl implements ShezhiDao {

	@Override
	public int updateMaxP(int maxP) {
		int id = 1;
		String sql = "update shezhi set maxP=? where id='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, maxP);
			
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
	public int updateMaxW(int maxW) {
		int id = 1;
		String sql = "update shezhi set maxW=? where id='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, maxW);
			
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
	public int updateNowP(int p) {
		int id = 1;
		String sql = "update shezhi set nowP=? where id='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, p);
			
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
	public int updateNowW(int w) {
		int id = 1;
		String sql = "update shezhi set nowW=? where id='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, w);
			
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
	public int changePassWord(String pass) {
		int id = 1;
		String sql = "update shezhi set pass=? where id='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pass);
			
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
	public Shezhi find() {
		int id = 1;
		String sql = "select * from shezhi where id='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			Shezhi c=null;
			if(re.next()){
				c = new Shezhi(re.getString("pass"),re.getInt("maxP"),re.getInt("maxW"),re.getInt("nowP"),re.getInt("nowW"),re.getDouble("price"));
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
	public int updatePrice(double pr) {
		int id = 1;
		String sql = "update shezhi set price=? where id='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, pr);
			
			pstmt.executeUpdate();
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return 0;
	}

}
