package com.cefet.pc2.trabalhospraticos.figurasgeometricas.control;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.view.QuadradoView;

public class QuadradoController {


    public void inicio() {
        System.out.println("Placeholder QuadradoController");
        QuadradoView telaQuadrado = new QuadradoView();
        telaQuadrado.showMenu();
        int op = telaQuadrado.askInt();
    }
}
