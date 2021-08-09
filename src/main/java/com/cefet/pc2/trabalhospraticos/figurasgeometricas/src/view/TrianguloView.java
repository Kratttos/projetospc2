package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Triangulo;

public class TrianguloView extends SubMenuView{
    @Override
    public Renderizavel askObject() {
        this.printLine("PLACEHOLDER : aqui vai ter um menu de criação do triangulo");

        return new Triangulo();
    }

    @Override
    public Renderizavel showUpdateMenu() {
        this.printLine("PLACEHOLDER : aqui vai ter um menu de mudança do triangulo");
        return null;
    }
}
