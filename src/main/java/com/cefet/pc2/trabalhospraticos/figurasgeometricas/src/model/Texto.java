package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

import java.util.Objects;

public class Texto extends Renderizavel{

    private String text;

    public Texto(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Texto texto = (Texto) o;
        return text.equals(texto.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "Texto: { Meu ID é: "+this.getId() +" e meu texto é : "+ this.text +" }";
    }
}
