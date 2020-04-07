package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Newsfeed_Album;

@Service
@Transactional
public class Newsfeed_AlbumService /* implements DAO<Newsfeed_Album> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Newsfeed_Album> newsfeed_albumDao;

//	@Override
	public Newsfeed_Album getOne(Integer id) {
		return newsfeed_albumDao.getOne(id);
	}

//	@Override
	public List<Newsfeed_Album> getAll() {
		return newsfeed_albumDao.getAll();
	}

//	@Override
	public Boolean add(Newsfeed_Album t) {
		return newsfeed_albumDao.add(t);
	}

//	@Override
	public Boolean update(Newsfeed_Album t) {
		return newsfeed_albumDao.update(t);
	}

//	@Override
	public Boolean remove(Newsfeed_Album t) {
		return newsfeed_albumDao.remove(t);
	}
}
