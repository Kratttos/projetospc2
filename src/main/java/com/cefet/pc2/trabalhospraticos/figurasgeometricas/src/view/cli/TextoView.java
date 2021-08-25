package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Texto;

import java.util.Map;

public class TextoView extends SubMenuView {

    @Override
    public Renderizavel create() {
        this.printLine("----Menu de Criação de Texto----");
        System.out.println("Digite um texto qualquer");
        this.printLine("---------------------------------");
        return new Texto(this.askString());
    }

    @Override
    public void update(Renderizavel item) {
        Texto circ = (Texto) item;
        objeto.put("Texto", (circ.getText() + ""));
        Map<String, String> editado = this.showUpdateMenu(objeto, "Texto");
        circ.setText(editado.get("Texto"));
    }
}
