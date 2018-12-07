package Controller;
//@author victor.maoliveira

import DAO.ClienteDAO;
import Model.Cliente;
import java.sql.SQLException;
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
        return ClienteDAO.Excluir(indice);
    }
    
    public static boolean Salvar(String pNome, String pCPF, String pDataNasc, String pSexo, String pCEP, String pRua, int pNumero, String pBairro, String pComp, String pEstado, String pCidade, String pCel1, String pCel2, String pTelefone, String pRecado, String pEmail) {
        Cliente p =  new Cliente(pNome, pCPF, pDataNasc, pSexo, pCEP, pRua, pNumero, pBairro, pComp, pEstado, pCidade, pCel1, pCel2, pTelefone, pRecado, pEmail);
        return ClienteDAO.Salvar(p);
    }

    public static boolean Atualizar(String pNome, String pCPF, String pDataNasc, String pSexo, String pCEP, String pRua, int pNumero, String pBairro, String pComp, String pEstado, String pCidade, String pCel1, String pCel2, String pTelefone, String pRecado, String pEmail) {
        Cliente p =  new Cliente(pNome, pCPF, pDataNasc, pSexo, pCEP, pRua, pNumero, pBairro, pComp, pEstado, pCidade, pCel1, pCel2, pTelefone, pRecado, pEmail);
        return ClienteDAO.Atualizar(p);
    }
    public static boolean Pesquisar(int pId, String pNome, String pCPF) throws SQLException {
        Cliente p = new Cliente(pId, pNome, pCPF );
        return ClienteDAO.Pesquisar(p);

    }
    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     * @return lista de string
     */
    public static ArrayList<String[]> getClientes()
    {
        ArrayList<Cliente> p = ClienteDAO.getClientes();
        ArrayList<String[]> listaClientes = new ArrayList<>();
        
        for(int i=0;i<p.size();i++)
        {
            listaClientes.add(new String[]{String.valueOf(p.get(i).getId()),
                p.get(i).getNome(),
                p.get(i).getCPF(),
                p.get(i).getDataNasc(),
                p.get(i).getSexo(),
                p.get(i).getCEP(),
                p.get(i).getRua(),
                String.valueOf(p.get(i).getNumero()),
                p.get(i).getBairro(),
                p.get(i).getComplemento(),
                p.get(i).getEstado(),
                p.get(i).getCidade(),
                p.get(i).getCelular1(),
                p.get(i).getCelular2(),
                p.get(i).getTelefone(),
                p.get(i).getRecado(),
                p.get(i).getEmail()});
            
        }
        
        return listaClientes;
        
    }
}
