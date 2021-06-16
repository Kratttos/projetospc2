package com.cefet.pc2.exercicios.maratona.lista3.Esquerda;

import java.util.Scanner;

public class EsquerdaVolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String posicoes[] = new String[]{"N", "L", "S", "O"};

        while (true) {

            int numeroComandos = Integer.parseInt(scanner.next());

            if (numeroComandos == 0) {
                break;
            }
            String comandos = scanner.next();
            System.out.println(new Soldado(posicoes).calcularPosicao(comandos));
        }
    }
}
