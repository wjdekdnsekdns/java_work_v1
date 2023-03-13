package com.daun.exblog;

import com.daun.exblog.controller.UserController;
import com.daun.exblog.dto.UserDTO;

public class MainTest {

	public static void main(String[] args) {
		
		UserDTO userDTO = new UserDTO("티모", "1234", "a@naver.com", "부산");
		
		UserController userController = new UserController();
		String result = userController.requestSignUp(userDTO, "localhost");
		System.out.println(result);
		

		
//		UserDTO responseUser = userController.requestsingIn(userDTO.getUsername(), userDTO.getPassword());
//		if(responseUser == null) {
//			System.out.println("로그인 실패");
//		}else {
//			System.out.println("로그인 성공");
//		}
	}

}
