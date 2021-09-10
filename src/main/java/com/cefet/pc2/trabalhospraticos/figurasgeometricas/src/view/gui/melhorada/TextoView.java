/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.TextoController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Texto;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.TextoForm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Everton
 */
public class TextoView extends AbstractSubMenuPane {

    public TextoView(String nomeMenu) {
        super(nomeMenu, new ArrayList<>(Arrays.asList("Texto")));
        this.form = new TextoForm();
        this.controller = new TextoController();
    }

    @Override
    public void atualizarTabela() {
        this.tablemodel.setRowCount(0);
        List lista = this.controller.findAll();
        for (Object item : lista) {
            Texto texto = (Texto) item;
            this.tablemodel.addRow(new Object[]{
                    texto.getId(),
                    texto.getText(),
            });
        }
    }
}
