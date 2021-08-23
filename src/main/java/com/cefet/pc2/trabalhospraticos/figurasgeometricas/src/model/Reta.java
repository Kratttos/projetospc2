package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

public class Reta extends Renderizavel{

    private int tamanho;

    public Reta(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
