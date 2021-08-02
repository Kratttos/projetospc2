package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.Quadrado;

public class QuadradoView extends BasicView {
    /**
     * Tela de criação do Objeto Quadrado
     *
     * @return Retorna um Objeto do tipo Quadrado
     */
    public Quadrado askQuadrado() {
        this.printLine("----Menu de Criação de Quadrado----");
        this.printLine("Qual e o tamanho dos lados do Quadrado ?");
        int ladoQuadrado = this.askNumberBiggerThanZero();
        this.printLine("----------------------------------");
        return new Quadrado(ladoQuadrado);

    }
}

