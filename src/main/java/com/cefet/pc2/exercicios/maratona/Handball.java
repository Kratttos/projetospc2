package com.cefet.pc2.exercicios.maratona;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Handball {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {

            int numJogadores = scanner.nextInt();
            int numeroPartidas = scanner.nextInt();
            int contador = 0;
            String[][] pontuacao = new String[numJogadores][numeroPartidas];
            for (int i = 0; i < pontuacao.length; i++) {
                for (int j = 0; j < pontuacao[0].length; j++) {
                    pontuacao[i][j] = scanner.next();
                }
                contador = Arrays.stream(pontuacao[i]).anyMatch(x -> x.equals("0")) ? contador : (contador += 1);
            }
            System.out.println(contador);
        }
    }
}
