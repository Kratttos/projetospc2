package com.cefet.pc2.exercicios.maratona.lista1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Alarme {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int horaInicio = scanner.nextInt();
            int minInicio = scanner.nextInt();
            int horaFim = scanner.nextInt();
            int minFim = scanner.nextInt();

            if (horaInicio == 0 && minInicio == 0 && horaFim == 0 && minFim ==0){
                break;
            }

            int[] vetorHoraInicial = new int[]{horaInicio, minInicio};
            int[] vetorHoraFinal = new int[]{horaFim, minFim};

            int contador = 0;

            while (!checarFim(vetorHoraInicial, vetorHoraFinal)) {

                if (vetorHoraInicial[1] == 60) {
                    vetorHoraInicial[1] = 0;
                    vetorHoraInicial[0] += 1;

                } else {
                    vetorHoraInicial[1] += 1;
                    contador += 1;
                }

                if (vetorHoraInicial[0] == 24) {
                    vetorHoraInicial[0] = 0;
                }
            }
            System.out.println(contador);
        }
    }

    public static boolean checarFim(int[] inicio, int fim[]) {
        boolean igual = false;
        igual = inicio[0] == fim[0] && inicio[1] == fim[1] ? true : false;

        return igual;
    }
}
