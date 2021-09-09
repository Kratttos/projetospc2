/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.OpcoesSubMenu;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.IFormulario;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Everton
 */
public abstract class AbstractForm<T extends Renderizavel> extends javax.swing.JDialog implements IFormulario {

    protected OpcoesSubMenu operacao;
    protected T objeto;
    protected JButton btnSalvar;

    /**
     * Creates new form AbstractForm
     */
    public AbstractForm() {
        this.setModal(true);
        this.setLocationRelativeTo(null);
    }

    protected void btnSalvarEvent(ActionEvent evnt) {
        if (this.operacao == OpcoesSubMenu.CRIAR) {
            this.criar();
        } else {
            this.alterar();
        }
    }

    @Override
    public Renderizavel inserir() {
        this.operacao = OpcoesSubMenu.CRIAR;
        this.setVisible(true);
        T objetoTemporario = objeto;
        this.objeto = null;
        return objetoTemporario;
    }

    @Override
    public void update(Renderizavel item){
    }

    @Override
    public void detalhes(Renderizavel item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   
    protected abstract void criar();

    protected abstract void alterar();
}
