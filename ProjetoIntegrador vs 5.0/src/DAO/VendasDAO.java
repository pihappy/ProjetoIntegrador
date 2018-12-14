package DAO;

import Model.Vendas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VendasDAO {
    
   
    
  
         
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SERVIDOR = "localhost";
    private static final String BASEDADOS = "pihappy";
    private static final String LOGIN = "root";
    private static final String SENHA = "";
    private static String url = "";
    private static Connection conexao;

  public static boolean salvar (Vendas v){
      
  
        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO tbl_vendas (pId,pCPF, pCodigoProduto, pDescricaoProduto,pCategoriaProduto,pQuantidadeProduto, pValorUni, pFormPag) VALUES(?, ?, ?, ?, ?, ?, ?, ? );");
         comando.setInt(1,v.getId());
         comando.setString(2, v.getNome());
         comando.setString(3, v.getCPF());
         comando.setInt(4, v.getCodigoProduto());
         comando.setString(5 ,v.getDescricaoProduto()); 
         comando.setString(6, v.getCategoriaProduto());
         comando.setInt(7,v.getQuantidadeProduto());
         comando.setDouble(8,v.getValorUni());
         comando.setString(9,v.getFormPag());
          

            int linhasAfetadas = comando.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (ClassNotFoundException e) {
            retorno = true;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                retorno = false;
            }
        }

        return retorno;
 }
  public static ArrayList<Vendas> getVendas()
    {
     ArrayList<Vendas> listaVendas = new ArrayList<Vendas>();

        try {

            Class.forName(DRIVER);
            url = "jdbc:mysql://" + "localhost:3306" + "/pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            Statement comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM vendas;");
            while (rs.next()) {
                Vendas vendas = new Vendas();
                vendas.setId(rs.getInt("ID"));
                vendas.setCPF(rs.getString("CPF"));
                 vendas.setCodigoProduto(rs.getInt("CodigoProduto"));
                vendas.setDescricaoProduto(rs.getString("DescricaoProduto")); 
                vendas.setCategoriaProduto(rs.getString("CategoriaProduto"));
                vendas.setQuantidadeProduto(rs.getInt("QuantidadeProduto"));
                vendas.setValorUni(rs.getDouble("ValorUni"));
                vendas.setFormPag(rs.getString("FormPag"));
                   
                listaVendas.add(vendas);
            }

        } catch (ClassNotFoundException ex) {
            listaVendas = null;
        } catch (SQLException ex) {
            listaVendas = null;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                listaVendas = null;
            }
        }

        return listaVendas;  //  Simulo uma consulta no banco de dados (SELECT ID,Nome,CPF FROM TabelaXYZ)
        //return SimulaDB.getInstance().getVendas();
    }
   
}

   