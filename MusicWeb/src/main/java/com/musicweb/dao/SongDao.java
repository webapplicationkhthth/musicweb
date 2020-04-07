package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.musicweb.model.Song;

public class SongDao implements DAO<Song> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Song getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Song.class, id);
	}

	@Override
	public List<Song> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Song").list();
	}

	@Override
	public Boolean add(Song t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Song t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Song t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
