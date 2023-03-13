package com.tenco.blog.dao;
/**
 * 
 * @author GGG
 * User와 관련된 DB 서버 연결 로직 처리
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.blog.dto.UserDTO;
import com.tenco.blog.utils.DBHelper;

public class UserDAO implements IUserDAO{
	private DBHelper dbHelper;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	// 사용자 정보를 저장 시키는 기능
	@Override
	public int saveUser(UserDTO user) {
		String qyery = " INSERT INTO user (username, password, email, address, userRole, creatDate) "
				+ " VALUES(?, ?, ?, ?, ?, now()) ";
		int resultRow = 0;
		try {
			pstmt = conn.prepareStatement(qyery);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress());
			pstmt.setString(5, user.getUserRole());
			resultRow = pstmt.executeUpdate(); // INSERT, UPDATE DELETE 시 사용
		} catch (SQLException e) {
			System.out.println(">> saveUser 함수에서 오류가 발생 <<");
			e.printStackTrace();
		}
		return resultRow;
	}
	
	// 사용자 정보를 아이디와 비번 값을 확인해서 찾는 기능
	@Override
	public UserDTO selectUserByUsernameAndPassword(String username, String password) {
		UserDTO resultUser = null;
		String query = "SELECT * "
				+ "FROM user "
				+ "WHERE username = ? AND password = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setId(rs.getInt("id"));
				dto.setUsername(rs.getString("username"));
				dto.setEmail(rs.getString("email"));
				resultUser = dto;
			}
		} catch (Exception e) {
			System.out.println("userDAO 회원 찾기시 에러");
			e.printStackTrace();
		}
		return resultUser;
	}
	
}

