package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Playlist_Song;

@Service
@Transactional
public class Playlist_SongService /* implements DAO<Playlist_Song> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Playlist_Song> playlist_songDao;

//	@Override
	public Playlist_Song getOne(Integer id) {
		return playlist_songDao.getOne(id);
	}

//	@Override
	public List<Playlist_Song> getAll() {
		return playlist_songDao.getAll();
	}

//	@Override
	public Boolean add(Playlist_Song t) {
		return playlist_songDao.add(t);
	}

//	@Override
	public Boolean update(Playlist_Song t) {
		return playlist_songDao.update(t);
	}

//	@Override
	public Boolean remove(Playlist_Song t) {
		return playlist_songDao.remove(t);
	}
}
