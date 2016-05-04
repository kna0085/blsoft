package com.ar.springex.domain;

import java.util.List;

public class ItemContrato {

    private Long id;

    private Contrato contrato;

    private Normativa normativa;

    private Obligacion obligacion;

    private Integer hashCode;

    private String version;

    public ItemContrato() {
    }

    public Long getId() {
        return id;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public Normativa getNormativa() {
        return normativa;
    }

    public Obligacion getObligacion() {
        return obligacion;
    }

    public Integer getHashCode() {
        return hashCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public void setNormativa(Normativa normativa) {
        this.normativa = normativa;
    }

    public void setObligacion(Obligacion obligacion) {
        this.obligacion = obligacion;
    }

    public void setHashCode(Integer hashCode) {
        this.hashCode = hashCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getItemContratoKey() {

        return this.contrato.getId() + "-" + (this.normativa != null ? "N-" + this.normativa.getId() : "O-"
                                                                                                       + this.obligacion.getId());

    }

    public boolean isInCollection(List<Obligacion> obligaciones) {

        if (this.obligacion == null) {
            return false;
        }

        for (Obligacion obligacion : obligaciones) {

            if (obligacion.getId().equals(this.obligacion.getId())) {
                return true;
            }
        }

        return false;

    }

    public void buildHashCode() {
        StringBuilder tmp = new StringBuilder();

        if (this.normativa != null) {
            tmp.append(this.normativa.getAlcance().getDescripcion());
            tmp.append(this.normativa.getSituacion().getCodigo());
            tmp.append(this.normativa.getTematica().getCodigo());
            tmp.append(this.normativa.getSubtematica().getCodigo());
            tmp.append(this.normativa.getArea().getCodigo());
            tmp.append(this.normativa.getSubtematica().getCodigo());
            tmp.append(this.normativa.getAutoridadAplicacion().getCodigo());
            tmp.append(this.normativa.getAutoridadEmision().getCodigo());
            tmp.append(this.normativa.getResumen());
            tmp.append(this.normativa.getLastModified());
        } else {

            tmp.append(this.obligacion.getTipoObligacion().toString());
            tmp.append(this.obligacion.getObligacion().toString());
            tmp.append(this.obligacion.isActivo());
        }

        this.setHashCode(tmp.toString().hashCode());
    }

    @Override
    public ItemContrato clone() {
        ItemContrato ic = new ItemContrato();
        ic.setContrato(this.contrato);
        ic.setHashCode(this.hashCode);
        ic.setNormativa(this.normativa);
        ic.setObligacion(this.obligacion);
        ic.setVersion(this.version);

        return ic;
    }

}
