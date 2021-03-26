/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.examenfuncion2.main.cliente.controller;

import com.comunidad.examenfuncion2.main.cliente.utils.ClienteFile;
import com.comunidad.examenfuncion2.main.cliente.vo.ClienteVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class ClienteController {

    private final ClienteFile clienteFile = new ClienteFile();
    List<ClienteVo> listClientesVo = null;

    public void guardar(ClienteVo clienteVo) throws Exception {
        if (clienteVo != null) {
            listClientesVo = clienteFile.buscarClientesVo();
            if (listClientesVo != null && listClientesVo.size() >= 0) {
                listClientesVo.add(clienteVo);
            }
            clienteFile.guardarListaClienteVo(listClientesVo);
        }

    }

    public void guardarLista(List<ClienteVo> listClientesVo) throws Exception {
        if (listClientesVo != null) {
            clienteFile.guardarListaClienteVo(listClientesVo);
        }

    }

    public List<ClienteVo> buscarClientesController() throws Exception {
        return clienteFile.buscarClientesVo();
    }
}
