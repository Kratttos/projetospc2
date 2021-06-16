package com.cefet.pc2.exercicios.maratona.lista3.Despertador;

public class Despertador {

    private int[] horarioAtual;


    public Despertador(String horarioAtual) {
        this.horarioAtual = this.formatarEntrada(horarioAtual);
    }

    /**
     * Formata uma String qualquer em um Array de inteiros usando o espaço como separação das posições
     *
     * @param input uma String qualquer contendo numeros separados por espaços em branco
     * @return Retorna um array de inteiros
     */
    private int[] formatarEntrada(String input) {
        String[] inputStringArray = input.split(" ");
        int inputIntArray[] = new int[inputStringArray.length];

        for (int i = 0; i < inputStringArray.length; i++) {
            inputIntArray[i] = Integer.parseInt(inputStringArray[i]);
        }
        return inputIntArray;
    }

    /**
     *
     * @param input Uma String contendo contendo um horario
     * @return retorna um inteiro com a quantidade de minutos entre o horario do despertador e o input
     */
    public int calcularTempoDeSono(String input) {

        int[] horario = this.formatarEntrada(input);
        int contador = 0;

        while (!this.checarFim(this.horarioAtual, horario)) {

            if (this.horarioAtual[1] == 60) {
                this.horarioAtual[1] = 0;
                this.horarioAtual[0] += 1;

            } else {
                this.horarioAtual[1] += 1;
                contador += 1;
            }

            if (this.horarioAtual[0] == 24) {
                this.horarioAtual[0] = 0;
            }
        }
        return contador;
    }

    private boolean checarFim(int[] inicio, int fim[]) {
        boolean igual = false;
        igual = inicio[0] == fim[0] && inicio[1] == fim[1] ? true : false;

        return igual;
    }
}