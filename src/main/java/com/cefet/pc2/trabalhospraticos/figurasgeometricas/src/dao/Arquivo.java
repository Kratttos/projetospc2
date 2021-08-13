package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.dao;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

import java.io.*;
import java.sql.SQLException;
import java.util.List;

public class Arquivo implements Persistence {

    private final String CAMINHO_ARQUIVO = "src/main/java/com/cefet/pc2/trabalhospraticos/figurasgeometricas/figuras.bin";

    @Override
    public void save(List<Renderizavel> lista) throws IOException, ClassNotFoundException, SQLException {
        FileOutputStream arquivo = null;
        try {
            arquivo = new FileOutputStream(CAMINHO_ARQUIVO);
            ObjectOutputStream out = new ObjectOutputStream(arquivo);
            out.writeObject(lista);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Figuras Salvas");

    }

    @Override
    public List<Renderizavel> load() throws IOException, ClassNotFoundException {
        List<Renderizavel> figs;
        FileInputStream arq = new FileInputStream(CAMINHO_ARQUIVO);
        ObjectInputStream in = new ObjectInputStream(arq);
        figs = (List<Renderizavel>) in.readObject();

        return figs;
    }
}
