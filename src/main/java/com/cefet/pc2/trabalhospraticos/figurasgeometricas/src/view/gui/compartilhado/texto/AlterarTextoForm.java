package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.texto;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Texto;

import java.awt.event.ActionEvent;

public class AlterarTextoForm extends TextoForm{

    public AlterarTextoForm() {
        setTitle("Alterar Texto");
    }

    @Override
    protected void btnSalvarEvent(ActionEvent evnt) {
        this.objeto.setText(this.textTexto.getText());

        this.setVisible(false);
    }

    @Override
    public Texto run(Texto objeto) {
        this.objeto = objeto;
        this.textTexto.setText(this.objeto.getText());
        this.setVisible(true);

        return this.objeto;
    }
}
