package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums;

public enum Avulsas implements Opcoes {
    DESENHAR("Desenhar","D"),
    LISTAR("Listar","L"),
    SALVAR("Salvar","S"),
    RECARREGAR("Recarregar","R"),
    SAIR("Sair","X");

    private String text;
    private String tecla;

    Avulsas(String text,String tecla) {
        this.text = text;
        this.tecla = tecla;
    }

    @Override
    public String getText() {
       return this.text;
    }

    @Override
    public String getTecla() {
        return this.tecla;
    }
}
