package Controller;


import DAO.RelatorioDAO;
import Model.Relatorio;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author milena.sgalvao
 */
public class RelatorioController {

    public static boolean salvar(String ppsqCliente, int pDtInicio, int pDtFim, String pClienteVenda, int pTotalVendas, int pTotalVendasPeriodo) {

        Relatorio r = new Relatorio(ppsqCliente, pDtInicio, pDtFim, pClienteVenda, pTotalVendas, pTotalVendasPeriodo);
        return RelatorioDAO.salvar(r);
    }
    
     public static boolean Pesquisar(int pId, String pNome, String pCPF) throws SQLException {
        Relatorio r = new Relatorio(ppsqCliente, pDtInicio, pDtFim, pClienteVenda, pTotalVendas, pTotalVendasPeriodo );
        return RelatorioDAO.Pesquisar(r);

    /*public static ArrayList<String[]> getRelatorio() {
         ArrayList<Relatorio> r = RelatorioDAO.getRelatorio();
        ArrayList<String[]> relatorioVendas = new ArrayList<>();

        for (int i = 0; i < r.size(); i++) {
            relatorioVendas.add(new String[]{
                String.valueOf(r.get(i).getpsqCliente(),
                r.get(i).getDtInicio(),
                r.get(i).getDtFim(),
                String.valueOf(r.get(i).getClienteVenda(),
                r.get(i).getTotalVendas(),
                r.get(i).getTotalVendasPeriodo()                  
        }

        return relatorioVendas;

    }*/
}
}