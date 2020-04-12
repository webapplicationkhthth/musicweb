package com.musicweb.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "playlist_song")
public class Playlist_Song {
	@EmbeddedId
	private Playlist_SongId id;

	public Playlist_Song(Playlist_SongId id) {
		super();
		this.id = id;
	}

	public Playlist_Song() {
		super();
	}

	public Playlist_SongId getId() {
		return id;
	}

	public void setId(Playlist_SongId id) {
		this.id = id;
	}
}
