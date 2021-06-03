package com.cefet.pc2.exercicios.maratona;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Handball {

    public static void main(String[] args) {
        //10 5
        //0 3 3 2 3
        //5 0 5 2 2
        //0 5 3 3 2
        //1 1 4 3 3
        //2 2 5 5 0
        //5 3 1 0 2
        //1 4 1 5 0
        //4 0 4 3 4
        //0 2 1 3 5
        //3 5 0 3 5
        Scanner scanner = new Scanner(System.in);

        int numJogadores = 12;
        int numeroPartidas = 5;
        String [][] pontuacao = new String[numJogadores][numeroPartidas];
        for (int i = 0; i < pontuacao.length ; i++) {
            for (int j = 0; j <pontuacao[0].length ; j++) {
                pontuacao[i][j] = scanner.next();
            }
        }

        int contador = 0;
        for (int i = 0; i < pontuacao[0].length; i++) {
            ArrayList<String> listaTemp = new ArrayList<>();
            for (int j = 0; j < pontuacao.length; j++) {
                listaTemp.add(pontuacao[j][i]);
            }
            Object[] b = listaTemp.stream().toArray();

            contador = Arrays.stream(b).anyMatch(x -> x.equals("0")) ? contador : (contador+=1);
        }
        System.out.println(contador);
    }

    public static void debug(Object[][] pontuacao) {
        for (int i = 0; i < pontuacao.length; i++) {
            for (int j = 0; j < pontuacao[0].length; j++) {
                System.out.printf(pontuacao[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
