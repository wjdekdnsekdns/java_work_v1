package com.daun.exblog.dao;

import com.daun.exblog.dto.UserDTO;

public interface IUserDAO {
	
	int saveUser(UserDTO user);
	UserDTO selectUserByUsernameAndPassword(String username, String password);
	
}
