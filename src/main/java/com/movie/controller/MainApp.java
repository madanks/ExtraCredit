package com.movie.controller;

import java.util.Date;

import com.movie.DAO.MovieDAOImpl;
import com.movie.connection.ManageConnection;
import com.movie.domain.Movie;

public class MainApp {

	static {
		new ManageConnection();
	}

	public static void main(String[] args) {
		MovieDAOImpl mdi = new MovieDAOImpl();
		Movie m = new Movie("Three Idiots", new Date());
		mdi.save(m);

	}

}
