package com.musicweb.controller;

class Person {
	private String username;
	private String email;
	private String password;
	private String age;

	public Person() {
		super();
	}

	public Person(String username, String email, String password, String age) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [username=" + username + ", email=" + email + ", password=" + password + ", age=" + age + "]";
	}
}