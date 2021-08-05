package com.ch.cinema.service;

import java.util.List;

import com.ch.cinema.model.Movie;

public interface MovieService {
	int movieinsert(Movie movie);
	int getMaxNum();
	int getTotal();
	List<Movie> list(Movie movie);
	List<Movie> mainList(Movie movie);
}
