package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Texto;

public class TextoView extends SubMenuView{

    @Override
    public Renderizavel askObject() {
        this.printLine("----Menu de Criação de Texto----");
        System.out.println("Digite um texto qualquer");
        this.printLine("---------------------------------");
        return new Texto(this.askString());
    }

    @Override
    public void showUpdateMenu(Renderizavel item) {
        Texto text = (Texto) item;

        this.printLine("----Menu de Alteração de Texto----");
        this.printLine("Por favor digite um novo texto");
        String novoTexto = this.askString();
        this.printLine("Você tem certeza que deseja subistuir o valor atual ?");
        this.printLine("Valor antigo : " + text.getText());
        this.printLine("Valor novo   : " +novoTexto);
        this.printLine("");

        this.printLine("---------------------------------");
        text.setText(this.askSorN() ? novoTexto : text.getText());
    }
}
