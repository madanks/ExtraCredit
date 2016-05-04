package com.movie.DAO;

import java.util.Date;
import java.util.List;

import com.movie.connection.ManageConnection;
import com.movie.domain.Artist;
import com.movie.domain.Director;
import com.movie.domain.Movie;

public class MovieDAOImpl implements MovieDAO {

	@Override
	public List<Movie> findAll() {
		
		return null;
	}

	@Override
	public String findGenre(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findGenre(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findRating(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findRating(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date findYear(Movie m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date findYear(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artist> findArtist(Movie m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artist> findArtist(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Director> findDirector(Movie m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Director> findDirector(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Character> findCharacters(Movie m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Character> findCharacters(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Movie m) {
		ManageConnection.getConnection().persist(m);
		ManageConnection.closeConnection();
		
	}

}
