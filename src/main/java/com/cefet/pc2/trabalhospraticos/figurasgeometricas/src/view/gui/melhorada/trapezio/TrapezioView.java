/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada.trapezio;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.CirculoController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.TrapezioController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.CirculoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.TrapezioForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada.AbstractSubMenuPane;

/**
 *
 * @author Everton
 */
public class TrapezioView extends AbstractSubMenuPane{

    public TrapezioView(String nomeMenu) {
        super(nomeMenu);
        this.form = new TrapezioForm(null,true);
        this.controller = new TrapezioController();
    }
    
}
