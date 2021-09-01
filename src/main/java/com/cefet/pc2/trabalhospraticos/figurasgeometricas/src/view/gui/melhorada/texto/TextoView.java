/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada.texto;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.CirculoController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.TextoController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.CirculoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.TextoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada.AbstractSubMenuPane;

/**
 *
 * @author Everton
 */
public class TextoView  extends AbstractSubMenuPane{

    public TextoView(String nomeMenu) {
        super(nomeMenu);
        this.form = new TextoForm(null, true);
        this.controller = new TextoController();
    }
    
}
