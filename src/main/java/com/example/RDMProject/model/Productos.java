package com.example.RDMProject.model;

import java.awt.*;

public class Productos {
    private int idProducto;
    private String nombre;
    private int codigo;
    private double precioVenta;
    private double igv;
    private String idUnidadMedida;
    private int idCategoria;
    private Image Imagen;
    private double precioInicialCompra;
    private double pesoBruto;
    private String alias;
    private int stockMin;
    private int stockIni;
    private double descuento;
    private String codigoSunat;
    private int estado;

    public Productos(int idProducto, String nombre, int codigo, double precioVenta, double igv, String idUnidadMedida, int idCategoria, Image imagen, double precioInicialCompra, double pesoBruto, String alias, int stockMin, int stockIni, double descuento, String codigoSunat, int estado) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.codigo = codigo;
        this.precioVenta = precioVenta;
        this.igv = igv;
        this.idUnidadMedida = idUnidadMedida;
        this.idCategoria = idCategoria;
        Imagen = imagen;
        this.precioInicialCompra = precioInicialCompra;
        this.pesoBruto = pesoBruto;
        this.alias = alias;
        this.stockMin = stockMin;
        this.stockIni = stockIni;
        this.descuento = descuento;
        this.codigoSunat = codigoSunat;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public String getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(String idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Image getImagen() {
        return Imagen;
    }

    public void setImagen(Image imagen) {
        Imagen = imagen;
    }

    public double getPrecioInicialCompra() {
        return precioInicialCompra;
    }

    public void setPrecioInicialCompra(double precioInicialCompra) {
        this.precioInicialCompra = precioInicialCompra;
    }

    public double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public int getStockIni() {
        return stockIni;
    }

    public void setStockIni(int stockIni) {
        this.stockIni = stockIni;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getCodigoSunat() {
        return codigoSunat;
    }

    public void setCodigoSunat(String codigoSunat) {
        this.codigoSunat = codigoSunat;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
