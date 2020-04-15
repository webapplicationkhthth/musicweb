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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "category")
public class Category {
	private Integer id;
	private String name;
	private List<Category_Sub> category_Subs;

	public Category(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Category() {
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

	@JsonIgnore
	@OneToMany(mappedBy = "cate_id", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	public List<Category_Sub> getCategory_Subs() {
		return category_Subs;
	}

	public void setCategory_Subs(List<Category_Sub> category_Subs) {
		this.category_Subs = category_Subs;
	}
}
