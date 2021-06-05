package com.cefet.pc2.exercicios.maratona.lista2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;

public class Casas {

    public static void main(String[] args) throws InterruptedException {

        Scanner teclado = new Scanner(System.in);

        //while (teclado.hasNextInt()) {

        int qtdNumeros = teclado.nextInt();
        int[] casas = new int[qtdNumeros];
        for (int i = 0; i < casas.length-1; i++) {
            casas[i] = teclado.nextInt();
        }
        int numeroCorreto = teclado.nextInt();
        int inicio  =0;
        int fim = casas.length-1;
        for (int i = inicio; i < casas.length; i++) {
            for (int k = fim; k < inicio ; k--) {
                if (casas[i] + casas[k] == numeroCorreto){
                    System.out.println("a");
                    System.out.println(casas[inicio] + " + "+ casas[fim] + " = " + (casas[inicio] + casas[fim]));
                }
            }
        }


    }

}
