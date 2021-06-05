package com.cefet.pc2.exercicios.maratona.lista1;

import java.util.Scanner;

public class EsquerdaVolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String posicoes[] = new String[]{"N", "L", "S", "O"};
        // 0 = N
        // 1 = L
        // 2 = S
        // 3 = O

        while (true) {

            int posicao = 0;

            int numeroComandos = Integer.parseInt(scanner.next());

            if (numeroComandos == 0) {
                break;
            }

            String comandos = scanner.next();
            for (int i = 0; i < comandos.length(); i++) {

                posicao = comandos.charAt(i) == 'D' ? ++posicao : --posicao;
                if (posicao == posicoes.length) {
                    posicao = 0;
                }
                if (posicao == -1) {
                    posicao = posicoes.length - 1;
                }
            }
            System.out.println(posicoes[posicao]);
        }
    }
}
