package ch05;

import java.util.ArrayList;

public interface IBuyDAO {
	ArrayList<BuyDTO> select();
	int insert(BuyDTO dto);
	int update(BuyDTO dto, String targetprodName);
	boolean delete(String username);
}
