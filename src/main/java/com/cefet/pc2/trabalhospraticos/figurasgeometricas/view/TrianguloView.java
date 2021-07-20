package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.Triangulo;

public class TrianguloView extends BasicIO{

    public Triangulo askTriangulo(){
        System.out.println("PLACEHOLDER: um triangulo foi criado");
        return new Triangulo();
    }
}
