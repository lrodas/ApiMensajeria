package com.cycsystems.mensajeria.services;

import java.util.List;

import com.cycsystems.mensajeria.entities.EstadoMensaje;


public interface IEstadoMensajeService {

	public EstadoMensaje save(EstadoMensaje entity);

	public EstadoMensaje findById(Integer id);

	public boolean existsById(Integer id);

	public List<EstadoMensaje> findAll();

	public long count();
}
