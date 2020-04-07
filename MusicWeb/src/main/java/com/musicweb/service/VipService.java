package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Vip;

@Service
@Transactional
public class VipService /* implements DAO<Vip> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Vip> vipDao;

//	@Override
	public Vip getOne(Integer id) {
		return vipDao.getOne(id);
	}

//	@Override
	public List<Vip> getAll() {
		return vipDao.getAll();
	}

//	@Override
	public Boolean add(Vip t) {
		return vipDao.add(t);
	}

//	@Override
	public Boolean update(Vip t) {
		return vipDao.update(t);
	}

//	@Override
	public Boolean remove(Vip t) {
		return vipDao.remove(t);
	}
}
