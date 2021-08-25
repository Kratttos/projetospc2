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
    public void update(Renderizavel item) {

    }
}
