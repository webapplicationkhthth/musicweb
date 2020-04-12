package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Playlist_Song;
import com.musicweb.model.Playlist_Song;

@Repository
public class Playlist_SongDao implements DAO<Playlist_Song> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Playlist_Song getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Playlist_Song.class, id);
	}

	@Override
	public List<Playlist_Song> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Playlist_Song").list();
	}

	@Override
	public Boolean add(Playlist_Song t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Playlist_Song t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Playlist_Song t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
