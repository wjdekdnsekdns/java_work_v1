package ch07;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO implements IUserDAO{
	private DBClient dbClient;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		dbClient = DBClient.getInstance();
		conn = dbClient.getConnection();
	}
	@Override
	public ArrayList<UserDTO> showBlog(String name) {
		 ArrayList<UserDTO> list = new ArrayList<>();
		 String sql = "SELECT u.name, b.content, b.create_date, r.reply_id, r.reply, r.create_reply "
		 		+ " FROM blog AS b "
		 		+ " LEFT JOIN user AS u "
		 		+ " ON b.user_id = u.user_id "
		 		+ " LEFT JOIN reply AS r "
		 		+ " ON b.blog_id = r.blog_id "
		 		+ " WHERE u.name = ? ";
		 
		 try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setName(rs.getString("name"));
				dto.setContent(rs.getString("content"));
				dto.setCreateDate(rs.getString("create_date"));
				dto.setReply(rs.getString("reply"));
				dto.setCreateReply(rs.getString("create_reply"));
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
		return list;
	}
	@Override
	public UserDTO insert(int blogId, String name, String text, int userId, String createDate) {
		UserDTO dto = null;
		String sql = "INSERT INTO blog "
				+ "	VALUES(?, ?,?,?,?) ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, blogId);
			pstmt.setString(2, name);
			pstmt.setString(3, text);
			pstmt.setInt(4, userId);
			pstmt.setString(5, createDate);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				 dto = new UserDTO();
				dto.setBlogId(rs.getInt("blog_id"));
				dto.setName(rs.getString("name"));
				dto.setContent(rs.getString("name"));
				dto.setUserId(rs.getInt("user_id"));
				dto.setCreateDate(rs.getNString("create_date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return dto;
	}

}
