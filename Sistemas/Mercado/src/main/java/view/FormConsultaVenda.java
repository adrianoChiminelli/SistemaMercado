package view;

import controller.ConsultaVendaController;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Venda;

public class FormConsultaVenda extends javax.swing.JPanel {

    public FormConsultaVenda() {
        initComponents();
        montaTbVenda();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbVendas = new javax.swing.JTable();
        lbTituloVenda = new javax.swing.JLabel();
        lbTituloProduto = new javax.swing.JLabel();
        pPesquisar = new javax.swing.JPanel();
        campoPesquisa = new javax.swing.JTextField();
        lbPesquisa = new javax.swing.JLabel();
        cbOpcao = new javax.swing.JComboBox<>();
        lbCampo = new javax.swing.JLabel();
        lbErro = new javax.swing.JLabel();
        campoData = new org.jdesktop.swingx.JXDatePicker();
        campoData.setFormats(new String[] {"dd/MM/yyyy"} );
        lbCampo2 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JToggleButton();

        setMinimumSize(new java.awt.Dimension(1280, 678));
        setName("Usuarios"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Produto", "Descrição", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbProdutos);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 224, 590, -1));

        tbVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Venda", "Nome Cliente", "Quantidade", "Valor da Compra", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVendasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbVendas);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 224, 590, -1));

        lbTituloVenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbTituloVenda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloVenda.setText("Vendas:");
        add(lbTituloVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 201, 67, -1));

        lbTituloProduto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbTituloProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloProduto.setText("Produtos:");
        add(lbTituloProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 201, 81, -1));

        pPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));
        pPesquisar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyReleased(evt);
            }
        });
        pPesquisar.add(campoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 320, 32));

        lbPesquisa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPesquisa.setText("Pesquisar por:");
        pPesquisar.add(lbPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 113, -1));

        cbOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Venda", "ID Cliente", "Nome Cliente" }));
        cbOpcao.setToolTipText("");
        pPesquisar.add(cbOpcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        lbCampo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCampo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCampo.setText("Data:");
        pPesquisar.add(lbCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 35, 40, -1));

        lbErro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbErro.setForeground(new java.awt.Color(204, 0, 0));
        lbErro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pPesquisar.add(lbErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 230, 20));

        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });
        pPesquisar.add(campoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 110, 30));

        lbCampo2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCampo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCampo2.setText("Campo:");
        pPesquisar.add(lbCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 113, -1));

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Limpar.png"))); // NOI18N
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        pPesquisar.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 40, 40));

        add(pPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 20, 590, 163));
    }// </editor-fold>//GEN-END:initComponents

    private void montaTbVenda() {
        ConsultaVendaController controller = new ConsultaVendaController();
        tbVendas.setModel(controller.montaTabelaVenda(tbVendas));
    }

    private void campoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyReleased
        if (KeyEvent.VK_ESCAPE == evt.getKeyCode()) {
            limpaTabelaVenda();
            montaTbVenda();
        }

        if (!"".equals(campoPesquisa.getText())) {
            ConsultaVendaController controller = new ConsultaVendaController();
            String filtro = campoPesquisa.getText();
            Optional<Venda> optVenda;

            switch (cbOpcao.getSelectedIndex()) {
                case 0 -> {
                    try {
                        limpaTabelaVenda();
                        optVenda = controller.getVenda(Integer.parseInt(filtro));
                        optVenda.ifPresent(v -> controller.montaTabela(v, tbVendas));
                    } catch (NumberFormatException e) {
                        lbErro.setText("ID inválido, tente novamente!");
                    }
                }
                case 1 -> {
                    try {
                        limpaTabelaVenda();
                        List<Venda> vendas = controller.getVendasByCliente(Integer.parseInt(filtro));
                        for (Venda ven : vendas) {
                            controller.montaTabela(ven, tbVendas);
                        }
                    } catch (NumberFormatException e) {
                        lbErro.setText("ID inválido, tente novamente!");
                    }
                }
                case 2 -> {
                    limpaTabelaVenda();
                    List<Venda> vendas = controller.getVendasByCliente(filtro);
                    for (Venda ven : vendas) {
                        controller.montaTabela(ven, tbVendas);
                    }
                }
                default -> {
                }
            }
        }
    }//GEN-LAST:event_campoPesquisaKeyReleased

    private void tbVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVendasMouseClicked
        ConsultaVendaController controller = new ConsultaVendaController();
        if (tbProdutos.getRowCount() > 0) {
            limpaTabelaProduto();
        }
        int linha = tbVendas.getSelectedRow();
        int id = (int) tbVendas.getValueAt(linha, 0);

        tbProdutos.setModel(controller.montaTabelaProduto(tbProdutos, id));
    }//GEN-LAST:event_tbVendasMouseClicked

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
        limpaTabelaVenda();
        montaTbVenda();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date dataSelecionada = campoData.getDate();

        for (int i = tbVendas.getRowCount() - 1; i > 0; i--) {
            String d = tbVendas.getValueAt(i, 4).toString();

            try {
                Date dataVenda = format.parse(d);
                if (dataVenda.after(dataSelecionada)) {
                    ((DefaultTableModel) tbVendas.getModel()).removeRow(i);
                }
            } catch (ParseException ex) {
                Logger.getLogger(FormConsultaVenda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_campoDataActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.removeAll();
        this.repaint();
        this.initComponents();
        montaTbVenda();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void limpaTabelaProduto() {
        while (tbProdutos.getRowCount() > 0) {
            ((DefaultTableModel) tbProdutos.getModel()).removeRow(0);
        }
    }

    private void limpaTabelaVenda() {
        lbErro.setText("");
        while (tbVendas.getRowCount() > 0) {
            ((DefaultTableModel) tbVendas.getModel()).removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnLimpar;
    private org.jdesktop.swingx.JXDatePicker campoData;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JComboBox<String> cbOpcao;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbCampo;
    private javax.swing.JLabel lbCampo2;
    private javax.swing.JLabel lbErro;
    private javax.swing.JLabel lbPesquisa;
    private javax.swing.JLabel lbTituloProduto;
    private javax.swing.JLabel lbTituloVenda;
    private javax.swing.JPanel pPesquisar;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTable tbVendas;
    // End of variables declaration//GEN-END:variables

}
