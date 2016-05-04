package com.movie.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class User extends Person {

	@OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
	private List<Comment> comments;

	public User() {
		super();
	}

	public User(String name, String address, String email, String phone) {
		super(name, address, email, phone);
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

}
