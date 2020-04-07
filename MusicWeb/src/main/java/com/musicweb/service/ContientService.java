package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Contient;

@Transactional
@Service
public class ContientService/* implements DAO<Contient> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Contient> contientDao;

//	@Override
	public Contient getOne(Integer id) {
		return contientDao.getOne(id);
	}

//	@Override
	public List<Contient> getAll() {
		return contientDao.getAll();
	}

//	@Override
	public Boolean add(Contient t) {
		return contientDao.add(t);
	}

//	@Override
	public Boolean update(Contient t) {
		return contientDao.update(t);
	}

//	@Override
	public Boolean remove(Contient t) {
		return contientDao.remove(t);
	}
}
