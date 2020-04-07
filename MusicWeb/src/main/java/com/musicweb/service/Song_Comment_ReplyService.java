package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Song_Comment_Reply;

@Service
@Transactional
public class Song_Comment_ReplyService /* implements DAO<Song_Comment_Reply> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Song_Comment_Reply> song_comment_replyDao;

//	@Override
	public Song_Comment_Reply getOne(Integer id) {
		return song_comment_replyDao.getOne(id);
	}

//	@Override
	public List<Song_Comment_Reply> getAll() {
		return song_comment_replyDao.getAll();
	}

//	@Override
	public Boolean add(Song_Comment_Reply t) {
		return song_comment_replyDao.add(t);
	}

//	@Override
	public Boolean update(Song_Comment_Reply t) {
		return song_comment_replyDao.update(t);
	}

//	@Override
	public Boolean remove(Song_Comment_Reply t) {
		return song_comment_replyDao.remove(t);
	}
}
