package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Newsfeed_Comment_Reply;

@Service
@Transactional
public class Newsfeed_Comment_ReplyService /* implements DAO<Newsfeed_Comment_Reply> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Newsfeed_Comment_Reply> newsfeed_comment_replyDao;

//	@Override
	public Newsfeed_Comment_Reply getOne(Integer id) {
		return newsfeed_comment_replyDao.getOne(id);
	}

//	@Override
	public List<Newsfeed_Comment_Reply> getAll() {
		return newsfeed_comment_replyDao.getAll();
	}

//	@Override
	public Boolean add(Newsfeed_Comment_Reply t) {
		return newsfeed_comment_replyDao.add(t);
	}

//	@Override
	public Boolean update(Newsfeed_Comment_Reply t) {
		return newsfeed_comment_replyDao.update(t);
	}

//	@Override
	public Boolean remove(Newsfeed_Comment_Reply t) {
		return newsfeed_comment_replyDao.remove(t);
	}
}
