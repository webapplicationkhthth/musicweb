package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Song_Comment;

@Service
@Transactional
public class Song_CommentService /* implements DAO<Song_Comment> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Song_Comment> song_commentDao;

//	@Override
	public Song_Comment getOne(Integer id) {
		return song_commentDao.getOne(id);
	}

//	@Override
	public List<Song_Comment> getAll() {
		return song_commentDao.getAll();
	}

//	@Override
	public Boolean add(Song_Comment t) {
		return song_commentDao.add(t);
	}

//	@Override
	public Boolean update(Song_Comment t) {
		return song_commentDao.update(t);
	}

//	@Override
	public Boolean remove(Song_Comment t) {
		return song_commentDao.remove(t);
	}
}
