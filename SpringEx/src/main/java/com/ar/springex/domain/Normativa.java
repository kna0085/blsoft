package com.ar.springex.domain;

import java.util.Date;

 
public class Normativa {

	private Long id;
	private Alcance alcance;
	private Categoria categoria;
	private Situacion situacion;
	private Tematica tematica;
	private SubTematica subtematica;
	private Autoridad autoridadAplicacion;
	private Autoridad autoridadEmision;
	private Area area;
	private Date fechaBoletinOficial;
	private String numero;
	private Integer anio;
	private String resumen;
	/*
	 * Usado para saber si hay obligaciones u adjuntos a modificar
	 */
	private String lastModified;
	
	private Long oldId;
	
	public Long getOldId() {
		return oldId;
	}
	public void setOldId(Long oldId) {
		this.oldId = oldId;
	}
	public Long getId() {
		return id;
	}
	public Alcance getAlcance() {
		return alcance;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public Situacion getSituacion() {
		return situacion;
	}
	public Tematica getTematica() {
		return tematica;
	}
	public SubTematica getSubtematica() {
		return subtematica;
	}
	public Autoridad getAutoridadAplicacion() {
		return autoridadAplicacion;
	}
	public Autoridad getAutoridadEmision() {
		return autoridadEmision;
	}
	public Area getArea() {
		return area;
	}
	public Date getFechaBoletinOficial() {
		return fechaBoletinOficial;
	}
	public String getNumero() {
		return numero;
	}
	public Integer getAnio() {
		return anio;
	}
	public String getResumen() {
		return resumen;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setAlcance(Alcance alcance) {
		this.alcance = alcance;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public void setSituacion(Situacion situacion) {
		this.situacion = situacion;
	}
	public void setTematica(Tematica tematica) {
		this.tematica = tematica;
	}
	public void setSubtematica(SubTematica subtematica) {
		this.subtematica = subtematica;
	}
	public void setAutoridadAplicacion(Autoridad autoridadAplicacion) {
		this.autoridadAplicacion = autoridadAplicacion;
	}
	public void setAutoridadEmision(Autoridad autoridadEmision) {
		this.autoridadEmision = autoridadEmision;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public void setFechaBoletinOficial(Date fechaBoletinOficial) {
		this.fechaBoletinOficial = fechaBoletinOficial;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getLastModified() {
		return lastModified;
	}
	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public String toString() {
		return "Normativa # "+numero+" - "+situacion.getDescripcion() + " - " + resumen;
	}

}
