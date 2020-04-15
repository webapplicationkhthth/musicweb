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
@Table(name = "newsfeed")
public class Newsfeed {
	private Integer id;
	private Integer liked;
	private String content;
	private String post_date;
	private Account account_id;
	private List<Newsfeed_Image> newsfeed_Images;
	private List<Newsfeed_Comment> newsfeed_Comments;
	private List<Newsfeed_Song> newsfeed_Songs;
	private List<Newsfeed_Album> newsfeed_Albums;

	public Newsfeed(Integer id, Integer liked, String content, String post_date) {
		super();
		this.id = id;
		this.liked = liked;
		this.content = content;
		this.post_date = post_date;
	}

	public Newsfeed() {
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

	@Column(name = "liked")
	public Integer getLiked() {
		return liked;
	}

	public void setLiked(Integer liked) {
		this.liked = liked;
	}

	@Column(name = "content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "post_date")
	public String getPost_date() {
		return post_date;
	}

	public void setPost_date(String post_date) {
		this.post_date = post_date;
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
	@OneToMany(mappedBy = "newsfeed_id", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Newsfeed_Image> getNewsfeed_Images() {
		return newsfeed_Images;
	}

	public void setNewsfeed_Images(List<Newsfeed_Image> newsfeed_Images) {
		this.newsfeed_Images = newsfeed_Images;
	}

	@JsonIgnore
	@OneToMany(mappedBy = "newsfeed_id", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Newsfeed_Comment> getNewsfeed_Comments() {
		return newsfeed_Comments;
	}

	public void setNewsfeed_Comments(List<Newsfeed_Comment> newsfeed_Comments) {
		this.newsfeed_Comments = newsfeed_Comments;
	}

	@JsonIgnore
	@OneToMany(mappedBy = "id.newsfeed", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Newsfeed_Song> getNewsfeed_Songs() {
		return newsfeed_Songs;
	}

	public void setNewsfeed_Songs(List<Newsfeed_Song> newsfeed_Songs) {
		this.newsfeed_Songs = newsfeed_Songs;
	}
	
	@OneToMany(mappedBy = "id.newsfeed", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Newsfeed_Album> getNewsfeed_Albums() {
		return newsfeed_Albums;
	}

	public void setNewsfeed_Albums(List<Newsfeed_Album> newsfeed_Albums) {
		this.newsfeed_Albums = newsfeed_Albums;
	}
}
