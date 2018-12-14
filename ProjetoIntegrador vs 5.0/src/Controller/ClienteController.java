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

    public static boolean Atualizar(String pId,String pNome, String pCPF, String pDataNasc, String pSexo, String pCEP, String pRua, int pNumero, String pBairro, String pComp, String pEstado, String pCidade, String pCel1, String pCel2, String pTelefone, String pRecado, String pEmail) throws ClassNotFoundException, SQLException {
        Cliente p =  new Cliente(pId,pNome, pCPF, pDataNasc, pSexo, pCEP, pRua, pNumero, pBairro, pComp, pEstado, pCidade, pCel1, pCel2, pTelefone, pRecado, pEmail);
        return ClienteDAO.Atualizar(p, pId);
    }
    public static ArrayList<String[]> Pesquisar(String pId, String pNome, String pCPF) {
        Cliente p  = new Cliente();
        p.setId(pId);
        p.setNome(pNome);
        p.setCPF(pCPF);

        ArrayList<Cliente> retorno = ClienteDAO.Pesquisar(p);

        ArrayList<String[]> listaClientes = new ArrayList<>();

        for (int i = 0; retorno.size() > i; i++) {
            listaClientes.add(new String[]{retorno.get(i).getId(),
                retorno.get(i).getNome(),
                retorno.get(i).getCPF(),
                retorno.get(i).getDataNasc(),
                retorno.get(i).getSexo(),
                retorno.get(i).getCEP(),
                retorno.get(i).getRua(),
                String.valueOf(retorno.get(i).getNumero()),
                retorno.get(i).getBairro(),
                retorno.get(i).getComplemento(),
                retorno.get(i).getEstado(),
                retorno.get(i).getCidade(),
                retorno.get(i).getCelular1(),
                retorno.get(i).getCelular2(),
                retorno.get(i).getTelefone(),
                retorno.get(i).getRecado(),
                retorno.get(i).getEmail()});
        }

        return listaClientes;

    }

    
    
        /*public static ArrayList<String[]> pesquisarClienteVendas(int pId, String pNome, String pCPF, String pEmail) throws SQLException {
        
            Cliente ClienteVenda = new Cliente();
            ClienteVenda.setId(pId);
            ClienteVenda.setNome(pNome);
            ClienteVenda.setCPF(pCPF);
            ClienteVenda.setEmail(pEmail);
            
        ArrayList<Cliente> retorno = ClienteDAO.pesquisarClienteVendas(ClienteVenda);
        
        ArrayList<String[]> linhasClientesVendas = new ArrayList<>();
        
        for (int i = 0; i < retorno.size(); i++) {
            linhasClientesVendas.add(new String[]{String.valueOf(retorno.get(i).getId()),
                retorno.get(i).getCPF(),
                retorno.get(i).getNome(),
                retorno.get(i).getEmail()});
        }
        return linhasClientesVendas;

    }*/
    
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
            listaClientes.add(new String[]{p.get(i).getId(),
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
