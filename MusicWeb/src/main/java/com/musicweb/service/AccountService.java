package com.musicweb.service;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
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
	private String hql;

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
	
	public Account getByMail(String email) {
		Account account = null;
		hql = "from Account where email like :email";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("email", email);
		if(query.getResultList().size() > 0)
			account = (Account) query.getResultList().get(0);
		return account;
	}
}
