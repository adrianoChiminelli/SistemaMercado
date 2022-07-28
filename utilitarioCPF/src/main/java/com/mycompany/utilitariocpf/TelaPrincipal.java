package com.mycompany.utilitariocpf;

import java.awt.Color;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoCPFAleatorio = new javax.swing.JTextField();
        campoValidaCPF = new javax.swing.JTextField();
        btnGerarCPF = new javax.swing.JButton();
        btnValidaCPF = new javax.swing.JButton();
        lbRespostaValida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        campoCPFAleatorio.setEditable(false);
        campoCPFAleatorio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoValidaCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoValidaCPF.setText("Digite o CPF");
        campoValidaCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoValidaCPFFocusGained(evt);
            }
        });

        btnGerarCPF.setText("Gerar CPF");
        btnGerarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarCPFActionPerformed(evt);
            }
        });

        btnValidaCPF.setText("Validar CPF");
        btnValidaCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidaCPFActionPerformed(evt);
            }
        });

        lbRespostaValida.setBackground(new java.awt.Color(255, 102, 102));
        lbRespostaValida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbRespostaValida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbRespostaValida, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCPFAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnGerarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoValidaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(btnValidaCPF)
                                    .addGap(41, 41, 41))))
                        .addGap(168, 168, 168))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(campoCPFAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGerarCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(campoValidaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnValidaCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRespostaValida, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarCPFActionPerformed
        UtilCPF util = new UtilCPF();
        String cpf = util.geraCPFAleatorio();
        campoCPFAleatorio.setText(util.formatarCPF(cpf));
    }//GEN-LAST:event_btnGerarCPFActionPerformed

    private void btnValidaCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidaCPFActionPerformed
        UtilCPF util = new UtilCPF();
        if (util.validaCPF(campoValidaCPF.getText())) {
            lbRespostaValida.setForeground(Color.GREEN);
            lbRespostaValida.setText("CPF Válido!");
        } else {
            lbRespostaValida.setForeground(Color.red);
            lbRespostaValida.setText("CPF Inválido!");
        }
        campoValidaCPF.setText(util.formatarCPF(campoValidaCPF.getText()));
    }//GEN-LAST:event_btnValidaCPFActionPerformed

    private void campoValidaCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoValidaCPFFocusGained
        if (campoValidaCPF.getText().equals("Digite o CPF")) {
            campoValidaCPF.setText("");
        }
    }//GEN-LAST:event_campoValidaCPFFocusGained

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarCPF;
    private javax.swing.JButton btnValidaCPF;
    private javax.swing.JTextField campoCPFAleatorio;
    private javax.swing.JTextField campoValidaCPF;
    private javax.swing.JLabel lbRespostaValida;
    // End of variables declaration//GEN-END:variables
}
