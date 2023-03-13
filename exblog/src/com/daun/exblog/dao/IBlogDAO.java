package com.daun.exblog.dao;

public interface IBlogDAO {
	int save(String title, String content, int userId);
	void select();
	void update();
	void delete();
}
