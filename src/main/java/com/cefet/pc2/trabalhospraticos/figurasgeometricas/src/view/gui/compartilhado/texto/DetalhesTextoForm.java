package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.texto;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Texto;

public class DetalhesTextoForm extends AlterarTextoForm{
    @Override
    public Texto run(Texto objeto) {
        this.textTexto.setEnabled(false);
        this.btnSalvar.setEnabled(false);

        return super.run(objeto);
    }
}
