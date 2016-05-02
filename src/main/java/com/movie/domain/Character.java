package com.movie.domain;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Character {
	
	@ManyToOne
	@JoinColumn(name="artist")
	private Artist artist;

}
