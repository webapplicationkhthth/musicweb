package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Genre;
import com.musicweb.model.Genre;

@Repository
public class GenreDao implements DAO<Genre> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Genre getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Genre.class, id);
	}

	@Override
	public List<Genre> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Genre").list();
	}

	@Override
	public Boolean add(Genre t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Genre t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Genre t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
