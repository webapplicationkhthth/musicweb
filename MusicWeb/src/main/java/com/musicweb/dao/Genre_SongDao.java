package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Genre_Song;

@Repository
public class Genre_SongDao implements DAO<Genre_SongDao> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Genre_SongDao getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Genre_SongDao.class, id);
	}

	@Override
	public List<Genre_SongDao> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Genre_Song").list();
	}

	@Override
	public Boolean add(Genre_SongDao t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Genre_SongDao t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Genre_SongDao t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
