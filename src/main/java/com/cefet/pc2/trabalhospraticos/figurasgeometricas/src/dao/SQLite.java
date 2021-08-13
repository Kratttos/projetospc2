package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.dao;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class SQLite implements Persistence {

    private static final String INSERT_SQL = "Insert Into Teste values(?,0)";        //O Table vai ser trocado pelo nome da tabela correta
    private static final String SELECT_SQL = "Select * From Table";               //O "Table" vou alterar pro nome da tabela certa
    private Connection con;

    private static final String URL_DATABASE = "src/main/java/com/cefet/pc2/trabalhospraticos/figurasgeometricas/figurasgeometricas.db";

    public SQLite() throws IOException, ClassNotFoundException {
        this.con = this.getConnection();
    }

    private Connection getConnection() throws IOException, ClassNotFoundException {

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlite:" + URL_DATABASE);
        } catch (SQLException ex) {

        }
        return con;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Persistence a = new SQLite();
    }


    @Override
    public void save(List<Renderizavel> lista) throws IOException, ClassNotFoundException, SQLException {

    }

    @Override
    public List<Renderizavel> load() {
        return null;
    }
}
