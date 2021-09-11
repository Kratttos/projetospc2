package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Reta;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Retangulo;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.reta.AlterarRetaForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.reta.DetalhesRetaForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.reta.InserirRetaForm;
import java.util.ArrayList;
import java.util.List;

public class RetaGUIView extends AbstractSubMenuGUIView{

    public RetaGUIView() {
        this.formularios = new Form(
                new InserirRetaForm(),
                new AlterarRetaForm(),
                new DetalhesRetaForm()
        );
    }
    
    public void listAll(List<Renderizavel> lista) {
        List linhas = new ArrayList();
        lista.forEach(item -> {
            Reta reta = (Reta) item;
            linhas.add(new Object[]{
                reta.getId(),
                reta.getTamanho()
            });
        });
        new ListarDialog(null, true).listar(new String[]{"ID","Tamanho"}, linhas);

    }
}
