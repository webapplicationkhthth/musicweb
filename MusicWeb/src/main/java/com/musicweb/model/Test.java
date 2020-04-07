package com.musicweb.model;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "testController/")
@Transactional
public class Test {
	@Autowired
	SessionFactory sessionFactory;
	
	@GetMapping(value = "test/")
	public String test () {
		return "example";
	}
}
