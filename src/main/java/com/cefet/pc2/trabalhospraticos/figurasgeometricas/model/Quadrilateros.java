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

    @Override
    public String toString() {

        String temp = (this.getClass().toString()).substring((this.getClass().toString()).lastIndexOf(".")+1);

        return temp + " : minha area é "+  this.calcularArea() + " e meu perimetro é "+ this.calcularPerimetro();
    }
}
