package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.Retangulo;

public class RetanguloView extends BasicIO {

    public Retangulo askRetangulo(){

        this.printLine("Qual e o tamanho da base do Rentagulo ?");
        int base = this.askInt();
        this.printLine("Qual e o tamanho dos lados ?");
        int lados = this.askInt();

        return new Retangulo(base,lados);
    }

}
