package locadoradeveiculos;

public class CadastrodeVeiculo extends javax.swing.JFrame {

    public CadastrodeVeiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jLabelMarca = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabelModelo = new javax.swing.JLabel();
        jTextFieldCor = new javax.swing.JTextField();
        jLabelCor = new javax.swing.JLabel();
        jTextFieldChassi = new javax.swing.JTextField();
        jLabelChassi = new javax.swing.JLabel();
        jTextFieldAno = new javax.swing.JTextField();
        jLabelAno = new javax.swing.JLabel();
        jTextFieldPrecoCusto = new javax.swing.JTextField();
        jLabelPrecoCusto = new javax.swing.JLabel();
        jTextFieldValorVenda = new javax.swing.JTextField();
        jLabelValorVenda = new javax.swing.JLabel();
        jTextFieldDtCadastro = new javax.swing.JTextField();
        jLabelDtCadastro = new javax.swing.JLabel();
        jTextFieldKm = new javax.swing.JTextField();
        jLabelKm = new javax.swing.JLabel();
        jTextFieldTipoCarga = new javax.swing.JTextField();
        jLabelTipoCarga = new javax.swing.JLabel();
        jButtonGravar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo.setText("Cadastro de Veículos");

        jLabelID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(0, 0, 0));
        jLabelID.setText("ID");

        jTextFieldID.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldID.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldMarca.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarca.setForeground(new java.awt.Color(0, 0, 0));

        jLabelMarca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelMarca.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMarca.setText("Marca");

        jTextFieldModelo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldModelo.setForeground(new java.awt.Color(0, 0, 0));

        jLabelModelo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelModelo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelModelo.setText("Modelo");

        jTextFieldCor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCor.setForeground(new java.awt.Color(0, 0, 0));

        jLabelCor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCor.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCor.setText("Cor");

        jTextFieldChassi.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldChassi.setForeground(new java.awt.Color(0, 0, 0));

        jLabelChassi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelChassi.setForeground(new java.awt.Color(0, 0, 0));
        jLabelChassi.setText("Chassi");

        jTextFieldAno.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAno.setForeground(new java.awt.Color(0, 0, 0));

        jLabelAno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelAno.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAno.setText("Ano");

        jTextFieldPrecoCusto.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPrecoCusto.setForeground(new java.awt.Color(0, 0, 0));

        jLabelPrecoCusto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPrecoCusto.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPrecoCusto.setText("Preço Custo");

        jTextFieldValorVenda.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValorVenda.setForeground(new java.awt.Color(0, 0, 0));

        jLabelValorVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelValorVenda.setForeground(new java.awt.Color(0, 0, 0));
        jLabelValorVenda.setText("Valor Venda");

        jTextFieldDtCadastro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDtCadastro.setForeground(new java.awt.Color(0, 0, 0));

        jLabelDtCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelDtCadastro.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDtCadastro.setText("Data de Cadastro");

        jTextFieldKm.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldKm.setForeground(new java.awt.Color(0, 0, 0));

        jLabelKm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelKm.setForeground(new java.awt.Color(0, 0, 0));
        jLabelKm.setText("Km");

        jTextFieldTipoCarga.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTipoCarga.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTipoCarga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTipoCarga.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTipoCarga.setText("Tipo de Carga");

        jButtonGravar.setBackground(new java.awt.Color(0, 153, 51));
        jButtonGravar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGravar.setText("Gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jButtonLimpar.setBackground(new java.awt.Color(0, 153, 51));
        jButtonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonSair.setBackground(new java.awt.Color(0, 153, 51));
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMarca)
                            .addComponent(jLabelID)
                            .addComponent(jLabelModelo)
                            .addComponent(jLabelCor)
                            .addComponent(jLabelChassi)
                            .addComponent(jLabelAno))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldMarca)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldAno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                        .addComponent(jTextFieldCor, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldChassi, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addComponent(jTextFieldID))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelValorVenda)
                                    .addComponent(jLabelPrecoCusto))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPrecoCusto, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(jTextFieldValorVenda)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSair))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDtCadastro)
                                    .addComponent(jLabelKm)
                                    .addComponent(jLabelTipoCarga))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldTipoCarga, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(jTextFieldDtCadastro)
                                    .addComponent(jTextFieldKm)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButtonGravar)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(188, 188, 188))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrecoCusto)
                            .addComponent(jTextFieldPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelValorVenda)
                            .addComponent(jTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDtCadastro)
                            .addComponent(jTextFieldDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelKm)
                            .addComponent(jTextFieldKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTipoCarga)
                            .addComponent(jTextFieldTipoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelAno))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMarca))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelModelo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCor))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelChassi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGravar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonSair))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldID.setText("");
        jTextFieldMarca.setText("");
        jTextFieldModelo.setText("");
        jTextFieldCor.setText("");
        jTextFieldChassi.setText("");
        jTextFieldAno.setText("");
        jTextFieldPrecoCusto.setText("");
        jTextFieldValorVenda.setText("");
        jTextFieldDtCadastro.setText("");
        jTextFieldKm.setText("");
        jTextFieldTipoCarga.setText("");
        jTextFieldID.requestFocus();
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGravarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrodeVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrodeVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrodeVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrodeVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrodeVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelAno;
    private javax.swing.JLabel jLabelChassi;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelDtCadastro;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelKm;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelPrecoCusto;
    private javax.swing.JLabel jLabelTipoCarga;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelValorVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldChassi;
    private javax.swing.JTextField jTextFieldCor;
    private javax.swing.JTextField jTextFieldDtCadastro;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldKm;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldPrecoCusto;
    private javax.swing.JTextField jTextFieldTipoCarga;
    private javax.swing.JTextField jTextFieldValorVenda;
    // End of variables declaration//GEN-END:variables
}
