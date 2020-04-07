package com.musicweb.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Newsfeed_SongId implements Serializable {
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@JoinColumn(name = "newsfeed_id")
	private Newsfeed newsfeed;
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@JoinColumn(name = "song_id")
	private Song song;

	public Newsfeed_SongId(Newsfeed newsfeed, Song song) {
		super();
		this.newsfeed = newsfeed;
		this.song = song;
	}

	public Newsfeed_SongId() {
		super();
	}

	public Newsfeed getNewsfeed() {
		return newsfeed;
	}

	public void setNewsfeed(Newsfeed newsfeed) {
		this.newsfeed = newsfeed;
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((newsfeed == null) ? 0 : newsfeed.hashCode());
		result = prime * result + ((song == null) ? 0 : song.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Newsfeed_SongId other = (Newsfeed_SongId) obj;
		if (newsfeed == null) {
			if (other.newsfeed != null)
				return false;
		} else if (!newsfeed.equals(other.newsfeed))
			return false;
		if (song == null) {
			if (other.song != null)
				return false;
		} else if (!song.equals(other.song))
			return false;
		return true;
	}
}
