package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Song_Comment;

@Repository
public class Song_CommentDao implements DAO<Song_Comment> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Song_Comment getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Song_Comment.class, id);
	}

	@Override
	public List<Song_Comment> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Song_Comment").list();
	}

	@Override
	public Boolean add(Song_Comment t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Song_Comment t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Song_Comment t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
