package com.daun.exblog.controller;

import com.daun.exblog.dto.UserDTO;
import com.daun.exblog.service.UserService;

public class UserController {

	public UserController() {
		userService = new UserService();
	}

	private UserService userService;

	public String requestSignUp(UserDTO user, String host) {
		String response = "외부에서는 회원 가입이 안됩니다";
		if (host.equals("localhost")) {
			response = userService.signUp(user);
		}
		return response;
	}

	public UserDTO requestsingIn(String username, String password) {
		
		UserDTO responseUserDto = userService.chekUser(username, password);
		return responseUserDto;
	}
}
