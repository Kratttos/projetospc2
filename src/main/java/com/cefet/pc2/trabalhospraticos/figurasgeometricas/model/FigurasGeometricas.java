package com.cefet.pc2.trabalhospraticos.figurasgeometricas.model;

public abstract class FigurasGeometricas {


    public FigurasGeometricas(){

    }

    public abstract int calcularArea();

    public abstract int calcularPerimetro();

    @Override
    public String toString() {

        String temp = (this.getClass().toString()).substring((this.getClass().toString()).lastIndexOf(".")+1);

        return temp + " : minha area é "+  this.calcularArea() + " e meu perimetro é "+ this.calcularPerimetro();
    }
}
