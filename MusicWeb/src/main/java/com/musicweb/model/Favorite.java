package com.musicweb.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "favorite")
public class Favorite {
	@EmbeddedId
	private FavoriteId id;

	public Favorite(FavoriteId id) {
		super();
		this.id = id;
	}

	public Favorite() {
		super();
	}

	public FavoriteId getId() {
		return id;
	}

	public void setId(FavoriteId id) {
		this.id = id;
	}
}
