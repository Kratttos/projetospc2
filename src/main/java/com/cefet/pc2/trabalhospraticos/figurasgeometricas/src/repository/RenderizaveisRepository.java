package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.repository;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.dao.Arquivo;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.dao.Persistence;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.dao.SQLite;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Local;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RenderizaveisRepository implements IRepository {

    private static List<Renderizavel> listaFiguras = new ArrayList<>();
    private static final int TAMANHO_VETOR = 10;
    private static int autoIncrement = 1;

    @Override
    public boolean insert(Renderizavel figura) {
        if (RenderizaveisRepository.listaFiguras.size() < TAMANHO_VETOR) {
            RenderizaveisRepository.listaFiguras.add(figura);
            figura.setId(autoIncrement++);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean delete(int id, String tipo) {
        boolean retorno = false;
        for (Renderizavel rend : listaFiguras) {
            if (rend.getId() == id && rend.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                retorno = true;
                listaFiguras.remove(rend);
            }
        }
        return retorno;
    }

    @Override
    public Renderizavel findByID(int id, String tipo) {
        for (Renderizavel item : listaFiguras) {
            if (item.getId() == id && item.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<Renderizavel> findByType(String tipo) {
        List<Renderizavel> novaLista = new ArrayList<>();
        for (Renderizavel item : listaFiguras) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                novaLista.add(item);
            }
        }
        return novaLista;
    }

    @Override
    public void persist(Local opcao) throws SQLException, IOException, ClassNotFoundException {
        Persistence local = opcao == Local.ARQUIVO ? new Arquivo() : new SQLite();
        local.save(listaFiguras);
    }

    @Override
    public void load(Local opcao) throws IOException, ClassNotFoundException {
        Persistence local = opcao == Local.ARQUIVO ? new Arquivo() : new SQLite();
        listaFiguras = local.load();
    }

    @Override
    public List<Renderizavel> getListaFiguras() {
        return listaFiguras;
    }
}
