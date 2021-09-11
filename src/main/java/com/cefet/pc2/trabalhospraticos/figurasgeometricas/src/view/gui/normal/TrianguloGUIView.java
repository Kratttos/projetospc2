package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Triangulo;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.triangulo.AlterarTrianguloForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.triangulo.DetalhesTrianguloForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.triangulo.InserirTrianguloForm;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TrianguloGUIView extends AbstractSubMenuGUIView {

    public TrianguloGUIView() {
        this.formularios = new Form(
                new InserirTrianguloForm(),
                new AlterarTrianguloForm(),
                new DetalhesTrianguloForm()
        );
    }

    @Override
    public void listAll(List<Renderizavel> lista) {
        List linhas = new ArrayList();
        lista.forEach(item -> {
            Triangulo tr = (Triangulo) item;
            linhas.add(new Object[]{
                tr.getId(),
                tr.getLado1(),
                tr.getLado2(),
                tr.getLado3()
            });
        });
        new ListarDialog(null, true).listar(new String[]{"ID", "Lado 1", "Lado 2", "Lado 3"}, linhas);

    }
}
