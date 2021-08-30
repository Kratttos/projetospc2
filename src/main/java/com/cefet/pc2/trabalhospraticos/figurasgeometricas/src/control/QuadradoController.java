package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.ISubMenuView;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.quadrado.QuadradoGUIView;

public class QuadradoController extends AbstractSubMenuController {

    public QuadradoController(ISubMenuView tela) {
        super(new QuadradoGUIView());
    }

}
