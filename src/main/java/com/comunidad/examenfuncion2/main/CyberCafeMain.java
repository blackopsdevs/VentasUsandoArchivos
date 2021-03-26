/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.examenfuncion2.main;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class CyberCafeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("********************************");
        System.out.println("Iniciando sistema");
        System.out.println("********************************");

        try {
            String homeSistema = System.getProperty("user.dir");
//        File carpeta = new File(sCarpAct);
            System.out.println("Directorio Home del sistema -> " + homeSistema);

            File directorio = new File(homeSistema + "/local/sistema");
            //File dirProdcutos = new File(homeSistema + "/local/sistema/estadisticas");
            Date fechaActual = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            /* if (!dirProdcutos.exists()) {
                if (dirProdcutos.mkdirs()) {
                    System.out.println("Directorio creado -> " + dirProdcutos);
                }
            }*/

            if (!directorio.exists()) {
                if (directorio.mkdirs()) {
                    System.out.println("Directorio creado -> " + directorio);
                    File ficheroClientes = new File(directorio, "clientes.dat");
                    File ficheroDetalle = new File(directorio, "detalle.dat");
                    File ficheroTotales = new File(directorio, "totales.dat");

                    if (ficheroClientes.createNewFile()) {
                        System.out.println("El fichero se ha creado correctamente -> " + ficheroClientes);
                    } else {
                        System.out.println("No ha podido ser creado el fichero -> " + ficheroClientes);
                    }

                    if (ficheroDetalle.createNewFile()) {
                        System.out.println("El fichero se ha creado correctamente -> " + ficheroDetalle);
                    } else {
                        System.out.println("No ha podido ser creado el fichero -> " + ficheroDetalle);
                    }

                    if (ficheroTotales.createNewFile()) {
                        System.out.println("El fichero se ha creado correctamente -> " + ficheroTotales);
                    } else {
                        System.out.println("No ha podido ser creado el fichero -> " + ficheroTotales);
                    }
                } else {
                    System.out.println("Error al crear directorio");
                }
            } else {
                System.out.println("El directorio " + directorio + " ya esta creado.");
                File ficheroClientes = new File(directorio, "clientes.dat");
                File ficheroDetalle = new File(directorio, "detalle.dat");
                File ficheroTotales = new File(directorio, "totales.dat");

                if (!ficheroClientes.exists()) {
                    if (ficheroClientes.createNewFile()) {
                        System.out.println("El fichero se ha creado correctamente -> " + ficheroClientes);
                    } else {
                        System.out.println("No ha podido ser creado el fichero -> " + ficheroClientes);
                    }
                } else {
                    System.out.println("Ya existe el fichero -> " + ficheroClientes);
                }

                if (!ficheroDetalle.exists()) {
                    if (ficheroDetalle.createNewFile()) {
                        System.out.println("El fichero se ha creado correctamente -> " + ficheroDetalle);
                    } else {
                        System.out.println("No ha podido ser creado el fichero -> " + ficheroDetalle);
                    }
                } else {
                    System.out.println("Ya existe el fichero -> " + ficheroDetalle);
                }

                if (!ficheroTotales.exists()) {
                    if (ficheroTotales.createNewFile()) {
                        System.out.println("El fichero se ha creado correctamente -> " + ficheroTotales);
                    } else {
                        System.out.println("No ha podido ser creado el fichero -> " + ficheroTotales);
                    }
                } else {
                    System.out.println("Ya existe el fichero -> " + ficheroTotales);
                }

            }

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new CyberCafeFrame().setVisible(true);
                }
            });

        } catch (IOException ioe) {
            Logger.getLogger(CyberCafeMain.class.getName()).log(Level.SEVERE, null, ioe);
            StringBuilder sb = new StringBuilder(ioe.toString());
            for (StackTraceElement ste : ioe.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(ste);
            }
            String trace = sb.toString();
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el sistema: " + trace);
        } catch (Exception ex) {
            Logger.getLogger(CyberCafeMain.class.getName()).log(Level.SEVERE, null, ex);
            StringBuilder sb = new StringBuilder(ex.toString());
            for (StackTraceElement ste : ex.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(ste);
            }
            String trace = sb.toString();
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el sistema: " + trace);
        }
    }

}
