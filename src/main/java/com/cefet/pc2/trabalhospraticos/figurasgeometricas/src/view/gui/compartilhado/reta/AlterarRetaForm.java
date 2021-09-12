package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.reta;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Reta;

import java.awt.event.ActionEvent;

public class AlterarRetaForm extends RetaForm {
    public AlterarRetaForm() {
        setTitle("Alterar Reta");
    }

    @Override
    protected void btnSalvarEvent(ActionEvent evnt) {
        this.objeto.setTamanho(
                Integer.parseInt(this.textTamanhoReta.getText())
        );
        this.setVisible(false);
    }

    @Override
    public Reta run(Reta objeto) {
        this.objeto = objeto;
        this.textTamanhoReta.setText(objeto.getTamanho()+"");
        this.setVisible(true);

        return this.objeto;
    }
}
