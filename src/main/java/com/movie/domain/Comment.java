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

	public int getId() {
		return id;
	}

	public String getComment() {
		return comment;
	}

	public Date getDatetime() {
		return datetime;
	}

	public User getUser() {
		return user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

}
