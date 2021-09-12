package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.reta;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Reta;

import java.awt.event.ActionEvent;

public class InserirRetaForm extends RetaForm {
    public InserirRetaForm() {
        setTitle("Inserir Reta");
    }

    @Override
    protected void btnSalvarEvent(ActionEvent evnt) {
        this.objeto = new Reta(
            Integer.parseInt(this.textTamanhoReta.getText())
        );
        this.setVisible(false);
    }
}
