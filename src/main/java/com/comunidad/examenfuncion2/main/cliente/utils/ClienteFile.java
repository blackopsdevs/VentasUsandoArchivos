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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class ClienteFile {

    String homeSistema = null;
    File directorio = null;
    File archivoCliente = null;
    FileOutputStream fos = null;
    ObjectOutputStream salida = null;
    FileInputStream fis = null;
    ObjectInputStream entrada = null;
    List<ClienteVo> listClienteVo = null;

    public ClienteFile() {
        homeSistema = System.getProperty("user.dir");
        directorio = new File(homeSistema + "/local/sistema");
        archivoCliente = new File(directorio + "/clientes.dat");
    }

    public void guardarClienteVo(ClienteVo clienteVo) throws Exception {
        FileInputStream fis = new FileInputStream(archivoCliente);
        if (fis.getChannel().size() == 0) {
            escribeFicheroClienteVo(clienteVo);
        } else {
        }
        fis.close();
    }

    public void guardarListaClienteVo(List<ClienteVo> listClienteVo) throws Exception {
        escribirFicheroLista(listClienteVo);
    }

    private void escribeFicheroClienteVo(List<ClienteVo> listClienteVo) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoCliente));
        oos.writeObject(listClienteVo);
        oos.close();
    }

    private void escribeFicheroClienteVo(ClienteVo clienteVo) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoCliente));
        oos.writeObject(clienteVo);
        oos.close();
    }

    public List<ClienteVo> buscarClientesVo() throws Exception {
        return leerFicheroLista();
    }

    /*
    private List<ClienteVo> leerFicheroClienteVo() throws Exception {
        List<ClienteVo> listClienteVo = new ArrayList<ClienteVo>();
        FileInputStream fis = new FileInputStream(archivoCliente);
        if (fis.getChannel().size() == 0) {
            System.out.println("El archivo esta vacio.");
        } else {
            ObjectInputStream ois = new ObjectInputStream(fis);
            listClienteVo = (List<ClienteVo>) ois.readObject();
            ois.close();
        }
        fis.close();
        return listClienteVo;
    }*/
    private List<ClienteVo> leerFicheroLista() throws Exception {
        try {
            fis = new FileInputStream(archivoCliente);
            if (fis.getChannel().size() == 0) {
                listClienteVo = new ArrayList<ClienteVo>();
            } else {
                entrada = new ObjectInputStream(fis);
                listClienteVo = (List<ClienteVo>) entrada.readObject();
            }
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
        return listClienteVo;
    }

    private void escribirFicheroLista(List<ClienteVo> listClienteVo) throws Exception {
        try {
            fos = new FileOutputStream(archivoCliente);
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
