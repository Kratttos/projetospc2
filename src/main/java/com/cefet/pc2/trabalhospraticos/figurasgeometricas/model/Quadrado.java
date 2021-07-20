package com.cefet.pc2.trabalhospraticos.figurasgeometricas.model;

import java.util.ArrayList;
import java.util.List;

public class Quadrado extends FigurasGeometricas{
    public Quadrado(List<Ponto> pontos) {
        super(pontos);
    }

    public Quadrado(){
        super(new ArrayList<>());
    }

    @Override
    public String toString() {
        return "PLACEHOLDER Isso aqui e um Quadrado";
    }
}
