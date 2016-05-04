package com.ar.springex.domain;

import com.ar.springex.util.DateUtil;
import java.util.Date;

public class Contrato {

    private Long id;
    private Date fechaInicio;
    private Date fechaVencimiento;
    private Empresa empresa;
    private String versionDesarrollo;
    private String versionProductiva;
    private TipoLicencia tipoLicencia;

    public Long getId() {
        return id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getVersionDesarrollo() {
        return versionDesarrollo;
    }

    public String getVersionProductiva() {
        return versionProductiva;
    }

    public void setVersionDesarrollo(String versionDesarrollo) {
        this.versionDesarrollo = versionDesarrollo;
    }

    public void setVersionProductiva(String versionProductiva) {
        this.versionProductiva = versionProductiva;
    }

    public TipoLicencia getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(TipoLicencia tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public static String generateVersion(Contrato contrato,
                                         Date date,
                                         boolean versionDesarrollo) {

        StringBuilder version = new StringBuilder();

        version.append(contrato.getId());
        version.append("_");
        version.append(DateUtil.yyyyMMddHHmmss_dateFormat.format(date));

        if (versionDesarrollo) {
            version.append("-DEV");
        }

        return version.toString();

    }

}
