package com.movie.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class User extends Perosn {
	
	@OneToMany(mappedBy="user")
	private List<Comment> comments; 

}
