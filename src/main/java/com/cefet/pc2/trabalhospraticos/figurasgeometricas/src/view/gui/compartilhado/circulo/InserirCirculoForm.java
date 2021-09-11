/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.circulo;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Circulo;

import java.awt.event.ActionEvent;

/**
 * @author Everton
 */
public class InserirCirculoForm extends CirculoDialog {


    @Override
    protected void btnSalvarEvent(ActionEvent evnt) {
        this.objeto = new Circulo(
                Integer.parseInt(this.textRaio.getText())
        );
        this.setVisible(false);
    }

}
