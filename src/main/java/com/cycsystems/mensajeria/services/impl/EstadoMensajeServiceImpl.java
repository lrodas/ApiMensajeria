package com.cycsystems.mensajeria.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cycsystems.mensajeria.dao.EstadoMensajeRepository;
import com.cycsystems.mensajeria.entities.EstadoMensaje;
import com.cycsystems.mensajeria.services.IEstadoMensajeService;

@Service
public class EstadoMensajeServiceImpl implements IEstadoMensajeService {

	@Autowired
	private EstadoMensajeRepository repository;
	
	@Override
	public EstadoMensaje save(EstadoMensaje entity) {
		return this.repository.save(entity);
	}

	@Override
	public EstadoMensaje findById(Integer id) {
		return this.repository.getOne(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return this.repository.existsById(id);
	}

	@Override
	public List<EstadoMensaje> findAll() {
		return this.repository.findAll();
	}

	@Override
	public long count() {
		return this.repository.count();
	}

}
