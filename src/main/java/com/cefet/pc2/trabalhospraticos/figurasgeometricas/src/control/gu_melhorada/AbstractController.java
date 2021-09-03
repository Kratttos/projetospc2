/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.repository.IRepository;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.repository.RenderizaveisRepository;

import java.util.List;

/**
 *
 * @author Everton
 */
public abstract class AbstractController implements ISubMenuController {

    protected IRepository dao = new RenderizaveisRepository();
    protected String tipo;

    public AbstractController() {
        this.tipo = this.getClass().getSimpleName().replace("Controller", "");;
    }

    @Override
    public void create(Renderizavel item) {
        dao.insert(item);
    }

    @Override
    public void update() {

    }

    @Override
    public void delete(int id) {
        dao.delete(id, tipo);
    }

    @Override
    public Renderizavel details(int id) {
        return dao.findByID(id, tipo);
    }

    @Override
    public List<Renderizavel> findAll() {
        return dao.findByType(this.tipo);

    }

}
