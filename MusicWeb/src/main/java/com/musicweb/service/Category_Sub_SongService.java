package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Category_Sub_Song;

@Service
@Transactional
public class Category_Sub_SongService /* implements DAO<Category_Sub_Song> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Category_Sub_Song> category_sub_songDao;

//	@Override
	public Category_Sub_Song getOne(Integer id) {
		return category_sub_songDao.getOne(id);
	}

//	@Override
	public List<Category_Sub_Song> getAll() {
		return category_sub_songDao.getAll();
	}

//	@Override
	public Boolean add(Category_Sub_Song t) {
		return category_sub_songDao.add(t);
	}

//	@Override
	public Boolean update(Category_Sub_Song t) {
		return category_sub_songDao.update(t);
	}

//	@Override
	public Boolean remove(Category_Sub_Song t) {
		return category_sub_songDao.remove(t);
	}
}
