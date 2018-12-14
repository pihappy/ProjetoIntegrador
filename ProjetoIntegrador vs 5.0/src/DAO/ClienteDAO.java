package DAO;
//@author victor.maoliveira

import Model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {
   
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SERVIDOR = "localhost";
    private static final String BASEDADOS = "pihappy";
    private static final String LOGIN = "root";
    private static final String SENHA = "";
    private static String url = "";
    private static Connection conexao;
    
    public static boolean Salvar(Cliente p)
    {
        boolean retorno = false;
        
        try {
            //Simulo uma inserção no banco de dados (INSERT INTO...)
            //return SimulaDB.getInstance().SalvarCliente(p);
            Class.forName(DRIVER);
            url="jdbc:mysql://localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url,"root","");
            Statement comando = conexao.createStatement();
            int linhasAfetadas = comando.executeUpdate("INSERT INTO cliente (nome,CPF,datanasc,"+
                    "sexo,CEP,rua,numero,bairro,complemento,estado,"+
                    "cidade,celular1,celular2,telefone,recado,email) " + 
                    "VALUES(" +
                    "'" + p.getNome() + "'" + "," +
                    "'" + p.getCPF() + "'" + "," +
                    "'" + p.getDataNasc() + "'" + "," +
                    "'" + p.getSexo() + "'" + "," +
                    "'" + p.getCEP() + "'" + "," +
                    "'" + p.getRua() + "'" + "," +
                    "'" + p.getNumero()+ "'" + "," +
                    "'" + p.getBairro()+ "'" + "," +
                    "'" + p.getComplemento()+ "'" + "," +
                    "'" + p.getEstado()+ "'" + "," +
                    "'" + p.getCidade() + "'" + "," +
                    "'" + p.getCelular1()+ "'" + "," +
                    "'" + p.getCelular2()+ "'" +"," +
                    "'" + p.getTelefone()+ "'" +"," +
                    "'" + p.getRecado()+ "'" +"," +
                    "'" + p.getEmail()+ "'" + ")"
                    );
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            retorno = false;
        }finally{
            try {
                conexao.close();
            } catch (SQLException ex) {
                retorno = false;
            }
            
        }
        
        return retorno;
        
              
    }
    
    public static boolean Atualizar(Cliente p, String pId) throws ClassNotFoundException, SQLException
    {
        boolean retorno = false;
        
        try {
            
            Class.forName(DRIVER);
            url="jdbc:mysql://localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url,"root","");
            Statement pst = conexao.createStatement();
            int linhasAfetadas = pst.executeUpdate("UPDATE cliente SET " + 
                " nome = '" + p.getNome() + "', CPF = '" + p.getCPF() + "', datanasc = '" + p.getDataNasc() + "', sexo = '" + p.getSexo() + "'"+
                ", CEP = '" + p.getCEP() + "', rua = '" + p.getRua() + "', numero = " + p.getNumero() + ", bairro = '" + p.getBairro() + "'," +
                " complemento = '" + p.getComplemento() + "', estado = '" + p.getEstado() + "', cidade = '" + p.getCidade() + "', celular1 = '" + p.getCelular1() + "'"+
                ", celular2 = '" + p.getCelular2() + "', telefone = '" + p.getTelefone() + "', recado = '" + p.getRecado() + "', email = '" + p.getEmail() + "'" +
                "where id = " + pId + ";"
                );
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }    
            
        } catch (ClassNotFoundException | SQLException ex) {
            retorno = false;
        }finally{
            try {
                conexao.close();
            } catch (SQLException ex) {
                retorno = false;
            }
            
        }
        
        return retorno;
        
        
        
    }
    
    public static boolean Excluir(int pID)
    {
        //Simulo uma exclusão no banco de dados (DELETE FROM TabelaXYZ WHERE...)
        //return SimulaDB.getInstance().ExcluirCliente(pID);
        boolean retorno = false;
        
        try {
            //Simulo uma inserção no banco de dados (INSERT INTO...)
            //return SimulaDB.getInstance().SalvarCliente(p);
            Class.forName(DRIVER);
            url="jdbc:mysql://localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url,"root","");
            Statement comando = conexao.createStatement();
            int linhasAfetadas = comando.executeUpdate("DELETE FROM cliente " + 
                    " WHERE id =" + pID
                    );
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            retorno = false;
        }finally{
            try {
                conexao.close();
            } catch (SQLException ex) {
                retorno = false;
            }
            
        }
        
        return retorno;
        
                       
    }
    
    public static ArrayList<Cliente> Pesquisar(Cliente p) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        try {

            Class.forName(DRIVER);
            url = "jdbc:mysql://" + "localhost:3306" + "/pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM cliente WHERE id LIKE ? OR nome LIKE ? OR CPF LIKE ?;");
            comando.setString(1, p.getId() + "%");
            comando.setString(2, p.getNome() + "%");
            comando.setString(3, p.getCPF() + "%");

            ResultSet rs = comando.executeQuery();
            
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getString("id"));
                c.setNome(rs.getString("nome"));
                c.setCPF(rs.getString("CPF"));
                c.setDataNasc(rs.getString("datanasc"));
                c.setSexo(rs.getString("sexo"));
                c.setCEP(rs.getString("CEP"));
                c.setRua(rs.getString("rua"));
                c.setNumero(rs.getInt("numero"));
                c.setBairro(rs.getString("bairro"));
                c.setComplemento(rs.getString("complemento"));
                c.setEstado(rs.getString("estado"));
                c.setCidade(rs.getString("cidade"));
                c.setCelular1(rs.getString("celular1"));
                c.setCelular2(rs.getString("celular2"));
                c.setTelefone(rs.getString("telefone"));
                c.setRecado(rs.getString("recado"));
                c.setEmail(rs.getString("email"));
                listaClientes.add(c);
            }
            
        } catch (SQLException ex) {
            listaClientes = null;
        } catch (ClassNotFoundException ex) {
            listaClientes = null;
        }
            
        finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                listaClientes = null;
            }
        }

        return listaClientes;
    }
        /*ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        
        try {
        //return SimulaDB.getInstance().getClientes();
        Class.forName(DRIVER);
        url = "jdbc:mysql://" + "localhost:3306/" + "pihappy";
        conexao = DriverManager.getConnection(url,"root","");
        Statement comando = conexao.createStatement();
        ResultSet rs = comando.executeQuery("SELECT * FROM cliente where id = "+ p.getId() +" OR nome = "+ p.getNome() +" OR CPF = "+ p.getCPF()+";");
        while(rs.next())
        {
        Cliente c = new Cliente();
        c.setId(rs.getInt("id"));
        c.setNome(rs.getString("nome"));
        c.setCPF(rs.getString("CPF"));
        c.setDataNasc(rs.getString("datanasc"));
        c.setSexo(rs.getString("sexo"));
        c.setCEP(rs.getString("CEP"));
        c.setRua(rs.getString("rua"));
        c.setNumero(rs.getInt("numero"));
        c.setBairro(rs.getString("bairro"));
        c.setComplemento(rs.getString("complemento"));
        c.setEstado(rs.getString("estado"));
        c.setCidade(rs.getString("cidade"));
        c.setCelular1(rs.getString("celular1"));
        c.setCelular2(rs.getString("celular2"));
        c.setTelefone(rs.getString("telefone"));
        c.setRecado(rs.getString("recado"));
        c.setEmail(rs.getString("email"));
        listaClientes.add(c);
        }
        
        } catch (ClassNotFoundException | SQLException ex) {
        listaClientes = null;
        } finally{
        try {
        conexao.close();
        } catch (SQLException ex) {
        listaClientes = null;
        }
        }
        
        return listaClientes;
        }*/
    
    
        
        // Alterar os dados do getConnection() de acordo com a tua implementação
	
    
     /*public static ArrayList<Cliente> pesquisarClienteVendas(Cliente ClienteVenda) throws SQLException {

        ArrayList<Cliente> listaProdutos = new ArrayList<Cliente>();

        try {

            Class.forName(DRIVER);
            url = "jdbc:mysql://" + "localhost:3306" + "/pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("SELECT id, CPF, nome,email  FROM clientes WHERE id = ? OR CPF = ?;");
            comando.setInt(1, ClienteVenda.getId());
            comando.setString(2, ClienteVenda.getCPF());

            ResultSet rs = comando.executeQuery();
            
            while (rs.next()) {
                Cliente ClienteVenda = new Cliente();
                ClienteVenda.setCodigoProduto(rs.getString("codigoProduto"));
                ClienteVenda.setDescricaoProduto(rs.getString("descricaoProduto"));
                produto.setQuantidadeProduto(rs.getInt("quantidadeProduto"));
                produto.setValorUni(rs.getDouble("valorUni"));
                produto.setCategoriaProduto(rs.getString("categoriaProduto"));
                listaProdutos.add(produto);
            }
            

        } catch (ClassNotFoundException | SQLException ex) {
            listaProdutos = null;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                listaProdutos = null;
            }
        }

        return listaProdutos;
    }
    
    */
        
     
public static ArrayList<Cliente> getClientes()
    {
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        
        try {
            //return SimulaDB.getInstance().getClientes();
            Class.forName(DRIVER);
            url = "jdbc:mysql://" + "localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url,"root","");
            Statement comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM cliente;");
            while(rs.next())
            {
                Cliente c = new Cliente();
                c.setId(rs.getString("id"));
                c.setNome(rs.getString("nome"));
                c.setCPF(rs.getString("CPF"));
                c.setDataNasc(rs.getString("datanasc"));
                c.setSexo(rs.getString("sexo"));
                c.setCEP(rs.getString("CEP"));
                c.setRua(rs.getString("rua"));
                c.setNumero(rs.getInt("numero"));
                c.setBairro(rs.getString("bairro"));
                c.setComplemento(rs.getString("complemento"));
                c.setEstado(rs.getString("estado"));
                c.setCidade(rs.getString("cidade"));
                c.setCelular1(rs.getString("celular1"));
                c.setCelular2(rs.getString("celular2"));
                c.setTelefone(rs.getString("telefone"));
                c.setRecado(rs.getString("recado"));
                c.setEmail(rs.getString("email"));
                listaClientes.add(c);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            listaClientes = null;
        } finally{
            try {
                conexao.close();
            } catch (SQLException ex) {
                listaClientes = null;
            }
        }
        
        return listaClientes;
    }
    
}
