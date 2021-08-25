package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Quadrado;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Retangulo;

import java.util.Map;

public class RetanguloView extends SubMenuView {

    private String[] opcoes = new String[]{"base", "altura"};

    @Override
    public Renderizavel create() {
        this.printLine("----Menu de Criação de Retangulo----");
        this.printLine("Qual e o tamanho da base do Rentagulo ?");
        int base = this.askIntegerBiggerThanZero();
        this.printLine("Qual e o tamanho dos lados ?");
        int lados = this.askIntegerBiggerThanZero();
        this.printLine("-----------------------------------");
        return new Retangulo(base, lados);
    }

    @Override
    public void update(Renderizavel item) {
        Quadrado circ = (Quadrado) item;
        objeto.put("Tamanho dos Lados",(circ.getTamanhoLado()+""));
        Map<String,String> editado = this.showUpdateMenu(objeto,"Quadrado");
        circ.setTamanhoLado(Integer.parseInt(editado.get("Tamanho dos Lados")));
    }
}
