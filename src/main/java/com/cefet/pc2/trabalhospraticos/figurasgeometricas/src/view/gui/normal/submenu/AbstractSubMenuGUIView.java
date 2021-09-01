package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal.submenu;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.ISubMenuView;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal.BasicGUIDialog;

import java.util.List;

public abstract class AbstractSubMenuGUIView extends BasicGUIDialog implements ISubMenuView {
     
    @Override
    public Enum showMenu(String nomeMenu) {
        return new Menu().init(nomeMenu);
    }

    @Override
    public int showDeleteMenu() {
        int ID = this.askID();

        return 0;
    }
    @Override
    public void listAll(List<Renderizavel> lista) {
            ///magia negra aqui
    }

    @Override
    public void vetorCheio() {
        this.print("Não foi possivel inserir, pois o vetor esta cheio");
    }

    @Override
    public int askID() {
        return this.askInt();
    }

    @Override
    public void invalidID() {
        this.print("ID Invalido");
    }

    @Override
    public void inseridoSucesso() {
       this.print("Inserido com Sucesso");
    }
}
