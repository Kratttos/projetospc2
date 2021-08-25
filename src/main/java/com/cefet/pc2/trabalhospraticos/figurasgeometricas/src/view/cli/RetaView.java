package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Reta;

import java.util.Map;

public class RetaView extends SubMenuView {

    @Override
    public Renderizavel create() {

        this.printLine("----Menu de Criação de Reta----");
        this.printLine("Qual e o tamanho da reta ?");
        int tamanho = this.askIntegerBiggerThanZero();

        this.printLine("-----------------------------------");
        return new Reta(tamanho);
    }

    @Override
    public void update(Renderizavel item) {
        Reta circ = (Reta) item;
        objeto.put("Tamanho", (circ.getTamanho() + ""));
        Map<String, String> editado = this.showUpdateMenu(objeto, "Reta");
        circ.setTamanho(Integer.parseInt(editado.get("Tamanho")));
    }
}
