package com.cefet.pc2.trabalhospraticos.figurasgeometricas.control;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.FigurasGeometricas;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.enums.OpcoesMenu;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.view.*;

import java.util.ArrayList;
import java.util.List;

public class MainControl {

    List<FigurasGeometricas> lista;

    public MainControl() {
        this.lista = new ArrayList<>();
    }

    public void start() {
        MainView tela = new MainView();
        OpcoesMenu opcao;
        do {
            tela.showMenu();
            opcao = tela.askOption();
            switch (opcao) {
                case QUADRADO -> this.addFigura(new QuadradoView().askQuadrado());
                case RETANGULO -> this.addFigura(new RetanguloView().askRetangulo());
                case CIRCULO -> this.addFigura(new CirculoView().askCirculo());
                case APAGAR_ITEM -> this.deleteFigura();
                case DESENHAR -> new Paint().desenhar(this.lista);
                case LISTAR -> this.listAll();
                case SAIR -> System.exit(0);
            }
        } while (opcao != OpcoesMenu.SAIR);
    }

    public void listAll() {
        new MainView().listarTodos(this.lista);
    }

    public void deleteFigura() {
        MainView tela = new MainView();
        if (this.lista.size() > 0) {
            int posicao = tela.showDeleteMenu(this.lista.size());
            this.lista.remove(posicao);
        } else {
            tela.listaVazia();
        }
    }

    public void addFigura(FigurasGeometricas figura) {

        if (this.lista.size() < 10) {
            this.lista.add(figura);
        } else {
            new MainView().vetorCheio();
        }
    }


}
