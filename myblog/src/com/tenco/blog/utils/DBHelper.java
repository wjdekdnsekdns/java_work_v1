package com.tenco.blog.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATABASE_NAME = "myblog";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER = "bloguser";
	private static final String DB_PASSWOED = "1q2w3e4r5t";
	
	// 접근 주체
	private Connection conn;
	
	public Connection getConnection() {
		if(conn == null) {
			// 한번도 생성하지 않았다면 동작
			
			String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			// jdbc:mysql://localhost:3306/employees?serverTimezone=Asia/Seoul&characterEncoding=UTF-8
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER, DB_PASSWOED);
				System.out.println(">> DB  연결 완료 <<");
			} catch (Exception e) {
				System.out.println(">> DBHelper 에서 오류가 발생 헀음!<<");
				e.printStackTrace();
			}
		}
		
		
		return conn;
	}
	public void closeConnection() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		conn = null; // 가비지 컬렉터 제거 대상이 된다
	}
	
	
}
