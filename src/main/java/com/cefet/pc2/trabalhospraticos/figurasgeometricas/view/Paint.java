package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.FigurasGeometricas;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.Quadrilateros;

import javax.swing.*;
import java.awt.*;
import java.util.List;


public class Paint {

    private void init(List<FigurasGeometricas> lista) {
        JFrame f = new JFrame("Teste de Desenhos");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.add(new PainelDeDesenho(lista));
        f.setSize(500, 500);
        f.setVisible(true);
    }

    public void desenhar(List<FigurasGeometricas> figs) {
        SwingUtilities.invokeLater(() -> init(figs));
    }

    class PainelDeDesenho extends JPanel {

        List<FigurasGeometricas> figs;

        public PainelDeDesenho(List<FigurasGeometricas> lista) {
            this.figs = lista;
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int pontoInicialLado = 30;
            int pontoInicialTopo = 20;
            for (FigurasGeometricas fig : this.figs) {
                if (fig instanceof Quadrilateros) {
                    Quadrilateros figura = (Quadrilateros) fig;
                    int linhaEsquerda = pontoInicialLado + figura.getBase();
                    int linhaTopo = pontoInicialLado + figura.getBase();
                    int linhaBaixo = pontoInicialTopo + figura.getAltura();
                    int linhaDireita = pontoInicialLado + figura.getBase();

                    g.drawLine(pontoInicialLado, pontoInicialTopo, pontoInicialLado, linhaEsquerda);        //Linha Esquerda
                    g.drawLine(pontoInicialLado, pontoInicialTopo, linhaTopo,pontoInicialTopo);             //Linha Topo
                    g.drawLine(pontoInicialLado, linhaBaixo, linhaTopo, linhaBaixo);                        //Linha Baixo
                    g.drawLine(linhaDireita, pontoInicialTopo, linhaDireita, linhaEsquerda);                //linha

                    pontoInicialLado += ((Quadrilateros) fig).getBase() + 30;
                }
            }


            /**
             *
             x1 – the first point's x coordinate.               x = ->
             y1 – the first point's y coordinate.               y = ↑
             x2 – the second point's x coordinate.
             y2 – the second point's y coordinate
             */
        }
    }

    public void backup(Graphics g) {
        // Draw Text
        //g.drawString("Meu Primeiro paint!", 10, 20);
        g.drawLine(30, 20, 100, 20);
        g.drawLine(100, 20, 100, 100);
        //g.drawRect(30,20,100,100);
        //g.drawRect(50, 50, 50  , 60);
        //g.drawRect(140,20,100,100);
        //g.drawArc(140,20,100,100,180,180);
        g.drawOval(140, 20, 100, 100);
    }
}
