package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.quadrado;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Quadrado;

import java.awt.event.ActionEvent;

public class InserirQuadradoForm extends QuadradoForm{

    public InserirQuadradoForm() {
        setTitle("Inserir Quadrado");
    }

    @Override
    protected void btnSalvarEvent(ActionEvent evnt) {
        this.objeto = new Quadrado(
                Integer.parseInt(this.textTamanhoLado.getText())
        );
        this.setVisible(false);
    }
}
