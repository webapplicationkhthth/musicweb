package com.musicweb.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musicweb.dao.DAO;
import com.musicweb.model.Account;

@Transactional
@Service
public class AccountService /* implements DAO<Account> */ {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	DAO<Account> accountDao;

//	@Override
	public Account getOne(Integer id) {
		return accountDao.getOne(id);
	}

//	@Override
	public List<Account> getAll() {
		return accountDao.getAll();
	}

//	@Override
	public Boolean add(Account t) {
		return accountDao.add(t);
	}

//	@Override
	public Boolean update(Account t) {
		return accountDao.update(t);
	}

//	@Override
	public Boolean remove(Account t) {
		return accountDao.remove(t);
	}
}
