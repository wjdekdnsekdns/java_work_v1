package com.tenco.blog.dao;

public interface IBlogDAO {

	int save(String title, String content, int userId);
	void select(int userId);
	void update();
	void delete(int boardId);
}
