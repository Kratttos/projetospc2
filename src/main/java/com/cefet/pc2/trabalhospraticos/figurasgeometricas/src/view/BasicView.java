package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.OpcoesSubMenu;

import java.util.List;

public abstract class BasicView extends BasicIO {

    protected static final String OPCAO_INVALIDA = "Por Favor digite uma opção valida";

    /**
     * Retorna um inteiro
     *
     * @return retorna um inteiro maior do que 0
     */
    public int askIntegerBiggerThanZero() {
        String number;
        int numberI = -50;
        do {
            number = this.askString();
            try {
                numberI = Integer.parseInt(number);
                if (numberI <= 0) {
                    this.printLine("O valor digitado deve ser maior que 0");
                }
            } catch (NumberFormatException ex) {
                this.printLine("O valor digitado deve ser um numero");
            }
        } while (numberI <= 0);

        return numberI;
    }

    public Enum showMenu() {
        String nomeClasse = this.getClass().getSimpleName();
        String nomeMenu = "MENU *" + nomeClasse.substring(0, nomeClasse.indexOf("View")) + "*:";
        String[] opcoes = new String[]{
                "Novo (Criar/Adicionar novo item (Quad, Ret, Text, etcc)",
                "Editar (Selecionar Id e Editar)",
                "Listar (Listar Itens do Tipo)",
                "Mostrar (Listar detalhes de 1 Itens)",
                "Excluir (Excluir Id)"
        };
        this.printLine(nomeMenu);
        this.printLine("");
        this.printLine("Digite uma opção");
        for (int i = 0; i < opcoes.length; i++) {
            System.out.println((i + 1) + " - " + opcoes[i]);
        }
        this.printLine("x - Voltar");
        return null;
    }

    public Enum askOption() {
        char opcao = (int) 0;
        boolean saida;
        do {
            saida = true;
            String opcaoString = "";
            while (opcaoString.length() == 0 || opcaoString.length()>1) {
                opcaoString = this.askString();
            }
            opcao = opcaoString.charAt(0);
            switch (opcao) {
                case '1':
                    return OpcoesSubMenu.CRIAR;
                case '2':
                    return OpcoesSubMenu.ALTERAR;
                case '3':
                    return OpcoesSubMenu.LISTAR;
                case '4':
                    return OpcoesSubMenu.MOSTRAR;
                case '5':
                    return OpcoesSubMenu.EXCLUIR;
                case 'X', 'x':
                    return OpcoesSubMenu.SAIR;
                default:
                    this.printLine(OPCAO_INVALIDA);
                    saida = false;
                    break;
            }
        } while (!saida);
        return null;    //so pra deixar a linguagem feliz
    }

    public void listAll(List<Renderizavel> lista){
        for (Renderizavel item: lista) {
            this.printLine(item.toString());
        }
    }

    public void vetorCheio() {
        this.printLine("Não foi possivel inserir pois o vetor esta lotado");
    }

    public void listaVazia() {
        this.printLine("Não tem nenhuma Figura para ser deletada");
    }
}
