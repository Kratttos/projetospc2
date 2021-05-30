package com.cefet.pc2.exercicios.maratona;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BotasPerdidas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Bota> botas = new ArrayList<Bota>();
        util(botas);

        Iterator<Bota> itr = botas.iterator();
        int pares = 0;
        while (itr.hasNext()) {
            Bota bota = itr.next();
            for (int i = 0; i < botas.size(); i++) {
                if (bota.getTamanho() == botas.get(i).getTamanho() && !bota.getPe().equals(botas.get(i).getPe())) {
                    pares++;
                    itr.remove();
                }
            }
        }
        System.out.println(pares);
    }


    public static void util(List botas) {
        botas.add(new Bota("D", 40));
        botas.add(new Bota("E", 41));
        botas.add(new Bota("D", 41));
        botas.add(new Bota("E", 40));
    }

}

class Bota {

    private String pe;
    private int tamanho;

    public String getPe() {
        return pe;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Bota(String pe, int tamanho) {
        this.pe = pe;
        this.tamanho = tamanho;
    }
}





