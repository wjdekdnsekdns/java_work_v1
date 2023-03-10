package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainTest2 {

	public static void main(String[] args) {
		ArrayList<Tbl> list = new ArrayList<>();
		// 코드 실행
		DBClient dbClient = new DBClient();
		DBClient.setDB_NAME("shopdb");
		// dbClient.setDB_NAME("shopdb");
		// mydb
		// DB 접근 구현 코드 처리
		Connection conn = dbClient.getConnection();
		try {
			Statement stmt = conn.createStatement();
			String qureystr = "SELECT * FROM buyTBL";
			ResultSet rs = stmt.executeQuery(qureystr);
			while (rs.next()) {
//				Tbl tbl = new Tbl(rs.getString("username"), rs.getString("prodName"), rs.getInt("price"),
//						rs.getInt("amount"));
			//	list.add(tbl);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println(list.get(i).getUsername());
		}
		// 자료구조 선언 담을 데이터를 클래스로 모델링
	}

	class Tbl {
		private String username;
		private String prodName;
		private int price;
		private int amout;

		public Tbl(String username, String prodName, int price, int amout) {
			super();
			this.username = username;
			this.prodName = prodName;
			this.price = price;
			this.amout = amout;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getProdName() {
			return prodName;
		}

		public void setProdName(String prodName) {
			this.prodName = prodName;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getAmout() {
			return amout;
		}

		public void setAmout(int amout) {
			this.amout = amout;
		}

		@Override
		public String toString() {
			return "Tbl [username=" + username + ", prodName=" + prodName + ", price=" + price + ", amout=" + amout
					+ "]";
		}

	}
}
