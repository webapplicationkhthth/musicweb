package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Song_Comment_Reply;

@Repository
public class Song_Comment_ReplyDao implements DAO<Song_Comment_Reply> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Song_Comment_Reply getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Song_Comment_Reply.class, id);
	}

	@Override
	public List<Song_Comment_Reply> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Song_Comment_Reply").list();
	}

	@Override
	public Boolean add(Song_Comment_Reply t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Song_Comment_Reply t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Song_Comment_Reply t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
