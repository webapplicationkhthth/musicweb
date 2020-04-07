package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.musicweb.model.Category_Sub;

public class Category_SubDao implements DAO<Category_Sub> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Category_Sub getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Category_Sub.class, id);
	}

	@Override
	public List<Category_Sub> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Category_Sub").list();
	}

	@Override
	public Boolean add(Category_Sub t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Category_Sub t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Category_Sub t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
