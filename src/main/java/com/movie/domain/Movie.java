package com.movie.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Movie {
	@Id
	@GeneratedValue
	private int id;

	private String name;

	@Temporal(TemporalType.DATE)
	private Date year;

	@Lob
	private byte[] poster;

	@ManyToMany(mappedBy = "directedmovies")
	private List<Director> director;

	@OneToMany(mappedBy = "movie")
	private List<Comment> comments;

	@ManyToMany(mappedBy = "playedmovies")
	private List<Artist> artist;

	@Enumerated(EnumType.STRING)
	private Rating rating;

	@Enumerated(EnumType.STRING)
	private Genre genre;

	public Movie() {

	}

	public Movie(String name, Date year) {
		this.name = name;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getYear() {
		return year;
	}

	public byte[] getPoster() {
		return poster;
	}

	public List<Director> getDirector() {
		return director;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public List<Artist> getArtist() {
		return artist;
	}

	public Rating getRating() {
		return rating;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public void setPoster(byte[] poster) {
		this.poster = poster;
	}

	public void setDirector(List<Director> director) {
		this.director = director;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public void setArtist(List<Artist> artist) {
		this.artist = artist;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

}
