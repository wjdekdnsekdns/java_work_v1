package com.daun.exblog.dto;

public class BlogDTO {

	private int id;
	private String title;
	private String content;
	private int readCount;
	private int userId;
	public BlogDTO() {
		// TODO Auto-generated constructor stub
	}
	public BlogDTO(int id, String title, String content, int readCount, int userId) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.readCount = readCount;
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
