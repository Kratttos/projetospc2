/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.QuadradoController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Quadrado;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.QuadradoForm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Everton
 */
public class QuadradoView extends AbstractSubMenuPane {

    public QuadradoView(String nomeMenu) {
        super(nomeMenu, new ArrayList<>(List.of("Tamanho dos Lados")));
        this.form = new QuadradoForm();
        this.controller = new QuadradoController();
    }

    @Override
    public void atualizarTabela() {
        this.tablemodel.setRowCount(0);
        List lista = this.controller.findAll();
        for (Object item : lista) {
            Quadrado quad = (Quadrado) item;
            this.tablemodel.addRow(new Object[]{
                    quad.getId(),
                    quad.getTamanhoLado()
            });
        }
    }
}
