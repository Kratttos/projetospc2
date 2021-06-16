package com.cefet.pc2.exercicios.maratona.lista2.Batal;

import java.util.Scanner;

public class Batal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int ordemMatriz = teclado.nextInt();
        int qtdPedras = teclado.nextInt();

        int[][] campo = new int[ordemMatriz][ordemMatriz];
        int linhasComPedra = 0;

        for (int i = 0; i <qtdPedras ; i++) {
            campo[teclado.nextInt()][teclado.nextInt()] = -1;
        }
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length ; j++) {
                if (campo[i][j] == -1){
                   linhasComPedra++;
                }
            }
        }
        System.out.println(linhasComPedra);
    }
}
