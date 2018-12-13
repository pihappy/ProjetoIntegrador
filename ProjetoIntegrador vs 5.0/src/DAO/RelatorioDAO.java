/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Model.Relatorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author milena.sgalvao
 */
public class RelatorioDAO {
    
       
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SERVIDOR = "localhost";
    private static final String BASEDADOS = "pihappy";
    private static final String LOGIN = "root";
    private static final String SENHA = "";
    private static String url = "";
    private static Connection conexao;

    
    


/*public class gerarRelatorio 
    try{
    this.conectar();
    this.insertSQL("INSERT INTO tbl_relatorio ("
            + "CodigoProduto,"
            + "DescricaoProduto"
            + "QuantidadeProduto"
            + "ValorUni"
            + "CategoriaProduto"
            + "FormPag"
            + ") VALUES ("
            +"'" + pRelatorio.get);*/
           
    
                

    
   public static boolean gerarRelatorio(Model.Relatorio r){

        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO tbl_relatorio (psqcliente,dtInicio,dtFim,clienteVenda,totalVendas,totalVendasPeriodo) VALUES(?, ?, ?, ?, ?);");
            comando.setString(1, r.getpsqCliente());
            comando.setInt(2, r.getDtInicio());
            comando.setInt(3, r.getDtFim());
            comando.setString(4, r.getClienteVenda());
            comando.setInt(5, r.getTotalVendas());

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
 // public static boolean Pesquisar(int ppsqCliente, int pDtInicio, int pDtFim, String pclienteVendas, int ptotalVendas, int ptotalVendasPeriodo) throws SQLException {
   //     Relatorio r = new Relatorio(ppsqCliente, pDtInicio, pDtFim, pclienteVenda, ptotalVendas,p totalVendasPeriodo );
     //   return RelatorioDAO.Pesquisar(r);
  
public static boolean atualizar (Model.Relatorio r) {

        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("UPDATE tbl_relatorio SET (psqcliente,dtInicio,dtFim,clienteVenda,totalVendas,totalVendasPeriodo) VALUES(?, ?, ?, ?, ?);");
            comando.setString(1, r.getpsqCliente());
            comando.setInt(2, r.getDtInicio());
            comando.setInt(3, r.getDtFim());
            comando.setString(4, r.getClienteVenda());
            comando.setInt(5, r.getTotalVendas());


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
   //public static boolean salvar (RelatorioDAO r){
     
        //return SimulaDB.getInstance().salvarRelatorio(r);

       
    
 /*   public static ArrayList<Model.RelatorioDAO> getRelatorio()
    {
        //Simulo uma consulta no banco de dados (SELECT ID,Nome,CPF FROM TabelaXYZ)
        return SimulaDB.getInstance().getRelatorio();
    }*/


    
    

