package com.cefet.pc2.exercicios.maratona.lista2;

import java.util.Scanner;

public class NavalhaBatal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //int ordemMatriz = teclado.nextInt();
        //int qtdCelularPreenchidas = teclado.nextInt();
        int ordemMatriz = 5;
        String[] celularPreenchidas = new String[]{"0!3","1!3","2!1","2!2","2!3","2!4","3!2","4!2"};

        //bavios de 1 de tamanho
        int  posicoesTotal = (ordemMatriz * ordemMatriz)- celularPreenchidas.length;





        

        System.out.println(posicoesTotal);



        
    }
}
