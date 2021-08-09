package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.OpcoesSubMenu;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.BasicView;

public abstract class AbstractController {

    private BasicView tela;

    public AbstractController(BasicView tela) {
        this.tela = tela;
    }

    public void start() {
        this.tela.showMenu();
        OpcoesSubMenu opcao = (OpcoesSubMenu) this.tela.askOption();
        do {
            switch (opcao) {
                case CRIAR -> this.insert();
                case ALTERAR -> this.update();
                case EXCLUIR -> this.delete();
                case LISTAR -> this.listAll();
                case MOSTRAR -> this.list();
            }
        } while (opcao != OpcoesSubMenu.SAIR);

    }

    public abstract void insert();

    public abstract void list();

    public abstract void update();

    public abstract void delete();

    public abstract void listAll();
}
