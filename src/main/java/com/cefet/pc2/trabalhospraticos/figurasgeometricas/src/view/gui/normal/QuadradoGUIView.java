package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.quadrado.AlterarQuadradoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.quadrado.DetalhesQuadradoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.quadrado.InserirQuadradoForm;

public class QuadradoGUIView extends AbstractSubMenuGUIView {

    public QuadradoGUIView() {
        this.formularios = new Form(new InserirQuadradoForm(), new AlterarQuadradoForm(), new DetalhesQuadradoForm());
    }
}
