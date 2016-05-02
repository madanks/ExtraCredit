package com.movie.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ArtistCharacter {
	@Id
	@GeneratedValue
	private int charid;
	
	private String characterName;
	
	private String characterDescription;

	@ManyToOne
	@JoinColumn(name = "artist")
	private Artist artist;

}
