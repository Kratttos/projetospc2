package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

import java.util.Random;

public class Losango extends Quadrilateros {

    private int diagonal1, diagonal2;

    public Losango(int tamanhoLado) {
        super(tamanhoLado, tamanhoLado);
    }

    public Losango() {
        //placeholder
        super(1, 0);
    }

    @Override
    public int calcularArea() {
        //Aqui ainda vai ter o calculo da area
        return new Random().nextInt();
    }

}
