package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

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
    public void showUpdateMenu(Renderizavel item) {
        Quadrado quad = (Quadrado) item;
        this.printLine("----Menu de Criação de Quadrado----");
        this.printLine("Qual e o novo tamanho dos lados do quadrado ?");
        int  tamanho = this.askIntegerBiggerThanZero();
        this.printLine("Você tem certeza que deseja subistuir o valor atual ( " + quad.getTamanhoLado() + " ) por " + tamanho + " ?");
        quad.setTamanhoLado(this.askSorN() ? tamanho : quad.getTamanhoLado());
        this.printLine("----------------------------------");

    }
}

