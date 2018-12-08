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
    
    public static boolean salvar(Relatorio r) {

        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO Relatorio (psqcliente,dtInicio,dtFim,clienteVenda,totalVendas,totalVendasPeriodo) VALUES(?, ?, ?, ?, ?);");
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

    public static boolean atualizar (Relatorio r) {

        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("UPDATE relatorio SET (gerarrelatorio = ?,limparrelatorio = ?, cancelarrelatorio " + "WHERE gerarrelatorio = ?;");
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
 

   //public static boolean salvar (Relatorio r){
     
        //return SimulaDB.getInstance().salvarRelatorio(r);
    }
    
    public static ArrayList<Relatorio> getRelatorio()
    {
        //Simulo uma consulta no banco de dados (SELECT ID,Nome,CPF FROM TabelaXYZ)
        return SimulaDB.getInstance().getRelatorio();
    }
    
}