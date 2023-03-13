package ch07;

import java.util.ArrayList;

public interface IUserDAO {
	ArrayList<UserDTO> showBlog(String name);
	int insert(UserDTO dto );
}
