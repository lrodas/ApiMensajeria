package com.cycsystems.mensajeria.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "mensaje")
public class Mensaje {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idMensaje;
	private String texto;
	private String remitente;
	private String destinatario;
	private Date fechaCreacion;
	private Date fechaEnvio;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Empresa empresa;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Canal canal;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private EstadoMensaje estado;
	
	@PrePersist
	public void prePersist() {
		this.fechaCreacion = new Date();
	}

	public Mensaje(Integer idMensaje, String texto, String remitente, String destinatario, Date fechaCreacion,
			Date fechaEnvio, Empresa empresa, Canal canal, EstadoMensaje estado) {
		this.idMensaje = idMensaje;
		this.texto = texto;
		this.remitente = remitente;
		this.destinatario = destinatario;
		this.fechaCreacion = fechaCreacion;
		this.fechaEnvio = fechaEnvio;
		this.empresa = empresa;
		this.canal = canal;
		this.estado = estado;
	}

	public Mensaje() {
	}

	public Integer getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(Integer idMensaje) {
		this.idMensaje = idMensaje;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}

	public EstadoMensaje getEstado() {
		return estado;
	}

	public void setEstado(EstadoMensaje estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Mensaje [idMensaje=" + idMensaje + ", texto=" + texto + ", remitente=" + remitente + ", destinatario="
				+ destinatario + ", fechaCreacion=" + fechaCreacion + ", fechaEnvio=" + fechaEnvio + ", empresa="
				+ empresa + ", canal=" + canal + ", estado=" + estado + "]";
	}
}
