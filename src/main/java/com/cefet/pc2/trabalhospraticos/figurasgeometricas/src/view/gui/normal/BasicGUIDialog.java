/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.IO;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.View;

import java.awt.*;

/**
 * @author Everton
 */
public abstract class BasicGUIDialog extends javax.swing.JDialog implements View {

    private IO inputOutput;

    public BasicGUIDialog(Frame owner, boolean modal) {
        super(owner, modal);
    }
    public BasicGUIDialog(){
        this(null,true);
        inputOutput = new BasicGUIIO();

    }
    @Override
    public void print(String msg) {
        inputOutput.print(msg);
    }

    @Override
    public void printLine(String msg) {
        inputOutput.printLine(msg);
    }

    @Override
    public int askInt() {
        return inputOutput.askInt();
    }

    @Override
    public String askString() {
        return inputOutput.askString();
    }

    @Override
    public double askDouble() {
        return inputOutput.askDouble();
    }

}
