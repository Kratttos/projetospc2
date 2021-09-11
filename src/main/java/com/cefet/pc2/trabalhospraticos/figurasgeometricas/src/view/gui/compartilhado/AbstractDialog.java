/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

import java.awt.event.ActionEvent;

/**
 *
 * @author Everton
 */
public abstract class AbstractDialog<T extends Renderizavel> extends javax.swing.JDialog {

    protected T objeto;

    /**
     * Creates new form AbstractForm
     */
    public AbstractDialog() {
        this.setModal(true);
        this.setLocationRelativeTo(null);
    }

    protected abstract void btnSalvarEvent(ActionEvent evnt);

    protected abstract void limparCampos();

    public T run(T objeto){
        this.setVisible(true);
        T objetoNovo = this.objeto;
        this.dispose();

        return objetoNovo;
    }


    // Variables declaration - do not modify                     
    // End of variables declaration


    @Override
    public void dispose() {
        this.limparCampos();
        this.objeto = null;
        super.dispose();
    }
}
