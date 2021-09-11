package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal.quadrado;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli.QuadradoView;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal.submenu.AbstractSubMenuGUIView;

public class QuadradoGUIView extends AbstractSubMenuGUIView {

    @Override
    public Renderizavel create() {
        //return new QuadradoForm().inserir();
        return null;
    }
    
    @Override
    public void update(Renderizavel item) {
        //new QuadradoForm().alterar((Quadrado) item);
    }
    
    @Override
    public void showDetails(Renderizavel rend) {
        new QuadradoView().showDetails(rend);
    }
}
