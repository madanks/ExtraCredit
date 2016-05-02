package com.movie.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
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
	
	@ManyToMany(mappedBy="movies")
	private List<Director> director;
	
	@OneToMany(mappedBy="movie")
	private List<Comment> comments; 
	
	@ManyToMany(mappedBy="movies")
	private List<Artist> artist;
	

}
