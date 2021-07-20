package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.Circulo;

public class CirculoView extends BasicIO{

    public Circulo askCirculo(){
        System.out.println("PLACEHOLDER : foi criado um circulo");

        return new Circulo();
    }
}
