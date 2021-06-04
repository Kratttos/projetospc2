package com.cefet.pc2.exercicios.maratona;

import java.util.ArrayList;
import java.util.Scanner;

public class Casas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (teclado.hasNextInt()) {

            int qtdNumeros = teclado.nextInt();
            int[] casas = new int[qtdNumeros];
            int valorCorreto = 0;
            ArrayList<int[]> somas = new ArrayList();
            int[] combinacaoCerta = new int[]{0, 0, 0};

            for (int i = 0; i <= casas.length; i++) {

                if (i == casas.length) {
                    valorCorreto = teclado.nextInt();
                } else {
                    casas[i] = teclado.nextInt();
                    for (int j = 0; j <= i; j++) {
                        if (i!=j){
                            int soma = casas[i] + casas[j];
                            System.out.println(casas[i]+" + "+casas[j] + " = " + soma);
                            somas.add(new int[]{casas[i], casas[j], soma});
                        }
                    }
                }
            }
            System.out.println(combinacaoCerta[1] + " " + combinacaoCerta[0]);
        }
    }
}
