package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Favorite;

@Service
@Transactional
public class FavoriteService /* implements DAO<Favorite> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Favorite> favoriteDao;

//	@Override
	public Favorite getOne(Integer id) {
		return favoriteDao.getOne(id);
	}

//	@Override
	public List<Favorite> getAll() {
		return favoriteDao.getAll();
	}

//	@Override
	public Boolean add(Favorite t) {
		return favoriteDao.add(t);
	}

//	@Override
	public Boolean update(Favorite t) {
		return favoriteDao.update(t);
	}

//	@Override
	public Boolean remove(Favorite t) {
		return favoriteDao.remove(t);
	}
}
