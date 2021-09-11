package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Trapezio;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Triangulo;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.trapezio.AlterarTrapezioForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.trapezio.DetalhesTrapezioForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.trapezio.InserirTrapezioForm;
import java.util.ArrayList;
import java.util.List;

public class TrapezioGUIVIew extends AbstractSubMenuGUIView{
    public TrapezioGUIVIew() {
        this.formularios = new Form(
                new InserirTrapezioForm(),
                new AlterarTrapezioForm(),
                new DetalhesTrapezioForm()
        );
    }
    
     public void listAll(List<Renderizavel> lista) {
        List linhas = new ArrayList();
        lista.forEach(item -> {
            Trapezio tr = (Trapezio) item;
            linhas.add(new Object[]{
                tr.getId(),
                tr.getBase(),
                tr.getBaseMenor(),
                tr.getAltura(),
                tr.getLadoEsquerdo(),
                tr.getLadoDireito()
            });
        });
        new ListarDialog(null, true).listar(new String[]{"ID", "Base Maior", "Base Menor", "Altura","Lado Esquerdo","Lado Direito"}, linhas);

    }
}
