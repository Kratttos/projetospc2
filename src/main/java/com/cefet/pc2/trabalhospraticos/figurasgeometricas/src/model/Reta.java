package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

import java.util.Objects;

public class Reta extends Renderizavel {

    private int tamanho;

    public Reta(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reta reta = (Reta) o;
        return tamanho == reta.tamanho;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tamanho);
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Reta { ID = " + this.getId() + " Tamanho = " + tamanho + "}";
    }
}
