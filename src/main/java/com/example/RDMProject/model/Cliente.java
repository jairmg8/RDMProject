package com.example.RDMProject.model;
import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "tipo_documento")
    private Integer tipoDocumento;

    @Column(name = "nro_documento")
    private String nroDocumento;

    @Column(name = "nombre_cliente")
    private String nombreCliente;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "tipo_cliente_proveedor")
    private Integer tipoClienteProveedor;

    @Column(name = "alias")
    private String alias;

    @Column(name = "genero")
    private String genero;

    @Column(name = "numero_celular")
    private String numeroCelular;

    @Column(name = "email")
    private String email;

    @Column(name = "datos_adicionales")
    private String datosAdicionales;

    @Column(name = "estado")
    private Integer estado;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Integer tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
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

    public Integer getTipoClienteProveedor() {
        return tipoClienteProveedor;
    }

    public void setTipoClienteProveedor(Integer tipoClienteProveedor) {
        this.tipoClienteProveedor = tipoClienteProveedor;
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

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
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

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}