package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Newsfeed_Image;

@Service
@Transactional
public class Newsfeed_ImageService /* implements DAO<Newsfeed_Image> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Newsfeed_Image> newsfeed_imageDao;

//	@Override
	public Newsfeed_Image getOne(Integer id) {
		return newsfeed_imageDao.getOne(id);
	}

//	@Override
	public List<Newsfeed_Image> getAll() {
		return newsfeed_imageDao.getAll();
	}

//	@Override
	public Boolean add(Newsfeed_Image t) {
		return newsfeed_imageDao.add(t);
	}

//	@Override
	public Boolean update(Newsfeed_Image t) {
		return newsfeed_imageDao.update(t);
	}

//	@Override
	public Boolean remove(Newsfeed_Image t) {
		return newsfeed_imageDao.remove(t);
	}
}
