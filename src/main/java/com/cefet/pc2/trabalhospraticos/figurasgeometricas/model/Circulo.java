package com.cefet.pc2.trabalhospraticos.figurasgeometricas.model;

import java.util.Objects;

public class Circulo extends FigurasGeometricas {

    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return raio == circulo.raio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(raio);
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
