package com.daun.exblog;

import com.daun.exblog.controller.BlogController;
import com.daun.exblog.controller.UserController;
import com.daun.exblog.dto.UserDTO;

public class MainTest2 {

	public static void main(String[] args) {

		UserController userController = new UserController();

		UserDTO loginUser = userController.requestsingIn("정다운", "1234");
		System.out.println("userId : " + loginUser.getId());

		BlogController blogController = new BlogController();
		if (loginUser.getId() != 0) {
			int response = blogController.reqSaveBoard("글 제목 1", "준내 어렵다", loginUser.getId());
			if (response == 0) {
				System.out.println("글쓰기에 실패 하였습니다");
			} else {
				System.out.println("글쓰기에 성공 하였습니다");
			}
		}
	}
}
