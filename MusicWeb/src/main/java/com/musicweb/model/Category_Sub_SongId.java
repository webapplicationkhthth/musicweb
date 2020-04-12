package com.musicweb.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Category_Sub_SongId implements Serializable {
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@JoinColumn(name = "category_sub_id")
	private Category_Sub category_sub;

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@JoinColumn(name = "song_id")
	private Song song;

	public Category_Sub_SongId(Category_Sub category_sub, Song song) {
		super();
		this.category_sub = category_sub;
		this.song = song;
	}

	public Category_Sub_SongId() {
		super();
	}

	public Category_Sub getCategory_sub() {
		return category_sub;
	}

	public void setCategory_sub(Category_Sub category_sub) {
		this.category_sub = category_sub;
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
		result = prime * result + ((category_sub == null) ? 0 : category_sub.hashCode());
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
		Category_Sub_SongId other = (Category_Sub_SongId) obj;
		if (category_sub == null) {
			if (other.category_sub != null)
				return false;
		} else if (!category_sub.equals(other.category_sub))
			return false;
		if (song == null) {
			if (other.song != null)
				return false;
		} else if (!song.equals(other.song))
			return false;
		return true;
	}
}
