package com.musicweb.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.musicweb.service.ContientService;

@Controller
@RequestMapping(value = "testController/")
public class Test {
	@Autowired
	private ContientService contientService;

	@GetMapping(value = "test/")
	public String test() {
		for (Contient c : contientService.getAll())
			System.out.println(c.getName());
		return "example";
	}
}
