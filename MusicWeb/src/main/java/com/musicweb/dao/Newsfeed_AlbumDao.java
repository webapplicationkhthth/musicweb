package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Newsfeed_Album;

@Repository
public class Newsfeed_AlbumDao implements DAO<Newsfeed_Album> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Newsfeed_Album getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Newsfeed_Album.class, id);
	}

	@Override
	public List<Newsfeed_Album> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Newsfeed_Album").list();
	}

	@Override
	public Boolean add(Newsfeed_Album t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Newsfeed_Album t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Newsfeed_Album t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
