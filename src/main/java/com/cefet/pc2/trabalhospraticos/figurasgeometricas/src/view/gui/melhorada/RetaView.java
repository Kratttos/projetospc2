/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.RetaController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.RetaForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada.AbstractSubMenuPane;

/**
 *
 * @author Everton
 */
public class RetaView extends AbstractSubMenuPane{

    public RetaView(String nomeMenu) {
        super(nomeMenu);
        this.form = new RetaForm();
        this.controller = new RetaController();
    }
    
}
