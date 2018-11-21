package Controller;
//@author victor.maoliveira

import DAO.CadastrarClienteDAO;
import Model.Cliente;
import java.util.ArrayList;

public class CadastrarClienteController {
    /**
     * Salvo os dados do cliente na memória ou no banco de dados
     * @param Id 
     * @param pNome
     * @param pCPF
     * @return 
     */
    public static boolean Salvar(int pId,String pNome, String pCPF)
    {
        //Salvo na memória
        Cliente p =  new Cliente(pId,pNome, pCPF);
        return CadastrarClienteDAO.Salvar(p);
    }
    
    public static boolean Excluir(int indice)
    {
        return CadastrarClienteDAO.Excluir(indice);
    }
    
    public static boolean Atualizar(int pId, String pNome, String pCPF)
    {
        Cliente p =  new Cliente(pId,pNome,pCPF);
        return CadastrarClienteDAO.Atualizar(p);
        
    }
    
    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     * @return lista de string
     */
    public static ArrayList<String[]> getClientes()
    {
        ArrayList<Cliente> clientes = CadastrarClienteDAO.getClientes();
        ArrayList<String[]> listaClientes = new ArrayList<>();
        
        for(int i=0;i<clientes.size();i++)
        {
            listaClientes.add(new String[]{String.valueOf(clientes.get(i).getId()),clientes.get(i).getNome(),String.valueOf(clientes.get(i).getCPF()) });
        
        }
        
        return listaClientes;
        
    }

    public static boolean Salvar(String pNome, String pCPF) {
        Cliente p =  new Cliente(pNome, pCPF);
        return CadastrarClienteDAO.Salvar(p);
    }


}
