package com.ch.cinema.model;

import java.sql.Date;


public class BsBoard {
	private int boardno;
	private int movie_id;
	private int starscore;
	private String moviem_id;
	private String content;
	private Date reportdate;


	// paging
	private int startRow;
	private int endRow;
	
	
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMoviem_id() {
		return moviem_id;
	}
	public void setMoviem_id(String moviem_id) {
		this.moviem_id = moviem_id;
	}
	public int getBoardno() {
		return boardno;
	}
	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}
	public int getStarscore() {
		return starscore;
	}
	public void setStarscore(int starscore) {
		this.starscore = starscore;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getReportdate() {
		return reportdate;
	}
	public void setReportdate(Date reportdate) {
		this.reportdate = reportdate;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	
}
