/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.TextoController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.TextoForm;

/**
 *
 * @author Everton
 */
public class TextoView  extends AbstractSubMenuPane{

    public TextoView(String nomeMenu) {
        super(nomeMenu);
        this.form = new TextoForm();
        this.controller = new TextoController();
    }
    
}