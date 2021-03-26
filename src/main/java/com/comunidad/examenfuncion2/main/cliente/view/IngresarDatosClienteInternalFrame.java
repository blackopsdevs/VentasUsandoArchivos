/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.examenfuncion2.main.cliente.view;

import com.comunidad.examenfuncion2.main.cliente.controller.ClienteController;
import com.comunidad.examenfuncion2.main.cliente.controller.DetalleController;
import com.comunidad.examenfuncion2.main.cliente.utils.DetalleTableModel;
import com.comunidad.examenfuncion2.main.cliente.vo.ClienteVo;
import com.comunidad.examenfuncion2.main.cliente.vo.DetalleVo;
import com.comunidad.examenfuncion2.main.cliente.vo.TotalesVo;
import com.comunidad.examenfuncion2.main.common.Utils;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class IngresarDatosClienteInternalFrame extends javax.swing.JInternalFrame {

    private ClienteController clienteController = null;
    private ClienteVo clientesVo = null;
    private List<ClienteVo> listClientesVo = null;

    private DetalleController detalleController = null;
    private DetalleVo detalleVo = null;
    private List<DetalleVo> listdetallesVo = null;
    private DetalleTableModel detalleTableModel = null;

    private TotalesVo totalesVo = null;
    private static int cantTotal;

    /**
     * Creates new form IngresarDatosClienteInternalFrame
     */
    public IngresarDatosClienteInternalFrame() {
        initComponents();
        loadData();
    }

    public void loadData() {
        try {
            clienteController = new ClienteController();
            detalleController = new DetalleController();
            detalleTableModel = new DetalleTableModel();
            tblDetalle.setModel(detalleTableModel);
            btnAgregar.setEnabled(false);
            btnGuardar.setEnabled(false);
        } catch (Exception ex) {
            Logger.getLogger(IngresarDatosClienteInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
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
            System.out.println("clientesVo -> " + clientesVo);
            System.out.println("totalesVo -> " + totalesVo);
            System.out.println("detalleVo -> " + detalleVo);
            txtIdCliente.setText("");
            txtNombre.setText("");
            txtApellidos.setText("");
            txtEdad.setText("");
            txtDescuento.setText("0");
            txtSubtotal.setText("0");
            txtIva.setText("0.12");
            txtTotal.setText("0");
            chkEstudiante.setSelected(false);
            clientesVo = null;
            totalesVo = null;
            detalleTableModel = new DetalleTableModel();
            tblDetalle.setModel(detalleTableModel);
            System.out.println("clientesVo -> " + clientesVo);
            System.out.println("totalesVo -> " + totalesVo);
            System.out.println("detalleVo -> " + detalleVo);
            limpiarCombos();
        } catch (Exception ex) {
            Logger.getLogger(IngresarDatosClienteInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            StringBuilder sb = new StringBuilder(ex.toString());
            for (StackTraceElement ste : ex.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(ste);
            }
            String trace = sb.toString();
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el sistema: " + trace);
        }
    }

    public void limpiarCombos() {
        try {
            radCuento.setSelected(false);
            radRomance.setSelected(false);
            radEducativo.setSelected(false);
            radNovela.setSelected(false);

            rad30Min.setSelected(false);
            rad1hora.setSelected(false);
            rad2Horas.setSelected(false);
            rad3MasHoras.setSelected(false);

            radLate.setSelected(false);
            radCafe.setSelected(false);
            radCapuchino.setSelected(false);
            radTe.setSelected(false);

            detalleVo = null;
        } catch (Exception ex) {
            Logger.getLogger(IngresarDatosClienteInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel2 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        chkEstudiante = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        radCuento = new javax.swing.JRadioButton();
        radRomance = new javax.swing.JRadioButton();
        radNovela = new javax.swing.JRadioButton();
        radEducativo = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rad30Min = new javax.swing.JRadioButton();
        rad1hora = new javax.swing.JRadioButton();
        rad2Horas = new javax.swing.JRadioButton();
        rad3MasHoras = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        radCafe = new javax.swing.JRadioButton();
        radTe = new javax.swing.JRadioButton();
        radCapuchino = new javax.swing.JRadioButton();
        radLate = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("INGRESAR DATOS DEL CLIENTE");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("---INGRESO DE DATOS---"));

        jLabel2.setText("Ingrese el número de cédula del cliente:");

        jLabel3.setText("Ingrese nombre del cliente:");

        jLabel4.setText("Ingrese apellido del cliente:");

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        jLabel5.setText("Ingrese la edad del cliente:");

        chkEstudiante.setText("¿Es estudiante? S/N");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellidos))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtEdad))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkEstudiante)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkEstudiante))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Escoja la actividad a realizar"));

        jLabel6.setText("Escoja categoría:");

        radCuento.setText("Cuento");
        radCuento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radCuentoMouseClicked(evt);
            }
        });

        radRomance.setText("Romance");
        radRomance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radRomanceActionPerformed(evt);
            }
        });

        radNovela.setText("Novela");
        radNovela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNovelaActionPerformed(evt);
            }
        });

        radEducativo.setText("Educativo");
        radEducativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radEducativoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(radCuento)
                .addGap(18, 18, 18)
                .addComponent(radRomance)
                .addGap(18, 18, 18)
                .addComponent(radNovela)
                .addGap(18, 18, 18)
                .addComponent(radEducativo)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(radCuento)
                    .addComponent(radRomance)
                    .addComponent(radNovela)
                    .addComponent(radEducativo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Comprar Libro", jPanel3);

        jLabel1.setText("Escoja el tiempo:");

        rad30Min.setText("30minutos");
        rad30Min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad30MinActionPerformed(evt);
            }
        });

        rad1hora.setText("1hora");
        rad1hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad1horaActionPerformed(evt);
            }
        });

        rad2Horas.setText("2Horas");
        rad2Horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad2HorasActionPerformed(evt);
            }
        });

        rad3MasHoras.setText("3Horas o más");
        rad3MasHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad3MasHorasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(rad30Min)
                .addGap(18, 18, 18)
                .addComponent(rad1hora)
                .addGap(18, 18, 18)
                .addComponent(rad2Horas)
                .addGap(18, 18, 18)
                .addComponent(rad3MasHoras)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rad30Min)
                    .addComponent(rad1hora)
                    .addComponent(rad2Horas)
                    .addComponent(rad3MasHoras))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alquilar una computadora", jPanel4);

        jLabel7.setText("Escoja la bebida:");

        radCafe.setText("Café");
        radCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCafeActionPerformed(evt);
            }
        });

        radTe.setText("Té");
        radTe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTeActionPerformed(evt);
            }
        });

        radCapuchino.setText("Cappuccino");
        radCapuchino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCapuchinoActionPerformed(evt);
            }
        });

        radLate.setText("Latte");
        radLate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radLateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(radCafe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radTe)
                .addGap(18, 18, 18)
                .addComponent(radCapuchino)
                .addGap(18, 18, 18)
                .addComponent(radLate)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(radCafe)
                    .addComponent(radTe)
                    .addComponent(radCapuchino)
                    .addComponent(radLate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Comprar una bebida", jPanel5);

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDetalle);

        jLabel8.setText("Descuento:  $");

        jLabel9.setText("Subtotal:  $");

        jLabel10.setText("IVA:");

        jLabel11.setText("Total:  $");

        txtDescuento.setText("0");

        txtSubtotal.setEditable(false);
        txtSubtotal.setText("0");

        txtIva.setEditable(false);
        txtIva.setText("0.12");

        txtTotal.setEditable(false);
        txtTotal.setText("0");
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDescuento)
                    .addComponent(txtSubtotal)
                    .addComponent(txtIva, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(txtTotal))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnSalir)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        try {
            this.setClosed(true);
        } catch (Exception ex) {
            Logger.getLogger(IngresarDatosClienteInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            StringBuilder sb = new StringBuilder(ex.toString());
            for (StackTraceElement ste : ex.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(ste);
            }
            String trace = sb.toString();
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el sistema: " + trace);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        System.out.println("******************************{btnAgregarActionPerformed}**********************************-> ");
        try {
            String id = txtIdCliente.getText().trim();
            String nombre = txtNombre.getText().trim();
            String apellidos = txtApellidos.getText().trim();
            String edad = txtEdad.getText().trim();
            boolean isEstudiante = chkEstudiante.isSelected();
            if (clientesVo == null) {
                clientesVo = new ClienteVo();
                clientesVo.setNumeroCedula(Integer.parseInt(id));
                clientesVo.setNombre(nombre);
                clientesVo.setApellidos(apellidos);
                clientesVo.setEdad(Integer.parseInt(edad));
                clientesVo.setEsEstudiante(isEstudiante);
                clientesVo.setActivo(true);
            }
            double descuento = Double.parseDouble(txtDescuento.getText().trim());
            double subtotal = Double.parseDouble(txtSubtotal.getText().trim());
            double iva = Double.parseDouble(txtIva.getText().trim());
            double total = Double.parseDouble(txtTotal.getText().trim());

            if (totalesVo == null) {
                totalesVo = new TotalesVo();
                if (cantTotal == 0) {
                    cantTotal = Utils.generarId();
                }
                totalesVo.setNumeroCedula(clientesVo.getNumeroCedula());
                totalesVo.setIdTotales(cantTotal);
                totalesVo.setIva(iva);
                totalesVo.setDescuento(descuento);
                totalesVo.setSubtotal(subtotal);
                totalesVo.setTotal(total);
            } else {
                if (cantTotal == 0) {
                    cantTotal = Utils.generarId();
                }
                totalesVo.setNumeroCedula(clientesVo.getNumeroCedula());
                totalesVo.setIdTotales(cantTotal);
                totalesVo.setIva(iva);
                totalesVo.setDescuento(descuento);
                totalesVo.setSubtotal(subtotal);
                totalesVo.setTotal(total);
            }
            if (detalleVo == null) {
                detalleVo = new DetalleVo();
                detalleVo.setCantidad(1);
                detalleVo.setNumeroCedula(Integer.parseInt(txtIdCliente.getText().trim()));
                detalleVo.setPrecioUnitario(12);
                detalleVo.setIdTotales(cantTotal);
                if (radCuento.isSelected()) {
                    detalleVo.setDescripcion(radCuento.getText());
                }
                if (radRomance.isSelected()) {
                    detalleVo.setDescripcion(radRomance.getText());
                }
                if (radEducativo.isSelected()) {
                    detalleVo.setDescripcion(radEducativo.getText());
                }
                if (radNovela.isSelected()) {
                    detalleVo.setDescripcion(radNovela.getText());
                }
                //Libro
                //Computadora
                if (rad30Min.isSelected()) {
                    detalleVo.setDescripcion(rad30Min.getText());
                }
                if (rad1hora.isSelected()) {
                    detalleVo.setDescripcion(rad1hora.getText());
                }
                if (rad2Horas.isSelected()) {
                    detalleVo.setDescripcion(rad2Horas.getText());
                }
                if (rad3MasHoras.isSelected()) {
                    detalleVo.setDescripcion(rad3MasHoras.getText());
                }

                //Bebida
                if (radCafe.isSelected()) {
                    detalleVo.setDescripcion(radCafe.getText());
                }
                if (radCapuchino.isSelected()) {
                    detalleVo.setDescripcion(radCapuchino.getText());
                }
                if (radTe.isSelected()) {
                    detalleVo.setDescripcion(radTe.getText());
                }
                if (radLate.isSelected()) {
                    detalleVo.setDescripcion(radLate.getText());
                }
                detalleVo.setNumeroCedula(clientesVo.getNumeroCedula());
                detalleVo.setIdDetalle(Utils.generarId());
            }

            detalleTableModel.addDetalleVo(detalleVo);

            List<DetalleVo> listaDetalle = detalleTableModel.getAllDetallesVo();
            double sumCant = 0.0;
            double sumTotal = 0.0;
            for (int x = 0; x < listaDetalle.size(); x++) {
                sumCant = sumCant + listaDetalle.get(x).getPrecioUnitario();
            }
            txtSubtotal.setText(String.valueOf(sumCant));
            sumTotal = (sumCant - descuento) + iva;
            txtTotal.setText(String.valueOf(sumTotal));

            limpiarCombos();
        } catch (Exception ex) {
            Logger.getLogger(IngresarDatosClienteInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            StringBuilder sb = new StringBuilder(ex.toString());
            for (StackTraceElement ste : ex.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(ste);
            }
            String trace = sb.toString();
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el sistema: " + trace);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        System.out.println("******************************{btnGuardarActionPerformed}**********************************-> ");
        try {
            clientesVo.setTotalesVo(totalesVo);
            clientesVo.setListDetalleVo(detalleTableModel.getAllDetallesVo());
            System.out.println("clientesV{} -> " + clientesVo);
            clienteController.guardar(clientesVo);
            limpiarCampos();
        } catch (Exception ex) {
            Logger.getLogger(IngresarDatosClienteInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            StringBuilder sb = new StringBuilder(ex.toString());
            for (StackTraceElement ste : ex.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(ste);
            }
            String trace = sb.toString();
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el sistema: " + trace);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void radCuentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radCuentoMouseClicked
        // TODO add your handling code here:
        if (radCuento.isSelected()) {
            radRomance.setSelected(false);
            radEducativo.setSelected(false);
            radNovela.setSelected(false);
            if (!btnAgregar.isEnabled()) {
                btnAgregar.setEnabled(true);
            }
            if (!btnGuardar.isEnabled()) {
                btnGuardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_radCuentoMouseClicked

    private void radRomanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radRomanceActionPerformed
        // TODO add your handling code here:
        if (radRomance.isSelected()) {
            radCuento.setSelected(false);
            radEducativo.setSelected(false);
            radNovela.setSelected(false);
            if (!btnAgregar.isEnabled()) {
                btnAgregar.setEnabled(true);
            }
            if (!btnGuardar.isEnabled()) {
                btnGuardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_radRomanceActionPerformed

    private void radNovelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNovelaActionPerformed
        // TODO add your handling code here:
        if (radNovela.isSelected()) {
            radCuento.setSelected(false);
            radRomance.setSelected(false);
            radEducativo.setSelected(false);
            if (!btnAgregar.isEnabled()) {
                btnAgregar.setEnabled(true);
            }
            if (!btnGuardar.isEnabled()) {
                btnGuardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_radNovelaActionPerformed

    private void radEducativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radEducativoActionPerformed
        // TODO add your handling code here:
        if (radEducativo.isSelected()) {
            radCuento.setSelected(false);
            radRomance.setSelected(false);
            radNovela.setSelected(false);
            if (!btnAgregar.isEnabled()) {
                btnAgregar.setEnabled(true);
            }
            if (!btnGuardar.isEnabled()) {
                btnGuardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_radEducativoActionPerformed

    private void rad30MinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad30MinActionPerformed
        // TODO add your handling code here:
        if (rad30Min.isSelected()) {
            rad1hora.setSelected(false);
            rad2Horas.setSelected(false);
            rad3MasHoras.setSelected(false);
            if (!btnAgregar.isEnabled()) {
                btnAgregar.setEnabled(true);
            }
            if (!btnGuardar.isEnabled()) {
                btnGuardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_rad30MinActionPerformed

    private void rad1horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad1horaActionPerformed
        // TODO add your handling code here:
        if (rad1hora.isSelected()) {
            rad30Min.setSelected(false);
            rad2Horas.setSelected(false);
            rad3MasHoras.setSelected(false);
            if (!btnAgregar.isEnabled()) {
                btnAgregar.setEnabled(true);
            }
            if (!btnGuardar.isEnabled()) {
                btnGuardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_rad1horaActionPerformed

    private void rad2HorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad2HorasActionPerformed
        // TODO add your handling code here:
        if (rad2Horas.isSelected()) {
            rad30Min.setSelected(false);
            rad1hora.setSelected(false);
            rad3MasHoras.setSelected(false);
            if (!btnAgregar.isEnabled()) {
                btnAgregar.setEnabled(true);
            }
            if (!btnGuardar.isEnabled()) {
                btnGuardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_rad2HorasActionPerformed

    private void rad3MasHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad3MasHorasActionPerformed
        // TODO add your handling code here:
        if (rad3MasHoras.isSelected()) {
            rad30Min.setSelected(false);
            rad1hora.setSelected(false);
            rad2Horas.setSelected(false);
            if (!btnAgregar.isEnabled()) {
                btnAgregar.setEnabled(true);
            }
            if (!btnGuardar.isEnabled()) {
                btnGuardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_rad3MasHorasActionPerformed

    private void radCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCafeActionPerformed
        // TODO add your handling code here:
        if (radCafe.isSelected()) {
            radTe.setSelected(false);
            radCapuchino.setSelected(false);
            radLate.setSelected(false);
            if (!btnAgregar.isEnabled()) {
                btnAgregar.setEnabled(true);
            }
            if (!btnGuardar.isEnabled()) {
                btnGuardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_radCafeActionPerformed

    private void radTeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTeActionPerformed
        // TODO add your handling code here:
        if (radTe.isSelected()) {
            radCafe.setSelected(false);
            radCapuchino.setSelected(false);
            radLate.setSelected(false);
            if (!btnAgregar.isEnabled()) {
                btnAgregar.setEnabled(true);
            }
            if (!btnGuardar.isEnabled()) {
                btnGuardar.setEnabled(true);
            }

        }
    }//GEN-LAST:event_radTeActionPerformed

    private void radCapuchinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCapuchinoActionPerformed
        // TODO add your handling code here:
        if (radCapuchino.isSelected()) {
            radCafe.setSelected(false);
            radTe.setSelected(false);
            radLate.setSelected(false);
            if (!btnAgregar.isEnabled()) {
                btnAgregar.setEnabled(true);
            }
            if (!btnGuardar.isEnabled()) {
                btnGuardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_radCapuchinoActionPerformed

    private void radLateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radLateActionPerformed
        // TODO add your handling code here:
        if (radLate.isSelected()) {
            radCafe.setSelected(false);
            radCapuchino.setSelected(false);
            radTe.setSelected(false);
            if (!btnAgregar.isEnabled()) {
                btnAgregar.setEnabled(true);
            }
            if (!btnGuardar.isEnabled()) {
                btnGuardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_radLateActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chkEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rad1hora;
    private javax.swing.JRadioButton rad2Horas;
    private javax.swing.JRadioButton rad30Min;
    private javax.swing.JRadioButton rad3MasHoras;
    private javax.swing.JRadioButton radCafe;
    private javax.swing.JRadioButton radCapuchino;
    private javax.swing.JRadioButton radCuento;
    private javax.swing.JRadioButton radEducativo;
    private javax.swing.JRadioButton radLate;
    private javax.swing.JRadioButton radNovela;
    private javax.swing.JRadioButton radRomance;
    private javax.swing.JRadioButton radTe;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
