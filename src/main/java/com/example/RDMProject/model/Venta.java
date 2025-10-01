package com.example.RDMProject.model;

import java.util.Date;

public class Venta {
    private int idVenta;
    private int idUsuario;
    private int idCliente;
    private int idTipoComprobante;
    private String serieComprobante;
    private int nroComprobante;
    private Date fecha_compra;
    private Date fecha_emision;
    private String observaciones;
    private double subtotal;
    private double descuento;
    private double igv;
    private double total;

    public Venta(int idVenta, int idUsuario, int idCliente, int idTipoComprobante, String serieComprobante, int nroComprobante, Date fecha_compra, Date fecha_emision, String observaciones, double subtotal, double descuento, double igv, double total) {
        this.idVenta = idVenta;
        this.idUsuario = idUsuario;
        this.idCliente = idCliente;
        this.idTipoComprobante = idTipoComprobante;
        this.serieComprobante = serieComprobante;
        this.nroComprobante = nroComprobante;
        this.fecha_compra = fecha_compra;
        this.fecha_emision = fecha_emision;
        this.observaciones = observaciones;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.igv = igv;
        this.total = total;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTipoComprobante() {
        return idTipoComprobante;
    }

    public void setIdTipoComprobante(int idTipoComprobante) {
        this.idTipoComprobante = idTipoComprobante;
    }

    public String getSerieComprobante() {
        return serieComprobante;
    }

    public void setSerieComprobante(String serieComprobante) {
        this.serieComprobante = serieComprobante;
    }

    public int getNroComprobante() {
        return nroComprobante;
    }

    public void setNroComprobante(int nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
