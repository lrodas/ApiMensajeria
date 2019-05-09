package com.cycsystems.mensajeria.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cycsystems.mensajeria.entities.EstadoMensaje;

@Repository
public interface EstadoMensajeRepository extends JpaRepository<EstadoMensaje, Integer> {

}
