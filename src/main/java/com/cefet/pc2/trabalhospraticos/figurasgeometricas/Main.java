package com.cefet.pc2.trabalhospraticos.figurasgeometricas;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.MainControl;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.MainView;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        new MainControl(new MainView()).start();
    }
}
