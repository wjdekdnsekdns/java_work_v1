package com.tenco.blog;

import com.tenco.blog.controller.BlogController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

public class MainTest2 {

	public static void main(String[] args) {

		// UserDTO dto = new UserDTO("티모", "5678", "a@nate.com", "부산");
		UserController userController = new UserController();
		
		// 로그인 성공
		UserDTO loginUser = userController.requestsingIn("티모", "5678");
		System.out.println("userId : " + loginUser.getId());
		
		BlogController blogController = new BlogController();
		if(loginUser.getId() != 0) {
			int response = blogController.reqSaveBorad("MVC 패턴에 이해2", "Model-Vies_Controller", loginUser.getId());
			if(response == 0) {
				System.out.println("글쓰기에 실패 하였습니다");
			}else {
				System.out.println("글쓰기에 성공 하였습니다");
			}
		}
		
		// id,title,content,readeCount,userId
		// title,content,userId -> String 하나씩 지정, 클래스 만들어서 넘기는 방법
		
	}

}
