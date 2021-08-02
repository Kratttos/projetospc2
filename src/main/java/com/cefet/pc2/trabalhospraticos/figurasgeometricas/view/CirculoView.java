package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.Circulo;

public class CirculoView extends BasicIO {

    /**
     * Tela de criação do objeto Circulo
     *
     * @return Retorna um objeto do tipo Quadrado
     */
    public Circulo askCirculo() {
        this.printLine("----Menu de Criação de Circulo----");
        this.printLine("Qual e o raio do Circulo ?");
        int raio;
        do {
            raio = this.askInt();
        } while (raio <= 0);
        this.printLine("---------------------------------");
        return new Circulo(raio);
    }
}
