package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.repository.Repository;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.OpcoesMenu;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.*;

public class MainControl extends AbstractController {

    public MainControl(BasicView tela) {
        super(tela);
    }

    public void start() {
        OpcoesMenu opcao;
        do {
            this.tela.showMenu();
            opcao = (OpcoesMenu) tela.askOption();
            switch (opcao) {
                case TEXTO -> new TextoController(new TextoView()).start();
                case RETA -> new RetaController(new RetaView()).start();
                case QUADRADO -> new QuadradoController(new QuadradoView()).start();
                case RETANGULO -> new RetanguloController(new RetanguloView()).start();
                case CIRCULO -> new CirculoController(new CirculoView()).start();
                case DESENHAR -> new Paint().desenhar(Repository.listaFiguras);
                case LISTAR -> this.listAll();
                case SAIR -> System.exit(0);
            }
        } while (opcao != OpcoesMenu.SAIR);
    }

    @Override
    public void listAll() {

    }
}
