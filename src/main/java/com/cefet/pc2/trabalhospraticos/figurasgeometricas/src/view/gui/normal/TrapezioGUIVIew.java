package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.Form;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.trapezio.AlterarTrapezioForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.trapezio.DetalhesTrapezioForm;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado.trapezio.InserirTrapezioForm;

public class TrapezioGUIVIew extends AbstractSubMenuGUIView{
    public TrapezioGUIVIew() {
        this.formularios = new Form(
                new InserirTrapezioForm(),
                new AlterarTrapezioForm(),
                new DetalhesTrapezioForm()
        );
    }
}
