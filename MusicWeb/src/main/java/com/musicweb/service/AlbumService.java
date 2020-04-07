package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Album;

@Service
@Transactional
public class AlbumService /* implements DAO<Album> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Album> albumDao;

//	@Override
	public Album getOne(Integer id) {
		return albumDao.getOne(id);
	}

//	@Override
	public List<Album> getAll() {
		return albumDao.getAll();
	}

//	@Override
	public Boolean add(Album t) {
		return albumDao.add(t);
	}

//	@Override
	public Boolean update(Album t) {
		return albumDao.update(t);
	}

//	@Override
	public Boolean remove(Album t) {
		return albumDao.remove(t);
	}
}
