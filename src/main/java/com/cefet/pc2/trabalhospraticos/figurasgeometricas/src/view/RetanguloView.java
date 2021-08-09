package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Retangulo;

public class RetanguloView extends BasicView {

    @Override
    public Renderizavel askObject() {
        this.printLine("----Menu de Criação de Retangulo----");
        this.printLine("Qual e o tamanho da base do Rentagulo ?");
        int base = this.askIntegerBiggerThanZero();
        this.printLine("Qual e o tamanho dos lados ?");
        int lados = this.askIntegerBiggerThanZero();
        this.printLine("-----------------------------------");
        return new Retangulo(base,lados);
    }
}
