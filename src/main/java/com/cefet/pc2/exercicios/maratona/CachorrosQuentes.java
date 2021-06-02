package com.cefet.pc2.exercicios.maratona;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CachorrosQuentes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p,h;
        do{
            h = scanner.nextInt();
            p = scanner.nextInt();

        }while (p<1 ||h>1000);

        double resultado  = (double) h/p;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println(decimalFormat.format(resultado));
        scanner.close();
    }
}
