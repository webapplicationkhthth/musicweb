package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Vip;

@Repository
public class VipDao implements DAO<Vip>{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Vip getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Vip.class, id);
	}

	@Override
	public List<Vip> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Vip").list();
	}

	@Override
	public Boolean add(Vip t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Vip t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Vip t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
