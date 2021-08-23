package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Reta;

public class RetaView extends SubMenuView {

    @Override
    public Renderizavel askObject() {

        this.printLine("----Menu de Criação de Reta----");
        this.printLine("Qual e o tamanho da reta ?");
        int tamanho = this.askIntegerBiggerThanZero();

        this.printLine("-----------------------------------");
        return new Reta(tamanho);
    }

    @Override
    public void showUpdateMenu(Renderizavel item) {
        Reta reta = (Reta) item;

        this.printLine("----Menu de Alteração de Reta----");
        this.printLine("Por favor digite um novo tamanho para a Reta");
        int novoTamanho = this.askIntegerBiggerThanZero();
        this.printLine("Você tem certeza que deseja subistuir o valor atual ?");
        this.printLine("Valor antigo : " + reta.getTamanho());
        this.printLine("Valor novo   : " + novoTamanho);
        this.printLine("");


        this.printLine("---------------------------------");
        reta.setTamanho(this.askSorN() ? novoTamanho : reta.getTamanho());
        System.out.println(reta.getTamanho());
    }
}
