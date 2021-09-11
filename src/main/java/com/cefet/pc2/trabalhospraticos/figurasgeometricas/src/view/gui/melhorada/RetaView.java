/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.RetaController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Reta;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.reta.AlterarRetaForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.reta.DetalhesRetaForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.reta.InserirRetaForm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Everton
 */
public class RetaView extends AbstractSubMenuPane {

    public RetaView(String nomeMenu) {
        super(nomeMenu, new ArrayList<>(Arrays.asList("Tamanho")));
        this.form = new Form(
                new InserirRetaForm(),
                new AlterarRetaForm(),
                new DetalhesRetaForm()
        );
        this.controller = new RetaController();
    }

    @Override
    protected Object[] criarLinha(Renderizavel item) {
        Reta reta = (Reta) item;
        return new Object[]{
                reta.getId(),
                reta.getTamanho()
        };
    }
}
