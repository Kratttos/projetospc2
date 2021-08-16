package com.cefet.pc2.trabalhospraticos.figurasgeometricas;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.MainControl;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.MainView;

public class Main {
    public static void main(String[] args) {
        new MainControl(new MainView()).start();
    }
}
