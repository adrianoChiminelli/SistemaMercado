package view;

import controller.ProdutoController;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormProduto extends javax.swing.JPanel {

    public FormProduto() {
        initComponents();
        atualizaTabela();
    }

    private void atualizaTabela() {
        ProdutoController controller = new ProdutoController();
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
        lbValor = new javax.swing.JLabel();
        btnNovo = new javax.swing.JToggleButton();
        btnAlterar = new javax.swing.JToggleButton();
        btnExcluir = new javax.swing.JToggleButton();
        btnLimpar = new javax.swing.JToggleButton();

        setMinimumSize(new java.awt.Dimension(1280, 678));
        setName("Produtos"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 19, 753, 592));

        btnPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Pesquisar.png"))); // NOI18N
        btnPesq.setText("Pesquisar");
        btnPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqActionPerformed(evt);
            }
        });
        add(btnPesq, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 623, 147, 36));

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
        add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 342, 136, -1));

        campoID.setEditable(false);
        add(campoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 33, 81, 30));

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
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 342, 134, -1));

        campoDescricao.setEditable(false);
        add(campoDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 81, 373, 30));

        lbID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbID.setText("ID");
        add(lbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 40, -1, -1));

        jsQuant.setEnabled(false);
        add(jsQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 129, 94, 30));

        campoValor.setEditable(false);
        add(campoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 177, 112, 30));

        lbDescricao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbDescricao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDescricao.setText("Descricao");
        add(lbDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 88, -1, -1));

        lbQuant.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbQuant.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbQuant.setText("Quant.");
        add(lbQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 136, -1, -1));

        lbValor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbValor.setText("Valor");
        add(lbValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 184, -1, -1));

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconAdicionar.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setHideActionText(true);
        btnNovo.setIconTextGap(10);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 623, 119, -1));

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Lista.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setIconTextGap(10);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 623, 119, -1));

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Lixo.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setIconTextGap(10);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 623, 119, -1));

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Limpar.png"))); // NOI18N
        btnLimpar.setHideActionText(true);
        btnLimpar.setIconTextGap(10);
        btnCancelar.setVisible(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 162, 40, -1));
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
        ProdutoController controller = new ProdutoController();
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
        ProdutoController controller = new ProdutoController();
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

    private void btnPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqActionPerformed
        TelaPesquisaProduto tela = new TelaPesquisaProduto(new JFrame(), true);
        tela.setVisible(true);
        if (TelaPesquisaProduto.produto != null) {
            for (int linha = 0; linha < tbProdutos.getRowCount(); linha++) {
                int id = (int) tbProdutos.getValueAt(linha, 0);
                if (TelaPesquisaProduto.produto.getIdProduto() == id) {
                    tbProdutos.setRowSelectionInterval(linha, linha);
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnPesqActionPerformed


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
