package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Favorite;
import com.musicweb.model.Favorite;

@Repository
public class FavoriteDao implements DAO<Favorite>{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Favorite getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Favorite.class, id);
	}

	@Override
	public List<Favorite> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Favorite").list();
	}

	@Override
	public Boolean add(Favorite t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Favorite t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Favorite t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
