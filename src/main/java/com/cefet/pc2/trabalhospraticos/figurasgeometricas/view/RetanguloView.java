package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.Retangulo;

public class RetanguloView extends BasicView {

    public Retangulo askRetangulo(){
        this.printLine("----Menu de Criação de Retangulo----");
        this.printLine("Qual e o tamanho da base do Rentagulo ?");
        int base = this.askNumberBiggerThanZero();
        this.printLine("Qual e o tamanho dos lados ?");
        int lados = this.askNumberBiggerThanZero();
        this.printLine("-----------------------------------");
        return new Retangulo(base,lados);
    }

}
