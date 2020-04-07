package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Newsfeed;

@Service
@Transactional
public class NewsfeedService /* implements DAO<Newsfeed> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Newsfeed> newsfeedDao;

//	@Override
	public Newsfeed getOne(Integer id) {
		return newsfeedDao.getOne(id);
	}

//	@Override
	public List<Newsfeed> getAll() {
		return newsfeedDao.getAll();
	}

//	@Override
	public Boolean add(Newsfeed t) {
		return newsfeedDao.add(t);
	}

//	@Override
	public Boolean update(Newsfeed t) {
		return newsfeedDao.update(t);
	}

//	@Override
	public Boolean remove(Newsfeed t) {
		return newsfeedDao.remove(t);
	}
}
