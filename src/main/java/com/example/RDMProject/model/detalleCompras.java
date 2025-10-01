package com.example.RDMProject.model;

public class detalleCompras {
    private int idDetalle;
    private int idCompra;
    private int idProducto;
    private int cantidad;
    private double precioUnitario;
    private double descuentoUnitario;
    private double subtotal;

    public detalleCompras(int idDetalle, int idCompra, int idProducto, int cantidad, double precioUnitario, double descuentoUnitario, double subtotal) {
        this.idDetalle = idDetalle;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.descuentoUnitario = descuentoUnitario;
        this.subtotal = subtotal;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
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
