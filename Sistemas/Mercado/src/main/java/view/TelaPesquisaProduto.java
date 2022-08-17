package view;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Optional;
import javax.swing.table.DefaultTableModel;
import model.Produto;

public class TelaPesquisaProduto extends javax.swing.JDialog {

    public static Produto produto;

    public TelaPesquisaProduto(javax.swing.JFrame frame, boolean modal) {
        super(frame, modal);
        initComponents();

        List<Produto> produtos = new Produto().getListaProduto();
        for (Produto pro : produtos) {
            montaTabela(pro);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        campoPesquisa = new javax.swing.JTextField();
        cbOpcao = new javax.swing.JComboBox<>();
        lbCampo = new javax.swing.JLabel();
        lbPesquisa = new javax.swing.JLabel();
        lbErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Produto");
        setResizable(false);

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProdutos);

        campoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyReleased(evt);
            }
        });

        cbOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Descrição" }));
        cbOpcao.setToolTipText("");

        lbCampo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCampo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCampo.setText("Campo:");

        lbPesquisa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPesquisa.setText("Pesquisar por:");

        lbErro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbErro.setForeground(new java.awt.Color(204, 0, 0));
        lbErro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)
                        .addComponent(lbErro, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbCampo)
                .addGap(6, 6, 6)
                .addComponent(cbOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPesquisa)
                    .addComponent(lbErro))
                .addGap(6, 6, 6)
                .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyReleased
        if (KeyEvent.VK_ESCAPE == evt.getKeyCode()) {
            limpaTabela();

            List<Produto> produtos = new Produto().getListaProduto();
            for (Produto pro : produtos) {
                montaTabela(pro);
            }
        }

        if (!"".equals(campoPesquisa.getText())) {
            limpaTabela();
            String filtro = campoPesquisa.getText();
            Optional<Produto> produto;

            switch (cbOpcao.getSelectedIndex()) {
                case 0 -> {
                    try {
                        produto = new Produto().getProduto(Integer.parseInt(filtro));
                        produto.ifPresent(pro -> montaTabela(pro));
                    } catch (NumberFormatException e) {
                        lbErro.setText("ID inválido, tente novamente!");
                    }
                }
                case 1 -> {
                    List<Produto> produtos = new Produto().getProdutoByName(filtro);
                    for (Produto pro : produtos) {
                        montaTabela(pro);
                    }
                }
                default -> {
                }
            }
        }

    }//GEN-LAST:event_campoPesquisaKeyReleased

    private void tbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutosMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int linha = tbProdutos.getSelectedRow();
            int id = (int) tbProdutos.getValueAt(linha, 0);
            String descricao = tbProdutos.getValueAt(linha, 1).toString();
            int qtd = (int) tbProdutos.getValueAt(linha, 2);
            Double valor = (Double) tbProdutos.getValueAt(linha, 3);

            produto = new Produto(id, descricao, qtd, valor);
            this.dispose();
        }
    }//GEN-LAST:event_tbProdutosMouseClicked

    private void montaTabela(Produto produto) {
        DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();

        int id = produto.getIdProduto();
        String descricao = produto.getDescricaoProduto();
        int qtd = produto.getQuantidadeEstoque();
        Double preco = produto.getValor();

        modelo.addRow(new Object[]{id, descricao, qtd, preco});

        tbProdutos.setModel(modelo);
    }

    private void limpaTabela() {
        lbErro.setText("");
        while (tbProdutos.getRowCount() > 0) {
            ((DefaultTableModel) tbProdutos.getModel()).removeRow(0);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JComboBox<String> cbOpcao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCampo;
    private javax.swing.JLabel lbErro;
    private javax.swing.JLabel lbPesquisa;
    private javax.swing.JTable tbProdutos;
    // End of variables declaration//GEN-END:variables
}
