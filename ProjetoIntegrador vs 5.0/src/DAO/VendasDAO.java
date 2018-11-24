package DAO;

import Model.Vendas;
import java.util.ArrayList;

/**
 *
 * @author gabriela.vsmarques
 */
public class VendasDAO {
    
    public static boolean salvar (Vendas v){
     
        return SimulaDB.getInstance().salvarVendas(v);
    }
    
    public static ArrayList<Vendas> getVendas()
    {
        //Simulo uma consulta no banco de dados (SELECT ID,Nome,CPF FROM TabelaXYZ)
        return SimulaDB.getInstance().getVendas();
    }
    
}
