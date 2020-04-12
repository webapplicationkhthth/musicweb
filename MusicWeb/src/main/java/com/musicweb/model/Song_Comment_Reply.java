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
@Table(name = "song_comment_reply")
public class Song_Comment_Reply {
	private Integer id;
	private Integer liked;
	private String content;
	private String comment_date;
	private Song_Comment song_comment_id;
	private Account account_id;

	public Song_Comment_Reply(Integer id, Integer liked, String content, String comment_date) {
		super();
		this.id = id;
		this.liked = liked;
		this.content = content;
		this.comment_date = comment_date;
	}

	public Song_Comment_Reply() {
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
	@JoinColumn(name = "song_comment_id")
	public Song_Comment getSong_comment_id() {
		return song_comment_id;
	}

	public void setSong_comment_id(Song_Comment song_comment_id) {
		this.song_comment_id = song_comment_id;
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
