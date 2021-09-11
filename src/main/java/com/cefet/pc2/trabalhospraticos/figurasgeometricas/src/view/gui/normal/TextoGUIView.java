package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Texto;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Trapezio;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.texto.AlterarTextoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.texto.DetalhesTextoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.texto.InserirTextoForm;
import java.util.ArrayList;
import java.util.List;

public class TextoGUIView extends AbstractSubMenuGUIView {
    public TextoGUIView() {
        this.formularios = new Form(
                new InserirTextoForm(),
                new AlterarTextoForm(),
                new DetalhesTextoForm()
        );
    }
     public void listAll(List<Renderizavel> lista) {
        List linhas = new ArrayList();
        lista.forEach(item -> {
            Texto text = (Texto) item;
            linhas.add(new Object[]{
                text.getId(),
                text.getText()
            });
        });
        new ListarDialog(null, true).listar(new String[]{"ID","Texto"}, linhas);

    }
}
