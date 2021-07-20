package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.Retangulo;

public class RetanguloView extends BasicIO {

    public Retangulo askRetangulo(){

        this.printLine("PLACEHOLDER um Retangulo foi criado aqui");

        return new Retangulo();
    }

}
