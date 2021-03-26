/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.examenfuncion2.main;

import com.comunidad.examenfuncion2.main.cliente.view.ClienteInternalFrame;
import com.comunidad.examenfuncion2.main.cliente.view.ConsultarDatosClienteInternalFrame;
import com.comunidad.examenfuncion2.main.cliente.view.EliminarDatosClienteInternalFrame;
import com.comunidad.examenfuncion2.main.cliente.view.EstadisticasDatosClienteInternalFrame;
import com.comunidad.examenfuncion2.main.cliente.view.IngresarDatosClienteInternalFrame;
import com.comunidad.examenfuncion2.main.cliente.view.ListaDatosClienteInternalFrame;
import com.comunidad.examenfuncion2.main.cliente.view.ModificarDatosClienteInternalFrame;
import com.comunidad.examenfuncion2.main.cliente.view.OrdenarDatosClienteInternalFrame;

/**
 *
 * @author Santiago
 */
public class CyberCafeFrame extends javax.swing.JFrame {

    /**
     * Creates new form CyberCafeFrame
     */
    public CyberCafeFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemAltaClientes = new javax.swing.JMenuItem();
        jMenuConsultarCliente = new javax.swing.JMenuItem();
        jMenuModificarDatos = new javax.swing.JMenuItem();
        jMenuEliminarDatos = new javax.swing.JMenuItem();
        jMenuOrdenarDatos = new javax.swing.JMenuItem();
        jMenuListaDatos = new javax.swing.JMenuItem();
        jMenuEstadisticas = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setMinimumSize(new java.awt.Dimension(1300, 700));

        jMenu1.setText("Adminstrar");

        jMenuItemAltaClientes.setText("INGRESAR DATOS DEL CLIENTE");
        jMenuItemAltaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAltaClientes);

        jMenuConsultarCliente.setText("CONSULTAR DATOS DEL CLIENTE");
        jMenuConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuConsultarCliente);

        jMenuModificarDatos.setText("MODIFICAR DATOS");
        jMenuModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuModificarDatosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuModificarDatos);

        jMenuEliminarDatos.setText("ELIMINAR DATOS");
        jMenuEliminarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEliminarDatosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuEliminarDatos);

        jMenuOrdenarDatos.setText("ORDENAR DATOS");
        jMenuOrdenarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOrdenarDatosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuOrdenarDatos);

        jMenuListaDatos.setText("LISTA DE DATOS");
        jMenuListaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListaDatosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuListaDatos);

        jMenuEstadisticas.setText("ESTADISTICAS");
        jMenuEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEstadisticasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuEstadisticas);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("...");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultarClienteActionPerformed
        // TODO add your handling code here:
        if (jDesktopPane1.getComponentCount() < 1) {
            ConsultarDatosClienteInternalFrame consultarDatosClienteInternalFrame = new ConsultarDatosClienteInternalFrame();
            consultarDatosClienteInternalFrame.setVisible(true);
            jDesktopPane1.add(consultarDatosClienteInternalFrame);
        }
    }//GEN-LAST:event_jMenuConsultarClienteActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuItemAltaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaClientesActionPerformed
        // TODO add your handling code here:
        if (jDesktopPane1.getComponentCount() < 1) {
            IngresarDatosClienteInternalFrame ingresarDatosClienteInternalFrame = new IngresarDatosClienteInternalFrame();
            ingresarDatosClienteInternalFrame.setVisible(true);
            jDesktopPane1.add(ingresarDatosClienteInternalFrame);
        }
    }//GEN-LAST:event_jMenuItemAltaClientesActionPerformed

    private void jMenuEliminarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEliminarDatosActionPerformed
        // TODO add your handling code here:
        if (jDesktopPane1.getComponentCount() < 1) {
            EliminarDatosClienteInternalFrame eliminarDatosClienteInternalFrame = new EliminarDatosClienteInternalFrame();
            eliminarDatosClienteInternalFrame.setVisible(true);
            jDesktopPane1.add(eliminarDatosClienteInternalFrame);
        }
    }//GEN-LAST:event_jMenuEliminarDatosActionPerformed

    private void jMenuModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuModificarDatosActionPerformed
        // TODO add your handling code here:
        if (jDesktopPane1.getComponentCount() < 1) {
            ModificarDatosClienteInternalFrame modificarDatosClienteInternalFrame = new ModificarDatosClienteInternalFrame();
            modificarDatosClienteInternalFrame.setVisible(true);
            jDesktopPane1.add(modificarDatosClienteInternalFrame);
        }
    }//GEN-LAST:event_jMenuModificarDatosActionPerformed

    private void jMenuOrdenarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOrdenarDatosActionPerformed
        // TODO add your handling code here:
        if (jDesktopPane1.getComponentCount() < 1) {
            OrdenarDatosClienteInternalFrame ordenarDatosClienteInternalFrame = new OrdenarDatosClienteInternalFrame();
            ordenarDatosClienteInternalFrame.setVisible(true);
            jDesktopPane1.add(ordenarDatosClienteInternalFrame);
        }
    }//GEN-LAST:event_jMenuOrdenarDatosActionPerformed

    private void jMenuListaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListaDatosActionPerformed
        // TODO add your handling code here:
        if (jDesktopPane1.getComponentCount() < 1) {
            ListaDatosClienteInternalFrame listaDatosClienteInternalFrame = new ListaDatosClienteInternalFrame();
            listaDatosClienteInternalFrame.setVisible(true);
            jDesktopPane1.add(listaDatosClienteInternalFrame);
        }
    }//GEN-LAST:event_jMenuListaDatosActionPerformed

    private void jMenuEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEstadisticasActionPerformed
        // TODO add your handling code here:
        if (jDesktopPane1.getComponentCount() < 1) {
            EstadisticasDatosClienteInternalFrame estadisticasDatosClienteInternalFrame = new EstadisticasDatosClienteInternalFrame();
            estadisticasDatosClienteInternalFrame.setVisible(true);
            jDesktopPane1.add(estadisticasDatosClienteInternalFrame);
        }
    }//GEN-LAST:event_jMenuEstadisticasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuConsultarCliente;
    private javax.swing.JMenuItem jMenuEliminarDatos;
    private javax.swing.JMenuItem jMenuEstadisticas;
    private javax.swing.JMenuItem jMenuItemAltaClientes;
    private javax.swing.JMenuItem jMenuListaDatos;
    private javax.swing.JMenuItem jMenuModificarDatos;
    private javax.swing.JMenuItem jMenuOrdenarDatos;
    private javax.swing.JMenuItem jMenuSalir;
    // End of variables declaration//GEN-END:variables
}
