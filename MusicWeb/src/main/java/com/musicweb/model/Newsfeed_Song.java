package com.musicweb.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "newsfeed_song")
public class Newsfeed_Song {
	@EmbeddedId
	private Newsfeed_SongId id;

	public Newsfeed_Song(Newsfeed_SongId id) {
		super();
		this.id = id;
	}

	public Newsfeed_Song() {
		super();
	}

	public Newsfeed_SongId getId() {
		return id;
	}

	public void setId(Newsfeed_SongId id) {
		this.id = id;
	}
}
