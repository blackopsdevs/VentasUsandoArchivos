/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.examenfuncion2.main.common;

/**
 *
 * @author Santiago
 */
public class Utils {
    public static int generarId(){
        return (int) Math.floor(Math.random()*(1000000-1+1)+1);
    }
}
