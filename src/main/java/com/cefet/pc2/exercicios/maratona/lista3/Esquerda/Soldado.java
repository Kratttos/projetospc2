package com.cefet.pc2.exercicios.maratona.lista3.Esquerda;

public class Soldado {

    private String[] posicoesPossiveis;

    public Soldado(String posicoes[]) {
        this.posicoesPossiveis = posicoes;
    }

    /**
     * Calcula a posição que o soldado esta olhando
     *
     * @param comandos String contendo os comandos pro soldado
     * @return  retorna uma String com o posição que o soldado esta olhando
     */
    public String calcularPosicao(String comandos){
        int posicao = 0;
        for (int i = 0; i < comandos.length(); i++) {

            posicao = comandos.charAt(i) == 'D' ? ++posicao : --posicao;
            if (posicao == posicoesPossiveis.length) {
                posicao = 0;
            }
            if (posicao == -1) {
                posicao = posicoesPossiveis.length - 1;
            }
        }
        return posicoesPossiveis[posicao];
    }
}
