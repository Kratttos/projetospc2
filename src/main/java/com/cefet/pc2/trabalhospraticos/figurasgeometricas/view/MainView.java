package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.enums.OpcoesMenu;

public class MainView extends BasicIO {

    public void showMainMenu() {
        this.print("Menu Principal");
        for (int i = 0; i < OpcoesMenu.values().length; i++) {
            System.out.println(i + 1 + " - " + OpcoesMenu.values()[i]);
        }
    }

    public void showMenu() {

        this.print("Menu Principal");
        this.print("1 - Criar Quadrado");
        this.print("2 - Criar Retangulo");
        this.print("3 - Criar Triangulo");
        this.print("4 - Criar Circulo");
        this.print(".....");
        this.print("D - Apagar Item");
        this.print("X - Listar");
        this.print("S - Sair");
    }

    public OpcoesMenu askOption() {
        char opcao;
        int limite = 15;
        do {

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
                case 'D':
                    return OpcoesMenu.APAGAR_ITEM;
                case 'X','x':
                    return OpcoesMenu.LISTAR;
                case 'S','s':
                    return OpcoesMenu.SAIR;
                default:
                    return null;
            }
        } while (opcao < 1 || opcao > limite);  //essa condição aqui ta quebrada por hora mas eu vou concertar
    }

    public OpcoesMenu askMainMenuOption() {
        int opcao;
        do {
            opcao = this.askInt();

        } while (opcao < 1 || opcao > OpcoesMenu.values().length);
        return OpcoesMenu.values()[opcao - 1];
    }
}
