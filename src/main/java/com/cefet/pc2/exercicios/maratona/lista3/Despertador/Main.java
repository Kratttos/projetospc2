package com.cefet.pc2.exercicios.maratona.lista3.Despertador;

//Versão  mais simples sem Exceção

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int horaInicio = scanner.nextInt();
            int minInicio = scanner.nextInt();
            int horaFim = scanner.nextInt();
            int minFim = scanner.nextInt();

            String horarioInicio = horaInicio + " " + minInicio;
            String horarioFim = horaFim +" " + minFim;

            if (checarInput(horarioInicio,horarioFim)){
                break;
            }
            System.out.println(new Despertador(horarioInicio).calcularTempoDeSono(horarioFim));
        }
    }

    /**
     *  Checa se as 2 strings são diferentes de 00
     *
     * @param str1 uma String qualquer contendo um horario (HH/mm) separados por espaço em branco
     * @param str2 uma String qualquer contendo um horario (HH/mm) separados por espaço em branco
     * @return true se os 2 Strings do input forem 00 e false caso alguma das 2 Strings não seja 00
     */
    public static boolean checarInput(String str1, String str2){
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");
        boolean retorno = str1.contentEquals("00") && str2.contentEquals("00");

        return retorno;
    }
}
