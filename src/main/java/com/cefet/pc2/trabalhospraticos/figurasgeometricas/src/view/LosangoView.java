package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Losango;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

public class LosangoView extends SubMenuView{
    @Override
    public Renderizavel askObject() {
        this.printLine("PLACEHOLDER: aqui vai ter um menu de criação de elipse");
        return new Losango();
    }

    @Override
    public Renderizavel showUpdateMenu() {
        this.printLine("PLACEHOLDER: aqui vai ter um menu de criação de triangulo");

        return null;
    }
}
