package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Quadrado;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

public class QuadradoView extends SubMenuView {

    @Override
    public Renderizavel askObject() {
        this.printLine("----Menu de Criação de Quadrado----");
        this.printLine("Qual e o tamanho dos lados do Quadrado ?");
        int ladoQuadrado = this.askIntegerBiggerThanZero();
        this.printLine("----------------------------------");
        return new Quadrado(ladoQuadrado);
    }

    @Override
    public void update(Renderizavel item) {

    }
}

