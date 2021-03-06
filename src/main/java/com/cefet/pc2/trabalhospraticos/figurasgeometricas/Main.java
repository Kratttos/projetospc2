package com.cefet.pc2.trabalhospraticos.figurasgeometricas;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.MainControl;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.TipoInterface;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.EscolhaInterface;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli.MainView;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal.MainGUIView;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada.MainPane;

/**
 * @author Everton
 */

public class Main {

    public static void main(String[] args) {
        TipoInterface tipo = new EscolhaInterface().run();
        if (tipo != null) {
            switch (tipo) {
                case CLI -> new MainControl(new MainView()).start(TipoInterface.CLI);
                case GUI -> new MainControl(new MainGUIView()).start(TipoInterface.GUI);
                case GUI_2 -> new MainPane();
            }
        }
    }
}
