package ch06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATABASE_NAME = "employees";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER = "root";
	private static final String DB_PASSWOED = "root";

	private Connection connection;

	// 싱글톤 패턴 객체 만들기
	// 1.
	private static DBHelper dbHelper;

	// 2.
	public DBHelper() {
	}

	// 3.
	static DBHelper getInstance() {
		if (dbHelper == null) {
			dbHelper = new DBHelper();
		}
		return dbHelper;
	}
	
	public Connection getConnection() {
		if(connection == null) {
			String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			// jdbc:mysql://localhost:3306/employees?serverTimezone=Asia/Seoul&characterEncoding=UTF-8
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");// 동적 로딩 - 리플렉션
				connection = DriverManager.getConnection(url, DB_USER, DB_PASSWOED);
				System.out.println("Connection Success");
			} catch (Exception e) {
				e.printStackTrace();
				try {
					connection.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			} 
		}
		return connection;
		
	}
	public void closeConnection() {
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
