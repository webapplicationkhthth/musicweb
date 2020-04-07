package com.musicweb.model;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.musicweb.dao.ContientDao;

@Controller
@RequestMapping(value = "testController/")
@Transactional
public class Test {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	ContientDao contientDao;

	@GetMapping(value = "test/")
	public String test() {
//		contientDao.add(new Contient(null, "Chau Au"));
		for (Contient c : contientDao.getAll())
			System.out.println(c.getName());
		return "example";
	}
}
