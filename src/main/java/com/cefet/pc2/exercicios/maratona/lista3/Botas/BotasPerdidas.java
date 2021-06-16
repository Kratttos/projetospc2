package com.cefet.pc2.exercicios.maratona.lista3.Botas;

import java.util.Scanner;

public class BotasPerdidas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int qtdBotas = scanner.nextInt();
            Sapateira sapateira = new Sapateira();
            for (int i = 0; i < qtdBotas; i++) {

                int tamanhoBota = Integer.parseInt(scanner.next());
                String pe = scanner.nextLine().trim();

                sapateira.add(new Bota(pe,tamanhoBota));
            }
            System.out.println(sapateira.qtdPares());
        }
    }
}
