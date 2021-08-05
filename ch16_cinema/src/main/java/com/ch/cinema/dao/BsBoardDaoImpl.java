package com.ch.cinema.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ch.cinema.model.BsBoard;


@Repository
public class BsBoardDaoImpl implements BsBoardDao{
	@Autowired
	private SqlSessionTemplate sst;
	
	public List<BsBoard> getList(BsBoard bsboard) {
		return sst.selectList("bsboardns.list", bsboard);
	}
	public int delete(int boardno) {
		return sst.delete("bsboardns.delete", boardno);
	}
	public int total(BsBoard bsboard) {
		return sst.selectOne("bsboardns.total", bsboard);
	}
	public int insert(BsBoard bsboard) {
		return sst.insert("bsboardns.insert", bsboard);
	}
	public int total(int movie_id) {
		return sst.selectOne("bsboardns.total", movie_id);
	}
	public int total1(int movieno) {
		return sst.selectOne("bsboardns.total1", movieno);
	}
	public List<BsBoard> getList_1(BsBoard bsboard) {
		return sst.selectList("bsboardns.list_1", bsboard);
	}
	public int getCountForMovieno(int movie_id) {
		return sst.selectOne("bsboardns.getCountForMovieno", movie_id);
	}
}
