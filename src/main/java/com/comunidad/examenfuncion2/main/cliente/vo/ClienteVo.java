/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.examenfuncion2.main.cliente.vo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class ClienteVo implements Serializable{

    private int numeroCedula;
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean esEstudiante;
    private boolean activo;
    private List<DetalleVo> listDetalleVo;
    private TotalesVo totalesVo;

    public int getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsEstudiante() {
        return esEstudiante;
    }

    public void setEsEstudiante(boolean esEstudiante) {
        this.esEstudiante = esEstudiante;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<DetalleVo> getListDetalleVo() {
        return listDetalleVo;
    }

    public void setListDetalleVo(List<DetalleVo> listDetalleVo) {
        this.listDetalleVo = listDetalleVo;
    }

    public TotalesVo getTotalesVo() {
        return totalesVo;
    }

    public void setTotalesVo(TotalesVo totalesVo) {
        this.totalesVo = totalesVo;
    }

    public ClienteVo(int numeroCedula, String nombre, String apellidos, int edad, boolean esEstudiante, boolean activo, List<DetalleVo> listDetalleVo, TotalesVo totalesVo) {
        this.numeroCedula = numeroCedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.esEstudiante = esEstudiante;
        this.activo = activo;
        this.listDetalleVo = listDetalleVo;
        this.totalesVo = totalesVo;
    }

    public ClienteVo() {
    }

    @Override
    public String toString() {
        return "ClienteVo{" + "numeroCedula=" + numeroCedula + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", esEstudiante=" + esEstudiante + ", activo=" + activo + ", listDetalleVo=" + listDetalleVo + ", totalesVo=" + totalesVo + '}';
    }

//    @Override
//    public int compareTo(ClienteVo o) {
//        int byAge = Integer.compare(edad, o.edad);
//        if (byAge != 0) {
//            return byAge;
//        }
//        if (nombre == null) {
//            return o.nombre == null ? 0 : 1;
//        }
//        if (o.nombre == null) {
//            return 1;
//        }
//        return nombre.compareToIgnoreCase(o.nombre);
//    }
}
