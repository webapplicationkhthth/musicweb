package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Album;

@Repository
public class AlbumDao implements DAO<Album> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Album getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Album.class, id);
	}

	@Override
	public List<Album> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Album").list();
	}

	@Override
	public Boolean add(Album t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Album t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Album t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
