package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Song;

@Service
@Transactional
public class SongService /* implements DAO<Song> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Song> songDao;

//	@Override
	public Song getOne(Integer id) {
		return songDao.getOne(id);
	}

//	@Override
	public List<Song> getAll() {
		return songDao.getAll();
	}

//	@Override
	public Boolean add(Song t) {
		return songDao.add(t);
	}

//	@Override
	public Boolean update(Song t) {
		return songDao.update(t);
	}

//	@Override
	public Boolean remove(Song t) {
		return songDao.remove(t);
	}
}
