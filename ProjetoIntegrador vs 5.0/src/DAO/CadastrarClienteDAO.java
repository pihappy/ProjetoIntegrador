package DAO;
//@author victor.maoliveira

import Model.Cliente;
import java.util.ArrayList;

public class CadastrarClienteDAO {
   
    public static boolean Salvar(Cliente p)
    {
        //Simulo uma inserção no banco de dados (INSERT INTO...)
        return SimulaDB.getInstance().SalvarCliente(p);
    }
    
    public static boolean Atualizar(Cliente p)
    {
        //Simulo um  UPDATE no banco de dados (UPDATE TabelaXYZ SET...)
        return SimulaDB.getInstance().AtualizarCliente(p);
    }
    
    public static boolean Excluir(int indice)
    {
        //Simulo uma exclusão no banco de dados (DELETE FROM TabelaXYZ WHERE...)
        return SimulaDB.getInstance().ExcluirCliente(indice);
    }
    
    public static ArrayList<Cliente> getClientes()
    {
        //Simulo uma consulta no banco de dados (SELECT ID,Nome,CPF FROM TabelaXYZ)
        return SimulaDB.getInstance().getClientes();
    }
    
}
