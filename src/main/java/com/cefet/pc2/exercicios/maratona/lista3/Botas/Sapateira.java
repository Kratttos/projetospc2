package com.cefet.pc2.exercicios.maratona.lista3.Botas;

import java.util.ArrayList;
import java.util.List;

public class Sapateira {

    private List<Bota> listaBotas;
    private int qtdPares;


    public Sapateira() {
        this.listaBotas = new ArrayList<>();
        this.qtdPares = 0;
    }

    /**
     * adiciona a bota a lista de botas
     *
     * @param bota Um objeto qualquer do tipo Bota
     */
    public void add(Bota bota) {
        Bota botaTemp;
        boolean flag = false;
        int posicaoIgual = Integer.MAX_VALUE-1;
        for (int i = 0; i < this.listaBotas.size(); i++) {
            botaTemp = this.listaBotas.get(i);
            if (botaTemp.getTamanho() == bota.getTamanho() && !botaTemp.getPe().equals(bota.getPe())) {
                this.qtdPares++;
                flag = true;
                posicaoIgual = i;
                break;
            }
        }
        if (flag) {
            listaBotas.remove(posicaoIgual);
        } else {
            this.listaBotas.add(bota);
        }
    }


    public int qtdPares() {
        return this.qtdPares;
    }
}
