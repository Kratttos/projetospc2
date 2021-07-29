package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.Circulo;

public class CirculoView extends BasicIO {

    public Circulo askCirculo() {
        this.printLine("Qual e o raio do Circulo ?");
        int raio;
        do {
            raio = this.askInt();
        } while (raio <= 0);
        return new Circulo(raio);
    }
}
