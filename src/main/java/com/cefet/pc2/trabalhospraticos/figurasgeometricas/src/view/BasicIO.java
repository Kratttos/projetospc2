package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import java.util.Scanner;

public abstract class BasicIO {

    private Scanner input;

    public BasicIO(){
        this.input = new Scanner(System.in);;
    }

    public void print(String msg){
        System.out.print(msg);
    }

    public void printLine(String msg){
        this.print(msg + "\n");
    }

    public int askInt(){
        return this.input.nextInt();
    }

    public String askString(){
        return this.input.nextLine();
    }

    public double askDouble(){
        return this.input.nextDouble();
    }

    /**
     * Retorna um inteiro
     *
     * @return retorna um inteiro maior do que 0
     */
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
}
