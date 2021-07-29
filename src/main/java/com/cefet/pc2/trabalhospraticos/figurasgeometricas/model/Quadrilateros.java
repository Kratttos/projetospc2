package com.cefet.pc2.trabalhospraticos.figurasgeometricas.model;

public class Quadrilateros extends FigurasGeometricas{

    private int base;
    private int altura;

    public Quadrilateros(int base,int altura){
        this.base = base;
        this.altura = altura;
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
