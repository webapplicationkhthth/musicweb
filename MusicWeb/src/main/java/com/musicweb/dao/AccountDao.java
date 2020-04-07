package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.musicweb.model.Account;

public class AccountDao implements DAO<Account>{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Account getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Account.class, id);
	}

	@Override
	public List<Account> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Account").list();
	}

	@Override
	public Boolean add(Account t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Account t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Account t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
