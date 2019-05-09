package com.cycsystems.mensajeria.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cycsystems.mensajeria.dao.MensajeRepository;
import com.cycsystems.mensajeria.entities.Mensaje;
import com.cycsystems.mensajeria.services.IMensajeService;

@Service
public class MensajeServiceImpl implements IMensajeService {

	@Autowired
	private MensajeRepository repository;
	
	@Override
	public Mensaje save(Mensaje entity) {
		return this.repository.save(entity);
	}

	@Override
	public Mensaje findById(Integer id) {
		return this.repository.getOne(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return this.repository.existsById(id);
	}

	@Override
	public List<Mensaje> findAll() {
		return this.repository.findAll();
	}

	@Override
	public long count() {
		return this.repository.count();
	}

}
