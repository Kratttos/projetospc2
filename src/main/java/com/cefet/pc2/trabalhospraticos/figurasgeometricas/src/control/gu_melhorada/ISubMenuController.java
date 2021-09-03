/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import java.util.List;

/**
 *
 * @author Everton
 */
public interface ISubMenuController {
    
    void create(Renderizavel item);
    
    void update();
    
    void delete(int id);
    
    Renderizavel details(int id);
    
    List<Renderizavel> findAll();
}
