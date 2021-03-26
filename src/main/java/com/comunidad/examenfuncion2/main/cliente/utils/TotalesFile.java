/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.examenfuncion2.main.cliente.utils;

import com.comunidad.examenfuncion2.main.cliente.vo.ClienteVo;
import com.comunidad.examenfuncion2.main.cliente.vo.TotalesVo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class TotalesFile {

    String homeSistema = null;
    File directorio = null;
    File archivoTotales = null;
    FileOutputStream fos = null;
    ObjectOutputStream salida = null;
    FileInputStream fis = null;
    ObjectInputStream entrada = null;
    List<TotalesVo> listTotalesVo = null;

    public TotalesFile() {
        homeSistema = System.getProperty("user.dir");
        directorio = new File(homeSistema + "/local/sistema");
        archivoTotales = new File(directorio + "/totales.dat");
    }

    public void guardarTotalesVo(TotalesVo totalesVo) throws Exception {
        try {
            fos = new FileOutputStream(archivoTotales);
            salida = new ObjectOutputStream(fos);
            salida.writeObject(totalesVo);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException -> " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException -> " + e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println("IOException finally ->" + e.getMessage());
            }
        }
    }

    private List<TotalesVo> leerFicheroTotales() throws Exception {
        try {
            fis = new FileInputStream(archivoTotales);
            entrada = new ObjectInputStream(fis);
            listTotalesVo = (List<TotalesVo>) entrada.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return listTotalesVo;
    }

    private void escribeFichero(List<ClienteVo> listClienteVo) throws Exception {
        try {
            fos = new FileOutputStream(archivoTotales);
            salida = new ObjectOutputStream(fos);
            salida.writeObject(listClienteVo);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException -> " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException -> " + e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println("IOException finally ->" + e.getMessage());
            }
        }
    }
}
