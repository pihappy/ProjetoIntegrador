package Controller;

import DAO.RelatorioDAO;
import Model.Relatorio;
import java.sql.SQLException;
import java.util.ArrayList;
//import Model.RelatorioDAO;

/**
 *
 * @author milena.sgalvao
 */
public class RelatorioController {

    private final RelatorioDAO Relatorio = new RelatorioDAO();

   /* public static boolean gerarRelatorio(String ppsqCliente, int pDtInicio, int pDtFim, String pClienteVenda, int pTotalVendas, int pTotalVendasPeriodo) {

        // RelatorioDAO r = new RelatorioDAO(ppsqCliente, pDtInicio,  pDtFim, pClienteVenda,pTotalVendas, pTotalVendasPeriodo);
        return RelatorioDAO.gerarRelatorio(r);
    }*/

    /*public static ArrayList<String[]> getRelatorio() {
        //     ArrayList<Relatorio> r = RelatorioDAO.getRelatorio();
        ArrayList<String[]> relatorioVendas = new ArrayList<>();

        for (int i = 0; i < r.size(); i++) {
            relatorioVendas.add(new String[]{
       String.valueOf(r.get(i).getpsqCliente(),
                r.get(i).getDtInicio(),
                r.get(i).getDtFim(),
                r.get(i).getClienteVenda(),
                r.get(i).getTotalVendas(),
                r.get(i).getTotalVendasPeriodo())                  
        };

        return relatorioVendas 

    }


    }
}*/
}
