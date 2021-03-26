/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.examenfuncion2.main.cliente.utils;

import com.comunidad.examenfuncion2.main.cliente.controller.DetalleController;
import com.comunidad.examenfuncion2.main.cliente.vo.DetalleVo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Santiago
 */
public class DetalleTableModel extends AbstractTableModel {

    private DetalleController detalleController;
    private String[] columnNames = {
        "Cantidad", "Cedula", "Descripcion", "PU"
    };

    private List<DetalleVo> listDetallesVo;

    public DetalleTableModel() throws Exception {
        detalleController = new DetalleController();
        listDetallesVo = new ArrayList<DetalleVo>();
        //listDetallesVo = detalleController.buscarDetallesController();
        System.out.println("Tamaño de la lista -> " + listDetallesVo.size());
    }

    public DetalleTableModel(List<DetalleVo> listDetallesVo) {
        this.listDetallesVo = listDetallesVo;
    }

    @Override
    public int getRowCount() {
        return listDetallesVo.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DetalleVo detallesVo = getDetalleVo(rowIndex);

        switch (columnIndex) {
            case 0:
                return detallesVo.getCantidad();
            case 1:
                return detallesVo.getNumeroCedula();
            case 2:
                return detallesVo.getDescripcion();
            case 3:
                return detallesVo.getPrecioUnitario();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        DetalleVo detallesVo = getDetalleVo(row);

        switch (column) {
            case 0:
                detallesVo.setCantidad((int) value);
                break;
            case 1:
                detallesVo.setNumeroCedula((int) value);
                break;
            case 2:
                detallesVo.setDescripcion((String) value);
                break;
            case 3:
                detallesVo.setPrecioUnitario((float) value);
                break;
        }

        fireTableCellUpdated(row, column);
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    public DetalleVo getDetalleVo(int row) {
        return listDetallesVo.get(row);
    }

    public void addDetalleVo(DetalleVo detalleVo) {
        insertDetalleVo(getRowCount(), detalleVo);
    }

    public void insertDetalleVo(int row, DetalleVo detallesVo) {
        listDetallesVo.add(row, detallesVo);
        fireTableRowsInserted(row, row);
    }

    public void removeDetalleVo(int row) {
        listDetallesVo.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public List<DetalleVo> getAllDetallesVo() {
        List<DetalleVo> listDetalleVo = new ArrayList<DetalleVo>();
        DetalleVo tblAdetalleVo = null;
        for (int i = 0; i < this.getRowCount(); i++) {
            tblAdetalleVo = (DetalleVo) this.listDetallesVo.get(i);
            listDetalleVo.add(tblAdetalleVo);
        }
        return listDetalleVo;
    }

    public void getLimpiarTabla() {
        listDetallesVo.clear();
    }

    public void updateDetalleVo(int row, DetalleVo detalleVo) {
        listDetallesVo.add(row, detalleVo);
        fireTableRowsUpdated(row, row);
    }

}
