package com.movie.domain;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Comment {
	
	@ManyToOne
	@JoinColumn(name="user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="movie")
	private Movie movie;

}
