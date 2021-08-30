package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.quadrado;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli.QuadradoView;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.submenu.AbstractSubMenuGUIView;

public class QuadradoGUIView extends AbstractSubMenuGUIView {

    @Override
    public Renderizavel create() {
        return new QuadradoForm().create();
    }
    
    @Override
    public void update(Renderizavel item) {
        new QuadradoForm().update(item);
    }
    
    @Override
    public void showDetails(Renderizavel rend) {
        new QuadradoView().showDetails(rend);
    }
}
