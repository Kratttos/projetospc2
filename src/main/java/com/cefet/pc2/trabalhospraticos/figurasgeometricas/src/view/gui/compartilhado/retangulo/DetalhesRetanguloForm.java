package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.retangulo;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Retangulo;

public class DetalhesRetanguloForm extends AlterarRetanguloForm {

    @Override
    public Retangulo run(Retangulo objeto) {
        textTamanhoLado.setEnabled(false);
        textTamanhoLado1.setEnabled(false);
        btnSalvarAlterar.setEnabled(false);
        return super.run(objeto);
    }
}
