package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

import java.util.List;

public interface ISubMenuView extends View {

    Renderizavel create();

    int showDeleteMenu();

    void update(Renderizavel item);

    void listAll(List<Renderizavel> lista);

    void showDetails(Renderizavel rend);

    void vetorCheio();

    int askID();

    void invalidID();

    void inseridoSucesso();
}
