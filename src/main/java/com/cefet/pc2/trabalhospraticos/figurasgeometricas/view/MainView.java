package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.enums.OpcoesMenu;

import java.util.List;

public class MainView extends BasicView {

    private static final String OPCAO_INVALIDA = "Por Favor digite uma opção valida";

    public void showMenu() {

        this.printLine("-------------Menu Principal-------------");
        this.printLine("1 - Criar Quadrado");
        this.printLine("2 - Criar Retangulo");
        this.printLine("3 - Criar Circulo");
        this.printLine(".....");
        this.printLine("A - Apagar Item");
        this.printLine("D - Desenhar");
        this.printLine("X - Listar");
        this.printLine("S - Sair");
        this.printLine("----------------------------------------");
    }

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
                    return OpcoesMenu.QUADRADO;
                case '2':
                    return OpcoesMenu.RETANGULO;
                case '3':
                    return OpcoesMenu.CIRCULO;
                case 'A', 'a':
                    return OpcoesMenu.APAGAR_ITEM;
                case 'D', 'd':
                    return OpcoesMenu.DESENHAR;
                case 'X', 'x':
                    return OpcoesMenu.LISTAR;
                case 'S', 's':
                    return OpcoesMenu.SAIR;
                default:
                    this.printLine(OPCAO_INVALIDA);
                    saida = false;
                    break;
            }
        } while (!saida);
        return null;    //so pra deixar a linguagem feliz
    }

    public void listarTodos(List figuras) {
        this.printLine("------ Lista de Figuras ------");
        for (int i = 0; i < figuras.size(); i++) {
            this.printLine((i + 1) + " - " + figuras.get(i));
        }
        this.printLine("------------------------------");
    }

    public void vetorCheio() {
        this.printLine("Não foi possivel inserir pois o vetor esta lotado");
    }

    /**
     * Mostra o menu de deletar e retornar um inteiro referente a posição do item escolhido
     *
     * @param limite Ultima posição da List
     * @return retorna a posição do item na List do objeto
     */
    public int showDeleteMenu(int limite) {
        this.printLine("------ Deletar Figuras ------");
        int opcao;
        this.printLine("Digite o numero do item que você deseja deletar");
        do {
            opcao = this.askNumberBiggerThanZero();
        } while (opcao < 1 || opcao > limite);
        this.printLine("------------------------------");
        return (opcao - 1);
    }

    public void listaVazia(){
        this.printLine("Não tem nenhuma Figura para ser deletada");
    }
}
