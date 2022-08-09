package view;

import java.util.List;
import java.util.Optional;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

public class TelaPesquisaCliente extends javax.swing.JFrame {

    public TelaPesquisaCliente() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        campoPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        cbOpcao = new javax.swing.JComboBox<>();
        lbCampo = new javax.swing.JLabel();
        lbPesquisa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jScrollPane1.setViewportView(tbClientes);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Pesquisar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lbCampo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoPesquisa)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String filtro = campoPesquisa.getText();
        Optional<Cliente> cliente;

        switch (cbOpcao.getSelectedIndex()) {
            case 0 -> {
                cliente = new Cliente().getCliente(Integer.parseInt(filtro));
                cliente.ifPresent(cli -> montaTabela(cli));
            }
            case 1 -> {
                List<Cliente> clientes = new Cliente().getClienteByName(filtro);
                for (Cliente cli : clientes) {
                    montaTabela(cli);
                }
            }
            case 2 -> {
                cliente = new Cliente().getClienteByCPF(filtro);
                cliente.ifPresent(cli -> montaTabela(cli));
            }
            default -> {
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void montaTabela(Cliente cliente) {
        DefaultTableModel modelo = (DefaultTableModel) tbClientes.getModel();
        modelo.setRowCount(0);

        int id = cliente.getIdCliente();
        String nomeCli = cliente.getNomeCliente();
        String cpf = cliente.getCpf();
        String email = cliente.getEmail();
        String tel = cliente.getTelefone();

        modelo.addRow(new Object[]{id, nomeCli, cpf, email, tel});

        tbClientes.setModel(modelo);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JComboBox<String> cbOpcao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCampo;
    private javax.swing.JLabel lbPesquisa;
    private javax.swing.JTable tbClientes;
    // End of variables declaration//GEN-END:variables
}
