package com.heaven.mvc.board.domain;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias; //ÀÌ°Å ¾ÈÇÏ¸é ¹ØÀÇ Alias ¿¡·¯¶ä


@Alias("boardVO")
public class BoardVO {
	private int seq;

	private String title;
	
	private String content;
	
	private String writer;
	private int password;
	private Timestamp regDate;
	private int cnt;
	
	public BoardVO() {}
	
	public BoardVO (String title, String content, String writer, int password) {
		super();
		this.title  = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
		this.cnt = 0;
	}
	
	public void boardprint() {
		System.out.println("¸â¹ö:");
		System.out.println(this.seq);
	}
	
	public int getSeq() {return this.seq;}
	public String getTitle() {return this.title;}
	public String getContent() {return this.content;}
	public String getWriter() {return this.writer;}
	public int getPassword() {return this.password;}
	public Timestamp getRegDate() {return this.regDate;}
	public int getCnt() {return this.cnt;}
	
	public void setSeq(int seq) {this.seq = seq;}
	public void setTitle(String title) {this.title = title;}
	public void setContent(String content) {this.content = content;}
	public void setWriter(String writer) {this.writer = writer;}
	public void setPassword(int password) {this.password = password;}
	public void setRegDate(Timestamp regDate) {this.regDate = regDate;}
	public void setCnt(int cnt) {this.cnt = cnt;}

}
