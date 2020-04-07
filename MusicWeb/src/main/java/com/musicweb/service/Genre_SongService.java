package com.musicweb.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicweb.dao.DAO;
import com.musicweb.model.Genre_Song;

@Service
@Transactional
public class Genre_SongService /* implements DAO<Genre_Song> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Genre_Song> genre_songDao;

//	@Override
	public Genre_Song getOne(Integer id) {
		return genre_songDao.getOne(id);
	}

//	@Override
	public List<Genre_Song> getAll() {
		return genre_songDao.getAll();
	}

//	@Override
	public Boolean add(Genre_Song t) {
		return genre_songDao.add(t);
	}

//	@Override
	public Boolean update(Genre_Song t) {
		return genre_songDao.update(t);
	}

//	@Override
	public Boolean remove(Genre_Song t) {
		return genre_songDao.remove(t);
	}
}
