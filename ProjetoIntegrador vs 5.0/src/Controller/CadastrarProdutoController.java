package Controller;

import DAO.CadastrarProdutoDAO;
import Model.CadastrarProduto;
import java.util.ArrayList;


/**
 *
 * @author gabriela.vsmarques
 */
public class CadastrarProdutoController {

    public static boolean salvar(int pcodigoProduto, String pdescricaoProduto, int pquantidadeProduto, double pvalorUni, String pcategoriaProduto) {
    	 
    	CadastrarProduto produto =  new CadastrarProduto(pcodigoProduto,pdescricaoProduto,pquantidadeProduto,pvalorUni,pcategoriaProduto);
         return CadastrarProdutoDAO.salvar(produto);
    }

    public static ArrayList<String[]> getCadastrarProduto() {

        ArrayList<CadastrarProduto> produto = CadastrarProdutoDAO.getCadastrarProduto();
        ArrayList<String[]> listaCadastroProduto = new ArrayList<>();

        for (int i = 0; i < produto.size(); i++) {
            listaCadastroProduto.add(new String[]{String.valueOf(produto.get(i).getCodigoProduto()),
            													produto.get(i).getDescricaoProduto(),
            													String.valueOf(produto.get(i).getQuantidadeProduto()),
            													String.valueOf(produto.get(i).getValorUni()),
            													String.valueOf(produto.get(i).getCategoriaProduto())});

        }

        return listaCadastroProduto;

    }

}
