package com.cefet.pc2.exercicios.maratona;

import java.util.*;

public class BotasPerdidas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int qtdBotas = scanner.nextInt();


            Bota botas[] = new Bota[qtdBotas];
            for (int i = 0; i < qtdBotas; i++) {

                int tamanhoBota = Integer.parseInt(scanner.next());
                String pe = scanner.nextLine().trim();

                Bota bota = new Bota(pe, tamanhoBota);
                botas[i] = bota;

            }
            int pares = 0;
            for (int i = 0; i < botas.length; i++) {
                for (int j = i + 1; j < botas.length; j++) {
                    if (botas[i] != null && botas[j] != null) {
                        if (botas[i].getTamanho() == botas[j].getTamanho() && !botas[i].getPe().equals(botas[j].getPe())) {
                            pares++;

                            botas[i] = null;
                            botas[j] = null;
                            break;
                        }
                    }

                }
            }
            System.out.println(pares);
        }
    }
}


class Bota {

    private String pe;
    private int tamanho;

    public String getPe() {
        return pe;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Bota(String pe, int tamanho) {
        this.pe = pe;
        this.tamanho = tamanho;
    }
}
/**
 *
 */

/**
 *
 */