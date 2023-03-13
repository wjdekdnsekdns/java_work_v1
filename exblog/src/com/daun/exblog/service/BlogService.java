package com.daun.exblog.service;

import com.daun.exblog.dao.BlogDAO;

public class BlogService {
	
	BlogDAO blogDAO;
	public BlogService() {
		blogDAO = new BlogDAO();
	}
	public int saveBoard(String title, String contect, int userId) {
		int resultRowCount = 0;
		if(title.equals("") || title.length() < 2) {
			return resultRowCount;
		}
		resultRowCount = blogDAO.save(title, contect, userId);
		return resultRowCount;
		
	}
}
