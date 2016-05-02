package com.movie.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
	
	@Id@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	
	private String name;
	
	private String address;
	
	private String email;
	
	private String phone;

}
