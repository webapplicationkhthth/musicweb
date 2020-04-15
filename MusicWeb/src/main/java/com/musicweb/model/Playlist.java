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
@Table(name = "playlist")
public class Playlist {
	private Integer id;
	private String name;
	private Account account_id;
	private List<Playlist_Song> playlist_Songs;

	public Playlist(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Playlist() {
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
	@OneToMany(mappedBy = "id.playlist", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Playlist_Song> getPlaylist_Songs() {
		return playlist_Songs;
	}

	public void setPlaylist_Songs(List<Playlist_Song> playlist_Songs) {
		this.playlist_Songs = playlist_Songs;
	}
}
