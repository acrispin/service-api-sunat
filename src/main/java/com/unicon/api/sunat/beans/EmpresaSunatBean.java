package com.unicon.api.sunat.beans;

import java.io.Serializable;

public class EmpresaSunatBean implements Serializable {

    private static final long serialVersionUID = 1L;

    protected String ruc;
    protected String razonSocial;
    protected String estadoContribuyente;
    protected String condicionDomicilio;
    protected String ubigeo;
    protected String tipoVia;
    protected String nombreVia;
    protected String codigoZona;
    protected String tipoZona;
    protected String numeroDomicilio;
    protected String interiorDomicilio;
    protected String lote;
    protected String numeroDepartamento;
    protected String manzana;
    protected String kilometro;

    public EmpresaSunatBean() {
    }

    public EmpresaSunatBean(String ruc, String razonSocial, String estadoContribuyente, String condicionDomicilio, String ubigeo) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.estadoContribuyente = estadoContribuyente;
        this.condicionDomicilio = condicionDomicilio;
        this.ubigeo = ubigeo;
    }

    @Override
    public String toString() {
        return "EmpresaSunatBean{" +
                "ruc='" + ruc + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", estadoContribuyente='" + estadoContribuyente + '\'' +
                ", condicionDomicilio='" + condicionDomicilio + '\'' +
                ", ubigeo='" + ubigeo + '\'' +
                ", tipoVia='" + tipoVia + '\'' +
                ", nombreVia='" + nombreVia + '\'' +
                ", codigoZona='" + codigoZona + '\'' +
                ", tipoZona='" + tipoZona + '\'' +
                ", numeroDomicilio='" + numeroDomicilio + '\'' +
                ", interiorDomicilio='" + interiorDomicilio + '\'' +
                ", lote='" + lote + '\'' +
                ", numeroDepartamento='" + numeroDepartamento + '\'' +
                ", manzana='" + manzana + '\'' +
                ", kilometro='" + kilometro + '\'' +
                '}';
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getEstadoContribuyente() {
        return estadoContribuyente;
    }

    public void setEstadoContribuyente(String estadoContribuyente) {
        this.estadoContribuyente = estadoContribuyente;
    }

    public String getCondicionDomicilio() {
        return condicionDomicilio;
    }

    public void setCondicionDomicilio(String condicionDomicilio) {
        this.condicionDomicilio = condicionDomicilio;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }

    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public String getCodigoZona() {
        return codigoZona;
    }

    public void setCodigoZona(String codigoZona) {
        this.codigoZona = codigoZona;
    }

    public String getTipoZona() {
        return tipoZona;
    }

    public void setTipoZona(String tipoZona) {
        this.tipoZona = tipoZona;
    }

    public String getNumeroDomicilio() {
        return numeroDomicilio;
    }

    public void setNumeroDomicilio(String numeroDomicilio) {
        this.numeroDomicilio = numeroDomicilio;
    }

    public String getInteriorDomicilio() {
        return interiorDomicilio;
    }

    public void setInteriorDomicilio(String interiorDomicilio) {
        this.interiorDomicilio = interiorDomicilio;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getNumeroDepartamento() {
        return numeroDepartamento;
    }

    public void setNumeroDepartamento(String numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getKilometro() {
        return kilometro;
    }

    public void setKilometro(String kilometro) {
        this.kilometro = kilometro;
    }
}
