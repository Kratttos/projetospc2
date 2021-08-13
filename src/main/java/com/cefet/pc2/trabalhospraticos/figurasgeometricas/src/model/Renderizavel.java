package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

import java.io.Serializable;

public abstract class Renderizavel implements Serializable {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
