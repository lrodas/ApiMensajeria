package com.cycsystems.mensajeria.dto.output;

public abstract class BaseOutput {

	private String codigo;
	private String descripcion;
	private String indicador;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIndicador() {
		return indicador;
	}

	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}

	@Override
	public String toString() {
		return "BaseOutput [codigo=" + codigo + ", descripcion=" + descripcion + ", indicador=" + indicador + "]";
	}
}
