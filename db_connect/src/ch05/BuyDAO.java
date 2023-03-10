package ch05;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BuyDAO implements IBuyDAO {

	private DBClient dbClient;

	public BuyDAO() {
		initData();
	}

	private void initData() {
		dbClient = new DBClient();
	}

	@Override
	public ArrayList<BuyDTO> select() {

		ArrayList<BuyDTO> list = new ArrayList<>();
		Connection conn = dbClient.getConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM buytbl ");
			while (rs.next()) {
				String username = rs.getString("username");
				String prodName = rs.getString("prodName");
				int price = rs.getInt("price");
				int amount = rs.getInt("amount");

				BuyDTO dto = new BuyDTO(username, prodName, price, amount);
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int insert(BuyDTO dto) {
		String sqlFormat = "INSERT INTO buytbl(username, prodName, price, amount) " + "VALUES ('%s', '%s', %d, %d) ";
		String sql = String.format(sqlFormat, dto.getUsername(), dto.getProdName(), dto.getPrice(), dto.getAmount());
		Connection conn = dbClient.getConnection();
		int resultRowCount = 0;
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultRowCount;
	}

	@Override
	public int update(BuyDTO dto, String targetprodName) {
		String sqlFormat = "UPDATE buyTBL "
				+ " SET prodName = '%s', price = '%d', amount = '%d' "
				+ "    WHERE prodName = '%s'; ";
		String sql = String.format(sqlFormat,dto.getProdName(), dto.getPrice(), 
				dto.getAmount(),targetprodName);
		Connection conn = dbClient.getConnection(); 
		int resultRow = 0;
		
		Statement stmt = null;
		try {
		    stmt = conn.createStatement();
			resultRow = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultRow;
	}

	@Override
	public boolean delete(String username) {
		boolean isOk = true;
		String sqlFormat = "DELETE FROM buyTBL WHERE username = '%s'";
		String sql = String.format(sqlFormat, username);
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			isOk = false;
			// 실행의 흐름이 여기로 빠졌을 경우
			// 구매 테이블에 데이터가 남아 잇어서 유저 테이블에 삭제가 불가능 하다
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isOk;
	
	}

}
