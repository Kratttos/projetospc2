package com.cefet.pc2.exercicios.maratona.lista2;

import java.util.Scanner;

public class Nagol {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int qtdlinha = scanner.nextInt();
            int qtdcoluna = scanner.nextInt();
            int hitLinha = scanner.nextInt();
            int hitColuna = scanner.nextInt();

            int localExato = (hitLinha * qtdcoluna) + hitColuna + 1;

            if (localExato % 2 == 0) {
                System.out.println("Esquerda");
            } else {
                System.out.println("Direita");
            }
        }
    }
}
