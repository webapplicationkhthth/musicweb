package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Newsfeed;
import com.musicweb.model.Newsfeed;

@Repository
public class NewsfeedDao implements DAO<Newsfeed> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Newsfeed getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Newsfeed.class, id);
	}

	@Override
	public List<Newsfeed> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Newsfeed").list();
	}

	@Override
	public Boolean add(Newsfeed t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Newsfeed t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Newsfeed t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
