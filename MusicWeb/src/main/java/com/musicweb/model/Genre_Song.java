package com.musicweb.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "genre_song")
public class Genre_Song {
	@EmbeddedId
	private Genre_SongId id;

	public Genre_Song(Genre_SongId id) {
		super();
		this.id = id;
	}

	public Genre_Song() {
		super();
	}

	public Genre_SongId getId() {
		return id;
	}

	public void setId(Genre_SongId id) {
		this.id = id;
	}
}
