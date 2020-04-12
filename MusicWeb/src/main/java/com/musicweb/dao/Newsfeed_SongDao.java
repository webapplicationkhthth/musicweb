package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Newsfeed_Song;
import com.musicweb.model.Newsfeed_Song;

@Repository
public class Newsfeed_SongDao implements DAO<Newsfeed_Song> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Newsfeed_Song getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Newsfeed_Song.class, id);
	}

	@Override
	public List<Newsfeed_Song> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Newsfeed_Song").list();
	}

	@Override
	public Boolean add(Newsfeed_Song t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Newsfeed_Song t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Newsfeed_Song t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
