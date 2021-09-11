package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.triangulo;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Triangulo;

import java.awt.event.ActionEvent;

public class AlterarTrianguloForm extends TrianguloForm{

    @Override
    protected void btnSalvarEvent(ActionEvent evnt) {
        int[] lados = new int[]{
                Integer.parseInt(textLado1.getText()),
                Integer.parseInt(textLado2.getText()),
                Integer.parseInt(textLado3.getText())
        };
        this.objeto.setLados(lados);

        setVisible(false);
    }

    @Override
    public Triangulo run(Triangulo objeto) {
        this.objeto = objeto;
        textLado1.setText(objeto.getLado1()+"");
        textLado2.setText(objeto.getLado2()+"");
        textLado3.setText(objeto.getLado3()+"");
        setVisible(true);

        return this.objeto;
    }
}
