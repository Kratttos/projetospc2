package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.Quadrado;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.enums.OpcoesSubMenu;

public class QuadradoView extends BasicIO {

    public Quadrado askQuadrado() {

        this.printLine("Qual e o tamanho dos lados do Quadrado ?");
        int ladoQuadrado = this.askInt();

        return new Quadrado(ladoQuadrado);

    }

    public void showMenu() {
        this.print("Menu Quadrado");
        for (int i = 0; i < OpcoesSubMenu.values().length; i++) {
            System.out.println(i + 1 + " - " + OpcoesSubMenu.values()[i]);
        }
    }
}

