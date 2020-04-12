package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Category;

@Repository
public class CategoryDao implements DAO<Category> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Category getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Category.class, id);
	}

	@Override
	public List<Category> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Category").list();
	}

	@Override
	public Boolean add(Category t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Category t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Category t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
