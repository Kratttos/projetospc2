package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.quadrado;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Quadrado;

import java.awt.event.ActionEvent;

public class AlterarQuadradoForm extends QuadradoForm {
    public AlterarQuadradoForm() {
        setTitle("Alterar Quadrado");
    }

    @Override
    public Quadrado run(Quadrado objeto) {
        this.objeto = objeto;
        this.textTamanhoLado.setText(this.objeto.getTamanhoLado()+"");
        this.setVisible(true);

        return this.objeto;
    }

    @Override
    protected void btnSalvarEvent(ActionEvent evnt) {
        this.objeto.setTamanhoLado(
                Integer.parseInt(this.textTamanhoLado.getText())
        );

        this.setVisible(false);
    }
}
