package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Triangulo;

public class TrianguloView extends SubMenuView {
    @Override
    public Renderizavel askObject() {
        this.printLine("----Menu de Criação de Triangulos----");
        this.printLine("Digite o tamanho do primeiro lado do Triangulo");
        int lado1 = this.askIntegerBiggerThanZero();
        this.printLine("Digite o tamanho do segundo lado do Triangulo");
        int lado2 = this.askIntegerBiggerThanZero();
        this.printLine("Digite o tamanho do terceiro lado do Triangulo");
        int lado3 = this.askIntegerBiggerThanZero();
        this.printLine("---------------------------------");

        return new Triangulo(lado1, lado2, lado3);
    }

    @Override
    public void update(Renderizavel item) {

    }
}
