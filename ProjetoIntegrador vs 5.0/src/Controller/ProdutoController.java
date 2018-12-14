package Controller;

import DAO.ProdutoDAO;
import Model.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriela.vsmarques
 */

public class ProdutoController {

    public static boolean Salvar(String pdescricaoProduto, int pquantidadeProduto, double pvalorUni, String pcategoriaProduto) {

        Produto p = new Produto(pdescricaoProduto, pquantidadeProduto, pvalorUni, pcategoriaProduto);
        return ProdutoDAO.salvar(p);
    }

    public static boolean Atualizar(String pdescricaoProduto, int pquantidadeProduto, double pvalorUni, String pcategoriaProduto, String pcodigoProduto) {

        Produto p = new Produto(pdescricaoProduto, pquantidadeProduto, pvalorUni, pcategoriaProduto, pcodigoProduto);
        return ProdutoDAO.atualizar(p);
    }

    public static boolean Excluir(int codigoProduto) {
        return ProdutoDAO.excluir(codigoProduto);
    }

    public static ArrayList<String[]> Pesquisar(String pcodigoProduto, String pdescricaoProduto, String pcategoriaProduto) throws SQLException {
        
        Produto p  = new Produto();
        p.setCodigoProduto(pcodigoProduto);
        p.setDescricaoProduto(pdescricaoProduto);
        p.setCategoriaProduto(pcategoriaProduto);
        
        ArrayList<Produto> retorno = ProdutoDAO.pesquisar(p);
        
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < retorno.size(); i++) {
            listaProdutos.add(new String[]{String.valueOf(retorno.get(i).getCodigoProduto()),
                retorno.get(i).getDescricaoProduto(),
                String.valueOf(retorno.get(i).getQuantidadeProduto()),
                String.valueOf(retorno.get(i).getValorUni()),
                String.valueOf(retorno.get(i).getCategoriaProduto())});
        }

        return listaProdutos;

    }
    
    public static ArrayList<String[]> pesquisarProdutoVendas(String pId) throws SQLException{
        
            Produto ProdutoVenda = new Produto();
            ProdutoVenda.setCodigoProduto(pId);
            
        
            ArrayList<Produto> retorno = ProdutoDAO.pesquisarProdutoVendas(ProdutoVenda);
            ArrayList<String[]> linhasProdutosVendas = new ArrayList<>();
        
            for (int i = 0; i < retorno.size(); i++) {
                linhasProdutosVendas.add(new String[]{String.valueOf(retorno.get(i).getCodigoProduto()),
                    retorno.get(i).getDescricaoProduto(),
                    retorno.get(i).getCategoriaProduto(),
                    String.valueOf(retorno.get(i).getQuantidadeProduto()),
                    String.valueOf(retorno.get(i).getValorUni())});
            }
            return linhasProdutosVendas; 

    }
    
    public static ArrayList<String[]> getProdutos() {
        ArrayList<Produto> p = ProdutoDAO.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < p.size(); i++) {
            listaProdutos.add(new String[]{String.valueOf(p.get(i).getCodigoProduto()),
                p.get(i).getDescricaoProduto(),
                String.valueOf(p.get(i).getQuantidadeProduto()),
                String.valueOf(p.get(i).getValorUni()),
                String.valueOf(p.get(i).getCategoriaProduto())});
        }

        return listaProdutos;

    }
}
