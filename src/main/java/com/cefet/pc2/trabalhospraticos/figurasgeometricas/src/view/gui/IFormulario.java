/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

/**
 *
 * @author Everton
 */
public interface IFormulario<T> {
    
    Renderizavel inserir();
    
    void alterar(T item);
    
    void detalhes(T item);
}
