package com.cycsystems.mensajeria.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estadoMensaje")
public class EstadoMensaje {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idMensaje;
	private String descripcion;

	public EstadoMensaje(Integer idMensaje, String descripcion) {
		this.idMensaje = idMensaje;
		this.descripcion = descripcion;
	}

	public EstadoMensaje() {
	}

	public Integer getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(Integer idMensaje) {
		this.idMensaje = idMensaje;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "EstadoMensaje [idMensaje=" + idMensaje + ", descripcion=" + descripcion + "]";
	}

}
