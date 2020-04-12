package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Genre;

@Service
@Transactional
public class GenreService /* implements DAO<Genre> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Genre> genreDao;

//	@Override
	public Genre getOne(Integer id) {
		return genreDao.getOne(id);
	}

//	@Override
	public List<Genre> getAll() {
		return genreDao.getAll();
	}

//	@Override
	public Boolean add(Genre t) {
		return genreDao.add(t);
	}

//	@Override
	public Boolean update(Genre t) {
		return genreDao.update(t);
	}

//	@Override
	public Boolean remove(Genre t) {
		return genreDao.remove(t);
	}
}
