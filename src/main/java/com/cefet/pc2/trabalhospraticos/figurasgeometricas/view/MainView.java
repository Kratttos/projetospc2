package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.FigurasGeometricas;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.enums.OpcoesMenu;

import java.util.List;

public class MainView extends BasicIO {

    public void showMainMenu() {
        this.print("Menu Principal");
        for (int i = 0; i < OpcoesMenu.values().length; i++) {
            System.out.println(i + 1 + " - " + OpcoesMenu.values()[i]);
        }
    }

    public void showMenu() {

        this.printLine("Menu Principal");
        this.printLine("1 - Criar Quadrado");
        this.printLine("2 - Criar Retangulo");
        this.printLine("3 - Criar Triangulo");
        this.printLine("4 - Criar Circulo");
        this.printLine(".....");
        this.printLine("A - Apagar Item");
        this.printLine("D - Desenhar");
        this.printLine("X - Listar");
        this.printLine("S - Sair");
    }

    public OpcoesMenu askOption() {
        char opcao;
        boolean saida;
        do {
            saida = true;
            opcao = this.askString().charAt(0);
            switch (opcao) {
                case '1':
                    return OpcoesMenu.QUADRADO;
                case '2':
                    return OpcoesMenu.RETANGULO;
                case '3':
                    return OpcoesMenu.TRIANGULO;
                case '4':
                    return OpcoesMenu.CIRCULO;
                case 'A', 'a':
                    return OpcoesMenu.APAGAR_ITEM;
                case 'D','d':
                    return OpcoesMenu.DESENHAR;
                case 'X', 'x':
                    return OpcoesMenu.LISTAR;
                case 'S', 's':
                    return OpcoesMenu.SAIR;
                default:
                    this.printLine("Por Favor digite uma opção valida");
                    saida = false;
                    break;
            }
        } while (!saida);
        return null;    //so pra deixar a linguagem feliz
    }

    public void listarTodos(List figuras) {
        for (FigurasGeometricas fig: (List<FigurasGeometricas>) figuras) {
            this.printLine(fig.toString());
        }
    }

    public void vetorCheio(){
        this.printLine("Não foi possivel inserir pois o vetor esta lotado");
    }

    public int showDeleteMenu(List figuras) {
        int opcao;
        for (int i = 0; i < figuras.size(); i++) {
            this.printLine((i + 1) + " - " + figuras.get(i));
        }
        this.printLine("Digite o numero do item que você deseja deletar");
        do{
            opcao = this.askInt();
        }while(opcao<1 || opcao>figuras.size());

        return (opcao - 1);
    }

    public OpcoesMenu askMainMenuOption() {
        int opcao;
        do {
            opcao = this.askInt();

        } while (opcao < 1 || opcao > OpcoesMenu.values().length);
        return OpcoesMenu.values()[opcao - 1];
    }
}
