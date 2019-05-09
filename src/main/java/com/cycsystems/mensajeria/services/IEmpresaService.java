package com.cycsystems.mensajeria.services;

import java.util.List;

import com.cycsystems.mensajeria.entities.Empresa;

public interface IEmpresaService {

	public Empresa save(Empresa entity);

	public Empresa findById(Integer id);

	public boolean existsById(Integer id);

	public List<Empresa> findAll();

	public long count();
	
	public abstract Empresa findByToken(String token);
}
