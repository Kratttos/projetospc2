package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Losango;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

public class LosangoView extends SubMenuView{
    @Override
    public Renderizavel askObject() {
        this.printLine("Digite o tamanho dos lados do losango");
        int lados = this.askIntegerBiggerThanZero();
        return new Losango(lados);
    }

    @Override
    public void showUpdateMenu(Renderizavel item) {
        this.printLine("PLACEHOLDER: aqui vai ter um menu de alteração de losango");

    }
}
