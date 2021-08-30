package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Opcoes;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.OpcoesSubMenu;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.ISubMenuView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class SubMenuView extends BasicView implements ISubMenuView {

    protected LinkedHashMap<String, String> objeto = new LinkedHashMap<>();

    public SubMenuView() {
    }

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

    public Map<String, String> showUpdateMenu(LinkedHashMap<String, String> valoresAtuais, String nomeMenu) {
        Map<String, String> editado = new LinkedHashMap<>();
        List<String> listaPropiedades = new ArrayList<>();
        valoresAtuais.forEach((key, value) -> {
            editado.put(key, value);
            listaPropiedades.add(key);
        });
        String opcaoString;
        this.printLine("----Menu de Criação de " + nomeMenu + "----");
        do {
            StringBuilder atualString = new StringBuilder(nomeMenu + " atual \t: ");
            StringBuilder alteradoString = new StringBuilder(nomeMenu + " alterado \t: ");
            for (String key : valoresAtuais.keySet()) {
                atualString.append(key + " = " + valoresAtuais.get(key) + " ");
                alteradoString.append(key + " = " + editado.get(key) + " ");
            }
            this.printLine(atualString.toString());
            this.printLine(alteradoString.toString());
            this.printLine("");

            this.printLine("Selecione oque você deseja alterar ?");
            int i = 1;
            for (String key : valoresAtuais.keySet()) {
                System.out.println((i++) + " - " + key);
            }
            this.printLine("");
            this.printLine("S - Salvar e Voltar");
            this.printLine("X - Cancelar e Voltar");
            while (true) {
                opcaoString = this.askString();
                if (opcaoString.equalsIgnoreCase("x") || opcaoString.equalsIgnoreCase("s")) {
                    String mensagem = opcaoString.equalsIgnoreCase("S") ? "Objeto salvo com Sucesso" : "Cancelado com Sucesso";
                    System.out.println(mensagem);
                    break;
                } else {
                    try {
                        int opcao = (Integer.parseInt(opcaoString) - 1);
                        if (opcao < listaPropiedades.size()) {
                            System.out.println("Qual e o novo valor do " + listaPropiedades.get(opcao) + " ?");
                            editado.put((listaPropiedades.get(opcao) + ""), askIntegerBiggerThanZero() + "");
                            break;
                        } else {
                            System.out.println("Por favor Digite uma opção valida");
                        }
                    } catch (NumberFormatException ex) {
                        System.out.println("O valor digitado deve ser um numero");
                    }
                }
            }
        } while (!opcaoString.equalsIgnoreCase("x") && !opcaoString.equalsIgnoreCase("s"));
        this.printLine("-----------------------------------");
        return opcaoString.equalsIgnoreCase("x") ? valoresAtuais : editado;
    }

    @Override
    public int showDeleteMenu() {
        this.printLine("------ Deletar Figuras ------");
        this.printLine("Digite o ID do item que você deseja deletar");
        int id = this.askIntegerBiggerThanZero();
        this.printLine("------------------------------");

        return id;
    }

    @Override
    public abstract void update(Renderizavel item);

    @Override
    public void listAll(List<Renderizavel> lista) {
        for (Renderizavel item : lista) {
            this.printLine(item.toString());
        }
    }

    @Override
    public void vetorCheio() {
        this.printLine("Não foi possivel inserir pois o vetor esta lotado");
    }

    @Override
    public int askID() {
        this.printLine("Por Favor Digite o ID do Objeto");
        return this.askIntegerBiggerThanZero();
    }

    @Override
    public void invalidID() {
        this.printLine("Não existe nenhum Objeto do tipo " + this.getClass().getSimpleName().replace("View", "") + " com esse ID");
    }

    @Override
    public void showDetails(Renderizavel rend) {
        this.printLine(rend.toString());
    }

    @Override
    public void inseridoSucesso() {
        this.printLine("Inserido com Sucesso");
    }
}
