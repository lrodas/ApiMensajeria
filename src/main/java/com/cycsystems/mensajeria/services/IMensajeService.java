package com.cycsystems.mensajeria.services;

import java.util.List;

import com.cycsystems.mensajeria.entities.Mensaje;

public interface IMensajeService {

	public Mensaje save(Mensaje entity);

	public Mensaje findById(Integer id);

	public boolean existsById(Integer id);

	public List<Mensaje> findAll();

	public long count();
}
