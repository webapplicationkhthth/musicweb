package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Newsfeed_Comment_Reply;
import com.musicweb.model.Newsfeed_Comment_Reply;

@Repository
public class Newsfeed_Comment_ReplyDao implements DAO<Newsfeed_Comment_Reply> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Newsfeed_Comment_Reply getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Newsfeed_Comment_Reply.class, id);
	}

	@Override
	public List<Newsfeed_Comment_Reply> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Newsfeed_Comment_Reply").list();
	}

	@Override
	public Boolean add(Newsfeed_Comment_Reply t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Newsfeed_Comment_Reply t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Newsfeed_Comment_Reply t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
