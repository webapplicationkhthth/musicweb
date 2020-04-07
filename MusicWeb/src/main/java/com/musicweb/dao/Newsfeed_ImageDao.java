package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Newsfeed_Image;

@Repository
public class Newsfeed_ImageDao implements DAO<Newsfeed_Image> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Newsfeed_Image getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Newsfeed_Image.class, id);
	}

	@Override
	public List<Newsfeed_Image> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Newsfeed_Image").list();
	}

	@Override
	public Boolean add(Newsfeed_Image t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Newsfeed_Image t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Newsfeed_Image t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
