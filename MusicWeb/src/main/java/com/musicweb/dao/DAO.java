package com.musicweb.dao;

import java.util.List;

public interface DAO<T> {
	public T getOne(Integer id);
	public List<T> getAll();
	public Boolean add(T t);
	public Boolean update(T t);
	public Boolean remove(T t);
}
