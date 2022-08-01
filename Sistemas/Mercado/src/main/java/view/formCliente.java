package view;

import controller.formClienteController;
import javax.swing.JOptionPane;
import utils.UtilCPF;

public class formCliente extends javax.swing.JPanel {

    public formCliente() {
        initComponents();
        atualizaTabela();
    }

    private void atualizaTabela() {
        formClienteController controller = new formClienteController();
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
        campoPesq = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        btnNovo = new javax.swing.JToggleButton();
        lbTel = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JToggleButton();
        btnExcluir = new javax.swing.JToggleButton();
        btnLimpar = new javax.swing.JToggleButton();

        setMinimumSize(new java.awt.Dimension(1280, 678));
        setName("Clientes"); // NOI18N

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

        campoNomeCli.setEditable(false);

        lbID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbID.setText("ID");

        campoCPF.setEditable(false);
        campoCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCPFFocusLost(evt);
            }
        });

        campoEmail.setEditable(false);

        lbNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNome.setText("Nome");

        campoTel.setEditable(false);

        lbCPF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCPF.setText("CPF");

        campoPesq.setText("Pesquisar");

        lbEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEmail.setText("E-mail");

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconAdicionar.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setHideActionText(true);
        btnNovo.setIconTextGap(10);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        lbTel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbTel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTel.setText("Tel.");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(lbNome)
                            .addComponent(lbCPF)
                            .addComponent(lbEmail)
                            .addComponent(lbTel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(campoTel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
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
                            .addComponent(campoNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCPF))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEmail))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbTel))
                            .addComponent(btnLimpar))
                        .addGap(75, 75, 75)
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
        formClienteController controller = new formClienteController();
        int id = Integer.parseInt(campoID.getText());
        String nome = campoNomeCli.getText();

        boolean sucesso = controller.excluiCliente(id, nome);
        if (sucesso) {
            JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!", "Concluido", 4);
        }
        atualizaTabela();
        limpaCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        formClienteController controller = new formClienteController();
        boolean sucesso = false;

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
    private javax.swing.JTextField campoPesq;
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
