package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Avulsas;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Figuras;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.repository.Repository;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.*;

public class MainControl implements AbstractController {

    private BasicView tela;

    public MainControl(BasicView tela) {
        this.tela = tela;
    }

    public void start() {
        SubMenu[] listaSubMenus = new SubMenu[]{
                new TextoController(new TextoView()),
                new RetaController(new RetaView()),
                new RetanguloController(new RetanguloView()),
                new QuadradoController(new QuadradoView()),
                new CirculoController(new CirculoView()),
                new TrianguloController(new TrianguloView()),
                new ElipseController(new ElipseView())
        };
        do {
            Enum escolha = this.tela.showMenu();
            if (escolha instanceof Figuras) {
                int teclaPressionada = (Integer.parseInt(((Figuras) escolha).getTecla()));
                listaSubMenus[teclaPressionada - 1].start();
            } else {
                switch ((Avulsas) escolha) {
                    case DESENHAR -> new Paint().desenhar(Repository.listaFiguras);
                    case LISTAR -> this.listAll();
                    case SAIR -> System.exit(0);
                }
            }
        } while (true);
    }

    @Override
    public void listAll() {

    }
}
