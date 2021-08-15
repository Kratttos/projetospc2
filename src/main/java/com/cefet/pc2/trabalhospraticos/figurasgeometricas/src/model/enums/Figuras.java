package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums;

public enum Figuras implements Opcoes {

    TEXTO("Texto", definirNumero()),
    RETA("Reta", definirNumero()),
    RETANGULO("Retangulo", definirNumero()),
    QUADRADO("Quadrado", definirNumero()),
    CIRCULO("Circulo", definirNumero()),
    TRIANGULO("Triangulo",definirNumero()),
    ELIPSE("Losango",definirNumero()),
    TRAPEZIO("Trapezio",definirNumero());

    private String text;
    private String tecla;

    private static int numero;

    Figuras(String text, String tecla) {
        this.text = text;
        this.tecla = tecla;
    }

    private static final String definirNumero() {
        return (Figuras.numero+=1) + "";
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
