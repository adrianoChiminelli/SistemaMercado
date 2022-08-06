package view;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormVenda extends javax.swing.JPanel {
    private final String usuario;
    
    public FormVenda(String usuario) {
        initComponents();
        this.usuario = usuario;
        pFinalVenda.setVisible(false);
    }

    public void ativaVenda(boolean habilita) {
        cbCliente.setEnabled(habilita);
        cbProduto.setEnabled(habilita);
        jsQuantidade.setEnabled(habilita);
        campoIdProduto.setEnabled(habilita);
        btnAdicionar.setEnabled(habilita);
        btnRemover.setEnabled(habilita);
        btnPesquisarCliente.setEnabled(habilita);

        limpaCampos();
        pFinalVenda.setVisible(habilita);
        campoVendedor.setText(usuario);
        SimpleDateFormat formatter = new SimpleDateFormat("dd / MM / yyyy");
        campoData.setText(formatter.format(new Date().getTime()));
    }
    
    public void limpaCampos(){
        campoIdCliente.setText("");
        campoNomeCliente.setText("");
        campoQuantidade.setText("");
        campoValorTotal.setText("");
        campoData.setText("");
        campoVendedor.setText("");
        formasPagamento.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formasPagamento = new javax.swing.ButtonGroup();
        btnNovo = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNoveVenda = new javax.swing.JTable();
        lbCliente = new javax.swing.JLabel();
        lbProduto = new javax.swing.JLabel();
        lbQuantidade = new javax.swing.JLabel();
        cbCliente = new javax.swing.JComboBox<>();
        campoIdProduto = new javax.swing.JTextField();
        cbProduto = new javax.swing.JComboBox<>();
        jsQuantidade = new javax.swing.JSpinner();
        btnPesquisarCliente = new javax.swing.JToggleButton();
        btnAdicionar = new javax.swing.JToggleButton();
        btnRemover = new javax.swing.JToggleButton();
        pFinalVenda = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();
        lbIdCliente = new javax.swing.JLabel();
        lbNomeCliente = new javax.swing.JLabel();
        lbQtdTotal = new javax.swing.JLabel();
        lbValorTotal = new javax.swing.JLabel();
        lbVendedor = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbMetPag = new javax.swing.JLabel();
        opVista = new javax.swing.JRadioButton();
        opCredito = new javax.swing.JRadioButton();
        opDebito = new javax.swing.JRadioButton();
        campoIdCliente = new javax.swing.JTextField();
        campoNomeCliente = new javax.swing.JTextField();
        campoQuantidade = new javax.swing.JTextField();
        campoValorTotal = new javax.swing.JTextField();
        campoVendedor = new javax.swing.JTextField();
        lbData = new javax.swing.JLabel();
        campoData = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(1280, 678));
        setName("Vendas"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 678));

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconAdicionar.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setHideActionText(true);
        btnNovo.setIconTextGap(10);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        tbNoveVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Preço Und.", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbNoveVenda);

        lbCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCliente.setText("Cliente:");

        lbProduto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbProduto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbProduto.setText("Produto:");

        lbQuantidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbQuantidade.setText("Quantidade:");

        cbCliente.setEnabled(false);

        campoIdProduto.setEnabled(false);

        cbProduto.setEnabled(false);

        jsQuantidade.setEnabled(false);

        btnPesquisarCliente.setText("...");
        btnPesquisarCliente.setEnabled(false);

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon ArrowDown.png"))); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setEnabled(false);

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon ArrowUP.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setEnabled(false);

        pFinalVenda.setBackground(new java.awt.Color(255, 255, 255));
        pFinalVenda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(204, 204, 204)));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon OK.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setHideActionText(true);
        btnSalvar.setIconTextGap(10);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHideActionText(true);
        btnCancelar.setIconTextGap(10);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lbIdCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbIdCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbIdCliente.setText("ID Cliente:");

        lbNomeCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNomeCliente.setText("Nome Cliente:");

        lbQtdTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbQtdTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbQtdTotal.setText("Quantidade:");

        lbValorTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbValorTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbValorTotal.setText("Valor Total:");

        lbVendedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbVendedor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbVendedor.setText("Vendedor:");

        lbTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Dados da Venda");

        lbMetPag.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbMetPag.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbMetPag.setText("Método Pag.:");

        formasPagamento.add(opVista);
        opVista.setText("À VISTA");

        formasPagamento.add(opCredito);
        opCredito.setText("CRÉDITO");

        formasPagamento.add(opDebito);
        opDebito.setText("DÉBITO");

        campoIdCliente.setEditable(false);

        campoNomeCliente.setEditable(false);

        campoQuantidade.setEditable(false);

        campoValorTotal.setEditable(false);

        campoVendedor.setEditable(false);

        lbData.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbData.setText("Data Venda:");

        campoData.setEditable(false);

        javax.swing.GroupLayout pFinalVendaLayout = new javax.swing.GroupLayout(pFinalVenda);
        pFinalVenda.setLayout(pFinalVendaLayout);
        pFinalVendaLayout.setHorizontalGroup(
            pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFinalVendaLayout.createSequentialGroup()
                .addGroup(pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFinalVendaLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lbTitulo))
                    .addGroup(pFinalVendaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pFinalVendaLayout.createSequentialGroup()
                                .addComponent(lbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pFinalVendaLayout.createSequentialGroup()
                                .addGroup(pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbQtdTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMetPag, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pFinalVendaLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(opCredito)
                                            .addComponent(opVista)
                                            .addComponent(opDebito)))
                                    .addGroup(pFinalVendaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pFinalVendaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pFinalVendaLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pFinalVendaLayout.setVerticalGroup(
            pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFinalVendaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbTitulo)
                .addGap(26, 26, 26)
                .addGroup(pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdCliente)
                    .addComponent(campoIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeCliente)
                    .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQtdTotal)
                    .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorTotal)
                    .addComponent(campoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVendedor)
                    .addComponent(campoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMetPag)
                    .addComponent(opVista))
                .addGap(27, 27, 27)
                .addComponent(opCredito)
                .addGap(28, 28, 28)
                .addComponent(opDebito)
                .addGap(40, 40, 40)
                .addGroup(pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbData)
                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pFinalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbQuantidade)
                                    .addComponent(lbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jsQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(pFinalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCliente)
                            .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProduto)
                    .addComponent(campoIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbQuantidade))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addComponent(pFinalVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        ativaVenda(true);

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        ativaVenda(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdicionar;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnNovo;
    private javax.swing.JToggleButton btnPesquisarCliente;
    private javax.swing.JToggleButton btnRemover;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoIdCliente;
    private javax.swing.JTextField campoIdProduto;
    private javax.swing.JTextField campoNomeCliente;
    private javax.swing.JTextField campoQuantidade;
    private javax.swing.JTextField campoValorTotal;
    private javax.swing.JTextField campoVendedor;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbProduto;
    private javax.swing.ButtonGroup formasPagamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jsQuantidade;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbIdCliente;
    private javax.swing.JLabel lbMetPag;
    private javax.swing.JLabel lbNomeCliente;
    private javax.swing.JLabel lbProduto;
    private javax.swing.JLabel lbQtdTotal;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JLabel lbVendedor;
    private javax.swing.JRadioButton opCredito;
    private javax.swing.JRadioButton opDebito;
    private javax.swing.JRadioButton opVista;
    private javax.swing.JPanel pFinalVenda;
    private javax.swing.JTable tbNoveVenda;
    // End of variables declaration//GEN-END:variables
}
