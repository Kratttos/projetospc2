package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Reta;

public class RetaView extends BasicView{
    @Override
    public Renderizavel askObject() {
        System.out.println("PLACEHOLDER RETA : finge q aqui tem um menu");
        return new Reta();
    }
}
