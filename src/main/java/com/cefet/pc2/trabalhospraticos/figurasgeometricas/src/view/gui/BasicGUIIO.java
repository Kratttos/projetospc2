package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.IO;

import javax.swing.*;


public class BasicGUIIO implements IO {
    @Override
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
