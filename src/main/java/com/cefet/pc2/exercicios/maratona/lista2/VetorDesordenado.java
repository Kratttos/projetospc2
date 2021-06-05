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

            StringBuilder StringV = new StringBuilder("V = { ");
            for (int i = 0; i < numeros.length; i++) {
                StringV.append(numeros[i]);
                if (i != numeros.length - 1) {
                    StringV.append(",");
                } else {
                    StringV.append("}");
                }
            }


            StringBuilder stringOutput = new StringBuilder("O = { ");
            for (int i = 0, iPar = arrayPar.length - 1, iImpar = 0; i != numeros.length; i++) {
                if (i % 2 == 0) {
                    stringOutput.append(arrayPar[iPar]);
                    iPar--;
                } else {
                    stringOutput.append(arrayImpar[iImpar]);
                    iImpar++;
                }
                if (i != numeros.length - 1) {
                    stringOutput.append(",");
                } else {
                    stringOutput.append("}");
                }
            }
            System.out.println(StringV);
            System.out.println(stringOutput);


        }
    }


}
/**
 *
 * 31
 * -611 529 868 -877 836 -911 -792 273 101 -180 -629 -338 382 825 -308 -831 -777 531 676 525 -48 -733 -989 953 910 -885 217 862 -542 -195 -627
 */
/**
 * System.out.println();
 * for (int i = numeros.length -1; i > -1; i--) {
 * System.out.print(ordenadoCres[i] + " ");
 * }
 */