package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;

public abstract class SubMenuView extends BasicView {

    public abstract Renderizavel askObject();

    public abstract void showUpdateMenu(Renderizavel item);

    public int showDeleteMenu() {
        this.printLine("------ Deletar Figuras ------");
        this.printLine("Digite o ID do item que você deseja deletar");
        int id = this.askIntegerBiggerThanZero();
        this.printLine("------------------------------");

        return id;
    }

    public int askID(){
        this.printLine("Por Favor Digite o ID do Objeto");
        return this.askIntegerBiggerThanZero();
    }

    public void invalidID(){
        this.printLine("Não existe nenhum Objeto do tipo " + this.getClass().getSimpleName().replace("View","")+ " com esse ID");
    }

    public void showDetails(Renderizavel rend){
        this.printLine(rend.toString());
    }

    public void inseridoSucesso(){
        this.printLine("Inserido com Sucesso");
    }
}
