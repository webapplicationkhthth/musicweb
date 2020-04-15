package com.musicweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.musicweb.model.Account;
import com.musicweb.model.TripleDES;
import com.musicweb.service.AccountService;

@Controller
@RequestMapping(value = "accountController")
public class AccountController {
	@Autowired
	private AccountService accountService;

	@PostMapping(value = "/add")
	@ResponseBody
	public boolean add(@RequestBody(required = false) Account account) throws Exception {
		account.setPassword(TripleDES.encrypt(account.getPassword()));
		return accountService.add(account);
	}

	@GetMapping(value = "/account")
	@ResponseBody
	public Account get(@RequestParam(required = false, value = "email") String email, @RequestParam(required = false, value = "id") String id) throws Exception {
		Account account = null;
		if(email == null) {
			account = accountService.getOne(Integer.parseInt(id));
			if(account != null)
				account.setPassword(TripleDES.decrypt(account.getPassword()));
		} else {
			account = accountService.getByMail(email);
			if(account != null)
				account.setPassword(TripleDES.decrypt(account.getPassword()));
		}
		return account;
	}
	
	@PostMapping(value = "/update")
	@ResponseBody
	public void update(@RequestBody(required = false) Account account) throws Exception {
		account.setPassword(TripleDES.encrypt(account.getPassword()));
		accountService.update(account);
	}
}
