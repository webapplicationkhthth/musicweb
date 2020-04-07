package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Playlist;

@Service
@Transactional
public class PlaylistService /* implements DAO<Playlist> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Playlist> playlistDao;

//	@Override
	public Playlist getOne(Integer id) {
		return playlistDao.getOne(id);
	}

//	@Override
	public List<Playlist> getAll() {
		return playlistDao.getAll();
	}

//	@Override
	public Boolean add(Playlist t) {
		return playlistDao.add(t);
	}

//	@Override
	public Boolean update(Playlist t) {
		return playlistDao.update(t);
	}

//	@Override
	public Boolean remove(Playlist t) {
		return playlistDao.remove(t);
	}
}
