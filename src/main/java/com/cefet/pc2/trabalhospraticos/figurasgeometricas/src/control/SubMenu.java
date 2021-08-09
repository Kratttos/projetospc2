package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.repository.Repository;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.OpcoesSubMenu;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.BasicView;

public abstract class SubMenu {

    protected BasicView tela;

    public SubMenu(BasicView tela) {
        this.tela = tela;
    }

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
                case MOSTRAR -> this.list();
            }
        } while (opcao != OpcoesSubMenu.SAIR);

    }

    public void insert(){
        boolean resposta = Repository.insert(this.tela.askObject());
        if (resposta){
            this.tela.inserido();
        }else{
            this.tela.vetorCheio();
        }
    }

    public void list(){
        this.tela.printLine("Em Progresso");
        String name = this.getClass().getSimpleName();
        System.out.println("List da classe " + name);
    }

    public void update(){
        this.tela.printLine("Em Progresso");
        String name = this.getClass().getSimpleName();
        System.out.println("Update da classe " + name);
    };

    public void delete(){
        this.tela.printLine("Em Progresso");
        String name = this.getClass().getSimpleName();
        System.out.println("Delete da classe " + name);
    };

    public void listAll(){
        this.tela.printLine("Em Progresso");
        String name = this.getClass().getSimpleName();
        System.out.println("ListAll da classe " + name);
    };
}
