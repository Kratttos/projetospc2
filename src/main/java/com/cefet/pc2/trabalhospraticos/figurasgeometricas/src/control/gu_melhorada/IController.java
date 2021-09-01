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
public interface IController {
    
    List<Renderizavel> findAll();
    
    boolean save();
    
    boolean load();
}
