package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaPrincipal extends javax.swing.JFrame {
    private final  String USER;

    public TelaPrincipal(String usuario, int nvAcesso) {
        initComponents();
        this.USER = usuario;
        
        if (nvAcesso == 0) {
            JOptionPane.showMessageDialog(null, "Tente novamente com outro usuario ou contate o\nadministrador do sistema!", "Usuario Inativo!", 1);
            System.exit(0);

        } else if (nvAcesso != 2) {
            menuUsuario.setVisible(false);
        }
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
            tabPainel.setSelectedIndex(tabPainel.getTabCount() - 1);
        }
    }
    
    public String getUsuario(){
        return this.USER;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPainel = new javax.swing.JTabbedPane();
        barraMenu = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        menuProduto = new javax.swing.JMenu();
        menuVenda = new javax.swing.JMenu();
        miNovaVenda = new javax.swing.JMenuItem();
        miConsultaVenda = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        menuConfig = new javax.swing.JMenu();
        miNovaSenha = new javax.swing.JMenuItem();

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

        miNovaVenda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        miNovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon Compra.png"))); // NOI18N
        miNovaVenda.setText("Nova Venda");
        miNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNovaVendaActionPerformed(evt);
            }
        });
        menuVenda.add(miNovaVenda);

        miConsultaVenda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        miConsultaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Pesquisar.png"))); // NOI18N
        miConsultaVenda.setText("Consultar Venda");
        miConsultaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaVendaActionPerformed(evt);
            }
        });
        menuVenda.add(miConsultaVenda);

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

        menuConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Config.png"))); // NOI18N
        menuConfig.setText("Configurações");
        menuConfig.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        miNovaSenha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        miNovaSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon Senha.png"))); // NOI18N
        miNovaSenha.setText("Alterar Senha");
        miNovaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNovaSenhaActionPerformed(evt);
            }
        });
        menuConfig.add(miNovaSenha);

        barraMenu.add(menuConfig);

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
        FormCliente form = new FormCliente();
        abrePainel(form);
    }//GEN-LAST:event_menuClienteMouseClicked

    private void menuProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProdutoMouseClicked
        FormProduto form = new FormProduto();
        abrePainel(form);
    }//GEN-LAST:event_menuProdutoMouseClicked

    private void menuUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsuarioMouseClicked
        FormUsuario form = new FormUsuario();
        abrePainel(form);
    }//GEN-LAST:event_menuUsuarioMouseClicked

    private void miNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNovaVendaActionPerformed
        FormVenda form = new FormVenda(USER);
        abrePainel(form);
    }//GEN-LAST:event_miNovaVendaActionPerformed

    private void miNovaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNovaSenhaActionPerformed
        DialogAlteraSenha tela = new DialogAlteraSenha(new JFrame() , true, USER);
        tela.setVisible(true);
    }//GEN-LAST:event_miNovaSenhaActionPerformed

    private void miConsultaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaVendaActionPerformed
        FormConsultaVenda form = new FormConsultaVenda();
        abrePainel(form);
    }//GEN-LAST:event_miConsultaVendaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuConfig;
    private javax.swing.JMenu menuProduto;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenu menuVenda;
    private javax.swing.JMenuItem miConsultaVenda;
    private javax.swing.JMenuItem miNovaSenha;
    private javax.swing.JMenuItem miNovaVenda;
    private javax.swing.JTabbedPane tabPainel;
    // End of variables declaration//GEN-END:variables
}
