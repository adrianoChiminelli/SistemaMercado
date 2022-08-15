package view;

import controller.ClienteController;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import utils.UtilCPF;

public class FormCliente extends javax.swing.JPanel {

    public FormCliente() {
        initComponents();
        atualizaTabela();
    }

    private void atualizaTabela() {
        ClienteController controller = new ClienteController();
        tbClientes.setModel(controller.montarTabela(tbClientes));
    }

    private void ativaCadastro(boolean habilita) {
        campoNomeCli.setEditable(habilita);
        campoCPF.setEditable(habilita);
        campoEmail.setEditable(habilita);
        campoTel.setEditable(habilita);

        btnSalvar.setVisible(habilita);
        btnCancelar.setVisible(habilita);

        btnNovo.setEnabled(!habilita);
        btnAlterar.setEnabled(!habilita);
        btnExcluir.setEnabled(!habilita);
    }

    private void limpaCampos() {
        campoID.setText("");
        campoNomeCli.setText("");
        campoCPF.setText("");
        campoEmail.setText("");
        campoTel.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        btnPesq = new javax.swing.JToggleButton();
        btnSalvar = new javax.swing.JToggleButton();
        campoID = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JToggleButton();
        campoNomeCli = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        campoCPF = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        campoTel = new javax.swing.JTextField();
        lbCPF = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        btnNovo = new javax.swing.JToggleButton();
        lbTel = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JToggleButton();
        btnExcluir = new javax.swing.JToggleButton();
        btnLimpar = new javax.swing.JToggleButton();

        setMinimumSize(new java.awt.Dimension(1280, 678));
        setName("Clientes"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Cliente", "CPF", "E-mail", "Tel."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.getColumnModel().getColumn(0).setMinWidth(35);
        tbClientes.getColumnModel().getColumn(0).setMaxWidth(35);
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 25, 753, 580));

        btnPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Pesquisar.png"))); // NOI18N
        btnPesq.setText("Pesquisar");
        btnPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqActionPerformed(evt);
            }
        });
        add(btnPesq, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 623, 148, 36));

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
        add(campoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 39, 81, 30));

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

        campoNomeCli.setEditable(false);
        add(campoNomeCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 87, 373, 30));

        lbID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbID.setText("ID");
        add(lbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 46, -1, -1));

        campoCPF.setEditable(false);
        campoCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCPFFocusLost(evt);
            }
        });
        add(campoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 135, 234, 30));

        campoEmail.setEditable(false);
        add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 183, 373, 30));

        lbNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNome.setText("Nome");
        add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 94, -1, -1));

        campoTel.setEditable(false);
        add(campoTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 231, 234, 30));

        lbCPF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCPF.setText("CPF");
        add(lbCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 142, -1, -1));

        lbEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEmail.setText("E-mail");
        add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 190, -1, -1));

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

        lbTel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbTel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTel.setText("Tel.");
        add(lbTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 238, -1, -1));

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
        add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 231, 40, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        btnSalvar.setText("Salvar");
        limpaCampos();
        ativaCadastro(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if ("".equals(campoID.getText())) {
            JOptionPane.showMessageDialog(null, "Selecione um registro para Alterar", "Erro", 0);
            return;
        }

        btnSalvar.setText("Alterar");
        ativaCadastro(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ClienteController controller = new ClienteController();

        try {
            int id = Integer.parseInt(campoID.getText());
            String nome = campoNomeCli.getText();

            boolean sucesso = controller.excluiCliente(id, nome);
            if (sucesso) {
                JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!", "Concluido", 1);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Selecione um registro para Excluir", "Erro", 0);
        }
        atualizaTabela();
        limpaCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ClienteController controller = new ClienteController();
        boolean sucesso = false;

        try {
            String nomeCli = campoNomeCli.getText();
            String cpf = campoCPF.getText();
            String email = campoEmail.getText();
            String tel = campoTel.getText();

            if ("Salvar".equals(btnSalvar.getText())) {
                sucesso = controller.salvaCliente(nomeCli, cpf, email, tel);
            } else {
                int id = Integer.parseInt(campoID.getText());
                sucesso = controller.alteraCliente(id, nomeCli, cpf, email, tel);
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

    private void campoCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCPFFocusLost
        String cpf = campoCPF.getText();
        campoCPF.setText(new UtilCPF().formatarCPF(cpf));
    }//GEN-LAST:event_campoCPFFocusLost

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        if (!btnSalvar.isVisible()) {
            int linha = tbClientes.getSelectedRow();

            campoID.setText(tbClientes.getValueAt(linha, 0).toString());
            campoNomeCli.setText(tbClientes.getValueAt(linha, 1).toString());
            campoCPF.setText(tbClientes.getValueAt(linha, 2).toString());
            campoEmail.setText(tbClientes.getValueAt(linha, 3).toString());
            campoTel.setText(tbClientes.getValueAt(linha, 4).toString());
        }

    }//GEN-LAST:event_tbClientesMouseClicked

    private void btnPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqActionPerformed
        TelaPesquisaCliente tela = new TelaPesquisaCliente(new JFrame(), true);
        tela.setVisible(true);
        if (TelaPesquisaCliente.cliente != null) {
            for (int linha = 0; linha < tbClientes.getRowCount(); linha++) {
                int id = (int) tbClientes.getValueAt(linha, 0);
                if (TelaPesquisaCliente.cliente.getIdCliente()== id) {
                    tbClientes.setRowSelectionInterval(linha, linha);
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
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoNomeCli;
    private javax.swing.JTextField campoTel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTel;
    private javax.swing.JTable tbClientes;
    // End of variables declaration//GEN-END:variables
}
