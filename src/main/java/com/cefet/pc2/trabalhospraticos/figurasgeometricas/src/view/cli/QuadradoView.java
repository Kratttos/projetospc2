package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Quadrado;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

import java.util.Map;

public class QuadradoView extends SubMenuView {

    @Override
    public Renderizavel create() {
        this.printLine("----Menu de Criação de Quadrado----");
        this.printLine("Qual e o tamanho dos lados do Quadrado ?");
        int ladoQuadrado = this.askIntegerBiggerThanZero();
        this.printLine("----------------------------------");
        return new Quadrado(ladoQuadrado);
    }

    @Override
    public void update(Renderizavel item) {
        Quadrado circ = (Quadrado) item;
        objeto.put("Tamanho dos Lados",(circ.getTamanhoLado()+""));
        Map<String,String> editado = this.showUpdateMenu(objeto,"Quadrado");
        circ.setTamanhoLado(Integer.parseInt(editado.get("Tamanho dos Lados")));
    }
}

