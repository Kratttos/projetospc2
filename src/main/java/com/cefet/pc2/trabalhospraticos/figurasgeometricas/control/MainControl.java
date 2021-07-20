package com.cefet.pc2.trabalhospraticos.figurasgeometricas.control;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.FigurasGeometricas;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.enums.OpcoesMenu;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.view.*;

import java.util.ArrayList;
import java.util.List;

public class MainControl {

    List<FigurasGeometricas> lista;

    public MainControl(){
        this.lista = new ArrayList<>();
    }

    public void start(){
        MainView tela = new MainView();
        OpcoesMenu opcao;
        do {
            tela.showMenu();
            opcao = tela.askOption();
            switch (opcao){
                case QUADRADO -> this.addFigura(new QuadradoView().askQuadrado());
                case RETANGULO -> this.addFigura(new RetanguloView().askRetangulo());
                case TRIANGULO -> this.addFigura(new TrianguloView().askTriangulo());
                case CIRCULO -> this.addFigura(new CirculoView().askCirculo());
                case APAGAR_ITEM -> this.deleteFigura();
                case LISTAR -> this.listAll();
                case SAIR -> System.exit(0);
            }

        } while (opcao != OpcoesMenu.SAIR);
    }

    public void startSubMenu() {

        MainView tela = new MainView();
        OpcoesMenu opcao;
        do {
            tela.showMainMenu();
            opcao = tela.askMainMenuOption();

           switch (opcao){
               case CIRCULO -> new CirculoController().inicio();
               case QUADRADO -> new QuadradoController().inicio();
               case RETANGULO -> new RetanguloController().inicio();
               case LISTAR -> System.out.println("aqui");
               case SAIR -> System.exit((0));
           }

        } while (opcao != OpcoesMenu.SAIR);
    }

    public void listAll(){
        for ( FigurasGeometricas fig : this.lista ) {
            new MainView().print(fig.toString());
        }
    }

    public void deleteFigura(){

    }

    public void addFigura(FigurasGeometricas figura){
        this.lista.add(figura);
    }


}
