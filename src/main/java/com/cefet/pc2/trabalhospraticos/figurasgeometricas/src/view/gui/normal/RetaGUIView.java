package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.reta.AlterarRetaForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.reta.DetalhesRetaForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.reta.InserirRetaForm;

public class RetaGUIView extends AbstractSubMenuGUIView{

    public RetaGUIView() {
        this.formularios = new Form(
                new InserirRetaForm(),
                new AlterarRetaForm(),
                new DetalhesRetaForm()
        );
    }
}
