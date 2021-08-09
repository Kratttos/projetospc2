package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Reta;

public class RetaView extends SubMenuView{

    @Override
    public Renderizavel askObject() {
        System.out.println("PLACEHOLDER RETA : finge q aqui tem um menu");
        return new Reta();
    }

    @Override
    public Renderizavel showUpdateMenu() {
        System.out.println("PLACEHOLDER : Aqui ainda vai ter um menu de update");

        return null;
    }
}
