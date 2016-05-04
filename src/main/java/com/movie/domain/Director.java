package com.movie.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Director extends Person {

	@ManyToMany
	@JoinTable(name = "Director_Movie", joinColumns = @JoinColumn(name = "directorId") , inverseJoinColumns = @JoinColumn(name = "movieId") )
	private List<Movie> directedmovies;

	public Director() {
		super();
	}

	public Director(String name, String address, String email, String phone) {
		super(name, address, email, phone);
	}

	public List<Movie> getDirectedmovies() {
		return directedmovies;
	}

	public void setDirectedmovies(List<Movie> directedmovies) {
		this.directedmovies = directedmovies;
	}

}
