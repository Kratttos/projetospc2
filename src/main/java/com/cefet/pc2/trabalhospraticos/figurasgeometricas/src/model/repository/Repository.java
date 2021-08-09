package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.repository;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    public static final List<Renderizavel> listaFiguras = new ArrayList<>();
    private static final int TAMANHO_VETOR = 10;
    private static int autoIncrement = 1;

    public static boolean insert(Renderizavel figura) {
        if (Repository.listaFiguras.size() < TAMANHO_VETOR) {
            Repository.listaFiguras.add(figura);
            figura.setId(autoIncrement++);
            return true;
        } else {
            return false;
        }
    }

    public static boolean delete(int id,String tipo){
        boolean retorno = false;
        for (Renderizavel rend: listaFiguras ) {
            if (rend.getId() == id && rend.getClass().getSimpleName().equalsIgnoreCase(tipo)){
                retorno = true;
                listaFiguras.remove(rend);
            }
        }
        return retorno;
    }

    public static Renderizavel findByID(int id){
        for (Renderizavel item: listaFiguras) {
            if (item.getId() == id){
                return item;
            }
        }
        return null;
    }

    public static List<Renderizavel> findByType(String tipo){
        List<Renderizavel> novaLista = new ArrayList<>();
        for (Renderizavel item: listaFiguras ) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(tipo)){
                novaLista.add(item);
            }
        }
        return novaLista;
    }
}
