package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Texto;

public class TextoView extends SubMenuView{

    @Override
    public Renderizavel askObject() {
        System.out.println("Digite um texto qualquer");
        return new Texto(this.askString());
    }

    @Override
    public Renderizavel showUpdateMenu() {
        System.out.println("PLACEHOLDER : Aqui ainda vai ter um menu de update");

        return null;
    }
}
