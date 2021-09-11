package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.texto.AlterarTextoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.texto.DetalhesTextoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.texto.InserirTextoForm;

public class TextoGUIView extends AbstractSubMenuGUIView {
    public TextoGUIView() {
        this.formularios = new Form(
                new InserirTextoForm(),
                new AlterarTextoForm(),
                new DetalhesTextoForm()
        );
    }
}
