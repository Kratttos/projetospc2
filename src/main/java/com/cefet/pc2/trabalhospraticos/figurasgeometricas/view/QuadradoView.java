package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.Quadrado;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.enums.OpcoesSubMenu;

public class QuadradoView extends BasicIO {

    public Quadrado askQuadrado() {

        this.printLine("PLACEHOLDER : Um Quadrado foi Criado Aqui");
        return new Quadrado();
    }

    public void showMenu() {
        this.print("Menu Quadrado");
        for (int i = 0; i < OpcoesSubMenu.values().length; i++) {
            System.out.println(i + 1 + " - " + OpcoesSubMenu.values()[i]);
        }
    }
}

