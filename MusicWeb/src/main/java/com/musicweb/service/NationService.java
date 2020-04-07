package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Nation;

@Service
@Transactional
public class NationService /* implements DAO<Nation> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Nation> nationDao;

//	@Override
	public Nation getOne(Integer id) {
		return nationDao.getOne(id);
	}

//	@Override
	public List<Nation> getAll() {
		return nationDao.getAll();
	}

//	@Override
	public Boolean add(Nation t) {
		return nationDao.add(t);
	}

//	@Override
	public Boolean update(Nation t) {
		return nationDao.update(t);
	}

//	@Override
	public Boolean remove(Nation t) {
		return nationDao.remove(t);
	}
}
