package ch06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// 실제 DB 접근해서 기능을 처리해주는 녀석
public class EmloyeeDAO implements IEmloyeeDAO{
	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public EmloyeeDAO() {
		//dbHelper.getConnection().createStatement().executeQuery(null);
		
		// DBHelper 객체를 가지고 오는 동작
		dbHelper = DBHelper.getInstance();
		//dbHelper 에서 connecrion 객체를 가지고 오는 동작
		conn = dbHelper.getConnection();
	}// end of EmloyeeDAO
	@Override
	public ArrayList<EmployeeDTO> showTitleEmpInfo(String title) {
		ArrayList<EmployeeDTO> list= new ArrayList<>();
		String sql = " SELECT e.emp_no, e.first_name, e.last_name, t.title "
				+ " FROM employees AS e "
				+ " INNER JOIN titles AS t "
				+ " ON e.emp_no = t.emp_no "
				+ " WHERE t.title = ? ";
		
		//prepareStatement 시작 번호는 1번 부터 시작한다 ' ' <-- 생략 가능 그냥 ? 기반으로 사용 가능
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setEmpNo(rs.getString("emp_no"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setTitle(rs.getString("title"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
		
	}
	@Override
	public EmployeeDTO showSalaryCount(String firstname ,String lastname ) {
		EmployeeDTO dto = null;
		String sql = " SELECT   count(salary) "
				+ "FROM salaries AS s "
				+ "LEFT JOIN employees AS e "
				+ "ON s.emp_no = e.emp_no "
				+ "WHERE e.first_name = ? AND  e.last_name = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, firstname);
			pstmt.setString(2, lastname);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dto = new EmployeeDTO();
				dto.setSalarycount(rs.getString("count(salary)"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
	
}// end of class
