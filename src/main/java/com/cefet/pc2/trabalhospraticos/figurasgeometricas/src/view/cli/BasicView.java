package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.IO;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.View;

public abstract class BasicView implements View {

    private IO io;


    public void setIo(IO io) {
        this.io = io;
    }

    public BasicView() {
        this.io = new BasicIO();
    }

    @Override
    public void print(String msg) {
        this.io.print(msg);
    }

    @Override
    public void printLine(String msg) {
        this.io.printLine(msg);
    }

    @Override
    public int askInt() {
        return io.askInt();
    }

    @Override
    public String askString() {
        return io.askString();
    }

    @Override
    public double askDouble() {
        return io.askDouble();
    }

    public int askIntegerBiggerThanZero() {
        String number;
        int numberI = -50;
        do {
            number = this.askString();
            try {
                numberI = Integer.parseInt(number);
                if (numberI <= 0) {
                    this.printLine("O valor digitado deve ser maior que 0");
                }
            } catch (NumberFormatException ex) {
                this.printLine("O valor digitado deve ser um numero");
            }
        } while (numberI <= 0);

        return numberI;
    }

    /**
     * @return retorna um booleano referente a opção escolhida sendo true caso a opção escolhida for S/s é false caso
     * a opção escolhida seja N/n
     */
    public boolean askSorN() {
        this.printLine("Digite S para Sim ou N para não");
        String opcao = "";
        do {
            opcao = this.askString();
            if (!opcao.equalsIgnoreCase("S") && !opcao.equalsIgnoreCase("N")) {
                this.printLine("O Valor entrado tem que ser S ou N");
                opcao= "@@@@";
            }
        } while (opcao.length() < 1 || opcao.length() > 1);

        return opcao.equalsIgnoreCase("S");
    }
}
