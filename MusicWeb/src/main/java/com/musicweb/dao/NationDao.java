package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Nation;
import com.musicweb.model.Nation;

@Repository
public class NationDao implements DAO<Nation> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Nation getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Nation.class, id);
	}

	@Override
	public List<Nation> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Nation").list();
	}

	@Override
	public Boolean add(Nation t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Nation t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Nation t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
