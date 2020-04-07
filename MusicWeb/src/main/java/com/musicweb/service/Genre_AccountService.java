package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Genre_Account;

@Service
@Transactional
public class Genre_AccountService /* implements DAO<Genre_Account> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Genre_Account> genre_accountDao;

//	@Override
	public Genre_Account getOne(Integer id) {
		return genre_accountDao.getOne(id);
	}

//	@Override
	public List<Genre_Account> getAll() {
		return genre_accountDao.getAll();
	}

//	@Override
	public Boolean add(Genre_Account t) {
		return genre_accountDao.add(t);
	}

//	@Override
	public Boolean update(Genre_Account t) {
		return genre_accountDao.update(t);
	}

//	@Override
	public Boolean remove(Genre_Account t) {
		return genre_accountDao.remove(t);
	}
}
