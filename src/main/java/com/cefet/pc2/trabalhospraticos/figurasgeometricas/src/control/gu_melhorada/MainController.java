/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Local;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.repository.RenderizaveisRepository;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Everton
 */
public class MainController implements IController {

    @Override
    public List<Renderizavel> findAll() {
        return new RenderizaveisRepository().getListaFiguras();
    }

    @Override
    public boolean save() {
        try {
            new RenderizaveisRepository().persist(Local.ARQUIVO);
            return true;
        } catch (SQLException | IOException | ClassNotFoundException ex) {
            return false;
        }
    }

    @Override
    public boolean load() {
        try {
            new RenderizaveisRepository().load(Local.ARQUIVO);
            return true;
        } catch (IOException | ClassNotFoundException ex) {
            return false;
        }
    }
}
