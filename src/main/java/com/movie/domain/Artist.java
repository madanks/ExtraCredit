package com.movie.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Artist extends Person {

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "Artist_Movie", joinColumns = @JoinColumn(name = "artistId") , inverseJoinColumns = @JoinColumn(name = "movieId") )
	private List<Movie> playedmovies;

	@OneToMany(mappedBy = "artist", cascade = CascadeType.PERSIST)
	private List<ArtistCharacter> artistcharacters;

	public Artist() {
		super();
	}

	public Artist(String name, String address, String email, String phone, List<ArtistCharacter> artistcharacters) {
		super(name, address, email, phone);
		this.artistcharacters = artistcharacters;
	}

	public List<Movie> getPlayedmovies() {
		return playedmovies;
	}

	public List<ArtistCharacter> getArtistcharacters() {
		return artistcharacters;
	}

	public void setPlayedmovies(List<Movie> playedmovies) {
		this.playedmovies = playedmovies;
	}

	public void setArtistcharacters(List<ArtistCharacter> artistcharacters) {
		this.artistcharacters = artistcharacters;
	}

}
