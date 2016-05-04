package com.ar.springex.domain;

public class Alcance {

    private Long id;

    private String codigo;

    private String descripcion;

    private boolean habilitado;

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

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

}
