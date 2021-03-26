/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.examenfuncion2.main.cliente.controller;

import com.comunidad.examenfuncion2.main.cliente.utils.DetalleFile;
import com.comunidad.examenfuncion2.main.cliente.vo.DetalleVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class DetalleController {
    private final DetalleFile detalleFile = new DetalleFile();

    public void guardarDetalleController(List<DetalleVo> listDetalleVo) throws Exception {
        List<DetalleVo> listAcceVo = new ArrayList<DetalleVo>();
        if (listDetalleVo != null && listDetalleVo.size() >= 0) {
            for (int i = 0; i < listDetalleVo.size(); i++) {
                DetalleVo detalleVo = listDetalleVo.get(i);
                //detalleVo.setEstAltMod("5");
                listAcceVo.add(detalleVo);
            }
            detalleFile.guardarListaDetalleVo(listAcceVo);
        }

    }

    public List<DetalleVo> buscarDetallesController() throws Exception {
        return detalleFile.buscarDetallesVo();
    }
}
