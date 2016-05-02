package com.movie.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Artist extends Person {
	@ManyToMany
	@JoinTable(name = "Artist_Movie", joinColumns = @JoinColumn(name = "artistId") , inverseJoinColumns = @JoinColumn(name = "movieId") )
	private List<Movie> playedmovies;

	@OneToMany(mappedBy = "artist")
	private List<ArtistCharacter> artistcharacters;

}
