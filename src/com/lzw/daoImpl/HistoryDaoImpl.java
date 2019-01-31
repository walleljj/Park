package com.lzw.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lzw.dao.HistoryDao;
import com.lzw.db.DBUtil;
import com.lzw.entity.History;

public class HistoryDaoImpl implements HistoryDao {

	@Override
	public int addHistory(History h) {
		String sql = "insert into history(code,carId,startTime,endTime,spend)"
				+ "values(?,?,?,?,?)";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, h.getCode());
			pstmt.setString(2, h.getCarId());
			pstmt.setTimestamp(3, h.getStartTime());
			pstmt.setTimestamp(4, h.getEndTime());
			pstmt.setDouble(5, h.getSpend());
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
	public int removeHistory(History h) {
		String carId = h.getCarId();
		String sql = "delete from history where carId="+carId;
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
	public History findHistoryByCarId(String carId) {
		// TODO 自动生成的方法存根
				String sql = "select * from history where carId='"+carId+"'";
				Connection conn =  DBUtil.open();
				PreparedStatement pstmt;
				try {
					pstmt = conn.prepareStatement(sql);
					ResultSet re = pstmt.executeQuery();
					History c=null;
					if(re.next()){
						c = new History(re.getString("code"),re.getString("carId"),re.getTimestamp("startTime"),re.getTimestamp("endTime"),re.getDouble("spend"));
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
	public List<History> findAll() {
		String sql = "select * from history";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<History> list = new ArrayList<History>();
			while(re.next()){
				History c=null;
				c = new History(re.getString("code"),re.getString("carId"),re.getTimestamp("startTime"),re.getTimestamp("endTime"),re.getDouble("spend"));
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
	public int removeAll() {
		String sql = "delete from history where '1'='1'";
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

}
