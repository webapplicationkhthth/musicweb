package com.musicweb.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "genre_account")
public class Genre_Account {
	@EmbeddedId
	private Genre_AccountId id;

	public Genre_Account(Genre_AccountId id) {
		super();
		this.id = id;
	}

	public Genre_Account() {
		super();
	}

	public Genre_AccountId getId() {
		return id;
	}

	public void setId(Genre_AccountId id) {
		this.id = id;
	}
}
