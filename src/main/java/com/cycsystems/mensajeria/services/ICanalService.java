package com.cycsystems.mensajeria.services;

import java.util.List;

import com.cycsystems.mensajeria.entities.Canal;

public interface ICanalService {

	public Canal save(Canal entity);

	public Canal findById(Integer id);

	public boolean existsById(Integer id);

	public List<Canal> findAll();

	public long count();
	
}
