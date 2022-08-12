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
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 171, 598, 370));

        campoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyReleased(evt);
            }
        });
        getContentPane().add(campoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 121, 598, 32));

        cbOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "CPF" }));
        cbOpcao.setToolTipText("");
        getContentPane().add(cbOpcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 50, 215, 30));

        lbCampo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCampo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCampo.setText("Campo:");
        getContentPane().add(lbCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 27, 113, -1));

        lbPesquisa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPesquisa.setText("Pesquisar por:");
        getContentPane().add(lbPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 98, 113, -1));

        lbErro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbErro.setForeground(new java.awt.Color(204, 0, 0));
        lbErro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lbErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 98, 283, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyReleased
        if (KeyEvent.VK_ESCAPE == evt.getKeyCode()) {
            limpaTabela();
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
