package ch04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBClient {

	private static final String DB_HOST = "localhost";
	private static final int DB_PORT = 3306;
	private static  String DB_NAME = "employees";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "root";
	private static final String DB_PASSWOED = "root";
	// 주소
	
	private Connection conn;
	public static String getDbName() {
		return DB_NAME;
	}
	
	public static void setDB_NAME(String dB_NAME) {
		DB_NAME = dB_NAME;
	}

	private Statement stmt;
	private ResultSet rs;
	
	public Connection getConnection() {
		if(conn == null) {
			String urlFormat = "jdbc:mysql://%s:%d/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_NAME, DB_CHARSET);
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver"); // Connection 객체를 뽑을 드라이버 객체 로드
				conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWOED);
				System.out.println(">>> Connection Success <<<");
				
				
				
			} catch (Exception e) {
				System.out.println(">>> Connection Fail <<<");
				e.printStackTrace();
			} 
		}
		return conn;
	}
	public void connectionClose() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
