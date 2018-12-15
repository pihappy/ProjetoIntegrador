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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    
   
    
                

    
   public static boolean gerarRelatorio(Model.Relatorio r){

        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO relatorio (psqcliente,DtInicio,DtFim,ClienteVenda,TotalVendas,totalVendasPeriodo) VALUES(?, ?, ?, ?, ?,?)");
            comando.setString(1, r.getpsqCliente());
            comando.setInt(2, r.getDtInicio());
            comando.setInt(3, r.getDtFim());
            comando.setString(4, r.getClienteVenda());
            comando.setInt(5, r.getTotalVendas());
            comando.setInt(6, r.getTotalVendasPeriodo());
            
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

  
public static boolean gerar (Relatorio r) {

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
    

    

public static ArrayList<Relatorio> getRelatorio()
    {
     ArrayList<Relatorio> listaRelatorio = new ArrayList<Relatorio>();

        try {

            Class.forName(DRIVER);
            url = "jdbc:mysql://" + "localhost:3306" + "/pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            Statement comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM Relatorio;");
            while (rs.next()) {
                Relatorio relatorio = new Relatorio();
                relatorio.setpsqCliente(rs.getString("psqCliente"));
                relatorio.setDtInicio(rs.getInt("DtInicio"));
                 relatorio.setDtFim(rs.getInt("DtFim"));
                relatorio.setClienteVenda(rs.getString("ClienteVenda")); 
                relatorio.setTotalVendas(rs.getInt("TotalVendas"));
                relatorio.setTotalVendasPeriodo(rs.getInt("TotalVendasPeriodo"));
                               
                listaRelatorio.add(relatorio);
            }

        } catch (ClassNotFoundException ex) {
            listaRelatorio = null;
        } catch (SQLException ex) {
            listaRelatorio = null;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                listaRelatorio = null;
            }
        }

        return listaRelatorio;
    }
    
    

}