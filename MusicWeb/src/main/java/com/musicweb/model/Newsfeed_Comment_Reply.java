package com.musicweb.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "newsfeed_comment_reply")
public class Newsfeed_Comment_Reply {
	private Integer id;
	private Integer liked;
	private String content;
	private String comment_date;
	private Newsfeed_Comment newsfeed_comment_id;
	private Account account_id;

	public Newsfeed_Comment_Reply(Integer id, Integer liked, String content, String comment_date) {
		super();
		this.id = id;
		this.liked = liked;
		this.content = content;
		this.comment_date = comment_date;
	}

	public Newsfeed_Comment_Reply() {
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

	@Column(name = "comment_date")
	public String getComment_date() {
		return comment_date;
	}

	public void setComment_date(String comment_date) {
		this.comment_date = comment_date;
	}

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@JoinColumn(name = "newsfeed_comment_id")
	public Newsfeed_Comment getNewsfeed_comment_id() {
		return newsfeed_comment_id;
	}

	public void setNewsfeed_comment_id(Newsfeed_Comment newsfeed_comment_id) {
		this.newsfeed_comment_id = newsfeed_comment_id;
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
}
