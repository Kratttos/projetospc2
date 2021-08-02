package com.cefet.pc2.trabalhospraticos.figurasgeometricas.model;

import java.util.Objects;

public abstract class Quadrilateros extends FigurasGeometricas{

    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public Quadrilateros(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadrilateros that = (Quadrilateros) o;
        return base == that.base && altura == that.altura;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, altura);
    }

    @Override
    public int calcularArea() {
       return this.base*this.altura;
    }

    @Override
    public int calcularPerimetro() {
        return (this.base+this.altura)*2;
    }

}
