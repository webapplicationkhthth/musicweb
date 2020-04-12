package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Newsfeed_Song;

@Service
@Transactional
public class Newsfeed_SongService /* implements DAO<Newsfeed_Song> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Newsfeed_Song> newsfeed_songDao;

//	@Override
	public Newsfeed_Song getOne(Integer id) {
		return newsfeed_songDao.getOne(id);
	}

//	@Override
	public List<Newsfeed_Song> getAll() {
		return newsfeed_songDao.getAll();
	}

//	@Override
	public Boolean add(Newsfeed_Song t) {
		return newsfeed_songDao.add(t);
	}

//	@Override
	public Boolean update(Newsfeed_Song t) {
		return newsfeed_songDao.update(t);
	}

//	@Override
	public Boolean remove(Newsfeed_Song t) {
		return newsfeed_songDao.remove(t);
	}
}
