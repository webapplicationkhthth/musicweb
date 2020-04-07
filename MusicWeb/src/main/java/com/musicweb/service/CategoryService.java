package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Category;

@Service
@Transactional
public class CategoryService /* implements DAO<Category> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Category> categoryDao;

//	@Override
	public Category getOne(Integer id) {
		return categoryDao.getOne(id);
	}

//	@Override
	public List<Category> getAll() {
		return categoryDao.getAll();
	}

//	@Override
	public Boolean add(Category t) {
		return categoryDao.add(t);
	}

//	@Override
	public Boolean update(Category t) {
		return categoryDao.update(t);
	}

//	@Override
	public Boolean remove(Category t) {
		return categoryDao.remove(t);
	}
}
