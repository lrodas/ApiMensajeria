package com.cycsystems.mensajeria.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEmpresa;
	private String nombre;
	private String direccion;
	private String pbx;
	private String token;
	private String nombreContacto;
	private String telefono;

	public Empresa(Integer idEmpresa, String nombre, String direccion, String pbx, String token, String nombreContacto,
			String telefono) {
		super();
		this.idEmpresa = idEmpresa;
		this.nombre = nombre;
		this.direccion = direccion;
		this.pbx = pbx;
		this.token = token;
		this.nombreContacto = nombreContacto;
		this.telefono = telefono;
	}

	public Empresa() {
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPbx() {
		return pbx;
	}

	public void setPbx(String pbx) {
		this.pbx = pbx;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Empresa [idEmpresa=" + idEmpresa + ", nombre=" + nombre + ", direccion=" + direccion + ", pbx=" + pbx
				+ ", token=" + token + ", nombreContacto=" + nombreContacto + ", telefono=" + telefono + "]";
	}
}
