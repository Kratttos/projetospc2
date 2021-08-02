package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.Circulo;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.FigurasGeometricas;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.model.Quadrilateros;

import javax.swing.*;
import java.awt.*;
import java.util.List;


public class Paint {

    private void init(List<FigurasGeometricas> lista) {
        if (lista.size()== 0) {
            JOptionPane.showMessageDialog(null, "Ainda não tem nada para Desenhar");
        } else {
            JFrame f = new JFrame("CefetPaint");
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.add(new PainelDeDesenho(lista));
            f.setSize(500, 500);
            f.setVisible(true);
        }
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
            final int TAMANHO_TELA = (this.getSize().width) - 30;
            int posicaoInicialLado = 30;
            int posicaoInicialTopo = 20;
            int maiorHeight = 0;
            for (FigurasGeometricas fig : this.figs) {
                if (fig instanceof Quadrilateros) {
                    Quadrilateros figura = (Quadrilateros) fig;

                    int height = figura.getAltura();
                    int width = figura.getBase();

                    if (maiorHeight < height) {
                        maiorHeight = height;
                    }

                    if (posicaoInicialLado + width >= TAMANHO_TELA) {
                        posicaoInicialTopo += (maiorHeight + 30);
                        posicaoInicialLado = 30;
                    }
                    g.drawRect(posicaoInicialLado, posicaoInicialTopo, width, height);
                    posicaoInicialLado += width + 30;
                }
                if (fig instanceof Circulo) {
                    Circulo circ = (Circulo) fig;

                    int height = circ.getRaio() * 2;

                    if (maiorHeight < height) {
                        maiorHeight = height;
                    }

                    if (posicaoInicialLado + height >= TAMANHO_TELA) {
                        posicaoInicialTopo += (maiorHeight - 30);
                        posicaoInicialLado = 30;
                    }

                    g.drawOval(posicaoInicialLado, posicaoInicialTopo, circ.getRaio(), circ.getRaio());
                    posicaoInicialLado += circ.getRaio() + 30;
                }

            }
        }
    }
}
