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
    public void showUpdateMenu(Renderizavel item) {
        Triangulo triangulo = (Triangulo) item;
        String opcoes[] = new String[]{"Lado 1", "Lado 2", "Lado 3"};
        int lados[] = triangulo.getLados();
        String opcaoEscolhida = "";

        this.printLine("----Menu de Criação de Triangulos----");
        do {
            this.printLine("Triangulo atual: Lado 1 = " + triangulo.getLados()[0] + " Lado 2 = " + triangulo.getLados()[1] + " Lado 3 = " + triangulo.getLados()[2]);
            this.printLine("Triangulo alterado: Lado 1 = " + lados[0] + " Lado 2 = " + lados[1] + " Lado 3 = " + lados[2]);
            this.printLine("");

            this.printLine("Selecione oque você deseja alterar ?");
            for (int i = 0; i < opcoes.length; i++) {
                this.printLine((i + 1) + " - Alterar " + opcoes[i]);
            }
            this.printLine("");
            this.printLine("S - Salvar e Voltar");
            this.printLine("X - Cancelar e Voltar");
            opcaoEscolhida = this.askString();
            char opcaoEscolhidaChar = opcaoEscolhida.length() == 1 ? opcaoEscolhida.charAt(0) : (int) 0;
            switch (opcaoEscolhidaChar) {
                case '1' -> {
                    this.printLine("Qual e o novo valor da Lado 1 ?");
                    lados[0] = this.askIntegerBiggerThanZero();
                }
                case '2' -> {
                    this.printLine("Qual e o novo valor do Lado 2 ?");
                    lados[1] = this.askIntegerBiggerThanZero();
                }
                case '3' -> {
                    this.printLine("Qual e o novo valor do Lado 3");
                    lados[2] = this.askIntegerBiggerThanZero();
                }
                case 'S','s' -> {
                    triangulo.setLados(lados);
                    this.printLine("Objeto Salvo");
                }
                case 'X','x' -> this.printLine("Cancelado com Sucesso");
                default -> this.printLine("Digite um valor valido");
            }
        } while (!opcaoEscolhida.equalsIgnoreCase("x") && !opcaoEscolhida.equalsIgnoreCase("s"));
        this.printLine("-----------------------------------");
    }
}
