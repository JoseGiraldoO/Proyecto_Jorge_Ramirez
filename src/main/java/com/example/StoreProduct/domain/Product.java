package com.example.StoreProduct.domain;

import com.example.StoreProduct.persistence.entity.Categoria;
public class Product {

    private Integer idPro;
    private String nombre;
    private Integer idCategoria;
    private String codigoBarras;
    private Double precioVenta;
    private Integer cantidadStock;
    private Boolean estado;
    private Categoria categ;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getCodigoBarras() {
        return codigoBarras;
    }
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    public Double getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public Integer getCantidadStock() {
        return cantidadStock;
    }
    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public Integer getIdPro() {
        return idPro;
    }
    public void setIdPro(Integer idPro) {
        this.idPro = idPro;
    }
    public Categoria getCateg() {
        return categ;
    }
    public void setCateg(Categoria categ) {
        this.categ = categ;
    }
}
