package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest {

	public static void main(String[] args) {

		DBClient client = new DBClient();
		Connection conn = client.getConnection();
		try {
			Statement stmt = conn.createStatement();
			// 쿼리문 생성, 실행
			String qureystr = "SELECT * FROM student ";
			ResultSet rs = stmt.executeQuery(qureystr);// 결과를 Resultset 담김
			// 결과를 뽑는 기술
			while (rs.next()) {
				Student student = new Student(rs.getInt("student_id"), rs.getString("student_name"), rs.getString("grade"), rs.getInt("school_id"));
				System.out.println(student);
			}
		} catch (SQLException e) { 
			e.printStackTrace();
		} finally {
		}
	}
}


class Student{
	 int id;
	 String  name;
	 String grade;
	 int schoolId;
	
	
	public Student(int id, String name, String grade, int schoolId) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.schoolId = schoolId;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", schoolId=" + schoolId + "]";
	}
	
 
}