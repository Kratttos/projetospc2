/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.TextoController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Texto;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.TextoForm;

import java.util.ArrayList;
import java.util.Arrays;

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
    protected Object[] criarLinha(Renderizavel item) {
        Texto texto = (Texto) item;
        return new Object[]{
                texto.getId(),
                texto.getText(),
        };
    }
}
