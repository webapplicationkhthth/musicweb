package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Contient;

@Repository
public class ContientDao implements DAO<Contient> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Contient getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Contient.class, id);
	}

	@Override
	public List<Contient> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Contient").list();
	}

	@Override
	public Boolean add(Contient t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Contient t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Contient t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
