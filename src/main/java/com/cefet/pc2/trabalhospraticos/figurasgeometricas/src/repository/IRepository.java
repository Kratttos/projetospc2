package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.repository;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Local;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IRepository {

    boolean insert(Renderizavel figura);

    boolean delete(int id, String tipo);

    Renderizavel findByID(int id, String tipo);

    List<Renderizavel> findByType(String tipo);

    void persist(Local opcao) throws SQLException, IOException, ClassNotFoundException;

    void load(Local opcao) throws IOException, ClassNotFoundException;

    List<Renderizavel> getListaFiguras();
}
