package com.cycsystems.mensajeria.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "canal")
public class Canal {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCanal;
	private String nombre;
	private Boolean estado;

	public Canal(Integer idCanal, String nombre, Boolean estado) {
		this.idCanal = idCanal;
		this.nombre = nombre;
		this.estado = estado;
	}

	public Canal() {
	}

	public Integer getIdCanal() {
		return idCanal;
	}

	public void setIdCanal(Integer idCanal) {
		this.idCanal = idCanal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Canal [idCanal=" + idCanal + ", nombre=" + nombre + ", estado=" + estado + "]";
	}
}
