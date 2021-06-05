package com.cefet.pc2.exercicios.maratona.lista2;

import java.util.*;
import java.util.stream.Collectors;

public class VetorDesordenado {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (teclado.hasNextInt()) {


            int qtdNumeros = teclado.nextInt();
            int[] numeros = new int[qtdNumeros];
            List listaPar = new ArrayList();
            List listaImpar = new ArrayList();

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = teclado.nextInt();
                if (i % 2 == 0) {
                    listaImpar.add(numeros[i]);
                } else {
                    listaPar.add(numeros[i]);
                }
            }
            Object[] arrayPar = listaPar.stream().sorted().toArray();
            Object[] arrayImpar = listaImpar.stream().sorted().toArray();

            StringBuilder stringV = new StringBuilder("V = { ");
            for (int i = 0; i < numeros.length; i++) {
                stringV.append(numeros[i]);
                if (i != numeros.length - 1) {
                    stringV.append(",");
                    stringV.append(" ");
                } else {
                    stringV.append("}");
                }
            }

            StringBuilder stringOutput = new StringBuilder("O = { ");
            for (int i = 1, iPar = arrayPar.length - 1, iImpar = 0; i != numeros.length; i++) {
                if (i % 2 == 0) {
                    stringOutput.append(arrayPar[iPar]);
                    iPar--;
                } else {
                    stringOutput.append(arrayImpar[iImpar]);
                    iImpar++;
                }
                if (i != numeros.length - 1) {
                    stringOutput.append(",");
                    stringOutput.append(" ");
                }
            }
            stringOutput.append(",");
            stringOutput.append(" ");

            if (arrayImpar.length > arrayPar.length) {
                stringOutput.append(arrayImpar[arrayImpar.length - 1]);
            } else {
                stringOutput.append(arrayPar[0]);
            }
            stringOutput.append("}");
            System.out.println(stringV);
            System.out.println(stringOutput);
        }
    }
}