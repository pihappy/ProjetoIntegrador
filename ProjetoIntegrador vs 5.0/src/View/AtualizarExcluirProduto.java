/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProdutoController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mikael
 */
public class AtualizarExcluirProduto extends javax.swing.JFrame {

    /**
     * Creates new form AtualizarExcluirProduto
     */
    public AtualizarExcluirProduto() {
        initComponents();
        this.setLocationRelativeTo(null);
        //LoadTable();
    }
    
    public void LoadTable(){
        
        //Peço ao controller resgatar os clientes do banco de dados
        ArrayList<String[]> linhasProdutos = ProdutoController.getProdutos();
        
        DefaultTableModel tmProdutos = new DefaultTableModel();
        tmProdutos.addColumn("Id");
        tmProdutos.addColumn("Categoria");
        tmProdutos.addColumn("Produto");
        tmProdutos.addColumn("Quantidade");
        tblProdutos.setModel(tmProdutos);
        
        for(String[] c:linhasProdutos)
        {
            tmProdutos.addRow(c);
        }
        
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(50);
    }
    
    private boolean ValidarFormulario() {
    
    if(this.txtCodigoProduto.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um codigo para pesquisar um produto!");
            return false;
        }
     
    if(this.txtProduto.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um produto para pesquisar!");
            return false;
        }   
        return true;
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JcboCategoria = new javax.swing.JComboBox<>();
        btnProcurar = new javax.swing.JButton();
        btnLimparProduto = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnNovoProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        btnAtulizarProduto = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmPesqCliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmCadastroColab = new javax.swing.JMenuItem();
        jmPesqColab = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Produto");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Produto");

        txtCodigoProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdutoActionPerformed(evt);
            }
        });

        txtProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Categoria:");

        JcboCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JcboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma categoria", "Artes", "Bonecas", "Bonecos", "Carros", "Colecionáveis", "Eletrônicos", "Esportes", "Pelúcias", "Tabuleiro", " ", " " }));

        btnProcurar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/procurar(2).png"))); // NOI18N
        btnProcurar.setText("Procurar");
        btnProcurar.setBorder(null);
        btnProcurar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        btnLimparProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnLimparProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/limpar(1).png"))); // NOI18N
        btnLimparProduto.setText("Limpar");
        btnLimparProduto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JcboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtProduto))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimparProduto)
                    .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLimparProduto, btnProcurar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JcboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnProcurar)
                .addGap(8, 8, 8)
                .addComponent(btnLimparProduto)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLimparProduto, btnProcurar});

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        btnNovoProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnNovoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/addProduct(1).png"))); // NOI18N
        btnNovoProduto.setText("Novo Produto");
        btnNovoProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnExcluirProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnAtulizarProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAtulizarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/atualizar(3).png"))); // NOI18N
        btnAtulizarProduto.setText("Atualizar");
        btnAtulizarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAtulizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtulizarProdutoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sair.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovoProduto)
                    .addComponent(btnAtulizarProduto)
                    .addComponent(btnExcluirProduto)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAtulizarProduto, btnCancelar, btnExcluirProduto, btnNovoProduto});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtulizarProduto)
                .addGap(13, 13, 13)
                .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(btnNovoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAtulizarProduto, btnExcluirProduto});

        tblProdutos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        tblProdutos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Produto", "Categoria", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenu5.setText("Cliente");
        jMenu5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItem1.setText("Cadastrar Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jmPesqCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmPesqCliente.setText("Pesquisar Cliente");
        jmPesqCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPesqClienteActionPerformed(evt);
            }
        });
        jMenu5.add(jmPesqCliente);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Colaborador");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jmCadastroColab.setText("Cadastrar Colaborador");
        jmCadastroColab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroColabActionPerformed(evt);
            }
        });
        jMenu4.add(jmCadastroColab);

        jmPesqColab.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmPesqColab.setText("Pesquisar Colaborador");
        jmPesqColab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPesqColabActionPerformed(evt);
            }
        });
        jMenu4.add(jmPesqColab);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        TelaPrincipal formCancelar = new TelaPrincipal();  
        formCancelar.setVisible(true);  
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jmPesqColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPesqColabActionPerformed
        AtualizarExcluirColaborador formPesqColab = new AtualizarExcluirColaborador();  
        formPesqColab.setVisible(true);  
        dispose();
    }//GEN-LAST:event_jmPesqColabActionPerformed

    private void jmPesqClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPesqClienteActionPerformed
        AtualizarExcluirCliente formPesqCliente = new AtualizarExcluirCliente();  
        formPesqCliente.setVisible(true);  
        dispose();
    }//GEN-LAST:event_jmPesqClienteActionPerformed

    private void jmCadastroColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroColabActionPerformed
        CadastrarColaborador formCadastroProduto = new CadastrarColaborador();  
        formCadastroProduto.setVisible(true);  
        dispose();
    }//GEN-LAST:event_jmCadastroColabActionPerformed

    private void txtCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProdutoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastrarCliente formCadastroCliente = new CadastrarCliente();  
        formCadastroCliente.setVisible(true);  
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
      String valorProcurarCodigo = "";
      String valorProcurarProduto = "";
      String valorProcurarCategoria = "";
      
        if(!this.txtCodigoProduto.getText().equals(0)){
        
            valorProcurarCodigo = txtCodigoProduto.getText();
        }
        if(!this.txtProduto.getText().equals("")){
        
            valorProcurarProduto = txtProduto.getText();
        }
        if(!this.JcboCategoria.getSelectedItem().equals("")){
        
            if(JcboCategoria.getSelectedIndex()>0)
                valorProcurarCategoria = JcboCategoria.getSelectedItem().toString();
        }
        
        
        try {
            
            
            ArrayList<String[]> linhasProdutos = ProdutoController.Pesquisar(Integer.parseInt(valorProcurarCodigo)
                    , valorProcurarProduto
                    , valorProcurarCategoria);

            DefaultTableModel tmProdutos = new DefaultTableModel();
            tmProdutos.addColumn("Id");
            tmProdutos.addColumn("Categoria");
            tmProdutos.addColumn("Produto");
            tmProdutos.addColumn("Quantidade");
            tblProdutos.setModel(tmProdutos);

            for(String[] c:linhasProdutos)
            {
                tmProdutos.addRow(c);
            }

            tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
            tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(50);
           
        } catch (SQLException ex) {
            Logger.getLogger(AtualizarExcluirProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnAtulizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtulizarProdutoActionPerformed
         if(tblProdutos.getRowCount()>0)
        {
            if(tblProdutos.getSelectedRow()>=0)
            {
                CadastrarProduto form2 = new CadastrarProduto();  
                form2.setVisible(true);  
                dispose();      
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Selecione um produto para editar!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Não há produtos para editar!");
        }             
    }//GEN-LAST:event_btnAtulizarProdutoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AtualizarExcluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarExcluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarExcluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarExcluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarExcluirProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcboCategoria;
    private javax.swing.JButton btnAtulizarProduto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnLimparProduto;
    private javax.swing.JButton btnNovoProduto;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmCadastroColab;
    private javax.swing.JMenuItem jmPesqCliente;
    private javax.swing.JMenuItem jmPesqColab;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}

