package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Quadrado;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.quadrado.AlterarQuadradoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.quadrado.DetalhesQuadradoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.quadrado.InserirQuadradoForm;

import java.util.ArrayList;
import java.util.List;

public class QuadradoGUIView extends AbstractSubMenuGUIView {

    public QuadradoGUIView() {
        this.formularios = new Form(new InserirQuadradoForm(), new AlterarQuadradoForm(), new DetalhesQuadradoForm());
    }
    public void listAll(List<Renderizavel> lista) {
        List linhas = new ArrayList();
        lista.forEach(item -> {
            Quadrado reta = (Quadrado) item;
            linhas.add(new Object[]{
                reta.getId(),
                reta.getTamanhoLado()
            });
        });
        new ListarDialog(null, true).listar(new String[]{"ID","Tamanho dos lados"}, linhas);

    }
}
