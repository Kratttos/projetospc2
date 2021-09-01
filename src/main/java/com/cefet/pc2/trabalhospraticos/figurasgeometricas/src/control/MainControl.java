package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Avulsas;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Figuras;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Local;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.repository.RenderizaveisRepository;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.View;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli.*;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.MainGUIView;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.Paint;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui_melhorada.MenuPrincipalPane;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class MainControl {

    private View tela;
    private RenderizaveisRepository repository = new RenderizaveisRepository();

    public MainControl(View tela) {
        this.tela = tela;
    }

    public void start() {
        AbstractSubMenuController[] listaSubMenus = new AbstractSubMenuController[]{
            new TextoController(new TextoView()),
            new RetaController(new RetaView()),
            new RetanguloController(new RetanguloView()),
            new QuadradoController(new QuadradoView()),
            new CirculoController(new CirculoView()),
            new TrianguloController(new TrianguloView()),
            new TrapezioController(new TrapezioView())
        };
        do {
            Enum escolha = this.tela.showMenu("Menu Principal");
            if (escolha instanceof Figuras) {
                int teclaPressionada = (Integer.parseInt(((Figuras) escolha).getTecla()));
                listaSubMenus[teclaPressionada - 1].startSubMenu();
            } else {
                switch ((Avulsas) escolha) {
                    case DESENHAR ->
                        new Paint().desenhar(this.repository.getListaFiguras());
                    case LISTAR ->
                        this.listAll();
                    case SAIR ->
                        System.exit(0);
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
        List<Renderizavel> lista = this.repository.getListaFiguras();
        if (lista.size() > 0) {
            for (Renderizavel item : lista) {
                this.tela.printLine(item + "");
            }
        } else {
            this.tela.printLine("Lista Vazia");
        }
        this.tela.printLine("Pressione qualquer tecla para voltar ao Menu Principal");
        this.tela.askString();
    }
}
