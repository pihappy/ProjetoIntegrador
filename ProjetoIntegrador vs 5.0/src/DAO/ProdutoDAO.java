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

    public static boolean salvar(Produto p) {

        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO produtos(descricaoProduto,quantidadeProduto,valorUni,categoriaProduto)VALUES(?, ?, ?, ?);");
            comando.setString(1, p.getDescricaoProduto());
            comando.setInt(2, p.getQuantidadeProduto());
            comando.setDouble(3, p.getValorUni());
            comando.setString(4, p.getCategoriaProduto());

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

    public static boolean atualizar(Produto p) {

        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("UPDATE produtos SET (descricaoProduto = ?, quantidadeProduto = ?, valorUni = ?, categoriaProduto = ?) " + "WHERE codigoProduto = ?;");
            comando.setString(1, p.getDescricaoProduto());
            comando.setInt(2, p.getQuantidadeProduto());
            comando.setDouble(3, p.getValorUni());
            comando.setString(4, p.getCategoriaProduto());
            comando.setInt(5, p.getCodigoProduto());

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

    public static boolean excluir(int codigoProduto) {

        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("DELETE FROM produtos" + "WHERE = ?");
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

    public static ArrayList<Produto> pesquisar(Produto p) throws SQLException {

        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

        try {

            Class.forName(DRIVER);
            url = "jdbc:mysql://" + "localhost:3306" + "/pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM produtos WHERE codigoProduto = ? OR descricaoProduto = ? OR categoriaProduto = ?;");
            comando.setInt(1, p.getCodigoProduto() );
            comando.setString(2, p.getDescricaoProduto() );
            comando.setString(3, p.getCategoriaProduto() );

            ResultSet rs = comando.executeQuery();
            
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigoProduto(rs.getInt("codigoProduto"));
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
                produto.setCodigoProduto(rs.getInt("codigoProduto"));
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
