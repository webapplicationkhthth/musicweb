package com.musicweb.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "newsfeed_album")
public class Newsfeed_Album {
	@EmbeddedId
	private Newsfeed_AlbumId id;

	public Newsfeed_Album(Newsfeed_AlbumId id) {
		super();
		this.id = id;
	}

	public Newsfeed_Album() {
		super();
	}

	public Newsfeed_AlbumId getId() {
		return id;
	}

	public void setId(Newsfeed_AlbumId id) {
		this.id = id;
	}
}
