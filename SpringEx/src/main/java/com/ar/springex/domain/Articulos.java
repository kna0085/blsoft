package com.ar.springex.domain;

 
public class Articulos  {

	private Long id;
	private String descripcion;
	private Integer numero;
	private Normativa normativa;
	public Long getId() {
		return id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Normativa getNormativa() {
		return normativa;
	}
	public void setNormativa(Normativa normativa) {
		this.normativa = normativa;
	}

}
