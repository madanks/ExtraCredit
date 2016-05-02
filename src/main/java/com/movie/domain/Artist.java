package com.movie.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Artist extends Perosn {
	
	@JoinTable(name="Artist_Movie", joinColumns=@JoinColumn(name="artistId"), inverseJoinColumns=@JoinColumn(name="movieId"))
	private List<Movie> movies;
	
	

}
