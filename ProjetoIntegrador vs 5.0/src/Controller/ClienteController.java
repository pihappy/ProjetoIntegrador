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
    
    public static boolean Salvar(String pNome, String pCPF, String pCEP, String pBairro, String pRua, int pNumero, String pComp, String pCidade, String pDataNasc, int pSexo, int pEstado, String pCel1, String pCel2, String pEmail, String pRecado, String pTelefone) {
        Cliente p =  new Cliente(pNome, pCPF,pCEP,pBairro,pRua,pNumero,pComp,pCidade,pDataNasc,pSexo,pEstado,pCel1,pCel2,pEmail,pRecado,pTelefone);
        return ClienteDAO.Salvar(p);
    }

    public static boolean Atualizar(String pNome, String pCPF, String pCEP, String pBairro, String pRua, int pNumero, String pComp, String pCidade, String pDataNasc, int pSexo, int pEstado, String pCel1, String pCel2, String pEmail, String pRecado, String pTelefone) {
        Cliente p =  new Cliente(pNome, pCPF, pCEP, pBairro, pRua, pNumero, pComp, pCidade, pDataNasc, pSexo, pEstado, pCel1, pCel2, pEmail, pRecado, pTelefone);
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
                String.valueOf(p.get(i).getSexo()),
                p.get(i).getCEP(),
                p.get(i).getRua(),
                String.valueOf(p.get(i).getNumero()),
                p.get(i).getBairro(),
                p.get(i).getComplemento(),
                String.valueOf(p.get(i).getEstado()),
                p.get(i).getCidade(),
                p.get(i).getCelular1(),
                p.get(i).getCelular2(),
                p.get(i).getCelular1(),
                p.get(i).getTelefone(),
                p.get(i).getRecado(),
                p.get(i).getEmail()});
            
        }
        
        return listaClientes;
        
    }
}
