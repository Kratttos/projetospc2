/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.IFormulario;
import lombok.AllArgsConstructor;

/**
 * @author Everton
 */
@AllArgsConstructor
public class Form<T extends Renderizavel> implements IFormulario<T> {

    protected AbstractDialog inserir;
    protected AbstractDialog alterar;
    protected AbstractDialog detalhes;

    @Override
    public Renderizavel inserir() {
        return this.inserir.run(null);
    }

    @Override
    public void alterar(T item) {
        this.alterar.run(item);
    }

    @Override
    public void detalhes(T item) {
        this.detalhes.run(item);
    }


}
