package ch05;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		// 데이터 베이스에 접근해서 memberTBL 에 대한 정보
		// 데이터 베이스에 접근해서 userTBL 에 대한 정보
		UserDAO userDAO = new UserDAO();
		BuyDAO buyDAO = new BuyDAO();
		
		
		//insert 확인
		//UserDTO insertDTO = new UserDTO("유진스", "2020", "제주도", "010-1234-1234");
		//int rowCount =  userDAO.insert(new UserDTO("아이즈원", "2020", "경기도", "010-1234-1234"));
		//System.out.println("rowCount : " + rowCount);
		// buytbl insert
		//int rowCount1 = buyDAO.insert(new BuyDTO("야스오", "로봇", 1000, 5));
		//System.out.println("rowCount : " + rowCount1);
		
		// update
		UserDTO dto = new UserDTO("야스오", "1999", "서울", "010-2222-2222");
		int updateRowCount = userDAO.update(dto, dto.getUsername());
		System.out.println("updateRowCount : " + updateRowCount);
		
		//buytbl update
//		BuyDTO dto = new BuyDTO( "책","컴퓨터", 300, 5);
//		int updateRowCount = buyDAO.update(dto, dto.getUsername());
		
		// delete
		// 자식 테이블에 데이터를 먼저 삭제하고 부모 데이블에 정보를 삭제할 수 있다
		// 야스오는 구매 테이블 이력이 남아 있기 떄문에 유저테이블에서 바로 삭제 할 수 없다
//		boolean isDelete = userDAO.delete("이승기");
//		System.out.println("isDelete : " + isDelete);
//		if(isDelete == false) {
//			System.out.println("구매 테이블에 이력이 남아 있을 수 있습니다");
//		}
		
		// buytbl update
		//boolean isDelete = buyDAO.delete("야스오");
		
		
		
		
		
		
		
		//select 확인
//		ArrayList<UserDTO> list = userDAO.select();
//		ArrayList<BuyDTO> buylist = buyDAO.select();
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getUsername());
//			System.out.println(list.get(i).getBirthYear());
//			System.out.println(list.get(i).getAddr());
//			System.out.println(list.get(i).getMobile());
//			System.out.println("-------------------");
//		}
//		System.out.println("=============user 끝===========");
//		for (int i = 0; i < buylist.size(); i++) {
//			System.out.println(buylist.get(i).getUsername());
//			System.out.println(buylist.get(i).getProdName());
//			System.out.println(buylist.get(i).getPrice());
//			System.out.println(buylist.get(i).getAmount());
//			System.out.println("----------------");
		}
		
	
	}


