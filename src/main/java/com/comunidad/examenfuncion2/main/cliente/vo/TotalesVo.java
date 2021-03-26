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
public class TotalesVo implements Serializable {

    private int numeroCedula;
    private int idTotales;
    private double descuento;
    private double subtotal;
    private double iva;
    private double total;

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

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public TotalesVo(int numeroCedula, int idTotales, double descuento, double subtotal, double iva, double total) {
        this.numeroCedula = numeroCedula;
        this.idTotales = idTotales;
        this.descuento = descuento;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
    }

    public TotalesVo() {
    }

    @Override
    public String toString() {
        return "TotalesVo{" + "numeroCedula=" + numeroCedula + ", idTotales=" + idTotales + ", descuento=" + descuento + ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + '}';
    }

}
