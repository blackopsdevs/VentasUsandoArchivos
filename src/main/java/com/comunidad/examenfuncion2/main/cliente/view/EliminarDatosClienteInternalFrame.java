/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.examenfuncion2.main.cliente.view;

import com.comunidad.examenfuncion2.main.cliente.controller.ClienteController;
import com.comunidad.examenfuncion2.main.cliente.vo.ClienteVo;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class EliminarDatosClienteInternalFrame extends javax.swing.JInternalFrame {

    private ClienteController clienteController = null;
    private List<ClienteVo> guardarListaClientes = null;
    private List<ClienteVo> listaClientesSistema = null;
    private ClienteVo clienteVo = null;
    private int cedulaCliente = 0;

    /**
     * Creates new form EliminarDatosClienteInternalFrame
     */
    public EliminarDatosClienteInternalFrame() {
        initComponents();
        loadData();
    }

    public void loadData() {
        try {
            clienteController = new ClienteController();
        } catch (Exception ex) {
            Logger.getLogger(EliminarDatosClienteInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            StringBuilder sb = new StringBuilder(ex.toString());
            for (StackTraceElement ste : ex.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(ste);
            }
            String trace = sb.toString();
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el sistema: " + trace);
        }
    }

    public void limpiarCampos() {
        try {
            txtBuscarCedula.setText("");
            txtIdCedulaCliente.setText("");
            txtNombreCliente.setText("");
            txtApellidoCliente.setText("");
            txtEdadCliente.setText("");
            chekEsEstudiante.setSelected(false);

            guardarListaClientes = null;
            listaClientesSistema = null;
            clienteVo = null;
        } catch (Exception ex) {
            Logger.getLogger(EliminarDatosClienteInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            StringBuilder sb = new StringBuilder(ex.toString());
            for (StackTraceElement ste : ex.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(ste);
            }
            String trace = sb.toString();
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el sistema: " + trace);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarCedula = new javax.swing.JTextField();
        btnBucarCedula = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdCedulaCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEdadCliente = new javax.swing.JTextField();
        chekEsEstudiante = new javax.swing.JCheckBox();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ELIMINAR DATOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        jLabel1.setText("Buscar por Cedula:");

        btnBucarCedula.setText("Buscar");
        btnBucarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBucarCedulaActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBucarCedula)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBucarCedula)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar"));

        jLabel2.setText("Cedula del cliente:");

        txtIdCedulaCliente.setEditable(false);

        jLabel3.setText("Nombre del cliente:");

        txtNombreCliente.setEditable(false);

        jLabel4.setText("Apellido del cliente:");

        txtApellidoCliente.setEditable(false);

        jLabel5.setText("Edad del cliente:");

        txtEdadCliente.setEditable(false);

        chekEsEstudiante.setText("Es estudiante?");
        chekEsEstudiante.setEnabled(false);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreCliente))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidoCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtEdadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(chekEsEstudiante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEdadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chekEsEstudiante)
                    .addComponent(btnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        try {
            this.setClosed(true);
        } catch (Exception ex) {
            Logger.getLogger(EliminarDatosClienteInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            StringBuilder sb = new StringBuilder(ex.toString());
            for (StackTraceElement ste : ex.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(ste);
            }
            String trace = sb.toString();
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el sistema: " + trace);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        try {
            limpiarCampos();
        } catch (Exception ex) {
            Logger.getLogger(EliminarDatosClienteInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            StringBuilder sb = new StringBuilder(ex.toString());
            for (StackTraceElement ste : ex.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(ste);
            }
            String trace = sb.toString();
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el sistema: " + trace);
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            guardarListaClientes = new ArrayList<ClienteVo>();
            ClienteVo clientVo = null;
            for (int i = 0; i < listaClientesSistema.size(); i++) {
                clientVo = (ClienteVo) listaClientesSistema.get(i);
                if (cedulaCliente != clientVo.getNumeroCedula()) {
                    guardarListaClientes.add(clientVo);
                }
            }

            if (clienteVo != null) {
                clienteVo.setNumeroCedula(Integer.parseInt(txtIdCedulaCliente.getText()));
                clienteVo.setNombre(txtNombreCliente.getText());
                clienteVo.setApellidos(txtApellidoCliente.getText());
                clienteVo.setEdad(Integer.parseInt(txtEdadCliente.getText()));
                clienteVo.setEsEstudiante(chekEsEstudiante.isSelected());
                clienteVo.setActivo(false);
                System.out.println("clienteVo -> " + clienteVo);
                guardarListaClientes.add(clienteVo);
            }
            System.out.println("guardarListaClientes -> " + guardarListaClientes);
            clienteController.guardarLista(guardarListaClientes);
            limpiarCampos();
        } catch (Exception ex) {
            Logger.getLogger(EliminarDatosClienteInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            StringBuilder sb = new StringBuilder(ex.toString());
            for (StackTraceElement ste : ex.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(ste);
            }
            String trace = sb.toString();
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el sistema: " + trace);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBucarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBucarCedulaActionPerformed
        // TODO add your handling code here:
        try {
            cedulaCliente = Integer.parseInt(txtBuscarCedula.getText().trim());
            listaClientesSistema = clienteController.buscarClientesController();
            System.out.println("listClientesVo -> " + listaClientesSistema);
            for (int i = 0; i < listaClientesSistema.size(); i++) {
                clienteVo = (ClienteVo) listaClientesSistema.get(i);
                if (cedulaCliente == clienteVo.getNumeroCedula() && clienteVo.isActivo() == true) {
                    break;
                }
                clienteVo = null;
            }
            System.out.println("clienteVo -> " + clienteVo);
            if (clienteVo != null) {
                txtIdCedulaCliente.setText(String.valueOf(clienteVo.getNumeroCedula()));
                txtNombreCliente.setText(clienteVo.getNombre());
                txtApellidoCliente.setText(clienteVo.getApellidos());
                txtEdadCliente.setText(String.valueOf(clienteVo.getEdad()));
                chekEsEstudiante.setSelected(clienteVo.isEsEstudiante());
            } else {
                limpiarCampos();
                JOptionPane.showMessageDialog(null, "No existe la cedula: " + cedulaCliente);
            }

        } catch (Exception ex) {
            Logger.getLogger(EliminarDatosClienteInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            StringBuilder sb = new StringBuilder(ex.toString());
            for (StackTraceElement ste : ex.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(ste);
            }
            String trace = sb.toString();
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el sistema: " + trace);
        }
    }//GEN-LAST:event_btnBucarCedulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBucarCedula;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chekEsEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtBuscarCedula;
    private javax.swing.JTextField txtEdadCliente;
    private javax.swing.JTextField txtIdCedulaCliente;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
