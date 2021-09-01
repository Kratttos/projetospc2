package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.normal;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.*;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.cli.MainView;

import javax.swing.*;
import java.awt.*;
import java.util.List;


public class Paint {

    private void init(List<Renderizavel> lista) {
        if (lista.size() == 0) {
            new MainView().printLine("Vetor Vazio");
            //JOptionPane.showMessageDialog(null, "Ainda não tem nada para Desenhar");
        } else {
            JFrame f = new JFrame("CefetPaint");
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.add(new PainelDeDesenho(lista));
            f.setSize(500, 500);
            f.setVisible(true);
        }
    }

    public void desenhar(List<Renderizavel> figs) {
        SwingUtilities.invokeLater(() -> init(figs));
    }

    class PainelDeDesenho extends JPanel {

        List<Renderizavel> figs;

        public PainelDeDesenho(List<Renderizavel> lista) {
            this.figs = lista;
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            final int TAMANHO_TELA = (this.getSize().width) - 30;
            final int INCREMENTO_PADRAO = 30;
            int posicaoInicialLado = 30;
            int posicaoInicialTopo = 20;

            int maiorHeight = 0;
            for (Renderizavel fig : this.figs) {
                if (fig instanceof Quadrilateros) {
                    if (fig instanceof Trapezio) {
                        Trapezio trapezio = (Trapezio) fig;
                        System.out.println("ainda vou fazer");
                    } else {
                        Quadrilateros figura = (Quadrilateros) fig;

                        int height = figura.getAltura();
                        int width = figura.getBase();

                        if (maiorHeight < height) {
                            maiorHeight = height;
                        }

                        if (posicaoInicialLado + width >= TAMANHO_TELA) {
                            posicaoInicialTopo += (maiorHeight + INCREMENTO_PADRAO);
                            posicaoInicialLado = INCREMENTO_PADRAO;
                        }
                        g.drawRect(posicaoInicialLado, posicaoInicialTopo, width, height);
                        posicaoInicialLado += width + INCREMENTO_PADRAO;
                    }
                }
                if (fig instanceof Texto) {
                    Texto texto = (Texto) fig;
                    int tamanhoTexto = texto.getText().length();

                    g.drawString(texto.getText(), posicaoInicialLado, (posicaoInicialTopo * 2));

                    posicaoInicialLado += (tamanhoTexto * 7) + INCREMENTO_PADRAO;
                }
                if (fig instanceof Triangulo) {
                    Triangulo triangulo = (Triangulo) fig;
                }

                if (fig instanceof Reta) {
                    Reta reta = (Reta) fig;

                    int width = reta.getTamanho();

                    g.drawLine(posicaoInicialLado, posicaoInicialTopo, (posicaoInicialLado + reta.getTamanho()), posicaoInicialTopo);

                    if (posicaoInicialLado + width >= TAMANHO_TELA) {
                        posicaoInicialTopo += (maiorHeight - INCREMENTO_PADRAO);
                        posicaoInicialLado = INCREMENTO_PADRAO;
                    }

                }
                if (fig instanceof Circulo) {
                    Circulo circ = (Circulo) fig;

                    int height = circ.getRaio() * 2;

                    if (maiorHeight < height) {
                        maiorHeight = height;
                    }

                    if (posicaoInicialLado + height >= TAMANHO_TELA) {
                        posicaoInicialTopo += (maiorHeight - INCREMENTO_PADRAO);
                        posicaoInicialLado = INCREMENTO_PADRAO;
                    }

                    g.drawOval(posicaoInicialLado, posicaoInicialTopo, circ.getRaio(), circ.getRaio());
                    posicaoInicialLado += circ.getRaio() + INCREMENTO_PADRAO;
                }

            }
        }
    }
}
