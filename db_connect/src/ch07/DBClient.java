package ch07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBClient {

	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_NAME = "blog";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";
	
	private Connection connection;
	
	private static DBClient dbClient;
	
	public DBClient() {
		// TODO Auto-generated constructor stub
	}
	
	static DBClient getInstance() {
		if(dbClient == null) {
			dbClient = new DBClient();
		}
		return dbClient;
	}
	
	public Connection getConnection() {
		if(connection == null) {
			String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_NAME, DB_CHARSET);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, DB_USER, DB_PASSWORD);
				System.out.println("Connection Success");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
