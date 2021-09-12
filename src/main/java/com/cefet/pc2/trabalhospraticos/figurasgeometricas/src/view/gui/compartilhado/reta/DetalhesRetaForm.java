package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.reta;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Reta;

public class DetalhesRetaForm extends AlterarRetaForm{
    public DetalhesRetaForm() {
        setTitle("Detalhes Reta");
    }

    @Override
    public Reta run(Reta objeto) {
        this.textTamanhoReta.setEnabled(false);
        this.btnSalvar.setEnabled(false);
        return super.run(objeto);
    }
}
