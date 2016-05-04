package com.movie.DAO;

import java.util.Date;
import java.util.List;

import com.movie.domain.Artist;
import com.movie.domain.Director;
import com.movie.domain.Movie;

public interface MovieDAO {

	public List<Movie> findAll();

	public String findGenre(Movie movie);

	public String findGenre(int id);

	public String findRating(Movie movie);

	public String findRating(int id);

	public Date findYear(Movie m);

	public Date findYear(int id);

	public List<Artist> findArtist(Movie m);

	public List<Artist> findArtist(int id);

	public List<Director> findDirector(Movie m);

	public List<Director> findDirector(int id);

	public List<Character> findCharacters(Movie m);

	public List<Character> findCharacters(int id);

	public void save(Movie m);
}
