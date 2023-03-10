package ch07;

import java.util.ArrayList;

public interface IUserDAO {
	ArrayList<UserDTO> showBlog(String name);
	UserDTO insert(int blogId, String name, String text, int userId, String createDate );
}
