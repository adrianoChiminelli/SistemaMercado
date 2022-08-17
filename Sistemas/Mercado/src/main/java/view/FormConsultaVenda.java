package view;

import controller.ClienteController;
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
import model.Cliente;
import model.Venda;
import utils.StringFormat;

public class FormConsultaVenda extends javax.swing.JPanel {

    ConsultaVendaController controller;

    public FormConsultaVenda() {
        controller = new ConsultaVendaController();
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
        lbTituloProduto = new javax.swing.JLabel();
        lbTituloVenda1 = new javax.swing.JLabel();
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
        pInfo = new javax.swing.JPanel();
        pInfo.setVisible(false);
        lbCliente = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        lbQtdTotal = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        lbMPagamento = new javax.swing.JLabel();
        lbVendedor = new javax.swing.JLabel();
        campoDataVenda = new javax.swing.JTextField();
        campoCliente = new javax.swing.JTextField();
        campoQtd = new javax.swing.JTextField();
        campoValor = new javax.swing.JTextField();
        campoCPF = new javax.swing.JTextField();
        campoMPag = new javax.swing.JTextField();
        campoVendedor = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(1280, 678));
        setName("Consulta"); // NOI18N
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

        lbTituloProduto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbTituloProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloProduto.setText("Produtos:");
        add(lbTituloProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 201, 81, -1));

        lbTituloVenda1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbTituloVenda1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloVenda1.setText("Vendas:");
        add(lbTituloVenda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 201, 67, -1));

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

        lbCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCliente.setText("Cliente:");

        lbCPF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCPF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCPF.setText("CPF:");

        lbData.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbData.setText("Data da venda:");

        lbQtdTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbQtdTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbQtdTotal.setText("Qtd Total:");

        lbValor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbValor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbValor.setText("Valor Total:");

        lbMPagamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbMPagamento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbMPagamento.setText("M. Pagamento:");

        lbVendedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbVendedor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbVendedor.setText("Vendedor: ");

        campoDataVenda.setEditable(false);
        campoDataVenda.setBorder(null);

        campoCliente.setEditable(false);
        campoCliente.setBorder(null);

        campoQtd.setEditable(false);
        campoQtd.setBorder(null);

        campoValor.setEditable(false);
        campoValor.setBorder(null);

        campoCPF.setEditable(false);
        campoCPF.setBorder(null);

        campoMPag.setEditable(false);
        campoMPag.setBorder(null);

        campoVendedor.setEditable(false);
        campoVendedor.setBorder(null);

        javax.swing.GroupLayout pInfoLayout = new javax.swing.GroupLayout(pInfo);
        pInfo.setLayout(pInfoLayout);
        pInfoLayout.setHorizontalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInfoLayout.createSequentialGroup()
                        .addComponent(lbData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInfoLayout.createSequentialGroup()
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pInfoLayout.createSequentialGroup()
                                .addComponent(lbValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbVendedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pInfoLayout.createSequentialGroup()
                                .addComponent(lbCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(lbCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCPF))
                            .addGroup(pInfoLayout.createSequentialGroup()
                                .addComponent(lbQtdTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151)
                                .addComponent(lbMPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoMPag, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))))
        );
        pInfoLayout.setVerticalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbData)
                    .addComponent(campoDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliente)
                    .addComponent(lbCPF)
                    .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQtdTotal)
                    .addComponent(lbMPagamento)
                    .addComponent(campoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoMPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValor)
                    .addComponent(lbVendedor)
                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        add(pInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 590, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void montaTbVenda() {
        tbVendas.setModel(controller.montaTabelaVenda(tbVendas));
    }

    private void campoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyReleased
        if (KeyEvent.VK_ESCAPE == evt.getKeyCode()) {
            limpaTabelaVenda();
            montaTbVenda();
            pInfo.setVisible(false);
        }

        if (!"".equals(campoPesquisa.getText())) {
            pInfo.setVisible(false);
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

        if (tbProdutos.getRowCount() > 0) {
            limpaTabelaProduto();
        }
        int linha = tbVendas.getSelectedRow();
        int id = (int) tbVendas.getValueAt(linha, 0);

        tbProdutos.setModel(controller.montaTabelaProduto(tbProdutos, id));
        relatorio(id);
    }//GEN-LAST:event_tbVendasMouseClicked

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
        limpaTabelaVenda();
        montaTbVenda();
        pInfo.setVisible(false);

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnLimpar;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoCliente;
    private org.jdesktop.swingx.JXDatePicker campoData;
    private javax.swing.JTextField campoDataVenda;
    private javax.swing.JTextField campoMPag;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JTextField campoQtd;
    private javax.swing.JTextField campoValor;
    private javax.swing.JTextField campoVendedor;
    private javax.swing.JComboBox<String> cbOpcao;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCampo;
    private javax.swing.JLabel lbCampo2;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbErro;
    private javax.swing.JLabel lbMPagamento;
    private javax.swing.JLabel lbPesquisa;
    private javax.swing.JLabel lbQtdTotal;
    private javax.swing.JLabel lbTituloProduto;
    private javax.swing.JLabel lbTituloVenda1;
    private javax.swing.JLabel lbValor;
    private javax.swing.JLabel lbVendedor;
    private javax.swing.JPanel pInfo;
    private javax.swing.JPanel pPesquisar;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTable tbVendas;
    // End of variables declaration//GEN-END:variables

    private void relatorio(int id) {
        pInfo.setVisible(true);
        
        Optional<Venda> opt = controller.getVenda(id);
        opt.ifPresent(venda -> {
            Optional<Cliente> optCliente = controller.getCliente(venda.getFkCliente());
            optCliente.ifPresent(cliente -> {
                
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                
                campoDataVenda.setText(format.format(venda.getData()));
                campoCliente.setText(cliente.getNomeCliente());
                campoCPF.setText(cliente.getCpf());
                campoQtd.setText(venda.getQuantidadeTotal().toString());
                campoValor.setText(new StringFormat().doubleParaReal(venda.getValorTotal()));
                campoMPag.setText(venda.getMetodoPagamento());
                campoVendedor.setText(venda.getVendedor());
            });
        });
    }

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
}
