package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Trapezio;

import java.util.Map;

public class TrapezioView extends SubMenuView {
    @Override
    public Renderizavel create() {
        this.printLine("----Menu de Criação de Trapezio----");

        this.printLine("Por favor Digite o tamanho da menor base");
        int menorBase = this.askIntegerBiggerThanZero();
        this.printLine("Por Favor Digite o tamanho da maior base");
        int maiorBase = this.askIntegerBiggerThanZero();
        System.out.println("Por favor digite o tamanho do lado esquerdo");
        int ladoEsquerdo = this.askIntegerBiggerThanZero();
        System.out.println("Por favor digite o tamanho do lado direito");
        int ladoDireito = this.askIntegerBiggerThanZero();
        this.printLine("Por favor digite a altura");
        int altura = this.askIntegerBiggerThanZero();

        this.printLine("---------------------------------");

        return new Trapezio(maiorBase, altura, menorBase, ladoDireito, ladoEsquerdo);
    }

    @Override
    public void update(Renderizavel item) {
        Trapezio circ = (Trapezio) item;
        objeto.put("Base Menor", (circ.getBaseMenor() + ""));
        objeto.put("Base Maior", circ.getBase() + "");
        objeto.put("Lado Direito", circ.getLadoDireito() + "");
        objeto.put("Lado Esquerdo", circ.getLadoEsquerdo() + "");
        objeto.put("Altura", circ.getAltura() + "");
        Map<String, String> editado = this.showUpdateMenu(objeto, "Trapezio");
        circ.setBaseMenor(Integer.parseInt(editado.get("Base Menor")));
        circ.setBase(Integer.parseInt(editado.get("Base Maior")));
        circ.setLadoDireito(Integer.parseInt(editado.get("Lado Direito")));
        circ.setLadoEsquerdo(Integer.parseInt(editado.get("Lado Esquerdo")));
        circ.setAltura(Integer.parseInt(editado.get("Altura")));
    }
}
