package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Circulo;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

import java.util.Map;

public class CirculoView extends SubMenuView {

    @Override
    public Renderizavel create() {
        this.printLine("----Menu de Criação de Circulo----");
        this.printLine("Qual e o raio do Circulo ?");
        int raio = this.askIntegerBiggerThanZero();
        this.printLine("---------------------------------");
        return new Circulo(raio);
    }

    @Override
    public void update(Renderizavel item) {
        Circulo circ = (Circulo) item;
        objeto.put("Raio",(circ.getRaio()+""));
        Map<String,String> editado = this.showUpdateMenu(objeto,"Circulo");
        circ.setRaio(Integer.parseInt(editado.get("Raio")));
    }
}
