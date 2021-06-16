package com.cefet.pc2.exercicios.maratona.lista2;

import java.util.Scanner;

public class Casas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (teclado.hasNextInt()) {

            int qtdNumeros = teclado.nextInt();
            int[] casas = new int[qtdNumeros];
            int valorCorreto = 0;
            int valor1 = 1;
            int valor2 = 1;
            for (int i = 0; i < casas.length; i++) {
                casas[i] = teclado.nextInt();
            }
            valorCorreto = teclado.nextInt();

            for (int i = 0; i < casas.length; i++) {
                int valor = valorCorreto - casas[i];
                if (procurarValor(valor,casas) != Integer.MIN_VALUE-1){
                    valor1 = valor;
                    valor2 = casas[i];
                    break;
                }
            }
            System.out.println(valor2 + " " + valor1);
        }
    }
    public static int procurarValor(int valor, int[] vetor){
        int retorno = Integer.MIN_VALUE-1;
        for (int i = 0; i < vetor.length ; i++) {
            if (vetor[i] == valor){
                retorno = vetor[i];
                break;
            }
        }
        return retorno;
    }
}
