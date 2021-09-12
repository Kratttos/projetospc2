package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.retangulo;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Retangulo;

import java.awt.event.ActionEvent;

public class InserirRetanguloForm extends RetanguloForm{

    public InserirRetanguloForm() {
        setTitle("Inserir Retangulo");
    }

    @Override
    protected void btnSalvarEvent(ActionEvent evnt) {
        int altura = Integer.parseInt(this.textTamanhoLado.getText());
        int base = Integer.parseInt(this.textTamanhoLado1.getText());
        this.objeto = new Retangulo(base,altura);

        setVisible(false);
    }
}
