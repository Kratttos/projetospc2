package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Retangulo;

public class RetanguloView extends SubMenuView {

    private String[] opcoes = new String[]{"base", "altura"};

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
        Retangulo retanguloNovo = new Retangulo(retangulo.getBase(), retangulo.getAltura());
        this.printLine("----Menu de alteração de Retangulo----");
        String opcaoEscolhida = "";

        do {
            this.printLine("Retangulo atual: Base = " + retangulo.getBase() + " é Altura = " + retangulo.getAltura());
            this.printLine("Retangulo alterado: Base = " + retanguloNovo.getBase() + " é Altura = " + retanguloNovo.getAltura());
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
                    this.printLine("Qual e o novo valor da base ?");
                    retanguloNovo.setBase(this.askIntegerBiggerThanZero());
                }
                case '2' -> {
                    this.printLine("Qual e o novo valor da altura ?");
                    retanguloNovo.setAltura(this.askIntegerBiggerThanZero());
                }
                case 'S','s' -> {
                    retangulo.setBase(retanguloNovo.getBase());
                    retangulo.setAltura(retanguloNovo.getAltura());
                    this.printLine("Objeto Salvo");
                }
                case 'X','x' -> {
                    this.printLine("Cancelado com Sucesso");
                }
                default -> this.printLine("Digite um valor valido");
            }
        } while (!opcaoEscolhida.equalsIgnoreCase("x") && !opcaoEscolhida.equalsIgnoreCase("s"));
        //em processo
        this.printLine("-----------------------------------");

    }
}
