package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Triangulo;

import java.util.Map;

public class TrianguloView extends SubMenuView {
    @Override
    public Renderizavel create() {
        this.printLine("----Menu de Criação de Triangulos----");
        this.printLine("Digite o tamanho do primeiro lado do Triangulo");
        int lado1 = this.askIntegerBiggerThanZero();
        this.printLine("Digite o tamanho do segundo lado do Triangulo");
        int lado2 = this.askIntegerBiggerThanZero();
        this.printLine("Digite o tamanho do terceiro lado do Triangulo");
        int lado3 = this.askIntegerBiggerThanZero();
        this.printLine("---------------------------------");

        return new Triangulo(lado1, lado2, lado3);
    }

    @Override
    public void update(Renderizavel item) {
        Triangulo circ = (Triangulo) item;
        var lados = circ.getLados();
        objeto.put("Lado 1", (lados[0] + ""));
        objeto.put("Lado 2", lados[1] + "");
        objeto.put("lado 3", lados[2] + "");
        Map<String, String> editado = this.showUpdateMenu(objeto, "Triangulo");
        lados[0] = Integer.parseInt(editado.get("Lado 1"));
        lados[1] = Integer.parseInt(editado.get("Lado 2"));
        lados[2] = Integer.parseInt(editado.get("Lado 3"));
        circ.setLados(lados);
    }
}
