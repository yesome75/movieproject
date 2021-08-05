package com.ch.cinema.dao;

import java.util.List;

import com.ch.cinema.model.BsBoard;
public interface BsBoardDao {

	int delete(int boardno);

	int total(BsBoard bsboard);

	List<BsBoard> getList(BsBoard bsboard);

	int insert(BsBoard bsboard);

	int total(int movie_id);

	int total1(int movieno);

	List<BsBoard> getList_1(BsBoard bsboard);

	int getCountForMovieno(int movie_id);

}
