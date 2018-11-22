package Controller;

import DAO.ProdutoDAO;
import Model.Produto;
import java.util.ArrayList;


/**
 *
 * @author gabriela.vsmarques
 */
public class ProdutoController {
    
    public static boolean salvar(int pcodigoProduto, String pdescricaoProduto, int pquantidadeProduto, double pvalorUni, String pcategoriaProduto) {
    	 
    	Produto p =  new Produto(pcodigoProduto,pdescricaoProduto,pquantidadeProduto,pvalorUni,pcategoriaProduto);
         return ProdutoDAO.salvar(p);
    }
    
    
    public static boolean atualizar(int pcodigoProduto, String pdescricaoProduto, int pquantidadeProduto, double pvalorUni, String pcategoriaProduto) {
    	 
    	Produto p =  new Produto(pcodigoProduto,pdescricaoProduto,pquantidadeProduto,pvalorUni,pcategoriaProduto);
         return ProdutoDAO.atualizar(p);
    }
    
    public static boolean excluir(int codigoProduto)
    {
        return ProdutoDAO.excluir(codigoProduto);
    }
    
    public static ArrayList<String[]> getProdutos()
    {
        ArrayList<Produto> p = ProdutoDAO.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();
        
        for(int i=0;i<p.size();i++)
        {
                        listaProdutos.add(new String[]{String.valueOf(p.get(i).getCodigoProduto()),
                                                                      p.get(i).getDescricaoProduto(),
                                                                      String.valueOf(p.get(i).getQuantidadeProduto()),
                                                                      String.valueOf(p.get(i).getValorUni()),
                                                                      String.valueOf(p.get(i).getCategoriaProduto())});
        }
        
        return listaProdutos;
        
    }

    /* 
    
    Deverá ser implementado no Marco 3
    
    public static boolean salvar(int pcodigoProduto, String pdescricaoProduto, int pquantidadeProduto, double pvalorUni, String pcategoriaProduto) {
    	 
    	Produto produto =  new Produto(pcodigoProduto,pdescricaoProduto,pquantidadeProduto,pvalorUni,pcategoriaProduto);
         return ProdutoDAO.salvar(produto);
    }

    public static ArrayList<String[]> getCadastrarProduto() {

        ArrayList<Produto> produto = ProdutoDAO.getCadastrarProduto();
        ArrayList<String[]> listaCadastroProduto = new ArrayList<>();

        for (int i = 0; i < produto.size(); i++) {
            listaCadastroProduto.add(new String[]{String.valueOf(produto.get(i).getCodigoProduto()),
            													produto.get(i).getDescricaoProduto(),
            													String.valueOf(produto.get(i).getQuantidadeProduto()),
            													String.valueOf(produto.get(i).getValorUni()),
            													String.valueOf(produto.get(i).getCategoriaProduto())});

        }

        return listaCadastroProduto;

    }*/

}
