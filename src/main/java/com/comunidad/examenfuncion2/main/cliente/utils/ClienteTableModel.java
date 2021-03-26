/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.examenfuncion2.main.cliente.utils;

import com.comunidad.examenfuncion2.main.cliente.controller.ClienteController;
import com.comunidad.examenfuncion2.main.cliente.vo.ClienteVo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Santiago
 */
public class ClienteTableModel extends AbstractTableModel {

    private ClienteController clienteController;
    private String[] columnNames = {
        "Cedula", "Nombre", "Apellidos", "Edad", "Es estudiante", "Activo"
    };

    private List<ClienteVo> listClientesVo;

    public ClienteTableModel() throws Exception {
        clienteController = new ClienteController();
        listClientesVo = new ArrayList<ClienteVo>();

        System.out.println("Tamaño de la lista -> " + listClientesVo.size());
    }

    public ClienteTableModel(int cedulaCliente) throws Exception {
        clienteController = new ClienteController();
        if (cedulaCliente == 0) {
            listClientesVo = new ArrayList<ClienteVo>();
        } else {
            listClientesVo = getClientePorCedula(cedulaCliente);
        }

        System.out.println("Tamaño de la lista -> " + listClientesVo.size());
    }

    public ClienteTableModel(String orden) throws Exception {
        clienteController = new ClienteController();
        listClientesVo = clienteController.buscarClientesController();
        if (orden.equals("0")) {
            Collections.sort(listClientesVo, new Comparator<ClienteVo>() {
                @Override
                public int compare(ClienteVo p1, ClienteVo p2) {
                    return new String(p1.getNombre()).compareTo(new String(p2.getNombre()));
                }
            });
        } else if (orden.equals("1")) {
            Collections.sort(listClientesVo, new Comparator<ClienteVo>() {
                @Override
                public int compare(ClienteVo p1, ClienteVo p2) {
                    return new Integer(p1.getEdad()).compareTo(new Integer(p2.getEdad()));
                }
            });
        }
        System.out.println("Tamaño de la lista -> " + listClientesVo.size());
    }

    public ClienteTableModel(List<ClienteVo> listClientesVo) {
        this.listClientesVo = listClientesVo;
    }

    @Override
    public int getRowCount() {
        return listClientesVo.size();
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
        ClienteVo clientesVo = getClienteVo(rowIndex);

        switch (columnIndex) {
            case 0:
                return clientesVo.getNumeroCedula();
            case 1:
                return clientesVo.getNombre();
            case 2:
                return clientesVo.getApellidos();
            case 3:
                return clientesVo.getEdad();
            case 4:
                return clientesVo.isEsEstudiante();
            case 5:
                return clientesVo.isActivo();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        ClienteVo clientesVo = getClienteVo(row);

        switch (column) {
            case 0:
                clientesVo.setNumeroCedula((int) value);
                break;
            case 1:
                clientesVo.setNombre((String) value);
                break;
            case 2:
                clientesVo.setApellidos((String) value);
                break;
            case 3:
                clientesVo.setEdad((int) value);
                break;
            case 4:
                clientesVo.setEsEstudiante((boolean) value);
                break;
            case 5:
                clientesVo.setActivo((boolean) value);
                break;
        }

        fireTableCellUpdated(row, column);
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    public ClienteVo getClienteVo(int row) {
        return listClientesVo.get(row);
    }

    public void addClienteVo(ClienteVo clientesVo) {
        insertClienteVo(getRowCount(), clientesVo);
    }

    public void insertClienteVo(int row, ClienteVo clientesVo) {
        listClientesVo.add(row, clientesVo);
        fireTableRowsInserted(row, row);
    }

    public void removeClienteVo(int row) {
        listClientesVo.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public List<ClienteVo> getClientePorCedula(int cedulaCliente) throws Exception {
        List<ClienteVo> listClienteVo = new ArrayList<ClienteVo>();
        ClienteVo tblAclienteVo = null;
        List<ClienteVo> listClientesVo = clienteController.buscarClientesController();
        for (int i = 0; i < listClientesVo.size(); i++) {
            tblAclienteVo = (ClienteVo) listClientesVo.get(i);
            if (cedulaCliente == tblAclienteVo.getNumeroCedula() && tblAclienteVo.isActivo() == true) {
                listClienteVo.add(tblAclienteVo);
            }
        }
        return listClienteVo;
    }

    public void updateClienteVo(int row, ClienteVo clienteVo) {
        listClientesVo.add(row, clienteVo);
        fireTableRowsUpdated(row, row);
    }
}
