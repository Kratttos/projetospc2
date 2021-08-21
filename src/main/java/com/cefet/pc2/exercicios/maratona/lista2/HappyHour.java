package com.cefet.pc2.exercicios.maratona.lista2;


import java.util.ArrayList;
import java.util.Scanner;
public class HappyHour {

    public static void main(String[] args) {

        final int DIAS_DA_SEMANA = 6;

        Scanner teclado = new Scanner(System.in);
        ArrayList<String[]> listaAlunos = new ArrayList();

        while (teclado.hasNextInt()) {
            int qtdAlunos = teclado.nextInt();
            for (int i = 0; i < qtdAlunos; i++) {
                String[] horarios = new String[DIAS_DA_SEMANA];
                for (int j = 0; j < DIAS_DA_SEMANA; j++) {
                    horarios[j] = teclado.next();
                }
                if (i == 0) {
                    listaAlunos.add(horarios);
                } else {
                    listaAlunos.add(0, horarioMaisRestrito(listaAlunos.get(0), horarios));

                }
            }
            for (int i = 0; i < listaAlunos.get(0).length; i++) {
                System.out.print(listaAlunos.get(0)[i] + " ");
            }
        }
    }

    public static String[] horarioMaisRestrito(String[] horario1, String[] horario2) {
        String novoHorario[] = new String[horario1.length];

        for (int i = 0; i < horario1.length; i++) {
            StringBuilder builder = new StringBuilder("");
            for (int j = 0; j < horario1[i].length(); j++) {
                if (horario2[i].contains(horario1[i].charAt(j) + "")) {
                    builder.append(horario1[i].charAt(j));
                }
            }
            novoHorario[i] = builder.toString();
        }

        return novoHorario;
    }
}


