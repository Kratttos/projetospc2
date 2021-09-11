package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.circulo;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Circulo;

public class DetalhesCirculoForm extends AlterarCirculoForm{

    @Override
    public Circulo run(Circulo objeto) {
        this.textRaio.setEnabled(false);
        this.btnSalvar.setEnabled(false);

        return super.run(objeto);
    }
}
