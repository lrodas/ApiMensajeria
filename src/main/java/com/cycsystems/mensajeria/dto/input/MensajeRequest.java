package com.cycsystems.mensajeria.dto.input;

public class MensajeRequest extends BaseInput {

	private String remitente;
	private String destinatario;
	private String asunto;
	private String mensaje;

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

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	@Override
	public String toString() {
		return "MensajeRequest [remitente=" + remitente + ", destinatario=" + destinatario + ", asunto=" + asunto
				+ ", mensaje=" + mensaje + ", toString()=" + super.toString() + "]";
	}
}
