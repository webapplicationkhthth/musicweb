package com.musicweb.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "category_sub_song")
public class Category_Sub_Song {
	@EmbeddedId
	private Category_Sub_SongId id;

	public Category_Sub_Song(Category_Sub_SongId id) {
		super();
		this.id = id;
	}

	public Category_Sub_Song() {
		super();
	}

	public Category_Sub_SongId getId() {
		return id;
	}

	public void setId(Category_Sub_SongId id) {
		this.id = id;
	}
}
