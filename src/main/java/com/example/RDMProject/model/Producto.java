package com.example.RDMProject.model;
import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "codigo")
    private Integer codigo;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "igv")
    private Double igv;

    @Column(name = "id_unidad_medida")
    private String idUnidadMedida;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "precio_inicial_compra")
    private Double precioInicialCompra;

    @Column(name = "peso_bruto")
    private Double pesoBruto;

    @Column(name = "alias")
    private String alias;

    @Column(name = "stock_min")
    private Integer stockMin;

    @Column(name = "stock_ini")
    private Integer stockIni;

    @Column(name = "descuento")
    private Double descuento;

    @Column(name = "codigo_sunat")
    private String codigoSunat;

    @Column(name = "estado")
    private Integer estado;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getIgv() {
        return igv;
    }

    public void setIgv(Double igv) {
        this.igv = igv;
    }

    public String getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(String idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Double getPrecioInicialCompra() {
        return precioInicialCompra;
    }

    public void setPrecioInicialCompra(Double precioInicialCompra) {
        this.precioInicialCompra = precioInicialCompra;
    }

    public Double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(Double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getStockMin() {
        return stockMin;
    }

    public void setStockMin(Integer stockMin) {
        this.stockMin = stockMin;
    }

    public Integer getStockIni() {
        return stockIni;
    }

    public void setStockIni(Integer stockIni) {
        this.stockIni = stockIni;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public String getCodigoSunat() {
        return codigoSunat;
    }

    public void setCodigoSunat(String codigoSunat) {
        this.codigoSunat = codigoSunat;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public void setId(Long id) {
    }
}
