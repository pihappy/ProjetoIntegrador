package Controller;
//@author victor.maoliveira

import DAO.CadastrarClienteDAO;
import Model.Cliente;
import java.util.ArrayList;

public class ClienteController {
    /**
     * Salvo os dados do cliente na memória ou no banco de dados
     * @param indice
     * @param Id 
     * @param pNome
     * @param pCPF
     * @return 
     */
    
    
    public static boolean Excluir(int indice)
    {
        return CadastrarClienteDAO.Excluir(indice);
    }
    
    public static boolean Salvar(String pNome, String pCPF, String pCEP, String pBairro, String pRua, String pNumero, String pComp, String pCidade, String pDataNasc, int pSexo, int pEstado, String pCel1, String pCel2, String pEmail, String pRecado, String pTelefone) {
        Cliente p =  new Cliente(pNome, pCPF,pCEP,pBairro,pRua,pNumero,pComp,pCidade,pDataNasc,pSexo,pEstado,pCel1,pCel2,pEmail,pRecado,pTelefone);
        return CadastrarClienteDAO.Salvar(p);
    }

    public static boolean Atualizar(String pNome, String pCPF, String pCEP, String pBairro, String pRua, String pNumero, String pComp, String pCidade, String pDataNasc, int pSexo, int pEstado, String pCel1, String pCel2, String pEmail, String pRecado, String pTelefone) {
        Cliente p =  new Cliente(pNome, pCPF, pCEP, pBairro, pRua, pNumero, pComp, pCidade, pDataNasc, pSexo, pEstado, pCel1, pCel2, pEmail, pRecado, pTelefone);
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
            listaClientes.add(new String[]{String.valueOf(clientes.get(i).getId()),clientes.get(i).getNome(),String.valueOf(clientes.get(i).getCPF()),String.valueOf(clientes.get(i).getDataNasc()),String.valueOf(clientes.get(i).getSexo()),String.valueOf(clientes.get(i).getCEP()),String.valueOf(clientes.get(i).getRua()),String.valueOf(clientes.get(i).getNumero()),String.valueOf(clientes.get(i).getBairro()),String.valueOf(clientes.get(i).getComplemento()),String.valueOf(clientes.get(i).getEstado()),String.valueOf(clientes.get(i).getCidade()),String.valueOf(clientes.get(i).getCelular1()),String.valueOf(clientes.get(i).getCelular2()),String.valueOf(clientes.get(i).getTelefone()),String.valueOf(clientes.get(i).getRecado()),String.valueOf(clientes.get(i).getEmail()) });
        
        }
        
        return listaClientes;
        
    }
}
