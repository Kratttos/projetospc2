package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Texto;

public class TextoView extends BasicView{
    @Override
    public Renderizavel askObject() {
        System.out.println("PLACEHOLDER TEXTO : finge q aqui tem um menu");
        return new Texto();
    }
}
