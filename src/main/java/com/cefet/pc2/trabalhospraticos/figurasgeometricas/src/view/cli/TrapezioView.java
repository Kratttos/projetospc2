package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Trapezio;

public class TrapezioView extends SubMenuView {
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

        this.printLine("---------------------------------");

        return new Trapezio(maiorBase, altura, menorBase, ladoDireito, ladoEsquerdo);
    }

    @Override
    public void showUpdateMenu(Renderizavel item) {
        Trapezio trapezio = (Trapezio) item;
        Trapezio novoTrapezio = new Trapezio(trapezio.getBase(), trapezio.getAltura(), trapezio.getBaseMenor(), trapezio.getLadoDireito(), trapezio.getLadoEsquerdo());
        String opcoes[] = new String[]{"Lado Direito", "Lado Esquerdo", "Base Maior", "Base Menor"};
        String opcaoEscolhida = "";

        this.printLine("----Menu de Criação de Triangulos----");
        do {
            this.printLine("Trapezio atual: Base Menor = " + trapezio.getBaseMenor() + " Base Maior = " + trapezio.getBase() + " Lado Direito = " + trapezio.getLadoDireito() + " Lado Esquerdo = " + trapezio.getLadoEsquerdo());
            this.printLine("Trapezio atual: Base Menor = " + novoTrapezio.getBaseMenor() + " Base Maior = " + novoTrapezio.getBase() + " Lado Direito = " + novoTrapezio.getLadoDireito() + " Lado Esquerdo = " + novoTrapezio.getLadoEsquerdo());
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
                    this.printLine("Qual e o novo valor da Lado Direito ?");
                    novoTrapezio.setLadoDireito(this.askIntegerBiggerThanZero());
                }
                case '2' -> {
                    this.printLine("Qual e o novo valor do Lado Esquerdo ?");
                    novoTrapezio.setLadoEsquerdo(this.askIntegerBiggerThanZero());
                }
                case '3' -> {
                    this.printLine("Qual e o novo valor da Base Maior");
                    novoTrapezio.setBase(this.askIntegerBiggerThanZero());
                }
                case '4' -> {
                    this.printLine("Qual e o novo valor da Base Menor");
                    novoTrapezio.setBaseMenor(this.askIntegerBiggerThanZero());
                }
                case 'S', 's' -> {
                    trapezio.setBaseMenor(novoTrapezio.getBaseMenor());
                    trapezio.setLadoEsquerdo(novoTrapezio.getLadoEsquerdo());
                    trapezio.setLadoDireito(novoTrapezio.getLadoDireito());
                    trapezio.setBase(novoTrapezio.getBase());
                    this.printLine("Objeto Salvo");
                }
                case 'X', 'x' -> this.printLine("Cancelado com Sucesso");
                default -> this.printLine("Digite um valor valido");
            }
        } while (!opcaoEscolhida.equalsIgnoreCase("x") && !opcaoEscolhida.equalsIgnoreCase("s"));
        this.printLine("-----------------------------------");
    }
}
