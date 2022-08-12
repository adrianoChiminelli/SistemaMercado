package view;

import controller.FormUsuarioController;
import javax.swing.JOptionPane;
import utils.Cripto;

public class FormUsuario extends javax.swing.JPanel {

    public FormUsuario() {
        initComponents();
        atualizaTabela();
    }

    private void atualizaTabela() {
        FormUsuarioController controller = new FormUsuarioController();
        tbUsuarios.setModel(controller.montarTabela(tbUsuarios));
    }

    private void ativaCadastro(boolean habilita) {
        campoUsuario.setEditable(habilita);
        campoSenha.setEditable(habilita);
        campoConfSenha.setEditable(habilita);
        cbNvAcesso.setEnabled(habilita);

        btnSalvar.setVisible(habilita);
        btnCancelar.setVisible(habilita);

        btnNovo.setEnabled(!habilita);
        btnAlterar.setEnabled(!habilita);
        btnExcluir.setEnabled(!habilita);
    }

    private void limpaCampos() {
        campoID.setText("");
        campoUsuario.setText("");
        campoSenha.setText("");
        campoConfSenha.setText("");
        cbNvAcesso.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        btnPesq = new javax.swing.JToggleButton();
        btnSalvar = new javax.swing.JToggleButton();
        campoID = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JToggleButton();
        campoUsuario = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        campoPesq = new javax.swing.JTextField();
        lbConfSenha = new javax.swing.JLabel();
        btnNovo = new javax.swing.JToggleButton();
        lbNvAcesso = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JToggleButton();
        btnExcluir = new javax.swing.JToggleButton();
        btnLimpar = new javax.swing.JToggleButton();
        cbNvAcesso = new javax.swing.JComboBox<>();
        campoSenha = new javax.swing.JPasswordField();
        campoConfSenha = new javax.swing.JPasswordField();

        setMinimumSize(new java.awt.Dimension(1280, 678));
        setName("Usuarios"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Nivel de Acesso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUsuarios.getColumnModel().getColumn(0).setMinWidth(35);
        tbUsuarios.getColumnModel().getColumn(0).setMaxWidth(35);
        tbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsuarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 25, 753, 592));

        btnPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Pesquisar.png"))); // NOI18N
        add(btnPesq, new org.netbeans.lib.awtextra.AbsoluteConstraints(1221, 630, -1, 29));

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
        add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 136, -1));

        campoID.setEditable(false);
        add(campoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 39, 81, 30));

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
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 134, -1));

        campoUsuario.setEditable(false);
        add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 87, 305, 30));

        lbID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbID.setText("ID");
        add(lbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 46, -1, -1));

        lbUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUsuario.setText("Usuario");
        add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 94, -1, -1));

        lbSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSenha.setText("Senha");
        add(lbSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 140, -1, -1));

        campoPesq.setText("Pesquisar");
        add(campoPesq, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 630, 265, 29));

        lbConfSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbConfSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbConfSenha.setText("Conf. Senha");
        add(lbConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 187, -1, -1));

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

        lbNvAcesso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNvAcesso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNvAcesso.setText("Nv. Acesso");
        add(lbNvAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

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
        add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 40, -1));

        cbNvAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inativo", "Padrão", "Admin" }));
        cbNvAcesso.setEnabled(false);
        add(cbNvAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 143, 34));

        campoSenha.setEditable(false);
        campoSenha.setPreferredSize(new java.awt.Dimension(90, 30));
        add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 135, 305, 30));

        campoConfSenha.setEditable(false);
        campoConfSenha.setPreferredSize(new java.awt.Dimension(90, 30));
        add(campoConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 305, -1));
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
        FormUsuarioController controller = new FormUsuarioController();

        try {
            int id = Integer.parseInt(campoID.getText());
            String nome = campoUsuario.getText();

            boolean sucesso = controller.excluiUsuario(id, nome);
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
        FormUsuarioController controller = new FormUsuarioController();
        boolean sucesso = false;

        try {
            String usuario = campoUsuario.getText();
            String senha = Cripto.getSenha(campoSenha.getPassword());
            String confSenha = Cripto.getSenha(campoConfSenha.getPassword());
            String nvAcesso = cbNvAcesso.getSelectedItem().toString();

            if ("Salvar".equals(btnSalvar.getText())) {
                sucesso = controller.salvaUsuario(usuario, senha, confSenha, nvAcesso);
            } else {
                int id = Integer.parseInt(campoID.getText());
                sucesso = controller.alteraUsuario(id, usuario, senha, confSenha, nvAcesso);
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

    private void tbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuariosMouseClicked
        if (!btnSalvar.isVisible()) {
            FormUsuarioController controller = new FormUsuarioController();

            int linha = tbUsuarios.getSelectedRow();

            campoID.setText(tbUsuarios.getValueAt(linha, 0).toString());
            campoUsuario.setText(tbUsuarios.getValueAt(linha, 1).toString());
            int indice = controller.converteNvAcesso(tbUsuarios.getValueAt(linha, 2).toString());
            cbNvAcesso.setSelectedIndex(indice);
        }

    }//GEN-LAST:event_tbUsuariosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAlterar;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnExcluir;
    private javax.swing.JToggleButton btnLimpar;
    private javax.swing.JToggleButton btnNovo;
    private javax.swing.JToggleButton btnPesq;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JPasswordField campoConfSenha;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoPesq;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JComboBox<String> cbNvAcesso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbConfSenha;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbNvAcesso;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JTable tbUsuarios;
    // End of variables declaration//GEN-END:variables
}
