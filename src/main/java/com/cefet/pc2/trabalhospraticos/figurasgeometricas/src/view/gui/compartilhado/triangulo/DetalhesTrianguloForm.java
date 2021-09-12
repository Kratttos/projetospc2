package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.triangulo;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Triangulo;

public class DetalhesTrianguloForm extends AlterarTrianguloForm{

    public DetalhesTrianguloForm() {
        setTitle("Detalhes Triangulo");
    }

    @Override
    public Triangulo run(Triangulo objeto) {
        textLado1.setEnabled(false);
        textLado2.setEnabled(false);
        textLado3.setEnabled(false);
        return super.run(objeto);
    }
}
