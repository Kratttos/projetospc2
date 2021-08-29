package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Texto;

public class TextoView extends SubMenuView {

    @Override
    public Renderizavel create() {
        this.printLine("----Menu de Criação de Texto----");
        System.out.println("Digite um texto qualquer");
        this.printLine("---------------------------------");
        return new Texto(this.askString());
    }

    @Override
    public void update(Renderizavel item) {
        Texto texto = (Texto) item;
        this.printLine("----Menu de Alteração de Texto----");
        this.printLine("Qual e o novo texto ?");
        String text = this.askString();
        texto.setText(text);
        this.printLine("---------------------------------");
    }
}
