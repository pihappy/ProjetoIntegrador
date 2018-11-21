/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.CadastrarProduto;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriela.vsmarques
 */
public class CadastrarProdutoDAO {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String SERVIDOR = "localhost";
	private static final String BASEDADOS = "pihappy";
	private static final String LOGIN = "root";
	private static final String SENHA = "";
	private static String url = "";
	private static Connection conexao;

	
	
	
	public static boolean salvar(CadastrarProduto produto) {

		boolean retorno = false;

		try {
			Class.forName(DRIVER);
			url = "jdbc:mysql://localhost:3306/" + "pihappy";
			conexao = DriverManager.getConnection(url, "root", "");
			// PreparedStatement
			Statement comando = conexao.createStatement();
			int linhasAfetadas = comando
					.executeUpdate("INSERT INTO produtos (Codigo,Descricao,Quantidade,ValorUni,Categoria) " + "VALUES("
							+ "'" + produto.getCodigoProduto() + "'" + "," + "'" + produto.getDescricaoProduto() + "'"
							+ "," + "'" + produto.getQuantidadeProduto() + "'" + "," + "'" + produto.getValorUni() + "'"
							+ "," + "'" + produto.getCategoriaProduto() + "'" + ")");

			if (linhasAfetadas > 0) {
				retorno = true;
			} else {
				retorno = false;
			}

		} catch (ClassNotFoundException ex) {
			retorno = false;
		} catch (SQLException ex) {
			retorno = false;
		}

		finally {
			try {
				conexao.close();
			} catch (SQLException ex) {
				retorno = false;
			}

		}

		return retorno;

	}

    public static ArrayList<CadastrarProduto> getCadastrarProduto()
    {
        ArrayList<CadastrarProduto> listaCadastrarProduto = new ArrayList<CadastrarProduto>();
        
        try {
           
            Class.forName(DRIVER);
            url = "jdbc:mysql://" + "localhost:3306" + "/pihappy";
            conexao = DriverManager.getConnection(url,"root","");
            Statement comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM produtos;");
            while(rs.next())
            {
                CadastrarProduto produto = new CadastrarProduto();
                produto.setCodigoProduto(rs.getInt("codigoProduto"));
                produto.setDescricaoProduto(rs.getString("descricaoProduto"));
                produto.setQuantidadeProduto(rs.getInt("quantidadeProduto"));
                produto.setValorUni(rs.getDouble("valorUni"));
                produto.setCategoriaProduto(rs.getString("categoriaProduto"));
                listaCadastrarProduto.add(produto);
            }
            
        } catch (ClassNotFoundException ex) {
        	listaCadastrarProduto = null;
        } catch (SQLException ex) {
        	listaCadastrarProduto = null;
        } finally{
            try {
                conexao.close();
            } catch (SQLException ex) {
            	listaCadastrarProduto = null;
            }
        }
        
        return listaCadastrarProduto;
    }





}
