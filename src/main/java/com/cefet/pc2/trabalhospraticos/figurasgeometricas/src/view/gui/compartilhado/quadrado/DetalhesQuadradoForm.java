package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.quadrado;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Quadrado;

public class DetalhesQuadradoForm extends AlterarQuadradoForm {

    @Override
    public Quadrado run(Quadrado objeto) {
        this.textTamanhoLado.setEnabled(false);
        this.btnSalvarAlterar.setEnabled(false);
        super.run(objeto);
        return objeto;
    }
}
