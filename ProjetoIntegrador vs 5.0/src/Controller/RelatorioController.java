package Controller;

import DAO.RelatorioDAO;
import Model.Relatorio;
import java.sql.SQLException;
import java.util.ArrayList;
import Model.Relatorio;

/**
 *
 * @author milena.sgalvao
 */
public class RelatorioController {

      public static boolean gerar(String ppsqCliente, int pDtInicio,int pDtFim, String pClienteVenda, int pTotalVendas, int pTotalVendasPeriodo)  {
    	 
    	Relatorio r =  new Relatorio(ppsqCliente,  pDtInicio,pDtFim,  pClienteVenda, pTotalVendas,  pTotalVendasPeriodo);
        return RelatorioDAO.gerar(r);
    }
        public static ArrayList<String[]> getRelatorio(){
    
      ArrayList<Relatorio> r = RelatorioDAO.getRelatorio();
        ArrayList<String[]> listaRelatorio = new ArrayList<>();
        
        for(int i=0;i<r.size();i++)
        {
                        listaRelatorio.add(new String[]{
                            String.valueOf(r.get(i).getpsqCliente()),
                            String.valueOf(r.get(i).getDtInicio()),
                            String.valueOf(r.get(i).getDtFim()),
                            String.valueOf(r.get(i).getClienteVenda()),
                            String.valueOf(r.get(i).getTotalVendas())});
                          //String.valueOf(r.get(i).getTotalVendasPeriodo())});
                                              
                     }
        return listaRelatorio;
    
   
}
        }
