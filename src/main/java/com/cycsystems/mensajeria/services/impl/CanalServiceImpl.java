package com.cycsystems.mensajeria.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cycsystems.mensajeria.dao.CanalRepository;
import com.cycsystems.mensajeria.entities.Canal;
import com.cycsystems.mensajeria.services.ICanalService;

@Service
public class CanalServiceImpl implements ICanalService {

	@Autowired
	private CanalRepository repository;
	
	@Override
	public Canal save(Canal entity) {
		return repository.save(entity);
	}

	@Override
	public Canal findById(Integer id) {
		return this.repository.findById(id).get();
	}

	@Override
	public boolean existsById(Integer id) {
		return this.repository.existsById(id);
	}

	@Override
	public List<Canal> findAll() {
		return this.repository.findAll();
	}

	@Override
	public long count() {
		return this.repository.count();
	}

}
