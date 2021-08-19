package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.OpcoesSubMenu;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.repository.RenderizaveisRepository;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli.SubMenuView;

public abstract class SubMenu{

    protected SubMenuView tela;
    private String className;
    protected RenderizaveisRepository repository = new RenderizaveisRepository();

    public SubMenu(SubMenuView tela) {
        this.tela = tela;
        this.className = this.getClass().getSimpleName().replace("Controller", "");

    }

    public void startSubMenu() {
        OpcoesSubMenu opcao;
        do {
            opcao = (OpcoesSubMenu) this.tela.showMenu();
            switch (opcao) {
                case CRIAR -> this.insert();
                case ALTERAR -> this.update();
                case EXCLUIR -> this.delete();
                case LISTAR -> this.listAll();
                case MOSTRAR -> this.details();
            }
        } while (opcao != OpcoesSubMenu.SAIR);
    }

    protected void insert() {
        boolean resposta = new RenderizaveisRepository().insert(this.tela.askObject());
        if (resposta) {
            this.tela.inseridoSucesso();
        } else {
            this.tela.vetorCheio();
        }
    }

    protected void details() { //detalhes de um objeto da classe
        int id = this.tela.askID();
        Renderizavel objeto = this.repository.findByID(id,this.className);
        if (objeto != null) {
            this.tela.showDetails(objeto);
        } else {
            this.tela.invalidID(); //temp
        }
    }

    protected void listAll() { //mostrar tds os objetos desse tipo no vetor
        this.tela.listAll(this.repository.findByType(this.className));
    }

    protected void update() {
        int id = this.tela.askID();
        Renderizavel item = this.repository.findByID(id,this.className);
        if (item != null) {
            this.tela.showUpdateMenu(item);
        }else{
            this.tela.invalidID();
        }

    }

    protected void delete() {
        int id = this.tela.showDeleteMenu();

        if (this.repository.delete(id, this.className)) {
            this.tela.inseridoSucesso();
        } else{
            this.tela.invalidID();
        }
    }
}
