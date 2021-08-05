package com.ch.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ch.cinema.dao.BsBoardDao;
import com.ch.cinema.model.BsBoard;


@Service
public class BsBoardServiceImpl implements BsBoardService{
	@Autowired
	private BsBoardDao bbd;
	public List<BsBoard> getList(BsBoard bsboard) {
		return bbd.getList(bsboard);
	}
	public int delete(int boardno) {
		return bbd.delete(boardno);
	}
	public int total(BsBoard bsboard) {
		return bbd.total(bsboard);
	}
	public int insert(BsBoard bsboard) {
		return bbd.insert(bsboard);
	}
	public int total(int movie_id) {
		return bbd.total(movie_id);
	}
	public int total1(int movieno) {
		return bbd.total1(movieno);
	}
	public List<BsBoard> getList_1(BsBoard bsboard) {
		return bbd.getList_1(bsboard);
	}
	
	public int getCountForMovieno(int movie_id) {
		return bbd.getCountForMovieno(movie_id);
	}
}
