package com.cefet.pc2.exercicios.maratona.lista2.Batal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NavalhaBatal {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        //int ordemMatriz = teclado.nextInt();
        //int qtdCelularPreenchidas = teclado.nextInt();
        int ordemMatriz = 5;

        String[] celularPreenchidas = new String[]{"0!3", "1!3", "2!1", "2!2", "2!3", "2!4", "3!2", "4!2"};

        for (int valorAtual = 0; valorAtual < ordemMatriz; valorAtual++) {

            List temp = new ArrayList<>();
            for (int i = 0; i < celularPreenchidas.length; i++) {

                String stringTemp = celularPreenchidas[i];
                stringTemp = stringTemp.substring(0, stringTemp.indexOf("!")).trim();
                if (valorAtual == Integer.parseInt(stringTemp)) {
                    int tempb = Integer.parseInt(celularPreenchidas[i].substring(celularPreenchidas[i].indexOf("!") + 1).trim());
                    temp.add(tempb);
                }
            }

            int qtd = 0;

            for (Object a : temp) {
                int tamanhoMaximoBavio = (int) a;

            }
            break;
        }
    }

}
