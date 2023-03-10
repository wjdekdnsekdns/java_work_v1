package ch04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDao implements IEmployeeDao{
	private static final String TABLE_NAME = "employees";
	private DBClient dbClient;
	private Connection conn;
	public EmployeeDao() {
		dbClient = new DBClient();
	}
	@Override
	public void insert(EmployeeDTO dto) {
		// DB 연결 정보
		
	}

	@Override
	public ArrayList<EmployeeDTO> select(int empNO) {
		
		ArrayList<EmployeeDTO> list = new ArrayList<>();
		
		String sqlFormat = "SELECT * FROM %s Where emp_no = %d ";
		String sql = String.format(sqlFormat, TABLE_NAME, empNO); // 문자열 형식
		
		conn = dbClient.getConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs;
			rs = stmt.executeQuery(sql); // 결과
			while(rs.next()) {
				// 주의 데이터 베이스 세상에 있는 컴럼명과 이름이 똑같아야 한다
				int mempNo = rs.getInt("emp_no");
				String birthDate = rs.getString("birth_date");
				String firstName = rs.getString("first_name");
				String gender = rs.getString("gender");
				String hireDate = rs.getString("hire_date");
				EmployeeDTO dto = new EmployeeDTO(mempNo, birthDate, firstName, "", gender, hireDate);
				
				list.add(dto);
			}
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i));
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void select(String lastname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String gender) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int empNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String lastName) {
		// TODO Auto-generated method stub
		
	}
	
}
