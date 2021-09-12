package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.trapezio;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Trapezio;

import java.awt.event.ActionEvent;

public class AlterarTrapezioForm extends TrapezioForm{

    public AlterarTrapezioForm() {
        setTitle("Alterar Trapezio");
    }

    @Override
    protected void btnSalvarEvent(ActionEvent evnt) {
        objeto.setAltura(
                Integer.parseInt(textAltura.getText())
        );
        objeto.setBaseMenor(
                Integer.parseInt(textMenorBase.getText())
        );
        objeto.setBase(
                Integer.parseInt(textMaiorBase.getText())
        );
        objeto.setLadoEsquerdo(
                Integer.parseInt(textLadoEsquerdo.getText())
        );
        objeto.setLadoDireito(
                Integer.parseInt(textLadoDireito.getText())
        );

        setVisible(false);
    }

    @Override
    public Trapezio run(Trapezio objeto) {
        this.objeto = objeto;
        textAltura.setText(this.objeto.getAltura()+"");
        textLadoDireito.setText(this.objeto.getLadoDireito()+"");
        textLadoEsquerdo.setText(this.objeto.getLadoEsquerdo()+"");
        textMaiorBase.setText(this.objeto.getBase()+"");
        textMenorBase.setText(this.objeto.getBaseMenor()+"");

        setVisible(true);

        return this.objeto;
    }
}
