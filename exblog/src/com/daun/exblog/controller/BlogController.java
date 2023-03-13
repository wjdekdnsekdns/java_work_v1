package com.daun.exblog.controller;

import com.daun.exblog.service.BlogService;

public class BlogController {

	private BlogService blogService;
	public BlogController() {
		blogService = new BlogService();
	}
	
	public int reqSaveBoard(String title, String content, int userId) {
		if(userId != 0) {
			return blogService.saveBoard(title, content, userId);
		}
		return 0;
		
	}
}
