package com.cefet.pc2.exercicios.maratona;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HappyHour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String horarios[] = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};

        int horariosIntArray[] = new int[horarios.length];
        //System.out.println(horarios.length);

        int qtdAlunos = 3;
        String matriz[][] = new String[][]{
                {"ABEL", "ABIJKL", "AJKL", "ABEL", "JKL", "EFGHIJKL"},
                {"ABEFGL", "CIJKL", "ABH", "AKL", "ABIJKL", "EFGHIJKL"},
                {"ABL", "HIJKL", "AIL", "AFGJKL", "AFGJKL", "EFGHIJK"}
        };

        //for controllando as colunas
        for (int i = 0; i < matriz[0].length; i++) {
            String menorPalavra = matriz[i][0];
            for (int j = 0; j < matriz.length; j++) {
                // System.out.print(matriz[j][i] +"\t");
                if (matriz[j][i].length() < menorPalavra.length()){
                    menorPalavra = matriz[j][i];
                }
            }
            break;
        }

        //System.out.println();
    }
}


