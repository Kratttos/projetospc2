package com.cefet.pc2.trabalhospraticos.figurasgeometricas.model;

public class Circulo extends FigurasGeometricas {

    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public int calcularArea() {
        return (int) (Math.PI * (raio * raio));
    }

    @Override
    public int calcularPerimetro() {
        return (int) ((2 * Math.PI) * this.raio);
    }

}
