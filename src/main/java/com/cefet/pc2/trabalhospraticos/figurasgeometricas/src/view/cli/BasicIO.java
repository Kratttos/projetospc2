package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.IO;

import java.util.Scanner;

public class BasicIO implements IO {

    private Scanner input;

    public BasicIO() {
        this.input = new Scanner(System.in);
    }

    public void print(String msg) {
        System.out.print(msg);
    }

    public void printLine(String msg) {
        this.print(msg + "\n");
    }

    public int askInt() {
        return this.input.nextInt();
    }

    public String askString() {
        return this.input.nextLine();
    }

    public double askDouble() {
        return this.input.nextDouble();
    }
}
