/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.examenfuncion2.main.cliente.vo;

import java.io.Serializable;

/**
 *
 * @author Santiago
 */
public class DetalleVo implements Serializable {

    private int numeroCedula;
    private int idTotales;
    private int idDetalle;
    private int idProducto;
    private int cantidad;
    private String descripcion;
    private float precioUnitario;

    public int getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public int getIdTotales() {
        return idTotales;
    }

    public void setIdTotales(int idTotales) {
        this.idTotales = idTotales;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public DetalleVo(int numeroCedula, int idTotales, int idDetalle, int idProducto, int cantidad, String descripcion, float precioUnitario) {
        this.numeroCedula = numeroCedula;
        this.idTotales = idTotales;
        this.idDetalle = idDetalle;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public DetalleVo() {
    }

    @Override
    public String toString() {
        return "DetalleVo{" + "numeroCedula=" + numeroCedula + ", idTotales=" + idTotales + ", idDetalle=" + idDetalle + ", idProducto=" + idProducto + ", cantidad=" + cantidad + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + '}';
    }

}
