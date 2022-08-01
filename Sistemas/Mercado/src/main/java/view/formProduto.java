package view;

import controller.FormProdutoController;
import javax.swing.JOptionPane;

public class FormProduto extends javax.swing.JPanel {

    public FormProduto() {
        initComponents();
        atualizaTabela();
    }

    private void atualizaTabela() {
        FormProdutoController controller = new FormProdutoController();
        tbProdutos.setModel(controller.montarTabela(tbProdutos));
    }

    private void ativaCadastro(boolean habilita) {
        campoDescricao.setEditable(habilita);
        jsQuant.setEnabled(habilita);
        campoValor.setEditable(habilita);

        btnSalvar.setVisible(habilita);
        btnCancelar.setVisible(habilita);

        btnNovo.setEnabled(!habilita);
        btnAlterar.setEnabled(!habilita);
        btnExcluir.setEnabled(!habilita);
    }

    private void limpaCampos() {
        campoID.setText("");
        campoDescricao.setText("");
        jsQuant.setValue(0);
        campoValor.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        btnPesq = new javax.swing.JToggleButton();
        btnSalvar = new javax.swing.JToggleButton();
        campoID = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JToggleButton();
        campoDescricao = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        jsQuant = new javax.swing.JSpinner();
        campoValor = new javax.swing.JTextField();
        lbDescricao = new javax.swing.JLabel();
        lbQuant = new javax.swing.JLabel();
        campoPesq = new javax.swing.JTextField();
        lbValor = new javax.swing.JLabel();
        btnNovo = new javax.swing.JToggleButton();
        btnAlterar = new javax.swing.JToggleButton();
        btnExcluir = new javax.swing.JToggleButton();
        btnLimpar = new javax.swing.JToggleButton();

        setMinimumSize(new java.awt.Dimension(1280, 678));
        setName("Produtos"); // NOI18N

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição Produto", "Quantidade Estoque", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProdutos.getColumnModel().getColumn(0).setMinWidth(35);
        tbProdutos.getColumnModel().getColumn(0).setMaxWidth(35);
        tbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProdutos);

        btnPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Pesquisar.png"))); // NOI18N

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon OK.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setHideActionText(true);
        btnSalvar.setIconTextGap(10);
        btnSalvar.setVisible(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        campoID.setEditable(false);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHideActionText(true);
        btnCancelar.setIconTextGap(10);
        btnCancelar.setVisible(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        campoDescricao.setEditable(false);

        lbID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbID.setText("ID");

        jsQuant.setEnabled(false);

        campoValor.setEditable(false);

        lbDescricao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbDescricao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDescricao.setText("Descricao");

        lbQuant.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbQuant.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbQuant.setText("Quant.");

        campoPesq.setText("Pesquisar");

        lbValor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbValor.setText("Valor");

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconAdicionar.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setHideActionText(true);
        btnNovo.setIconTextGap(10);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Lista.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setIconTextGap(10);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Lixo.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setIconTextGap(10);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Limpar.png"))); // NOI18N
        btnLimpar.setHideActionText(true);
        btnLimpar.setIconTextGap(10);
        btnCancelar.setVisible(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbID)
                            .addComponent(lbDescricao)
                            .addComponent(lbQuant))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lbValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(campoPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDescricao))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbQuant)
                            .addComponent(jsQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbValor)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnLimpar)))
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btnCancelar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovo)
                        .addComponent(btnAlterar)
                        .addComponent(btnExcluir)))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        btnSalvar.setText("Salvar");
        limpaCampos();
        ativaCadastro(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        btnSalvar.setText("Alterar");
        ativaCadastro(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        FormProdutoController controller = new FormProdutoController();
        int id = Integer.parseInt(campoID.getText());
        String descricao = campoDescricao.getText();

        boolean sucesso = controller.excluiProduto(id, descricao);
        if (sucesso) {
            JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!", "Concluido", 1);
        }
        atualizaTabela();
        limpaCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        FormProdutoController controller = new FormProdutoController();
        boolean sucesso = false;

        try {
            String descricao = campoDescricao.getText();
            int quant = (Integer) jsQuant.getValue();
            Double valor = Double.parseDouble(campoValor.getText());
            if ("Salvar".equals(btnSalvar.getText())) {
                sucesso = controller.salvaProduto(descricao, quant, valor);
            } else {
                int id = Integer.parseInt(campoID.getText());
                sucesso = controller.alteraProduto(id, descricao, quant, valor);
            }

            if (sucesso) {
                atualizaTabela();
                limpaCampos();
                ativaCadastro(false);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Preencha as informações Corretamente!", "Erro ao cadastrar", 0);
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        ativaCadastro(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutosMouseClicked
        if (!btnSalvar.isVisible()) {
            int linha = tbProdutos.getSelectedRow();

            campoID.setText(tbProdutos.getValueAt(linha, 0).toString());
            campoDescricao.setText(tbProdutos.getValueAt(linha, 1).toString());
            jsQuant.setValue(tbProdutos.getValueAt(linha, 2));
            campoValor.setText(tbProdutos.getValueAt(linha, 3).toString());
        }

    }//GEN-LAST:event_tbProdutosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAlterar;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnExcluir;
    private javax.swing.JToggleButton btnLimpar;
    private javax.swing.JToggleButton btnNovo;
    private javax.swing.JToggleButton btnPesq;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoPesq;
    private javax.swing.JTextField campoValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jsQuant;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbQuant;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTable tbProdutos;
    // End of variables declaration//GEN-END:variables
}
