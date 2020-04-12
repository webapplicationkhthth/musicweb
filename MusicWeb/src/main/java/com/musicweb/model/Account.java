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
@Table(name = "account")
public class Account {
	private Integer id;
	private String name;
	private String email;
	private String password;
	private String role;
	private String avatar;
	private String desciption;
	private Integer liked;
	private Integer follower;
	private String start_vip;
	private Vip vip_id;
	private Nation nation_id;
	private List<Favorite> favorites;
	private List<Album> albums;
	private List<Playlist> playlists;
	private List<Song_Comment> song_Comments;
	private List<Song_Comment_Reply> song_Comment_Replies;
	private List<Newsfeed> newsfeeds;
	private List<Newsfeed_Comment> newsfeed_Comments;
	private List<Newsfeed_Comment_Reply> newsfeed_Comment_Replies;
	private List<Genre_Account> genre_Accounts;

	public Account(Integer id, String name, String email, String password, String role, String avatar,
			String desciption, Integer liked, Integer follower, String start_vip) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.avatar = avatar;
		this.desciption = desciption;
		this.liked = liked;
		this.follower = follower;
		this.start_vip = start_vip;
	}

	public Account() {
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

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "role")
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Column(name = "avatar")
	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Column(name = "description")
	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	@Column(name = "liked")
	public Integer getLiked() {
		return liked;
	}

	public void setLiked(Integer liked) {
		this.liked = liked;
	}

	@Column(name = "follower")
	public Integer getFollower() {
		return follower;
	}

	public void setFollower(Integer follower) {
		this.follower = follower;
	}

	@Column(name = "start_vip")
	public String getStart_vip() {
		return start_vip;
	}

	public void setStart_vip(String start_vip) {
		this.start_vip = start_vip;
	}

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@JoinColumn(name = "vip_id")
	public Vip getVip_id() {
		return vip_id;
	}

	public void setVip_id(Vip vip_id) {
		this.vip_id = vip_id;
	}

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@JoinColumn(name = "nation_id")
	public Nation getNation_id() {
		return nation_id;
	}

	public void setNation_id(Nation nation_id) {
		this.nation_id = nation_id;
	}

	@OneToMany(mappedBy = "account_id", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}

	@OneToMany(mappedBy = "account_id", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Playlist> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(List<Playlist> playlists) {
		this.playlists = playlists;
	}

	@OneToMany(mappedBy = "account_id", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Song_Comment> getSong_Comments() {
		return song_Comments;
	}

	public void setSong_Comments(List<Song_Comment> song_Comments) {
		this.song_Comments = song_Comments;
	}
	
	@OneToMany(mappedBy = "account_id", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Song_Comment_Reply> getSong_Comment_Replies() {
		return song_Comment_Replies;
	}

	public void setSong_Comment_Replies(List<Song_Comment_Reply> song_Comment_Replies) {
		this.song_Comment_Replies = song_Comment_Replies;
	}

	@OneToMany(mappedBy = "account_id", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Newsfeed> getNewsfeeds() {
		return newsfeeds;
	}

	public void setNewsfeeds(List<Newsfeed> newsfeeds) {
		this.newsfeeds = newsfeeds;
	}

	@OneToMany(mappedBy = "account_id", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Newsfeed_Comment> getNewsfeed_Comments() {
		return newsfeed_Comments;
	}

	public void setNewsfeed_Comments(List<Newsfeed_Comment> newsfeed_Comments) {
		this.newsfeed_Comments = newsfeed_Comments;
	}

	@OneToMany(mappedBy = "account_id", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Newsfeed_Comment_Reply> getNewsfeed_Comment_Replies() {
		return newsfeed_Comment_Replies;
	}

	public void setNewsfeed_Comment_Replies(List<Newsfeed_Comment_Reply> newsfeed_Comment_Replies) {
		this.newsfeed_Comment_Replies = newsfeed_Comment_Replies;
	}

	@OneToMany(mappedBy = "id.account", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Favorite> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}
	
	@OneToMany(mappedBy = "id.genre", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Genre_Account> getGenre_Accounts() {
		return genre_Accounts;
	}

	public void setGenre_Accounts(List<Genre_Account> genre_Accounts) {
		this.genre_Accounts = genre_Accounts;
	}
}
