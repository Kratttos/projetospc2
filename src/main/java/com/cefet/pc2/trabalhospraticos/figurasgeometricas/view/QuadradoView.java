package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.Quadrado;

public class QuadradoView extends BasicIO {

    public Quadrado askQuadrado() {

        this.printLine("Qual e o tamanho dos lados do Quadrado ?");
        int ladoQuadrado = this.askInt();

        return new Quadrado(ladoQuadrado);

    }
}

