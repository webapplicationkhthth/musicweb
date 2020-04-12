package com.musicweb.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Controller
@RequestMapping(value = "signInController")
public class SignInController {
	@Autowired
	private SessionLocaleResolver localeResolver;
	
	@GetMapping(value = "/")
	public String display(@RequestParam(value = "lang", defaultValue = "en") String language) {
		switch (language) {
		case "en":
			localeResolver.setDefaultLocale(new Locale("en", "US"));
			break;
		case "vi":
			localeResolver.setDefaultLocale(new Locale("vi", "VN"));
			break;
		default:
			break;
		}
		return "signIn";
	}
}
