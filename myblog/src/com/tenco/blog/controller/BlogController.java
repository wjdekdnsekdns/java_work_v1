package com.tenco.blog.controller;

import com.tenco.blog.service.BlogService;

public class BlogController {

	private BlogService blogService;

	public BlogController() {
		blogService = new BlogService();
	}

	// 블로그 글쓰기 기능 요청
	public int reqSaveBorad(String title, String content, int userId) {
		// 방어적 코드
		if (userId != 0) {
			return blogService.saveBoard(title, content, userId);
		}
		return 0;

	}
	// 게시글 삭제 요청 받기
	public void requstBoradDelete(int boardId, int userId) {
		blogService.deleteByBoardId(boardId, userId);
	}
	// 게시글 선택 요청 받기
	public void selectBoard(int userId) {
		blogService.selectByBoardId(userId);
	}
}
