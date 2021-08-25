package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Reta;

public class RetaView extends SubMenuView {

    @Override
    public Renderizavel askObject() {

        this.printLine("----Menu de Criação de Reta----");
        this.printLine("Qual e o tamanho da reta ?");
        int tamanho = this.askIntegerBiggerThanZero();

        this.printLine("-----------------------------------");
        return new Reta(tamanho);
    }

    @Override
    public void update(Renderizavel item) {

    }
}
