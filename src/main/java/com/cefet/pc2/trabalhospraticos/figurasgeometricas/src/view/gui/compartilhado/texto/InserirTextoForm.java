package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.texto;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Texto;

import java.awt.event.ActionEvent;

public class InserirTextoForm extends TextoForm {

    public InserirTextoForm() {
        setTitle("Inserir Texto");
    }

    @Override
    protected void btnSalvarEvent(ActionEvent evnt) {
        this.objeto = new Texto(
            this.textTexto.getText()
        );

        this.setVisible(false);
    }
}
