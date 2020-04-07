package com.musicweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicweb.model.Genre_Account;
import com.musicweb.model.Genre_Account;

@Repository
public class Genre_AccountDao implements DAO<Genre_Account> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Genre_Account getOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Genre_Account.class, id);
	}

	@Override
	public List<Genre_Account> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Genre_Account").list();
	}

	@Override
	public Boolean add(Genre_Account t) {
		try {
			sessionFactory.getCurrentSession().persist(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean update(Genre_Account t) {
		try {
			sessionFactory.getCurrentSession().update(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean remove(Genre_Account t) {
		try {
			sessionFactory.getCurrentSession().remove(t);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
