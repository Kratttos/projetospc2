package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Avulsas;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Figuras;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Local;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.repository.RenderizaveisRepository;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.BasicView;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli.*;

import java.io.IOException;
import java.sql.SQLException;

public class MainControl {

    private BasicView tela;
    private RenderizaveisRepository repository = new RenderizaveisRepository();

    public MainControl(BasicView tela) {
        this.tela = tela;
    }

    public void start(){
        SubMenu[] listaSubMenus = new SubMenu[]{
                new TextoController(new TextoView()),
                new RetaController(new RetaView()),
                new RetanguloController(new RetanguloView()),
                new QuadradoController(new QuadradoView()),
                new CirculoController(new CirculoView()),
                new TrianguloController(new TrianguloView()),
                new LosangoController(new LosangoView()),
                new TrapezioController(new TrapezioView())
        };
        do {
            Enum escolha = this.tela.showMenu();
            if (escolha instanceof Figuras) {
                int teclaPressionada = (Integer.parseInt(((Figuras) escolha).getTecla()));
                listaSubMenus[teclaPressionada - 1].startSubMenu();
            } else {
                switch ((Avulsas) escolha) {
                    case DESENHAR -> new Paint().desenhar(this.repository.getListaFiguras());
                    case LISTAR -> this.listAll();
                    case SAIR -> System.exit(0);
                    case SALVAR -> {
                        try {
                            this.repository.persist(Local.ARQUIVO);
                        } catch (IOException | ClassNotFoundException | SQLException ex2) {
                            this.tela.printLine("Não foi possivel salvar os dados");    //vou mexer nisso aqui ainda
                        }
                    }
                    case RECARREGAR -> {
                        try {
                            this.repository.load(Local.ARQUIVO);
                        } catch (IOException | ClassNotFoundException ex2) {
                            this.tela.printLine("Não foi possivel Carregar os Dados");  //vou mexer nisso aqui ainda
                        }
                    }

                }
            }
        } while (true);
    }
    public void listAll() {

    }
}
