/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.View;
import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author Everton
 */
public abstract class BasicGUIPane extends javax.swing.JDialog implements View {

    public BasicGUIPane(Frame owner, boolean modal) {
        super(owner, modal);
    }

   public void print(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public void printLine(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public int askInt() {
        return Integer.parseInt(this.askString());
    }

    @Override
    public String askString() {
        return JOptionPane.showInputDialog(null, "");
    }

    @Override
    public double askDouble() {
        return Double.parseDouble(this.askString());
    }

}
