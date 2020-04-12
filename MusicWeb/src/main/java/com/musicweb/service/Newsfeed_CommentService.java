package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Newsfeed_Comment;

@Service
@Transactional
public class Newsfeed_CommentService /* implements DAO<Newsfeed_Comment> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Newsfeed_Comment> newsfeed_commentDao;

//	@Override
	public Newsfeed_Comment getOne(Integer id) {
		return newsfeed_commentDao.getOne(id);
	}

//	@Override
	public List<Newsfeed_Comment> getAll() {
		return newsfeed_commentDao.getAll();
	}

//	@Override
	public Boolean add(Newsfeed_Comment t) {
		return newsfeed_commentDao.add(t);
	}

//	@Override
	public Boolean update(Newsfeed_Comment t) {
		return newsfeed_commentDao.update(t);
	}

//	@Override
	public Boolean remove(Newsfeed_Comment t) {
		return newsfeed_commentDao.remove(t);
	}
}
