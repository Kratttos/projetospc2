package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.FigurasGeometricas;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.OpcoesMenu;

import java.util.List;

public class MainView extends BasicView {

    @Override
    public void showMenu() {
        final String[] figuras = new String[]{"Reta","Texto","Circulo","Quadrado","Retangulo"};
        final String[][] avulsas = new String[][]{
                {"D","Desenhar"},
                {"L","Listar"},
                {"S","Salvar"},
                {"R","Recarregar"},
                {"X","Sair"}
        };
        this.printLine("-----------Menu Inicial--------------");
        this.printLine("Digite uma opção:");
        for (int i = 0; i < figuras.length ; i++) {
            this.printLine((i+1) + " - "+figuras[i]);
        }
        this.printLine("....");
        for (int i = 0; i < avulsas.length; i++) {
            this.printLine(avulsas[i][0] + " - " + avulsas[i][1]);
        }
    }

    @Override
    public OpcoesMenu askOption() {
        char opcao = (int) 0;
        boolean saida;
        do {
            saida = true;
            String opcaoString = "";
            while (opcaoString.length() == 0) {
                opcaoString = this.askString();
            }
            opcao = opcaoString.charAt(0);
            switch (opcao) {
                case '1':
                    return OpcoesMenu.TEXTO;
                case '2':
                    return OpcoesMenu.RETA;
                case '3':
                    return OpcoesMenu.CIRCULO;
                case '4':
                    return OpcoesMenu.QUADRADO;
                case '5':
                    return OpcoesMenu.RETANGULO;
                case 'D', 'd':
                    return OpcoesMenu.DESENHAR;
                case 'L', 'l':
                    return OpcoesMenu.LISTAR;
                case 'S','s':
                    return OpcoesMenu.SALVAR;
                case 'R','r':
                    return OpcoesMenu.RECARREGAR;
                case 'X', 'x':
                    return OpcoesMenu.SAIR;
                default:
                    this.printLine(OPCAO_INVALIDA);
                    saida = false;
                    break;
            }
        } while (!saida);
        return null;    //so pra deixar a linguagem feliz
    }

    @Override
    public FigurasGeometricas askObject() {
        return null;
    }

    @Override
    public void listarTodos(List figuras) {
        this.printLine("------ Lista de Figuras ------");
        for (int i = 0; i < figuras.size(); i++) {
            this.printLine((i + 1) + " - " + figuras.get(i));
        }
        this.printLine("------------------------------");
    }

}
