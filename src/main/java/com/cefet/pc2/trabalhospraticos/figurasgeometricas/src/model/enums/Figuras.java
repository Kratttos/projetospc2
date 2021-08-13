package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums;

public enum Figuras implements Opcoes {
    TEXTO("Texto", "1"),
    RETA("Reta", "2"),
    RETANGULO("Retangulo", "3"),
    QUADRADO("Quadrado", "4"),
    CIRCULO("Circulo", "5"),
    TRIANGULO("Triangulo","6"),
    ELIPSE("Losango","7");

    private String text;
    private String tecla;

    Figuras(String text, String tecla) {
        this.text = text;
        this.tecla = tecla;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getTecla() {
        return tecla;
    }
}
