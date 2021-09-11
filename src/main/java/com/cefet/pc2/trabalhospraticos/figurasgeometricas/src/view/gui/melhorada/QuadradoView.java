/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.QuadradoController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Quadrado;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.quadrado.AlterarQuadradoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.quadrado.DetalhesQuadradoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.quadrado.InserirQuadradoForm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Everton
 */
public class QuadradoView extends AbstractSubMenuPane<Quadrado> {

    public QuadradoView(String nomeMenu) {
        super(nomeMenu, new ArrayList<>(List.of("Tamanho dos Lados")));
        this.form = new Form(
                new InserirQuadradoForm(),
                new AlterarQuadradoForm(),
                new DetalhesQuadradoForm()
        );
        this.controller = new QuadradoController();
    }

    @Override
    protected Object[] criarLinha(Renderizavel item) {
        Quadrado quad = (Quadrado) item;
        return new Object[]{
                quad.getId(),
                quad.getTamanhoLado()
        };
    }
}
