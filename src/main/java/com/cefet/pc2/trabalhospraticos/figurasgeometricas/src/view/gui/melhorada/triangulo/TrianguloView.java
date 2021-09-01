/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada.triangulo;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.CirculoController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.TrianguloController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.CirculoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.TrianguloForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada.AbstractSubMenuPane;

/**
 *
 * @author Everton
 */
public class TrianguloView extends AbstractSubMenuPane{

    public TrianguloView(String nomeMenu) {
        super(nomeMenu);
        this.form = new TrianguloForm(null, true);
        this.controller = new TrianguloController();
    }
    
}
