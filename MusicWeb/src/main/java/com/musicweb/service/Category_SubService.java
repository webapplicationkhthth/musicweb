package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Category_Sub;

@Service
@Transactional
public class Category_SubService /* implements DAO<Category_Sub> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Category_Sub> category_subDao;

//	@Override
	public Category_Sub getOne(Integer id) {
		return category_subDao.getOne(id);
	}

//	@Override
	public List<Category_Sub> getAll() {
		return category_subDao.getAll();
	}

//	@Override
	public Boolean add(Category_Sub t) {
		return category_subDao.add(t);
	}

//	@Override
	public Boolean update(Category_Sub t) {
		return category_subDao.update(t);
	}

//	@Override
	public Boolean remove(Category_Sub t) {
		return category_subDao.remove(t);
	}
}
