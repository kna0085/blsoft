package com.ar.springex.domain;

 
public class Obligacion   {

	private Long id;
	private String obligacion;
	private TipoObligacion tipoObligacion;
	private Normativa normativa;
	private boolean activo = true;

	public Long getId() {
		return id;
	}
	public String getObligacion() {
		return obligacion;
	}
	public TipoObligacion getTipoObligacion() {
		return tipoObligacion;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setObligacion(String cumplimiento) {
		this.obligacion = cumplimiento;
	}
	public void setTipoObligacion(TipoObligacion tipoObligacion) {
		this.tipoObligacion = tipoObligacion;
	}
	public Normativa getNormativa() {
		return normativa;
	}
	public void setNormativa(Normativa normativa) {
		this.normativa = normativa;
	}
	
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Normativa # " + normativa.getNumero() + " - Tipo: " + tipoObligacion + " - " + obligacion;
	}

}
