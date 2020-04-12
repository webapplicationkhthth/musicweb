package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Category_Sub_Song;
import com.musicweb.model.Category_Sub_Song;

@Repository
public class Category_Sub_SongDao implements DAO<Category_Sub_Song> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Category_Sub_Song getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Category_Sub_Song.class, id);
	}

	@Override
	public List<Category_Sub_Song> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Category_Sub_Song").list();
	}

	@Override
	public Boolean add(Category_Sub_Song t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Category_Sub_Song t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Category_Sub_Song t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
