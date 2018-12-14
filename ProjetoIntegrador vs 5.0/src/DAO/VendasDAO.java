package DAO;

import Model.Vendas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author gabriela.vsmarques
 */
public class VendasDAO {
    
  //  public static boolean salvar (Vendas v){
     
    //    return SimulaDB.getInstance().salvarVendas(v);
    //}
    
    //public static ArrayList<Vendas> getVendas()
    //{
        //Simulo uma consulta no banco de dados (SELECT ID,Nome,CPF FROM TabelaXYZ)
      //  return SimulaDB.getInstance().getVendas();
    //}
         
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
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO tbl_vendas (pId,pNome,pCPF) VALUES(?, ?, ? );");
//            comando.setInt(1,v.getpId());
  //          comando.setString(2, v.getpNome());
    //        comando.setString(3, v.getpCPF());
          

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

   
}

   