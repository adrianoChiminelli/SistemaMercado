package view;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Optional;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

public class TelaPesquisaCliente extends javax.swing.JDialog {

    public static Cliente cliente;

    public TelaPesquisaCliente(javax.swing.JFrame frame, boolean modal) {
        super(frame, modal);
        initComponents();
        
        List<Cliente> clientes = new Cliente().getListaCliente();
        for (Cliente cli : clientes) {
            montaTabela(cli);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        campoPesquisa = new javax.swing.JTextField();
        cbOpcao = new javax.swing.JComboBox<>();
        lbCampo = new javax.swing.JLabel();
        lbPesquisa = new javax.swing.JLabel();
        lbErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Cliente");
        setResizable(false);

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
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        campoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyReleased(evt);
            }
        });

        cbOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "CPF" }));
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
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
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
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyReleased
        if (KeyEvent.VK_ESCAPE == evt.getKeyCode()) {
            limpaTabela();

            List<Cliente> clientes = new Cliente().getListaCliente();
            for (Cliente cli : clientes) {
                montaTabela(cli);
            }
        }

        if (!"".equals(campoPesquisa.getText())) {
            limpaTabela();
            String filtro = campoPesquisa.getText();
            Optional<Cliente> optCliente;

            switch (cbOpcao.getSelectedIndex()) {
                case 0 -> {
                    try {
                        optCliente = new Cliente().getCliente(Integer.parseInt(filtro));
                        optCliente.ifPresent(cli -> montaTabela(cli));
                    } catch (NumberFormatException e) {
                        lbErro.setText("ID inválido, tente novamente!");
                    }
                }
                case 1 -> {
                    List<Cliente> clientes = new Cliente().getClienteByName(filtro);
                    for (Cliente cli : clientes) {
                        montaTabela(cli);
                    }
                }
                case 2 -> {
                    optCliente = new Cliente().getClienteByCPF(filtro);
                    optCliente.ifPresent(cli -> montaTabela(cli));
                }
                default -> {
                }
            }
        }

    }//GEN-LAST:event_campoPesquisaKeyReleased

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int linha = tbClientes.getSelectedRow();
            int id = (int) tbClientes.getValueAt(linha, 0);
            String nome = tbClientes.getValueAt(linha, 1).toString();
            String cpf = tbClientes.getValueAt(linha, 2).toString();
            String telefone = tbClientes.getValueAt(linha, 3).toString();
            String email = tbClientes.getValueAt(linha, 4).toString();

            cliente = new Cliente(id, nome, cpf, telefone, email);
            this.dispose();
        }
    }//GEN-LAST:event_tbClientesMouseClicked

    private void montaTabela(Cliente cliente) {
        DefaultTableModel modelo = (DefaultTableModel) tbClientes.getModel();

        int id = cliente.getIdCliente();
        String nomeCli = cliente.getNomeCliente();
        String cpf = cliente.getCpf();
        String email = cliente.getEmail();
        String tel = cliente.getTelefone();

        modelo.addRow(new Object[]{id, nomeCli, cpf, email, tel});

        tbClientes.setModel(modelo);
    }

    private void limpaTabela() {
        lbErro.setText("");
        while (tbClientes.getRowCount() > 0) {
            ((DefaultTableModel) tbClientes.getModel()).removeRow(0);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JComboBox<String> cbOpcao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCampo;
    private javax.swing.JLabel lbErro;
    private javax.swing.JLabel lbPesquisa;
    private javax.swing.JTable tbClientes;
    // End of variables declaration//GEN-END:variables
}
