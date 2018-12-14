package DAO;

import Model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author gabriela.vsmarques
 */
public class ProdutoDAO {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SERVIDOR = "localhost";
    private static final String BASEDADOS = "pihappy";
    private static final String LOGIN = "root";
    private static final String SENHA = "";
    private static String url = "";
    private static Connection conexao;

    
    /**
     * Metodo salvar que recebe como parametro um objeto produto da model e a partir disso salva no dados no banco.
     * @param pProduto
     * @return boolean
     */
    public static boolean salvar(Produto pProduto) {

        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO produtos(descricaoProduto,quantidadeProduto,valorUni,categoriaProduto)VALUES(?, ?, ?, ?);");
            comando.setString(1, pProduto.getDescricaoProduto());
            comando.setInt(2, pProduto.getQuantidadeProduto());
            comando.setDouble(3, pProduto.getValorUni());
            comando.setString(4, pProduto.getCategoriaProduto());

            int linhasAfetadas = comando.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
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

    /**
     * Metodo atualizar que recebe como parametro um objeto produto da model e a partir disso salva no dados no banco.
     * @param pProduto
     * @return boolean
     */
    public static boolean atualizar(Produto pProduto) {

        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("UPDATE produtos SET descricaoProduto = ?, quantidadeProduto = ?, valorUni = ?, categoriaProduto = ? WHERE codigoProduto = ?;");
            comando.setString(1, pProduto.getDescricaoProduto());
            comando.setInt(2, pProduto.getQuantidadeProduto());
            comando.setDouble(3, pProduto.getValorUni());
            comando.setString(4, pProduto.getCategoriaProduto());
            comando.setString(5, pProduto.getCodigoProduto());

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

    /**
     * Metodo excluir que recebe como parametro o codigo do produto da model e a partir disso excluir no dados no banco. 
     * @param pcodigoProduto
     * @return boolean
     */
    public static boolean excluir(int codigoProduto) {


        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("DELETE FROM produtos WHERE codigoProduto = ?");
            comando.setInt(1, codigoProduto);

            int linhasAfetadas = comando.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (ClassNotFoundException ex) {
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
    /**
     * @param p
     * @return Lista de produtos por campos especificos que o usuário pode escolher por qual pesquisar e retornar para a View AtualizarExcluirProduto.
     * @throws SQLException 
     */
        public static ArrayList<Produto> pesquisar(Produto p) throws SQLException {

        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

        try {

            Class.forName(DRIVER);
            url = "jdbc:mysql://" + "localhost:3306" + "/pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM produtos WHERE codigoProduto = ? OR descricaoProduto = ? OR categoriaProduto = ?;");
            comando.setString(1, p.getCodigoProduto() );
            comando.setString(2, p.getDescricaoProduto() );
            comando.setString(3, p.getCategoriaProduto() );

            ResultSet rs = comando.executeQuery();
            
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigoProduto(rs.getString("codigoProduto"));
                produto.setDescricaoProduto(rs.getString("descricaoProduto"));
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
        
    public static ArrayList<Produto> pesquisarProdutoVendas(Produto p) throws SQLException {

        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

        try {

            Class.forName(DRIVER);
            url = "jdbc:mysql://" + "localhost:3306" + "/pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM produtos WHERE codigoProduto = ?;");
            comando.setString(1, p.getCodigoProduto() + "%");

            ResultSet rs = comando.executeQuery();
            
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigoProduto(rs.getString("codigoProduto"));
                produto.setDescricaoProduto(rs.getString("descricaoProduto"));
                produto.setCategoriaProduto(rs.getString("categoriaProduto"));
                produto.setQuantidadeProduto(rs.getInt("quantidadeProduto"));
                produto.setValorUni(rs.getDouble("valorUni"));
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
        
    public static ArrayList<Produto> getProdutos() {
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

        try {

            Class.forName(DRIVER);
            url = "jdbc:mysql://" + "localhost:3306" + "/pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            Statement comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM produtos;");
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigoProduto(rs.getString("codigoProduto"));
                produto.setDescricaoProduto(rs.getString("descricaoProduto"));
                produto.setQuantidadeProduto(rs.getInt("quantidadeProduto"));
                produto.setValorUni(rs.getDouble("valorUni"));
                produto.setCategoriaProduto(rs.getString("categoriaProduto"));
                listaProdutos.add(produto);
            }

        } catch (ClassNotFoundException ex) {
            listaProdutos = null;
        } catch (SQLException ex) {
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

}
