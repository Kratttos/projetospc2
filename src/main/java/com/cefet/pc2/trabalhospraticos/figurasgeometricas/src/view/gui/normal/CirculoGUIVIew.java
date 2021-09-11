package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.circulo.AlterarCirculoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.circulo.DetalhesCirculoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.circulo.InserirCirculoForm;

public class CirculoGUIVIew extends AbstractSubMenuGUIView{
    public CirculoGUIVIew() {
        this.formularios = new Form(
                new InserirCirculoForm(),
                new AlterarCirculoForm(),
                new DetalhesCirculoForm()
        );
    }
}
