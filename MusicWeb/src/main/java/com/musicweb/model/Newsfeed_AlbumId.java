package com.musicweb.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Newsfeed_AlbumId implements Serializable {
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@JoinColumn(name = "newsfeed_id")
	private Newsfeed newsfeed;
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@JoinColumn(name = "album_id")
	private Album album;

	public Newsfeed_AlbumId(Newsfeed newsfeed, Album album) {
		super();
		this.newsfeed = newsfeed;
		this.album = album;
	}

	public Newsfeed_AlbumId() {
		super();
	}

	public Newsfeed getNewsfeed() {
		return newsfeed;
	}

	public void setNewsfeed(Newsfeed newsfeed) {
		this.newsfeed = newsfeed;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((album == null) ? 0 : album.hashCode());
		result = prime * result + ((newsfeed == null) ? 0 : newsfeed.hashCode());
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
		Newsfeed_AlbumId other = (Newsfeed_AlbumId) obj;
		if (album == null) {
			if (other.album != null)
				return false;
		} else if (!album.equals(other.album))
			return false;
		if (newsfeed == null) {
			if (other.newsfeed != null)
				return false;
		} else if (!newsfeed.equals(other.newsfeed))
			return false;
		return true;
	}
}
