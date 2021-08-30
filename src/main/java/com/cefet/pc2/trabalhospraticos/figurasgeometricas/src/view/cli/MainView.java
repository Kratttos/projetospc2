package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Avulsas;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Figuras;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.Opcoes;

public class MainView extends BasicView {

    @Override
    public Enum showMenu(String nomeMenu) {
        final Figuras[] figuras = Figuras.values();
        final Avulsas[] avulsas = Avulsas.values();
        final Opcoes[] opcoes = new Opcoes[figuras.length + avulsas.length];
        int j = 0;
        for (int i = 0; i < figuras.length; i++, j++) {
            opcoes[j] = figuras[i];
        }
        for (int i = 0; i < avulsas.length; i++, j++) {
            opcoes[j] = avulsas[i];
        }
        this.printLine("-----------Menu Inicial--------------");
        this.printLine("Digite uma opção:");
        for (int i = 0; i < figuras.length; i++) {
            this.printLine(figuras[i].getTecla() + " - " + figuras[i].getText());
        }
        this.printLine(".....");
        for (int i = 0; i < avulsas.length; i++) {
            this.printLine(avulsas[i].getTecla() + " - " + avulsas[i].getText());
        }
        do {
            String opcao = this.askString();
            for (Opcoes item : opcoes) {
                if (item.getTecla().equalsIgnoreCase(opcao)) {
                    return (Enum) item;
                }
            }
            this.printLine("Por Favor Digite uma opção valida");
        } while (true);
    }
}
