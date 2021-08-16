package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Retangulo;

public class RetanguloView extends SubMenuView {

    @Override
    public Renderizavel askObject() {
        this.printLine("----Menu de Criação de Retangulo----");
        this.printLine("Qual e o tamanho da base do Rentagulo ?");
        int base = this.askIntegerBiggerThanZero();
        this.printLine("Qual e o tamanho dos lados ?");
        int lados = this.askIntegerBiggerThanZero();
        this.printLine("-----------------------------------");
        return new Retangulo(base, lados);
    }

    @Override
    public void showUpdateMenu(Renderizavel item) {
        Retangulo retangulo = (Retangulo) item;
        this.printLine("----Menu de alteração de Retangulo----");
        this.printLine("Qual propiedade você deseja alterar ?");
        this.printLine("1 - Tamanho da base");
        this.printLine("2 - Tamanho da altura");
        this.printLine("X - Cancelar e Voltar");
        String opcao = this.askString();
        //em processo



        this.printLine("-----------------------------------");

    }
}
