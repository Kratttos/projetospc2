package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Circulo;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

public class CirculoView extends SubMenuView {

    @Override
    public Renderizavel askObject() {
        this.printLine("----Menu de Criação de Circulo----");
        this.printLine("Qual e o raio do Circulo ?");
        int raio = this.askIntegerBiggerThanZero();
        this.printLine("---------------------------------");
        return new Circulo(raio);
    }

    @Override
    public void showUpdateMenu(Renderizavel item) {
        Circulo circulo = (Circulo) item;
        this.printLine("----Menu de alteração de Circulo----");
        this.printLine("Qual e o valor que você deseja que seja o novo raio ?");
        int raio = this.askIntegerBiggerThanZero();

        this.printLine("Você tem certeza que deseja subistuir o valor atual ( " + circulo.getRaio() + " ) por " + raio + " ?");

        circulo.setRaio(this.askSorN() ? raio : circulo.getRaio());
        this.printLine("---------------------------------");
    }
}
