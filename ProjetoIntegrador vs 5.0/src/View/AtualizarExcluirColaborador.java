package View;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Controller.ColaboradorController;
import Model.Colaborador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mikael.asilva3
 */
public class AtualizarExcluirColaborador extends javax.swing.JFrame {

    public AtualizarExcluirColaborador() {
        initComponents();
        this.setLocationRelativeTo(null);
        DesabilitarFormulario();
        LoadTable();

    }

    public void LoadTable() {

        //Peço ao controller resgatar os clientes do banco de dados
        ArrayList<String[]> linhaColaborador = ColaboradorController.getColaboradores();

        DefaultTableModel tmColaborador = new DefaultTableModel();
        tmColaborador.addColumn("ID");
        tmColaborador.addColumn("Nome");
        tmColaborador.addColumn("CPF");
        tmColaborador.addColumn("DataNasc");
        tmColaborador.addColumn("Sexo");
        tmColaborador.addColumn("CEP");
        tmColaborador.addColumn("Rua");
        tmColaborador.addColumn("Numero");
        tmColaborador.addColumn("Bairro");
        tmColaborador.addColumn("Complemento");
        tmColaborador.addColumn("Estado");
        tmColaborador.addColumn("Cidade");
        tmColaborador.addColumn("Celular1");
        tmColaborador.addColumn("Celular2");
        tmColaborador.addColumn("Telefone");
        tmColaborador.addColumn("Recado");
        tmColaborador.addColumn("Email");
        tmColaborador.addColumn("Cargo");
        tmColaborador.addColumn("Departamento");
        tmColaborador.addColumn("Admissao");
        tmColaborador.addColumn("Salario");
        tblColaborador.setModel(tmColaborador);

        for (String[] c : linhaColaborador) {
            tmColaborador.addRow(c);
        }

        tblColaborador.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblColaborador.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblColaborador.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblColaborador.getColumnModel().getColumn(3).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(4).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(5).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(6).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(7).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(8).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(9).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(10).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(11).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(12).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(13).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(14).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(15).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(16).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(17).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(18).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(19).setPreferredWidth(0);
        tblColaborador.getColumnModel().getColumn(20).setPreferredWidth(0);

    }

    public void LimparFormulario() {

        txtIdColaborador.setText("");
        txtNomeColaborador.setText("");
        txtCPFColaborador.setText("");
        cboDeptoColaborador.setSelectedIndex(0);

    }

    public void DesabilitarFormulario() {

        txtIdColaborador.setEditable(false);

    }

    public void HabilitarFormulario() {
        txtNomeColaborador.setEditable(true);
        txtCPFColaborador.setEditable(true);

        btnNovoColaborador.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    private boolean ValidarFormulario() {

        if (this.txtNomeColaborador.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um Nome para o colaborador!");
            return false;
        }

        if (this.txtCPFColaborador.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para colaborador!");
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
        pnlColaborador1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCPFColaborador = new javax.swing.JTextField();
        txtNomeColaborador = new javax.swing.JTextField();
        btnProcurar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        cboDeptoColaborador = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdColaborador = new javax.swing.JTextField();
        pnlBotoes = new javax.swing.JPanel();
        btnNovoColaborador = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblColaborador = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jmCadastrarCliente = new javax.swing.JMenuItem();
        jmPesqCliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmCadastroProduto = new javax.swing.JMenuItem();
        jmPesqProduto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Colaborador");

        pnlColaborador1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Colaborador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("CPF:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        txtCPFColaborador.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtNomeColaborador.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

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

        btnLimpar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/limpar(1).png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        cboDeptoColaborador.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cboDeptoColaborador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Administração", "Operacional" }));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Departamento:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("ID:");

        txtIdColaborador.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        javax.swing.GroupLayout pnlColaborador1Layout = new javax.swing.GroupLayout(pnlColaborador1);
        pnlColaborador1.setLayout(pnlColaborador1Layout);
        pnlColaborador1Layout.setHorizontalGroup(
            pnlColaborador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlColaborador1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlColaborador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlColaborador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlColaborador1Layout.createSequentialGroup()
                        .addComponent(txtIdColaborador)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPFColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboDeptoColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNomeColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlColaborador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpar)
                    .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pnlColaborador1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLimpar, btnProcurar});

        pnlColaborador1Layout.setVerticalGroup(
            pnlColaborador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlColaborador1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlColaborador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(pnlColaborador1Layout.createSequentialGroup()
                .addGroup(pnlColaborador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcurar)
                    .addComponent(cboDeptoColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(txtCPFColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(btnLimpar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlColaborador1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLimpar, btnProcurar});

        pnlBotoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        btnNovoColaborador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnNovoColaborador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add (5).png"))); // NOI18N
        btnNovoColaborador.setText("Novo Colaborador");
        btnNovoColaborador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoColaborador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovoColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoColaboradorActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/atualizar(3).png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
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

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovoColaborador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(btnNovoColaborador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAtualizar, btnExcluir});

        tblColaborador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        tblColaborador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblColaborador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "Data de Nascimento", "Sexo", "CEP", "Rua", "Número", "Bairro", "Complemento", "Estado", "Cidade", "Celular1", "Celular2", "Telefone", "Recado", "Email", "Cargo", "Departamento", "Admissao", "Salario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblColaborador);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlColaborador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlColaborador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu5.setText("Cliente");
        jMenu5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jmCadastrarCliente.setText("Cadastrar Cliente");
        jmCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarClienteActionPerformed(evt);
            }
        });
        jMenu5.add(jmCadastrarCliente);

        jmPesqCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmPesqCliente.setText("Pesquisar Cliente");
        jmPesqCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPesqClienteActionPerformed(evt);
            }
        });
        jMenu5.add(jmPesqCliente);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Produto");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jmCadastroProduto.setText("Cadastrar Produto");
        jmCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroProdutoActionPerformed(evt);
            }
        });
        jMenu4.add(jmCadastroProduto);

        jmPesqProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmPesqProduto.setText("Pesquisar Produto");
        jmPesqProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPesqProdutoActionPerformed(evt);
            }
        });
        jMenu4.add(jmPesqProduto);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarClienteActionPerformed
        CadastrarCliente form2 = null;
        try {
            form2 = new CadastrarCliente();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AtualizarExcluirColaborador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AtualizarExcluirColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }
        form2.setVisible(true);
        dispose();
    }//GEN-LAST:event_jmCadastrarClienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        TelaPrincipal form2 = new TelaPrincipal();
        form2.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jmPesqClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPesqClienteActionPerformed
        AtualizarExcluirCliente form2 = new AtualizarExcluirCliente();
        form2.setVisible(true);
        dispose();
    }//GEN-LAST:event_jmPesqClienteActionPerformed

    private void jmCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroProdutoActionPerformed
        CadastrarProduto form2 = new CadastrarProduto();
        form2.setVisible(true);
        dispose();
    }//GEN-LAST:event_jmCadastroProdutoActionPerformed

    private void jmPesqProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPesqProdutoActionPerformed
        AtualizarExcluirProduto form2 = new AtualizarExcluirProduto();
        form2.setVisible(true);
        dispose();
    }//GEN-LAST:event_jmPesqProdutoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparFormulario();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
       
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnNovoColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoColaboradorActionPerformed
        CadastrarColaborador tela1 = new CadastrarColaborador();
        tela1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNovoColaboradorActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarExcluirColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarExcluirColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarExcluirColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarExcluirColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarExcluirColaborador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovoColaborador;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JComboBox<String> cboDeptoColaborador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmCadastrarCliente;
    private javax.swing.JMenuItem jmCadastroProduto;
    private javax.swing.JMenuItem jmPesqCliente;
    private javax.swing.JMenuItem jmPesqProduto;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlColaborador1;
    private javax.swing.JTable tblColaborador;
    private javax.swing.JTextField txtCPFColaborador;
    private javax.swing.JTextField txtIdColaborador;
    private javax.swing.JTextField txtNomeColaborador;
    // End of variables declaration//GEN-END:variables
}
