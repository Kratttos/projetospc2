package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Trapezio;

public class TrapezioView extends SubMenuView{
    @Override
    public Renderizavel askObject() {
        this.printLine("----Menu de Criação de Trapezio----");
        this.printLine("Por favor Digite o tamanho da menor base");
        int menorBase = this.askIntegerBiggerThanZero();
        this.printLine("Por Favor Digite o tamanho da maior base");
        int maiorBase = this.askIntegerBiggerThanZero();
        System.out.println("Por favor digite o tamanho do lado esquerdo");
        int ladoEsquerdo = this.askIntegerBiggerThanZero();
        System.out.println("Por favor digite o tamanho do lado direito");
        int ladoDireito = this.askIntegerBiggerThanZero();
        this.printLine("Por favor digite a altura");
        int altura = this.askIntegerBiggerThanZero();

        return new Trapezio(maiorBase,altura,menorBase,ladoDireito,ladoEsquerdo);
    }

    @Override
    public void showUpdateMenu(Renderizavel item) {

    }
}
