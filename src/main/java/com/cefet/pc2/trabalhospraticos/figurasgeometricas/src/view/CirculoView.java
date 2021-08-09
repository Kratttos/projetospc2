package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Circulo;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

public class CirculoView extends BasicView {

    @Override
    public Renderizavel askObject() {
        this.printLine("----Menu de Criação de Circulo----");
        this.printLine("Qual e o raio do Circulo ?");
        int raio = this.askIntegerBiggerThanZero();
        this.printLine("---------------------------------");
        return new Circulo(raio);
    }
}
