package com.musicweb.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "genre")
public class Genre {
	private Integer id;
	private String name;
	private List<Genre_Account> genre_Accounts;
	private List<Genre_Song> genre_Songs;

	public Genre(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Genre() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "id.genre", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Genre_Account> getGenre_Accounts() {
		return genre_Accounts;
	}

	public void setGenre_Accounts(List<Genre_Account> genre_Accounts) {
		this.genre_Accounts = genre_Accounts;
	}

	@OneToMany(mappedBy = "id.genre", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Genre_Song> getGenre_Songs() {
		return genre_Songs;
	}

	public void setGenre_Songs(List<Genre_Song> genre_Songs) {
		this.genre_Songs = genre_Songs;
	}
}
