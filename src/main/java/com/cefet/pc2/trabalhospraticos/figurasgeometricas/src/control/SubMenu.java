package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.OpcoesSubMenu;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.repository.Repository;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.SubMenuView;

public abstract class SubMenu implements ISubMenu{

    protected SubMenuView tela;
    private String className;

    public SubMenu(SubMenuView tela) {
        this.tela = tela;
        this.className = this.getClass().getSimpleName().replace("Controller", "");

    }

    @Override
    public void start() {
        OpcoesSubMenu opcao;
        do {
            this.tela.showMenu();
            opcao = (OpcoesSubMenu) this.tela.askOption();
            switch (opcao) {
                case CRIAR -> this.insert();
                case ALTERAR -> this.update();
                case EXCLUIR -> this.delete();
                case LISTAR -> this.listAll();
                case MOSTRAR -> this.details();
            }
        } while (opcao != OpcoesSubMenu.SAIR);
    }

    @Override
    public void insert() {
        boolean resposta = new Repository().insert(this.tela.askObject());
        if (resposta) {
            this.tela.inseridoSucesso();
        } else {
            this.tela.vetorCheio();
        }
    }

    @Override
    public void details() { //detalhes de um objeto da classe
        int id = this.tela.askID();
        Renderizavel objeto = new Repository().findByID(id,this.className);
        if (objeto != null) {
            this.tela.showDetails(objeto);
        } else {
            this.tela.invalidID(); //temp
        }
    }

    @Override
    public void listAll() { //mostrar tds os objetos desse tipo no vetor
        this.tela.listAll(new Repository().findByType(this.className));
    }

    @Override
    public void update() {
        this.tela.printLine("Em Progresso");
        String name = this.className;
        System.out.println("PLACEHOLDER : Update da classe " + name);
    }

    @Override
    public void delete() {
        int id = this.tela.showDeleteMenu();

        if (new Repository().delete(id, this.className)) {
            this.tela.inseridoSucesso();
        } else{
            this.tela.invalidID();
        }
    }
}
