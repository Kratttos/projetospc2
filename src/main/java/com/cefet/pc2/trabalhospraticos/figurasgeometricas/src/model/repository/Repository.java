package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.repository;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    public static final List<Renderizavel> listaFiguras = new ArrayList<>();
    private static final int TAMANHO_VETOR = 10;

    public static boolean insert(Renderizavel figura) {
        if (Repository.listaFiguras.size() < TAMANHO_VETOR) {
            Repository.listaFiguras.add(figura);
            return true;
        } else {
            return false;
        }
    }
}
