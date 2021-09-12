package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.trapezio;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Trapezio;

public class DetalhesTrapezioForm extends AlterarTrapezioForm{

    public DetalhesTrapezioForm() {
        setTitle("Detalhes Trapezio");
    }

    @Override
    public Trapezio run(Trapezio objeto) {
        textLadoDireito.setEnabled(false);
        textAltura.setEnabled(false);
        textLadoEsquerdo.setEnabled(false);
        textMenorBase.setEnabled(false);
        textMaiorBase.setEnabled(false);
        btnSalvar.setEnabled(false);

        return super.run(objeto);
    }
}
