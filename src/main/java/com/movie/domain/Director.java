package com.movie.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Director extends Perosn {
	
	@JoinTable(name="Director_Movie", joinColumns=@JoinColumn(name="directorId"), inverseJoinColumns=@JoinColumn(name="movieId"))
	private List<Movie> movies;
	

}
