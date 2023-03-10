package ch03;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainTest {
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		
		DBClient client = new DBClient();
		Connection conn = client.getconnection();
		try {
			Statement stmt = conn.createStatement();
			String qureystr = "SELECT * FROM student ";
			ResultSet rs = stmt.executeQuery(qureystr);
//			while(rs.next()) {
//				Student student = new Student(rs.getInt("student_id"), rs.getString("student_name"), rs.getString("grade"), rs.getInt("school_id"));
//				list.add(student);
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	for(int i = 0; i < list.size(); i++ ) {
		System.out.println(list.get(i));
		System.out.println(list.get(i).getName());
	}
}

	class Student {
		private int id;
		private String name;
		private String grade;
		private int schoolId;

		public Student(int id, String name, String grade, int schoolId) {
			super();
			this.id = id;
			this.name = name;
			this.grade = grade;
			this.schoolId = schoolId;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		public int getSchoolId() {
			return schoolId;
		}

		public void setSchoolId(int schoolId) {
			this.schoolId = schoolId;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", schoolId=" + schoolId + "]";
		}

	}
}