package ch07;

import java.util.ArrayList;

public class MainTest1 {
	public static void main(String[] args) {

		UserDAO blogDAO = new UserDAO();
//		ArrayList<UserDTO> list = blogDAO.showBlog("이순신");
//		for (int i = 0; i < list.size(); i++) {
//			String neme = list.get(i).getName();
//			String content = list.get(i).getContent();
//			String creatDate = list.get(i).getCreateDate();
//			String reply = list.get(i).getReply();
//			String createReply = list.get(i).getCreateReply();
//			System.out.println("작성자 : " + neme);
//			System.out.println("글 제목 : " + content);
//			System.out.println("작성일자 : " + creatDate);
//			System.out.println("댓글 : " + reply);
//			System.out.println("댓글 작성일자 : " + createReply);
//		}
		
		UserDTO dto = blogDAO.insert(4, "정다운", "본문1", 1, "2021-11-25 13:53:45");
		
	}
}
