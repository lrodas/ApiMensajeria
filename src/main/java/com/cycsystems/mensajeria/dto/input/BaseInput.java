package com.cycsystems.mensajeria.dto.input;

public abstract class BaseInput {

	private String usuario;
	private String fechaRequest;
	private String token;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getFechaRequest() {
		return fechaRequest;
	}

	public void setFechaRequest(String fechaRequest) {
		this.fechaRequest = fechaRequest;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "BaseInput [usuario=" + usuario + ", fechaRequest=" + fechaRequest + ", token=" + token + "]";
	}
}
