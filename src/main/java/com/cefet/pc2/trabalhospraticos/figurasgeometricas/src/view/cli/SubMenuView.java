package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Opcoes;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.OpcoesSubMenu;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.BasicView;

import java.util.List;

public abstract class SubMenuView extends BasicView {

    public abstract Renderizavel askObject();

    @Override
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

    public abstract void showUpdateMenu(Renderizavel item);

    public int showDeleteMenu() {
        this.printLine("------ Deletar Figuras ------");
        this.printLine("Digite o ID do item que você deseja deletar");
        int id = this.askIntegerBiggerThanZero();
        this.printLine("------------------------------");

        return id;
    }

    public void listAll(List<Renderizavel> lista) {
        for (Renderizavel item : lista) {
            this.printLine(item.toString());
        }
    }

    public void vetorCheio() {
        this.printLine("Não foi possivel inserir pois o vetor esta lotado");
    }

    public int askID() {
        this.printLine("Por Favor Digite o ID do Objeto");
        return this.askIntegerBiggerThanZero();
    }

    public void invalidID() {
        this.printLine("Não existe nenhum Objeto do tipo " + this.getClass().getSimpleName().replace("View", "") + " com esse ID");
    }

    public void showDetails(Renderizavel rend) {
        this.printLine(rend.toString());
    }

    public void inseridoSucesso() {
        this.printLine("Inserido com Sucesso");
    }
}
