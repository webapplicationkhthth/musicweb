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

@Entity
@Table(name = "song")
public class Song {
	private Integer id;
	private String name;
	private boolean copyright;
	private Integer played;
	private Integer liked;
	private String released_date;
	private Account account_id;
	private Album album_id;
	private List<Category_Sub_Song> category_Sub_Songs;
	private List<Newsfeed_Song> newsfeed_Songs;
	private List<Favorite> favorites;
	private List<Playlist_Song> playlist_Songs;
	private List<Genre_Song> genre_Songs;

	public Song(Integer id, String name, boolean copyright, Integer played, Integer liked, String released_date) {
		super();
		this.id = id;
		this.name = name;
		this.copyright = copyright;
		this.played = played;
		this.liked = liked;
		this.released_date = released_date;
	}

	public Song() {
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

	@Column(name = "copyright")
	public boolean getCopyright() {
		return copyright;
	}

	public void setCopyright(boolean copyright) {
		this.copyright = copyright;
	}

	@Column(name = "played")
	public Integer getPlayed() {
		return played;
	}

	public void setPlayed(Integer played) {
		this.played = played;
	}

	@Column(name = "liked")
	public Integer getLiked() {
		return liked;
	}

	public void setLiked(Integer liked) {
		this.liked = liked;
	}

	@Column(name = "released_date")
	public String getReleased_date() {
		return released_date;
	}

	public void setReleased_date(String released_date) {
		this.released_date = released_date;
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

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@JoinColumn(name = "album_id")
	public Album getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(Album album_id) {
		this.album_id = album_id;
	}

	@OneToMany(mappedBy = "id.song", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Category_Sub_Song> getCategory_Sub_Songs() {
		return category_Sub_Songs;
	}

	public void setCategory_Sub_Songs(List<Category_Sub_Song> category_Sub_Songs) {
		this.category_Sub_Songs = category_Sub_Songs;
	}

	@OneToMany(mappedBy = "id.song", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Newsfeed_Song> getNewsfeed_Songs() {
		return newsfeed_Songs;
	}

	public void setNewsfeed_Songs(List<Newsfeed_Song> newsfeed_Songs) {
		this.newsfeed_Songs = newsfeed_Songs;
	}

	@OneToMany(mappedBy = "id.song", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Favorite> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}
	
	@OneToMany(mappedBy = "id.song", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Playlist_Song> getPlaylist_Songs() {
		return playlist_Songs;
	}

	public void setPlaylist_Songs(List<Playlist_Song> playlist_Songs) {
		this.playlist_Songs = playlist_Songs;
	}
	
	@OneToMany(mappedBy = "id.song", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Genre_Song> getGenre_Songs() {
		return genre_Songs;
	}

	public void setGenre_Songs(List<Genre_Song> genre_Songs) {
		this.genre_Songs = genre_Songs;
	}
}
