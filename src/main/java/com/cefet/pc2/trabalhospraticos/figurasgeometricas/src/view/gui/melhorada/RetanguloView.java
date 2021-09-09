/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.RetanguloController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.RetanguloForm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Everton
 */
public class RetanguloView extends AbstractSubMenuPane {

    public RetanguloView(String nomeMenu) {
        super(nomeMenu, new ArrayList<>(Arrays.asList("Base", "Altura")));
        this.form = new RetanguloForm();
        this.controller = new RetanguloController();
    }

}
