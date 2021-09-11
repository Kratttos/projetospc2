package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Circulo;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Quadrado;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.circulo.AlterarCirculoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.circulo.DetalhesCirculoForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.circulo.InserirCirculoForm;
import java.util.ArrayList;
import java.util.List;

public class CirculoGUIVIew extends AbstractSubMenuGUIView{
    public CirculoGUIVIew() {
        this.formularios = new Form(
                new InserirCirculoForm(),
                new AlterarCirculoForm(),
                new DetalhesCirculoForm()
        );
    }
    public void listAll(List<Renderizavel> lista) {
        List linhas = new ArrayList();
        lista.forEach(item -> {
            Circulo reta = (Circulo) item;
            linhas.add(new Object[]{
                reta.getId(),
                reta.getRaio()
            });
        });
        new ListarDialog(null, true).listar(new String[]{"ID","Raio"}, linhas);

    }
}
