/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import Model.Cliente;
import static View.AtualizarExcluirCliente.tblClientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Mikael
 */
public final class CadastrarCliente extends javax.swing.JFrame {
    /**
     * Creates new form CadastrarCliente1
     */
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SERVIDOR = "localhost";
    private static final String BASEDADOS = "pihappy";
    private static final String LOGIN = "root";
    private static final String SENHA = "";
    private static String url = "";
    private static Connection conexao;
    
    public CadastrarCliente() throws ClassNotFoundException, SQLException {
    
        initComponents();
        
        this.setLocationRelativeTo(null);
        txtIdCliente.setEditable(false);
        
    }
    
    public void LimparFormulario()
    {
        txtIdCliente.setText("");
        txtNomeCliente.setText("");
        txtCPFCliente.setText("");
        txtCEP.setText("");
        txtBairro.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtComplemento.setText("");
        txtCidade.setText("");
        txtDataNascCliente.setText("");
        jcSexo1.setSelectedIndex(0);
        jcEstado.setSelectedIndex(0);
        txtCelular1.setText("");
        txtCelular2.setText("");
        txtEmail.setText("");
        txtRecado.setText("");
        txtTelefone.setText("");
    }
    
    public void HabilitarFormulario()
    {
        txtIdCliente.setEditable(true);
        txtNomeCliente.setEditable(true);
        txtCPFCliente.setEditable(true);
    }

    private boolean ValidarFormulario() {
        
        if(this.txtNomeCliente.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um nome para o cliente!");
            return false;
        }
        
        if(this.txtCPFCliente.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um CPF para o cliente!");
            return false;
        }
        
        if(this.txtDataNascCliente.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina uma data de nascimento para o cliente!");
            return false;
        }
        
        if(this.txtCEP.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um CEP para o endereço do cliente!");
            return false;
        }
        
        if(this.txtRua.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina uma rua para o endereço do cliente!");
            return false;
        }
        
        if(this.txtNumero.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um numero para o endereço do cliente!");
            return false;
        }
        
        if(this.txtBairro.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um Bairro para o endereço do cliente!");
            return false;
        }
        
        if(this.txtCidade.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina uma cidade para o endereço do cliente!");
            return false;
        }
        
        if(this.txtCelular1.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um Celular para o cliente!");
            return false;
        }
        
        if(this.txtTelefone.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um Telefone para o cliente!");
            return false;
        }
        
        if(this.txtEmail.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um E-mail para o cliente!");
            return false;
        }
                
        int sexo = 0;
        int estado = 0;
        if(this.jcSexo1.equals(sexo))
        {
            JOptionPane.showMessageDialog(this,"Defina um sexo para o cliente!");
            return false;
        }
        if(this.jcEstado.equals(estado))
        {
            JOptionPane.showMessageDialog(this,"Defina um estado para o endereço do cliente!");
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

        jTextField1 = new javax.swing.JTextField();
        pnlGeralCadCliente = new javax.swing.JPanel();
        pnlDadosGerais = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jcSexo1 = new javax.swing.JComboBox<>();
        txtCPFCliente = new javax.swing.JFormattedTextField();
        lblDataNasc = new javax.swing.JLabel();
        txtDataNascCliente = new javax.swing.JFormattedTextField();
        lblIdCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        pnlEndereço = new javax.swing.JPanel();
        lblCEP = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        jcEstado = new javax.swing.JComboBox<>();
        Contato = new javax.swing.JPanel();
        lblCelular1 = new javax.swing.JLabel();
        lblCelular2 = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblRecado = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCelular1 = new javax.swing.JFormattedTextField();
        txtCelular2 = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtRecado = new javax.swing.JFormattedTextField();
        btnSalvarCliente = new javax.swing.JButton();
        btnLimparDados = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Cliente");

        pnlDadosGerais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        lblNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNome.setText("Nome:");

        lblCPF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCPF.setText("CPF:");

        lblSexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSexo.setText("Sexo:");

        txtNomeCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtNomeCliente.setPreferredSize(new java.awt.Dimension(300, 20));

        jcSexo1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcSexo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Masculino", "Feminino", "Não gostaria de declarar" }));

        try {
            txtCPFCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCPFCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblDataNasc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDataNasc.setText("Dt. Nascimento:");

        try {
            txtDataNascCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataNascCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblIdCliente.setText("ID:");

        javax.swing.GroupLayout pnlDadosGeraisLayout = new javax.swing.GroupLayout(pnlDadosGerais);
        pnlDadosGerais.setLayout(pnlDadosGeraisLayout);
        pnlDadosGeraisLayout.setHorizontalGroup(
            pnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosGeraisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIdCliente)
                    .addComponent(lblNome)
                    .addComponent(lblCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosGeraisLayout.createSequentialGroup()
                        .addComponent(txtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDataNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataNascCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcSexo1, 0, 1, Short.MAX_VALUE))
                    .addGroup(pnlDadosGeraisLayout.createSequentialGroup()
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDadosGeraisLayout.setVerticalGroup(
            pnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosGeraisLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdCliente)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCPF)
                        .addComponent(txtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDataNasc)
                        .addComponent(txtDataNascCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSexo)
                        .addComponent(jcSexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        pnlEndereço.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        lblCEP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCEP.setText("CEP:");

        lblRua.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblRua.setText("Rua:");

        lblNumero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNumero.setText("Número:");

        lblBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblBairro.setText("Bairro:");

        lblCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCidade.setText("Cidade:");

        txtRua.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtNumero.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtBairro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtCidade.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblEstado.setText("Estado:");

        lblComplemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblComplemento.setText("Complemento:");

        txtComplemento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCEP.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jcEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Estado", "-----------------------", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout pnlEndereçoLayout = new javax.swing.GroupLayout(pnlEndereço);
        pnlEndereço.setLayout(pnlEndereçoLayout);
        pnlEndereçoLayout.setHorizontalGroup(
            pnlEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEndereçoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCEP, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRua, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBairro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEstado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(pnlEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEndereçoLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(lblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEndereçoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(pnlEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlEndereçoLayout.createSequentialGroup()
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(lblComplemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComplemento))
                            .addGroup(pnlEndereçoLayout.createSequentialGroup()
                                .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(lblNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlEndereçoLayout.setVerticalGroup(
            pnlEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEndereçoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCEP)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRua)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComplemento)
                    .addComponent(lblBairro)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Contato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        lblCelular1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCelular1.setText("Celular (1):");

        lblCelular2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCelular2.setText("Celular (2):");

        lblTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblTelefone.setText("Telefone:");

        lblRecado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblRecado.setText("Recado:");

        lblEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblEmail.setText("E - mail:");

        txtEmail.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtEmail.setToolTipText("");

        try {
            txtCelular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        try {
            txtCelular2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        try {
            txtRecado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRecado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        javax.swing.GroupLayout ContatoLayout = new javax.swing.GroupLayout(Contato);
        Contato.setLayout(ContatoLayout);
        ContatoLayout.setHorizontalGroup(
            ContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContatoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCelular1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContatoLayout.createSequentialGroup()
                        .addGroup(ContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCelular1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(txtTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContatoLayout.createSequentialGroup()
                                .addComponent(lblRecado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRecado, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContatoLayout.createSequentialGroup()
                                .addComponent(lblCelular2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelular2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtEmail))
                .addContainerGap())
        );
        ContatoLayout.setVerticalGroup(
            ContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular1)
                    .addComponent(txtCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelular2)
                    .addComponent(txtCelular2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRecado)
                    .addComponent(txtRecado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvarCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSalvarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/save.png"))); // NOI18N
        btnSalvarCliente.setText("Cadastrar");
        btnSalvarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        btnLimparDados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnLimparDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/limpar(1).png"))); // NOI18N
        btnLimparDados.setText("Limpar");
        btnLimparDados.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLimparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparDadosActionPerformed(evt);
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

        javax.swing.GroupLayout pnlGeralCadClienteLayout = new javax.swing.GroupLayout(pnlGeralCadCliente);
        pnlGeralCadCliente.setLayout(pnlGeralCadClienteLayout);
        pnlGeralCadClienteLayout.setHorizontalGroup(
            pnlGeralCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosGerais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlEndereço, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Contato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlGeralCadClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarCliente))
        );

        pnlGeralCadClienteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnLimparDados, btnSalvarCliente});

        pnlGeralCadClienteLayout.setVerticalGroup(
            pnlGeralCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeralCadClienteLayout.createSequentialGroup()
                .addComponent(pnlDadosGerais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeralCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimparDados)
                    .addGroup(pnlGeralCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );

        pnlGeralCadClienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnLimparDados, btnSalvarCliente});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlGeralCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGeralCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        if(txtIdCliente.getText().equals("")){
            if(ValidarFormulario())
                {
                    //Passar a Controller do método Salvar
                    if(ClienteController.Salvar(txtNomeCliente.getText(),txtCPFCliente.getText(),txtDataNascCliente.getText(),jcSexo1.getSelectedItem().toString(), txtCEP.getText(),txtRua.getText(),Integer.parseInt(txtNumero.getText()), txtBairro.getText(), txtComplemento.getText(),jcEstado.getSelectedItem().toString(),txtCidade.getText(),txtCelular1.getText(),txtCelular2.getText(),txtTelefone.getText(),txtRecado.getText(),txtEmail.getText()))
                    {
                        JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso!");
                        AtualizarExcluirCliente form2 = new AtualizarExcluirCliente();  
                        form2.setVisible(true);  
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(null,"Falha ao cadastrar cliente!");
                        LimparFormulario();
                    }
            }
        }else{
            try {
                if(ClienteController.Atualizar(txtIdCliente.getText(),txtNomeCliente.getText(),txtCPFCliente.getText(),txtDataNascCliente.getText(),jcSexo1.getSelectedItem().toString(), txtCEP.getText(),txtRua.getText(),Integer.parseInt(txtNumero.getText()), txtBairro.getText(), txtComplemento.getText(),jcEstado.getSelectedItem().toString(),txtCidade.getText(),txtCelular1.getText(),txtCelular2.getText(),txtTelefone.getText(),txtRecado.getText(),txtEmail.getText()))
                {
                    JOptionPane.showMessageDialog(this,"Cliente atualizado com sucesso!");
                    AtualizarExcluirCliente form2 = new AtualizarExcluirCliente();
                    form2.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(this,"Falha ao atualizar cliente!");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnLimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDadosActionPerformed
        LimparFormulario();
    }//GEN-LAST:event_btnLimparDadosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        AtualizarExcluirCliente form2 = new AtualizarExcluirCliente();  
        form2.setVisible(true);  
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastrarCliente().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contato;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimparDados;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcEstado;
    private javax.swing.JComboBox<String> jcSexo1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular1;
    private javax.swing.JLabel lblCelular2;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRecado;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlDadosGerais;
    private javax.swing.JPanel pnlEndereço;
    private javax.swing.JPanel pnlGeralCadCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPFCliente;
    private javax.swing.JFormattedTextField txtCelular1;
    private javax.swing.JFormattedTextField txtCelular2;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtDataNascCliente;
    private javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtRecado;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    void receberValores(int Id, String Nome, String CPF, String DataNasc, String Sexo, String CEP, String Rua, int Numero, String Bairro, String Complemento, String Estado, String Cidade, String Celular1, String Celular2, String Telefone, String Recado, String Email) {
        txtIdCliente.setText(String.valueOf(Id));
        txtNomeCliente.setText(String.valueOf(Nome));
        txtCPFCliente.setText(String.valueOf(CPF));
        txtDataNascCliente.setText(String.valueOf(DataNasc));
        jcSexo1.setSelectedItem(String.valueOf(Sexo));
        txtCEP.setText(String.valueOf(CEP));
        txtRua.setText(String.valueOf(Rua));
        txtNumero.setText(String.valueOf(Numero));
        txtBairro.setText(String.valueOf(Bairro));
        txtComplemento.setText(String.valueOf(Complemento));
        jcEstado.setSelectedItem(String.valueOf(Estado));
        txtCidade.setText(String.valueOf(Cidade));
        txtCelular1.setText(String.valueOf(Celular1));
        txtCelular2.setText(String.valueOf(Celular2));
        txtTelefone.setText(String.valueOf(Telefone));
        txtRecado.setText(String.valueOf(Recado));
        txtEmail.setText(String.valueOf(Email));
    }
}
