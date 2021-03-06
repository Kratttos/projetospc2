/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.CirculoController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Circulo;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.circulo.AlterarCirculoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.circulo.DetalhesCirculoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.circulo.InserirCirculoForm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Everton
 */
public class CirculoView extends AbstractSubMenuPane {

    public CirculoView(String nomeMenu) {
        super(nomeMenu, new ArrayList<>(Arrays.asList("Raio")));
        this.form = new Form(
                new InserirCirculoForm(),
                new AlterarCirculoForm(),
                new DetalhesCirculoForm()
        );
        this.controller = new CirculoController();
    }

    @Override
    protected Object[] criarLinha(Renderizavel item) {
        Circulo circulo = (Circulo) item;
        return new Object[]{
                circulo.getId(),
                circulo.getRaio()
        };
    }
}
