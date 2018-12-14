package Controller;

import DAO.VendasDAO;
import Model.Vendas;
import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author gabriela.vsmarques
 */
/*public class VendasController {
    
   /* public static boolean salvar(int pId, String pNome, String pCPF, int pcodigoProduto, String pdescricaoProduto, int pquantidadeProduto, double pvalorUni, String pcategoriaProduto, String pformPag)  {
    	 
    	Vendas v =  new Vendas(pId, pNome, pCPF,pcodigoProduto,pdescricaoProduto,pquantidadeProduto,pvalorUni,pcategoriaProduto,pformPag);
        return VendasDAO.salvar(v);
    }
    
    public static ArrayList<String[]> getVendas()
    {
     /*   ArrayList<Vendas> v = VendasDAO.getVendas(v);
        ArrayList<String[]> listaVendas = new ArrayList<>();
        
        for(int i=0;i<v.size();i++)
        {
                        listaVendas.add(new String[]{
                            String.valueOf(v.get(i).getId()),
                            v.get(i).getNome(),
                            v.get(i).getCPF(),
                            String.valueOf(v.get(i).getCodigoProduto()),
                            v.get(i).getDescricaoProduto(),
                            String.valueOf(v.get(i).getQuantidadeProduto()),
                            String.valueOf(v.get(i).getValorUni()),
                            String.valueOf(v.get(i).getCategoriaProduto()),
                            v.get(i).getFormPag()});
        }
        
        return listaVendas;
        
    }
        }

}}*/