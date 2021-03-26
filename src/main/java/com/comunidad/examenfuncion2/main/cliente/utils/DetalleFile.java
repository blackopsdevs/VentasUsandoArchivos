/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.examenfuncion2.main.cliente.utils;

import com.comunidad.examenfuncion2.main.cliente.vo.DetalleVo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class DetalleFile {

    String homeSistema = null;
    File directorio = null;
    File archivoDetalle = null;
    FileOutputStream fos = null;
    ObjectOutputStream salida = null;
    FileInputStream fis = null;
    ObjectInputStream entrada = null;
    List<DetalleVo> listDetalleVo = null;

    public DetalleFile() {
        homeSistema = System.getProperty("user.dir");
        directorio = new File(homeSistema + "/local/sistema");
        archivoDetalle = new File(directorio + "/detalle.dat");
    }

    public void guardarDetalleVo(DetalleVo detalleVo) throws Exception {
        FileInputStream fis = new FileInputStream(archivoDetalle);
        if (fis.getChannel().size() == 0) {
            escribeFicheroDetalleVo(detalleVo);
        } else {
        }
        fis.close();
    }

    public void guardarListaDetalleVo(List<DetalleVo> listDetalleVo) throws Exception {
        FileInputStream fis = new FileInputStream(archivoDetalle);
        escribeFicheroDetalleVo(listDetalleVo);
        fis.close();
    }

    private void escribeFicheroDetalleVo(List<DetalleVo> listDetalleVo) throws Exception {
        escribirFicheroLista(listDetalleVo);
    }

    private void escribeFicheroDetalleVo(DetalleVo detalleVo) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoDetalle));
        oos.writeObject(detalleVo);
        oos.close();
    }

    public List<DetalleVo> buscarDetallesVo() throws Exception {
        return leerFicheroLista();
    }

    /*
    private List<DetalleVo> leerFicheroDetalleVo() throws Exception {
        List<DetalleVo> listDetalleVo = new ArrayList<DetalleVo>();
        FileInputStream fis = new FileInputStream(archivoDetalle);
        if (fis.getChannel().size() == 0) {
            System.out.println("El archivo esta vacio.");
        } else {
            ObjectInputStream ois = new ObjectInputStream(fis);
            listDetalleVo = (List<DetalleVo>) ois.readObject();
            ois.close();
        }
        fis.close();
        return listDetalleVo;
    }*/

    private List<DetalleVo> leerFicheroLista() throws Exception {
        try {
            fis = new FileInputStream(archivoDetalle);
            if (fis.getChannel().size() == 0) {
                listDetalleVo = new ArrayList<DetalleVo>();
            } else{
                entrada = new ObjectInputStream(fis);
                listDetalleVo = (List<DetalleVo>) entrada.readObject();
            }
        } catch (FileNotFoundException e) {
            System.out.println("leerFicheroLista FileNotFoundException -> "+e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("leerFicheroLista ClassNotFoundException -> "+e.getMessage());
        } catch (IOException e) {
            System.out.println("leerFicheroLista IOException -> "+e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println("leerFicheroLista finally IOException -> "+e.getMessage());
            }
        }
        return listDetalleVo;
    }

    private void escribirFicheroLista(List<DetalleVo> listDetalleVo) throws Exception {
        try {
            fos = new FileOutputStream(archivoDetalle);
            salida = new ObjectOutputStream(fos);
            salida.writeObject(listDetalleVo);
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
