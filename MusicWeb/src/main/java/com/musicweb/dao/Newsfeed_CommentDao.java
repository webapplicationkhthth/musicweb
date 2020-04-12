package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Newsfeed_Comment;

@Repository
public class Newsfeed_CommentDao implements DAO<Newsfeed_Comment> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Newsfeed_Comment getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Newsfeed_Comment.class, id);
	}

	@Override
	public List<Newsfeed_Comment> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Newsfeed_Comment").list();
	}

	@Override
	public Boolean add(Newsfeed_Comment t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Newsfeed_Comment t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Newsfeed_Comment t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
