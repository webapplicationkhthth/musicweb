package com.musicweb.controller;

import java.util.Locale;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.musicweb.model.Account;

@Controller
@RequestMapping(value = "signInController")
public class SignInController {
	private Account account;
	private String langGlobal = "en";
	@Autowired
	private SessionLocaleResolver localeResolver;

	@GetMapping(value = "/")
	public String display(@RequestParam(value = "lang", defaultValue = "en") String language) {
		switch (language) {
		case "en":
			langGlobal = language;
			localeResolver.setDefaultLocale(new Locale("en", "US"));
			break;
		case "vi":
			langGlobal = language;
			localeResolver.setDefaultLocale(new Locale("vi", "VN"));
			break;
		default:
			break;
		}
		return "signIn";
	}

	@Async
	public void sendMail(String content, String mail) {
		SendMail.send(content, mail);
	}

	@GetMapping(value = "/getcode")
	@ResponseBody
	public int getCode(@RequestParam("email") String email) {
		int code = new Random().nextInt(999999) + 100000;
		String content = "";
		if (langGlobal.equalsIgnoreCase("en")) {
			content = "<h3>This is code automatically generated : MW-<strong style='color:red;'>#code</strong>,</h3>"
					+ "<p>The code will be valid for 2 minutes.</p>";
		} else {
			content = "<h3>Đây là mã xác nhận được tạo tự động : MW-<strong style='color:red;'>#code</strong>,</h3>"
					+ "<p>Mã này sẽ có hiệu lực trong 2 phút.</p>";
		}
		content = content.replace("#code", code + "");
		sendMail(content, email);
		return code;
	}
}
