/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.TrapezioController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Trapezio;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.TrapezioForm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Everton
 */
public class TrapezioView extends AbstractSubMenuPane {

    public TrapezioView(String nomeMenu) {
        super(nomeMenu, new ArrayList<>(Arrays.asList(
                "Maior Lado",
                "Menor Lado",
                "Lado Direito",
                "Lado Esquerdo",
                "Altura"
        )));
        this.form = new TrapezioForm();
        this.controller = new TrapezioController();
    }

    @Override
    public void atualizarTabela() {
        this.tablemodel.setRowCount(0);
        List lista = this.controller.findAll();
        for (Object item : lista) {
            Trapezio trapezio = (Trapezio) item;
            this.tablemodel.addRow(new Object[]{
                    trapezio.getId(),
                    trapezio.getBase(),
                    trapezio.getBaseMenor(),
                    trapezio.getLadoDireito(),
                    trapezio.getLadoEsquerdo(),
                    trapezio.getAltura()
            });
        }
    }
}
