package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

public class Texto extends Renderizavel{

    private String text;

    public Texto(String text) {
        this.text = text;
    }

    public Texto() {
        this.text = "";
    }

    @Override
    public String toString() {
        return "Texto: { Meu ID é: "+this.getId() +" e meu texto é : "+ this.text +"}";
    }
}
