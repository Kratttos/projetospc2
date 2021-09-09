/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.TrianguloController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Triangulo;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.TrianguloForm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Everton
 */
public class TrianguloView extends AbstractSubMenuPane {

    public TrianguloView(String nomeMenu) {
        super(nomeMenu, new ArrayList<>(List.of(
                "Lado 1",
                "Lado 2",
                "Lado 3"
        )));
        this.form = new TrianguloForm();
        this.controller = new TrianguloController();
        this.atualizarTabela();
    }

    @Override
    public void atualizarTabela() {
        this.tablemodel.setRowCount(0);
        List lista = this.controller.findAll();
        for (Object item : lista) {
            Triangulo triangulo = (Triangulo) item;
            int[] lados = triangulo.getLados();
            this.tablemodel.addRow(new Object[]{
                    triangulo.getId(),
                    lados[0],
                    lados[1],
                    lados[2]
            });
        }
    }
}
