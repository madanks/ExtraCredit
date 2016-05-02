package com.movie.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Comment {
	@Id
	@GeneratedValue
	private int id;

	private String comment;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date datetime;

	@ManyToOne
	@JoinColumn(name = "user")
	private User user;

	@ManyToOne
	@JoinColumn(name = "movie")
	private Movie movie;

}
