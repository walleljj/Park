package com.lzw.db;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	public static String DBDRIVER;
	public static String DBURL;
	public static String DBUSER;
	public static String DBPASS;
	static{
		Properties prop = new Properties();
		Reader in=null;
		try {
			in = new FileReader("src\\config.properties");
			prop.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		DBDRIVER = prop.getProperty("DBDRIVER");
		DBURL = prop.getProperty("DBURL");
		DBUSER = prop.getProperty("DBUSER");
		DBPASS = prop.getProperty("DBPASS");
	}
	//连接数据库
	public static Connection open(){
		try {
			Class.forName(DBDRIVER);
			return DriverManager.getConnection(DBURL,DBUSER,DBPASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}
	//关闭数据库
	public static void close(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
