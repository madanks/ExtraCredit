package com.movie.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Perosn {
	
	@Id@GeneratedValue
	private int id;
	
	private String name;
	
	private String address;
	
	private String email;
	
	private String phone;

}
