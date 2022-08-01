package view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();

    }

    public void abrePainel(JPanel painel) {

        if (tabPainel.getTabCount() == 0) {
            tabPainel.addTab(painel.getName(), painel);
        } else {
            for (int i = 0; i < tabPainel.getTabCount(); i++) {
                if (tabPainel.getTitleAt(i).equals(painel.getName())) {
                    tabPainel.setSelectedIndex(i);
                    return;
                }
            }
            tabPainel.addTab(painel.getName(), painel);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPainel = new javax.swing.JTabbedPane();
        barraMenu = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        menuProduto = new javax.swing.JMenu();
        menuVenda = new javax.swing.JMenu();
        menuUsuario = new javax.swing.JMenu();
        menuAdmin = new javax.swing.JMenu();
        smSQL = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Market System");
        setMaximumSize(new java.awt.Dimension(5000, 5000));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        tabPainel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabPainel.setOpaque(true);

        menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Cliente.png"))); // NOI18N
        menuCliente.setText("Clientes");
        menuCliente.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        menuCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuClienteMouseClicked(evt);
            }
        });
        barraMenu.add(menuCliente);

        menuProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Etiqueta.png"))); // NOI18N
        menuProduto.setText("Produtos");
        menuProduto.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        menuProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProdutoMouseClicked(evt);
            }
        });
        barraMenu.add(menuProduto);

        menuVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Carrinho.png"))); // NOI18N
        menuVenda.setText("Vendas");
        menuVenda.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        menuVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVendaMouseClicked(evt);
            }
        });
        barraMenu.add(menuVenda);

        menuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconUsuario.png"))); // NOI18N
        menuUsuario.setText("Usuarios");
        menuUsuario.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        menuUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUsuarioMouseClicked(evt);
            }
        });
        barraMenu.add(menuUsuario);

        menuAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Config.png"))); // NOI18N
        menuAdmin.setText("Administrador");
        menuAdmin.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        smSQL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        smSQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Chave.png"))); // NOI18N
        smSQL.setText("Editor SQL");
        smSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smSQLActionPerformed(evt);
            }
        });
        menuAdmin.add(smSQL);

        barraMenu.add(menuAdmin);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClienteMouseClicked
        formCliente frm = new formCliente();
        abrePainel(frm);
    }//GEN-LAST:event_menuClienteMouseClicked

    private void menuProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProdutoMouseClicked

    }//GEN-LAST:event_menuProdutoMouseClicked

    private void menuVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVendaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuVendaMouseClicked

    private void menuUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuUsuarioMouseClicked

    private void smSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smSQLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smSQLActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuProduto;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenu menuVenda;
    private javax.swing.JMenuItem smSQL;
    private javax.swing.JTabbedPane tabPainel;
    // End of variables declaration//GEN-END:variables
}
