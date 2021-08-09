package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.FigurasGeometricas;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.OpcoesMenu;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.*;

import java.util.ArrayList;
import java.util.List;

public class MainControl {

    private List<FigurasGeometricas> lista;

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
                case QUADRADO -> new QuadradoControl(new QuadradoView()).start();
                case RETANGULO -> new RetanguloController(new RetanguloView()).start();
                case CIRCULO -> new CirculoController(new CirculoView()).start();
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
