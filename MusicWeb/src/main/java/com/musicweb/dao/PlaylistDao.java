package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Playlist;

@Repository
public class PlaylistDao implements DAO<Playlist> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Playlist getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Playlist.class, id);
	}

	@Override
	public List<Playlist> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Playlist").list();
	}

	@Override
	public Boolean add(Playlist t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Playlist t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Playlist t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
