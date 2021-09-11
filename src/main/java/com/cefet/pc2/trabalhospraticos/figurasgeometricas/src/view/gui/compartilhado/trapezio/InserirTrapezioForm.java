package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.trapezio;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Trapezio;

import java.awt.event.ActionEvent;

public class InserirTrapezioForm extends TrapezioForm {

    @Override
    protected void btnSalvarEvent(ActionEvent evnt) {
        this.objeto = new Trapezio(
                Integer.parseInt(textMaiorBase.getText()),
                Integer.parseInt(textAltura.getText()),
                Integer.parseInt(textMenorBase.getText()),
                Integer.parseInt(textLadoDireito.getText()),
                Integer.parseInt(textLadoEsquerdo.getText())
        );

        this.setVisible(false);
    }
}
