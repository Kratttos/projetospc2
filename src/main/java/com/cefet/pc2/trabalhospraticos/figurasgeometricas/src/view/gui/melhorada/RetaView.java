/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.RetaController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Reta;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.RetaForm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Everton
 */
public class RetaView extends AbstractSubMenuPane {

    public RetaView(String nomeMenu) {
        super(nomeMenu, new ArrayList<>(Arrays.asList("Tamanho")));
        this.form = new RetaForm();
        this.controller = new RetaController();
    }

    @Override
    public void atualizarTabela() {
        this.tablemodel.setRowCount(0);
        List lista = this.controller.findAll();
        for (Object item : lista) {
            Reta reta = (Reta) item;
            this.tablemodel.addRow(new Object[]{
                    reta.getId(),
                    reta.getTamanho()
            });
        }
    }
}
