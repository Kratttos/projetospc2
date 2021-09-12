/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.TipoInterface;

import javax.swing.*;

/**
 * @author Everton
 */
public class EscolhaInterface extends javax.swing.JDialog {

    private TipoInterface tipoSelecionado = null;
    private static final String NADA_SELECIONADO = "Você precisa selecionar alguma opção primeiro";

    /**
     * Creates new form EscolhaInterface
     */
    public EscolhaInterface() {
        initComponents();
        this.setModal(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Escolha de tipo de Interface");
    }

    public TipoInterface run() {
        this.setVisible(true);


        return this.tipoSelecionado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoInterface = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnEscolher = new javax.swing.JButton();
        radioCLI = new javax.swing.JRadioButton();
        radioGUI = new javax.swing.JRadioButton();
        radioGUI2 = new javax.swing.JRadioButton();
        btnDetalhes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Escolha um tipo de Interface para Iniciar o Paint");

        btnSair.setText("Sair do Programa");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnEscolher.setText("Escolher");
        btnEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolherActionPerformed(evt);
            }
        });

        tipoInterface.add(radioCLI);
        radioCLI.setText("CLI");
        radioCLI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCLIActionPerformed(evt);
            }
        });

        tipoInterface.add(radioGUI);
        radioGUI.setText("GUI");
        radioGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGUIActionPerformed(evt);
            }
        });

        tipoInterface.add(radioGUI2);
        radioGUI2.setText("GUI 2.0");
        radioGUI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGUI2ActionPerformed(evt);
            }
        });

        btnDetalhes.setText("Detalhes");
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(96, 96, 96)
                                                .addComponent(radioCLI, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(107, 107, 107)
                                                .addComponent(btnDetalhes)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(radioGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(130, 130, 130)
                                                .addComponent(radioGUI2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(64, 64, 64))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(513, Short.MAX_VALUE)
                                        .addComponent(btnEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(radioCLI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radioGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radioGUI2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDetalhes, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(14, 14, 14))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(295, Short.MAX_VALUE)
                                        .addComponent(btnEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void dispose() {
        this.tipoSelecionado = null;
        super.dispose();
    }

    private boolean checarSelecionado() {
        return radioCLI.isSelected() || radioGUI.isSelected() || radioGUI2.isSelected();
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscolherActionPerformed
        // TODO add your handling code here:
        if (this.checarSelecionado()) {
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this,NADA_SELECIONADO);
        }

    }//GEN-LAST:event_btnEscolherActionPerformed

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        // TODO add your handling code here:
        String mensagem = "";
        if (this.checarSelecionado()) {
            switch (tipoSelecionado) {
                case CLI -> mensagem = "Interface Padrão em texto";
                case GUI -> mensagem = "Interface grafica usando exatamente os mesmo controllers  \n\n (Possivelmente a mais instavel é propicia a bug das 3)";
                case GUI_2 -> mensagem = "Interface Grafica com mudanças nos controllers para tornar a aplicação mais voltada a eventos";
            }

        }else{
            mensagem = NADA_SELECIONADO;
        }

        JOptionPane.showMessageDialog(this, mensagem);

    }//GEN-LAST:event_btnDetalhesActionPerformed

    private void radioCLIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCLIActionPerformed
        // TODO add your handling code here:
        this.tipoSelecionado = TipoInterface.CLI;
    }//GEN-LAST:event_radioCLIActionPerformed

    private void radioGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGUIActionPerformed
        // TODO add your handling code here:
        this.tipoSelecionado = TipoInterface.GUI;
    }//GEN-LAST:event_radioGUIActionPerformed

    private void radioGUI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGUI2ActionPerformed
        // TODO add your handling code here:
        this.tipoSelecionado = TipoInterface.GUI_2;
    }//GEN-LAST:event_radioGUI2ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnEscolher;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton radioCLI;
    private javax.swing.JRadioButton radioGUI;
    private javax.swing.JRadioButton radioGUI2;
    private javax.swing.ButtonGroup tipoInterface;
    // End of variables declaration//GEN-END:variables
}
