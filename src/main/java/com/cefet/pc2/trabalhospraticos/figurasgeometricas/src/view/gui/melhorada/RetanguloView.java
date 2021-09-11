/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.RetanguloController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Retangulo;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.retangulo.AlterarRetanguloForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.retangulo.DetalhesRetanguloForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.retangulo.InserirRetanguloForm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Everton
 */
public class RetanguloView extends AbstractSubMenuPane {

    public RetanguloView(String nomeMenu) {
        super(nomeMenu, new ArrayList<>(Arrays.asList("Base", "Altura")));
        this.form = new Form(
                new InserirRetanguloForm(),
                new AlterarRetanguloForm(),
                new DetalhesRetanguloForm()
        );
        this.controller = new RetanguloController();
    }
    
    @Override
    protected Object[] criarLinha(Renderizavel item) {
        Retangulo retangulo = (Retangulo) item;
        return new Object[]{
                retangulo.getId(),
                retangulo.getBase(),
                retangulo.getAltura()
        };
    }
}
