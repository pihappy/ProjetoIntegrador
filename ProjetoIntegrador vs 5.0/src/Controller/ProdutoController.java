package Controller;

import DAO.ProdutoDAO;
import Model.Produto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author gabriela.vsmarques
 */
public class ProdutoController {

    public static boolean salvar(int pcodigoProduto, String pdescricaoProduto, int pquantidadeProduto, double pvalorUni, String pcategoriaProduto) {

        Produto p = new Produto(pcodigoProduto, pdescricaoProduto, pquantidadeProduto, pvalorUni, pcategoriaProduto);
        return ProdutoDAO.salvar(p);
    }

    public static boolean atualizar(int pcodigoProduto, String pdescricaoProduto, int pquantidadeProduto, double pvalorUni, String pcategoriaProduto) {

        Produto p = new Produto(pcodigoProduto, pdescricaoProduto, pquantidadeProduto, pvalorUni, pcategoriaProduto);
        return ProdutoDAO.atualizar(p);
    }

    public static boolean excluir(int codigoProduto) {
        return ProdutoDAO.excluir(codigoProduto);
    }

    public static boolean pesquisar(int pcodigoProduto, String pdescricaoProduto, String pcategoriaProduto) throws SQLException {
        Produto p = new Produto(pcodigoProduto, pdescricaoProduto, pcategoriaProduto);
        return ProdutoDAO.pesquisar(p);

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
