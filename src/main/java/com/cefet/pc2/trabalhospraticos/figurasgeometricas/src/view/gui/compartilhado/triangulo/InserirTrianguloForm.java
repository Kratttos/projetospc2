package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.triangulo;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Triangulo;

import java.awt.event.ActionEvent;

public class InserirTrianguloForm extends TrianguloForm {

    public InserirTrianguloForm() {
        setTitle("Inserir Triangulo");
    }

    @Override
    protected void btnSalvarEvent(ActionEvent evnt) {
        int[] lados = new int[]{
                Integer.parseInt(textLado1.getText()),
                Integer.parseInt(textLado2.getText()),
                Integer.parseInt(textLado3.getText())
        };
        this.objeto = new Triangulo(lados);

        setVisible(false);

    }
}
