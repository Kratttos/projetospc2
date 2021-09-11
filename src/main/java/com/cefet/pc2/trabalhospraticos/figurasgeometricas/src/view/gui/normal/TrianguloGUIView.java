package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.triangulo.AlterarTrianguloForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.triangulo.DetalhesTrianguloForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.triangulo.InserirTrianguloForm;

public class TrianguloGUIView extends AbstractSubMenuGUIView {
    public TrianguloGUIView() {
        this.formularios = new Form(
                new InserirTrianguloForm(),
                new AlterarTrianguloForm(),
                new DetalhesTrianguloForm()
        );
    }
}
