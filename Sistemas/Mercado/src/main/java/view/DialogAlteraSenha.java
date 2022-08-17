package view;

import javax.swing.JOptionPane;
import model.Usuario;
import utils.Cripto;

public class DialogAlteraSenha extends javax.swing.JDialog {

    private String usuario;

    public DialogAlteraSenha(java.awt.Frame parent, boolean modal, String user) {
        super(parent, modal);
        this.usuario = user;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbNovaSenha = new javax.swing.JLabel();
        lbErro = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();
        campoSenha = new javax.swing.JPasswordField();
        campoConfSenha = new javax.swing.JPasswordField();
        lbConfirmar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Senha");
        setMaximumSize(new java.awt.Dimension(421, 318));
        setMinimumSize(new java.awt.Dimension(421, 318));
        setPreferredSize(new java.awt.Dimension(421, 318));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTitulo.setText("Digite uma nova Senha");
        getContentPane().add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        lbNovaSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNovaSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNovaSenha.setText("Nova Senha");
        getContentPane().add(lbNovaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lbErro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbErro.setForeground(new java.awt.Color(255, 0, 0));
        lbErro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lbErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon OK.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setHideActionText(true);
        btnConfirmar.setIconTextGap(10);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 136, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHideActionText(true);
        btnCancelar.setIconTextGap(10);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 134, -1));
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 266, 34));
        getContentPane().add(campoConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 266, 34));

        lbConfirmar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbConfirmar1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbConfirmar1.setText("Confirmar ");
        getContentPane().add(lbConfirmar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        setSize(new java.awt.Dimension(421, 318));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String senha = Cripto.getSenha(campoSenha.getPassword());
        String confSenha = Cripto.getSenha(campoConfSenha.getPassword());

        if (senha.equals(confSenha) && senha.length() > 0) {
            
            if (new Usuario().trocaSenha(usuario, senha)) {
                JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!", "Atenção", 1);
                this.dispose();
            } else {
                lbErro.setText("Algo deu errado, tente novamente!");
            }
        } else {
            lbErro.setText("As senhas não são iguais!");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnConfirmar;
    private javax.swing.JPasswordField campoConfSenha;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel lbConfirmar1;
    private javax.swing.JLabel lbErro;
    private javax.swing.JLabel lbNovaSenha;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
