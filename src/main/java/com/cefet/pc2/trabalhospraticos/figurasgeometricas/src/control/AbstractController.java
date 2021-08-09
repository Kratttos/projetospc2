package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.BasicView;

public abstract class AbstractController {

    protected BasicView tela;

    public AbstractController(BasicView tela) {
        this.tela =  tela;
    }

    public abstract void listAll();
}
