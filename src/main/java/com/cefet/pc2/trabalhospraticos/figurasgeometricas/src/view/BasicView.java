package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Opcoes;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.OpcoesSubMenu;

import java.util.List;

public abstract class BasicView extends BasicIO {
    
    public Enum showMenu() {
        String nomeClasse = this.getClass().getSimpleName();
        String nomeMenu = "MENU *" + nomeClasse.substring(0, nomeClasse.indexOf("View")) + "*:";
        Opcoes[] opcoes = OpcoesSubMenu.values();

        this.printLine(nomeMenu);
        this.printLine("");
        this.printLine("Digite uma opção");
        for (int i = 0; i < opcoes.length; i++) {
            this.printLine(opcoes[i].getTecla() + " - " + opcoes[i].getText());
        }
        int opcao;
        String opcaoString = "";
        do {
            while (opcaoString.length() <= 0 || opcaoString.length() > 1) {
                opcaoString = this.askString();
            }
            if (opcaoString.equalsIgnoreCase(OpcoesSubMenu.SAIR.getTecla())) return OpcoesSubMenu.SAIR;
            try {
                opcao = Integer.parseInt(opcaoString) - 1;
                return (OpcoesSubMenu) opcoes[opcao];
            } catch (NumberFormatException ex) {
                this.printLine("O valor digitado deve ser um numero de 1 a " + (opcaoString.length() + 1) + " ou X");
            }
        } while (true);
    }

    public void listAll(List<Renderizavel> lista) {
        for (Renderizavel item : lista) {
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
