package DAO;

import Model.Produto;
import java.util.ArrayList;


/**
 *
 * @author gabriela.vsmarques
 */
public class ProdutoDAO {
    
    public static boolean salvar (Produto p){
     
        return SimulaDB.getInstance().salvarProduto(p);
    }
    
    public static boolean atualizar (Produto p){
        
        return SimulaDB.getInstance().atualizarProduto(p);

    }
    
    public static boolean excluir(int codigoProduto){
        
       return SimulaDB.getInstance().excluirProduto(codigoProduto);
    }
    
    public static ArrayList<Produto> getProdutos()
    {
        //Simulo uma consulta no banco de dados (SELECT ID,Nome,CPF FROM TabelaXYZ)
        return SimulaDB.getInstance().getProdutos();
    }
    
    
	/*
        Deverá ser implementado no Marco 3
    
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

 */
	
	
}
