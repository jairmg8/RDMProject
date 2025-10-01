package com.example.RDMProject.model;

public class detalleVenta {
    private int idDetalleVenta;
    private int idVenta;
    private int idProducto;
    private int cantidad;
    private double precioUnitario;
    private double descuentoUnitario;
    private double subtotal;

    public detalleVenta(int idDetalleVenta, int idVenta, int idProducto, int cantidad, double precioUnitario, double descuentoUnitario, double subtotal) {
        this.idDetalleVenta = idDetalleVenta;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.descuentoUnitario = descuentoUnitario;
        this.subtotal = subtotal;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getDescuentoUnitario() {
        return descuentoUnitario;
    }

    public void setDescuentoUnitario(double descuentoUnitario) {
        this.descuentoUnitario = descuentoUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
