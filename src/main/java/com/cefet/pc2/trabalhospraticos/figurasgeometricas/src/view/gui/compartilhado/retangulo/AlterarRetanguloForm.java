package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.retangulo;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Retangulo;

import java.awt.event.ActionEvent;

public class AlterarRetanguloForm extends RetanguloForm {
    @Override
    protected void btnSalvarEvent(ActionEvent evnt) {
        objeto.setAltura(
                Integer.parseInt(this.textTamanhoLado.getText())
        );
        objeto.setBase(
                Integer.parseInt(this.textTamanhoLado1.getText())
        );
        setVisible(false);
    }

    @Override
    public Retangulo run(Retangulo objeto) {
        this.objeto = objeto;
        textTamanhoLado.setText(this.objeto.getAltura() + "");
        textTamanhoLado1.setText(this.objeto.getBase() + "");
        setVisible(true);

        return this.objeto;
    }
}
