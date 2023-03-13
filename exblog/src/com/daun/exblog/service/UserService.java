package com.daun.exblog.service;

import com.daun.exblog.dao.UserDAO;
import com.daun.exblog.dto.UserDTO;

public class UserService {
	private UserDAO userDAO;

	public UserService() {
		userDAO = new UserDAO();
	}

	public String signUp(UserDTO user) {
		String msg = "";
		if (user.getUsername().equals("")) {
			msg = "사용자 이름을 입력하세요";
			System.out.println(msg);
			return msg;
		}
		user.setUserRole("USER");
		int resultRow = userDAO.saveUser(user);
		return resultRow + "";

	}
	public UserDTO chekUser(String username, String password) {
		boolean isValid = true;
		if(username.equals("")) {
			isValid = false;
		}else if (password.equals("")) {
			isValid = false;
		}
		UserDTO userDTO = null;
		if(isValid) {
			userDTO = userDAO.selectUserByUsernameAndPassword(username, password);
		}
		return userDTO;
		
	}
}
