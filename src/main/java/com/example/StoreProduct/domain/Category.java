package com.example.StoreProduct.domain;
public class Category {

    private Integer idCa;
    private String descripcion;
    private Boolean estado;
    public Integer getIdCa() {
        return idCa;
    }
    public void setIdCa(Integer idCa) {
        this.idCa = idCa;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
