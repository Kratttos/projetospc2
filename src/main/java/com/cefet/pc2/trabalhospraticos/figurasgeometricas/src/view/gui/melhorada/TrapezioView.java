/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.TrapezioController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Trapezio;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.trapezio.AlterarTrapezioForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.trapezio.DetalhesTrapezioForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.trapezio.InserirTrapezioForm;

import java.util.ArrayList;
import java.util.Arrays;

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
        this.form = new Form(
                new InserirTrapezioForm(),
                new AlterarTrapezioForm(),
                new DetalhesTrapezioForm()
        );
        this.controller = new TrapezioController();
    }

    @Override
    protected Object[] criarLinha(Renderizavel item) {
        Trapezio trapezio = (Trapezio) item;
        return new Object[]{
                trapezio.getId(),
                trapezio.getBase(),
                trapezio.getBaseMenor(),
                trapezio.getLadoDireito(),
                trapezio.getLadoEsquerdo(),
                trapezio.getAltura()
        };
    }
}
