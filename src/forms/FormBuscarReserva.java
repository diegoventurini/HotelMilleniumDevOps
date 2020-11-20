/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Reserva;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuário
 */
public class FormBuscarReserva extends javax.swing.JFrame {
    private DefaultTableModel modelo;
    /**
     * Creates new form FormBuscarReserva
     */
    public FormBuscarReserva() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btLimpar = new javax.swing.JButton();
        lbIdReserva = new javax.swing.JLabel();
        tfNumeroReserva = new javax.swing.JTextField();
        btBuscarCPF1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReserva = new javax.swing.JTable();
        btSair1 = new javax.swing.JButton();
        cbReserva = new javax.swing.JCheckBox();
        btExcluir = new javax.swing.JButton();
        lbImagemReserva = new javax.swing.JLabel();

        btLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(0, 0, 102));
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icRemoverItem.png"))); // NOI18N
        btLimpar.setText("Excluir");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbIdReserva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbIdReserva.setForeground(new java.awt.Color(0, 0, 102));
        lbIdReserva.setText("ID da Reserva:");
        getContentPane().add(lbIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, 20));
        getContentPane().add(tfNumeroReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 90, 30));

        btBuscarCPF1.setBackground(new java.awt.Color(255, 255, 255));
        btBuscarCPF1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btBuscarCPF1.setForeground(new java.awt.Color(0, 0, 102));
        btBuscarCPF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icBuscar.png"))); // NOI18N
        btBuscarCPF1.setText("Buscar");
        btBuscarCPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarCPF1ActionPerformed(evt);
            }
        });
        getContentPane().add(btBuscarCPF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 110, 50));

        tbReserva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbReserva.setForeground(new java.awt.Color(0, 0, 102));
        tbReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CPF Cliente", "Quarto", "Data Inicio", "Data Fim"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Short.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbReservaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbReserva);
        if (tbReserva.getColumnModel().getColumnCount() > 0) {
            tbReserva.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbReserva.getColumnModel().getColumn(2).setPreferredWidth(30);
            tbReserva.getColumnModel().getColumn(3).setPreferredWidth(25);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 400, 140));

        btSair1.setBackground(new java.awt.Color(255, 255, 255));
        btSair1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair1.setForeground(new java.awt.Color(0, 0, 102));
        btSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icSair.png"))); // NOI18N
        btSair1.setText("Sair");
        btSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSair1ActionPerformed(evt);
            }
        });
        getContentPane().add(btSair1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 110, 51));

        cbReserva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbReserva.setForeground(new java.awt.Color(0, 0, 102));
        cbReserva.setText("Ver Todas as Reservas");
        cbReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbReservaActionPerformed(evt);
            }
        });
        getContentPane().add(cbReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        btExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(0, 0, 102));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icRemoverItem.png"))); // NOI18N
        btExcluir.setText("Cancelar Reserva");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 51));

        lbImagemReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Reserva55.jpg"))); // NOI18N
        getContentPane().add(lbImagemReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 470, 360));

        setSize(new java.awt.Dimension(472, 382));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void tabelaId(){
        if (tfNumeroReserva.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo antes de pesquisar.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (!this.tfNumeroReserva.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Apenas número são permitidos no campo.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Reserva r = FormPrincipal.reservaDAO.buscarReserva(Short.parseShort(tfNumeroReserva.getText()));
        if (r != null){
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String dataInicio = df.format(r.getDataInicio());
            String dataFim = df.format(r.calcularDataSaida());
            
            modelo.addRow(new Object[]{r.getId(), r.getCliente().getCpf(), r.getQuarto().getNumQuarto(), dataInicio, dataFim});
        }
        else
           JOptionPane.showMessageDialog(null, "Reserva não encontrada.", "Atenção", JOptionPane.WARNING_MESSAGE); 
    }
    
    public void tabelaTodos(){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        for (Reserva r: FormPrincipal.reservaDAO.getList()){
            String dataInicio = df.format(r.getDataInicio());
            String dataFim = df.format(r.calcularDataSaida());
            
            modelo.addRow(new Object[]{r.getId(), r.getCliente().getCpf(), r.getQuarto().getNumQuarto(), dataInicio, dataFim});
        }
    }
    
    public void limparTabela(){
        for (int i = tbReserva.getRowCount() - 1; i >= 0; i--){
            modelo.removeRow(i);
        }
    }
    
    private void btBuscarCPF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarCPF1ActionPerformed
 
        this.modelo = (DefaultTableModel) tbReserva.getModel();
        limparTabela();
        
        if (cbReserva.isSelected())
            tabelaTodos();
        else
            tabelaId();
    }//GEN-LAST:event_btBuscarCPF1ActionPerformed

    private void btSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSair1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSair1ActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed

    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja mesmo cancelar a reserva?", "Confirmação", WIDTH, HEIGHT);
        
        if (opcao == 0){
            int linha = tbReserva.getSelectedRow();
            short id = (short) modelo.getValueAt(linha, 0);
            FormPrincipal.reservaDAO.buscarReserva(id).getQuarto().setOcupado(false);
            FormPrincipal.reservaDAO.removerReserva(id);
            modelo.removeRow(tbReserva.getSelectedRow());
        }
        
    }//GEN-LAST:event_btExcluirActionPerformed

    private void cbReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbReservaActionPerformed
        if (cbReserva.isSelected()){
            tfNumeroReserva.setText("");
            tfNumeroReserva.setEnabled(false);
        }
        else{
            tfNumeroReserva.setEnabled(true);
        }
    }//GEN-LAST:event_cbReservaActionPerformed

    private void tbReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbReservaMouseClicked
        btExcluir.setEnabled(true);
    }//GEN-LAST:event_tbReservaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(FormBuscarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuscarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuscarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuscarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuscarReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarCPF1;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair1;
    private javax.swing.JCheckBox cbReserva;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbIdReserva;
    private javax.swing.JLabel lbImagemReserva;
    private javax.swing.JTable tbReserva;
    private javax.swing.JTextField tfNumeroReserva;
    // End of variables declaration//GEN-END:variables
}