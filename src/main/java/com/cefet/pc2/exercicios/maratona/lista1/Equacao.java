package com.cefet.pc2.exercicios.maratona.lista1;

import java.util.Scanner;

public class Equacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            String formula = "Equacao: " + a + "(x2) + " + b + "(x) + " + c;

            if (a == 0) {
                System.out.println("Nao e uma equacao de grau 2");
            } else {
                System.out.println(formula);
                double delta = (Math.pow(b, 2)) - 4 * a * c;

                if (delta < 0) {

                    System.out.println("Solucao com 0 raizes reais");
                    System.out.println("X1: Nao existe raiz real");

                } else {
                    double raiz1 = (-(b) + Math.sqrt(delta)) / (2 * a);
                    double raiz2 = (-(b) - Math.sqrt(delta)) / (2 * a);

                    if (raiz1 == raiz2) {

                        System.out.println("Solucao com 1 raiz real");
                        System.out.println("X1: " + raiz1);
                    } else {
                        System.out.println("Solucao com 2 raizes reais");
                        System.out.println("X1: " + raiz1);
                        System.out.println("X2: " + raiz2);
                    }

                }

            }
        }

    }
}
