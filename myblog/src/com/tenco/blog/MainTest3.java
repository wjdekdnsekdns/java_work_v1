package com.tenco.blog;

import com.tenco.blog.controller.BlogController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

public class MainTest3 {

	public static void main(String[] args) {
		
		// 사용자 여부 확인 
		UserController userController = new UserController();
		BlogController blogController = new BlogController();
		
		UserDTO loginUser = userController.requestsingIn("티모", "5678");
		System.out.println(loginUser);
		
		// main --> BlogController 에 넘겨야 할 값??
		// 해당 계시글에 pk 값을 알아야 한다
		// 사용자에 대한 정보도 필요 하다 (userId)
		//blogController.requstBoradDelete(2, loginUser.getId());
		blogController.selectBoard(3);
		
	}

}
