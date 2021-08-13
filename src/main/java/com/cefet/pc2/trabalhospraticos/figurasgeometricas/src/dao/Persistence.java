package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.dao;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public interface Persistence {

    void save(List<Renderizavel> lista) throws IOException, ClassNotFoundException, SQLException;

    List<Renderizavel> load() throws IOException, ClassNotFoundException;

}
