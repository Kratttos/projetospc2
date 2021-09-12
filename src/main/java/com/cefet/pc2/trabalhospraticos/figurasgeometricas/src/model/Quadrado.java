package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

public class Quadrado extends Quadrilateros{

    public Quadrado(int tamanhoLado){
        super(tamanhoLado,tamanhoLado);
    }

    public void setTamanhoLado(int tamanhoLado){
        this.setAltura(tamanhoLado);
        this.setBase(tamanhoLado);
    }

    public int getTamanhoLado(){
        return this.getAltura();
    }

}
