package com.example.RDMProject.model;

public class clientes {
    private int idCliente;
    private int tipoDocumento;
    private int nroDocumento;
    private String nombreCliente;
    private String direccion;
    private int tipoClienteProvedoor;
    private String alias;
    private String genero;
    private int numerocelular;
    private String email;
    private String datosAdicionales;
    private int estado;

    public clientes(int idCliente, int tipoDocumento, int nroDocumento, String nombreCliente, String direccion, int tipoClienteProvedoor, String alias, String genero, int numerocelular, String email, String datosAdicionales, int estado) {
        this.idCliente = idCliente;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
        this.tipoClienteProvedoor = tipoClienteProvedoor;
        this.alias = alias;
        this.genero = genero;
        this.numerocelular = numerocelular;
        this.email = email;
        this.datosAdicionales = datosAdicionales;
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTipoClienteProvedoor() {
        return tipoClienteProvedoor;
    }

    public void setTipoClienteProvedoor(int tipoClienteProvedoor) {
        this.tipoClienteProvedoor = tipoClienteProvedoor;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumerocelular() {
        return numerocelular;
    }

    public void setNumerocelular(int numerocelular) {
        this.numerocelular = numerocelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDatosAdicionales() {
        return datosAdicionales;
    }

    public void setDatosAdicionales(String datosAdicionales) {
        this.datosAdicionales = datosAdicionales;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
