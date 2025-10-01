package com.example.RDMProject.model;

public class SerieFactura {
    private int idFactura;
    private String serie;
    private int estado;

    public SerieFactura(int idFactura, String serie, int estado) {
        this.idFactura = idFactura;
        this.serie = serie;
        this.estado = estado;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
