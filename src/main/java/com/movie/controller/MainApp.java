package com.movie.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.movie.DAO.MovieDAOImpl;
import com.movie.connection.ManageConnection;
import com.movie.domain.Artist;
import com.movie.domain.ArtistCharacter;
import com.movie.domain.Comment;
import com.movie.domain.Director;
import com.movie.domain.Genre;
import com.movie.domain.Movie;
import com.movie.domain.Rating;
import com.movie.domain.User;

public class MainApp {

	static {
		new ManageConnection();
	}

	public static void main(String[] args) {
		MovieDAOImpl mdi = new MovieDAOImpl();

		List<ArtistCharacter> acList = new ArrayList<ArtistCharacter>();
		ArtistCharacter ac1 = new ArtistCharacter("Ram", "Ram in Mahabharat");
		ArtistCharacter ac2 = new ArtistCharacter("Shiva", "Shiva in Mahabharat");
		acList.add(ac1);
		acList.add(ac2);
		List<Artist> lar = new ArrayList<>();
		Artist ar = new Artist("Madan", "Fairfield", "mk@gmail.com", "9849088444", acList);

		ac1.setArtist(ar);
		ac2.setArtist(ar);
		lar.add(ar);
		User u = new User("Govinda", "TX", "gb@gmail.com", "98490000");
		List<Comment> cList = new ArrayList<Comment>();
		Comment c1 = new Comment("Good", new Date(), u);
		Comment c2 = new Comment("Liked Action", new Date(), u);
		cList.add(c1);
		cList.add(c2);
		List<Director> di = new ArrayList<>();
		Director d = new Director("Sabina", "Dharan", "sa@gmail.com", "98090000");
		di.add(d);
		Movie m = new Movie("Three Idiots", new Date(), di, cList, lar, Rating.FOUR, Genre.ACTION);
		c1.setMovie(m);
		c2.setMovie(m);
		List<Movie> lmovie = new ArrayList<>();
		lmovie.add(m);
		ar.setPlayedmovies(lmovie);
		d.setDirectedmovies(lmovie);

		// Insert
		mdi.save(m);

		// find
		Movie retriveMovie = mdi.find(1);
		// System.out.println(retriveMovie.getName());

		// Update
		retriveMovie.setName("Pashupati Prasad");
		mdi.update(retriveMovie);

		// delete
		mdi.delete(1);

		// Search by name of Movie

		Movie moviebyname = mdi.findByName("Pashupati Prasad");
		System.out.println(moviebyname.getRating());

		// search by Genre of the movie
		Movie moviebygenre = mdi.findByGenre(Genre.ACTION);
		System.out.println(moviebygenre.getName());

		// search by Rating of the movie

		Movie moviebyrating = mdi.findByRating(Rating.FOUR);
		System.out.println(moviebyrating.getName());

		// search by Year
		Movie moviebyyear = mdi.findByYear(new Date());
		System.out.println(moviebyyear.getName());

		// Search movie by artist
		List<Movie> listmovie = mdi.findByArtist("Madan");
		for (Movie mo : listmovie) {
			System.out.println("Madan Movie: "+mo.getName());
		}
		//search by character
		List<Movie> listmoviechar = mdi.findByCharacter("Ram");
		for (Movie mo : listmoviechar) {
			System.out.println("Ram character Movie: "+mo.getName());
		}
		
		//search by Director of the movie
		
		List<Movie> listmoviedirector = mdi.findByDirector("Sabina");
		for (Movie mo : listmoviedirector) {
			System.out.println("Sabina directed Movie: "+mo.getName());
		}
	}

}
