package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Retangulo;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Texto;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.retangulo.AlterarRetanguloForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.retangulo.DetalhesRetanguloForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.retangulo.InserirRetanguloForm;
import java.util.ArrayList;
import java.util.List;

public class RetanguloGUIView extends AbstractSubMenuGUIView{
    public RetanguloGUIView() {
        this.formularios = new Form(
                new InserirRetanguloForm(),
                new AlterarRetanguloForm(),
                new DetalhesRetanguloForm()
        );
    }
    
    public void listAll(List<Renderizavel> lista) {
        List linhas = new ArrayList();
        lista.forEach(item -> {
            Retangulo retangulo = (Retangulo) item;
            linhas.add(new Object[]{
                retangulo.getId(),
                retangulo.getBase(),
                retangulo.getAltura()
            });
        });
        new ListarDialog(null, true).listar(new String[]{"ID","Base","Altura"}, linhas);

    }
}
