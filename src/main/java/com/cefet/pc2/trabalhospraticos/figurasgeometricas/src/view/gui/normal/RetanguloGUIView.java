package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.retangulo.AlterarRetanguloForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.retangulo.DetalhesRetanguloForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.retangulo.InserirRetanguloForm;

public class RetanguloGUIView extends AbstractSubMenuGUIView{
    public RetanguloGUIView() {
        this.formularios = new Form(
                new InserirRetanguloForm(),
                new AlterarRetanguloForm(),
                new DetalhesRetanguloForm()
        );
    }
}
