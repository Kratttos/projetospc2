package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.circulo;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Circulo;

import java.awt.event.ActionEvent;

public class AlterarCirculoForm extends CirculoDialog {
    public AlterarCirculoForm() {
        setTitle("Alterar Circulo");
    }

    @Override
    protected void btnSalvarEvent(ActionEvent evnt) {
        this.objeto.setRaio(
                Integer.parseInt(this.textRaio.getText())
        );
        this.setVisible(false);
    }

    @Override
    public Circulo run(Circulo objeto) {
        this.objeto = objeto;
        this.textRaio.setText(objeto.getRaio() + "");
        this.setVisible(true);

        return this.objeto;
    }
}
