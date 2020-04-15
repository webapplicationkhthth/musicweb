package com.musicweb.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "album")
public class Album {
	private Integer id;
	private String name;
	private Integer liked;
	private Integer played;
	private Account account_id;
	private List<Song> songs;
	private List<Newsfeed_Album> newsfeed_Albums;

	public Album(Integer id, String name, Integer liked, Integer played) {
		super();
		this.id = id;
		this.name = name;
		this.liked = liked;
		this.played = played;
	}

	public Album() {
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

	@Column(name = "liked")
	public Integer getLiked() {
		return liked;
	}

	public void setLiked(Integer liked) {
		this.liked = liked;
	}

	@Column(name = "played")
	public Integer getPlayed() {
		return played;
	}

	public void setPlayed(Integer played) {
		this.played = played;
	}

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@JoinColumn(name = "account_id")
	public Account getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Account account_id) {
		this.account_id = account_id;
	}

	@JsonIgnore
	@OneToMany(mappedBy = "album_id", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	@JsonIgnore
	@OneToMany(mappedBy = "id.album", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Newsfeed_Album> getNewsfeed_Albums() {
		return newsfeed_Albums;
	}

	public void setNewsfeed_Albums(List<Newsfeed_Album> newsfeed_Albums) {
		this.newsfeed_Albums = newsfeed_Albums;
	}
}
