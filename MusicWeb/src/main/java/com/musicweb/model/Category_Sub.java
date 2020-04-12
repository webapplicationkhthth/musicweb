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
@Table(name = "category_sub")
public class Category_Sub {
	private Integer id;
	private String name;
	private Integer played;
	private Integer liked;
	private Category cate_id;
	private List<Category_Sub_Song> category_Sub_Songs;

	public Category_Sub(Integer id, String name, Integer played, Integer liked) {
		super();
		this.id = id;
		this.name = name;
		this.played = played;
		this.liked = liked;
	}

	public Category_Sub() {
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

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@JoinColumn(name = "cate_id")
	public Category getCate_id() {
		return cate_id;
	}

	public void setCate_id(Category cate_id) {
		this.cate_id = cate_id;
	}

	@OneToMany(mappedBy = "id.category_sub", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.DETACH })
	public List<Category_Sub_Song> getCategory_Sub_Songs() {
		return category_Sub_Songs;
	}

	public void setCategory_Sub_Songs(List<Category_Sub_Song> category_Sub_Songs) {
		this.category_Sub_Songs = category_Sub_Songs;
	}
}
