package com.musicweb.model;

import java.util.jar.Attributes.Name;

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
@Table(name = "newsfeed_image")
public class Newsfeed_Image {
	private Integer id;
	private Newsfeed newsfeed_id;
	private String resource;

	public Newsfeed_Image(Integer id, String resource) {
		super();
		this.id = id;
		this.resource = resource;
	}

	public Newsfeed_Image() {
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

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@JoinColumn(name = "newsfeed_id")
	public Newsfeed getNewsfeed_id() {
		return newsfeed_id;
	}

	public void setNewsfeed_id(Newsfeed newsfeed_id) {
		this.newsfeed_id = newsfeed_id;
	}

	@Column(name = "resource")
	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}
}
