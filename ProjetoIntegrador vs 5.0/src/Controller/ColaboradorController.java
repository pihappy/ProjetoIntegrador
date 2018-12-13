package Controller;

import DAO.ColaboradorDAO;
import Model.Colaborador;
import java.util.ArrayList;

/**
 *
 * @author mikael.asilva3
 */
public class ColaboradorController {

    public static boolean salvar(String pNome, String pCPF, String pDtnasc, String pSexo, int pCep, String pRua, int pNumero, String pBairro, String pComplemento, String pEstado, String pCidade, int pCelular1, int pCelular2, int pTelefone, int pRecado, String pEmail, String pCargo, String pDepartamento, String pAdmissao, Double pSalario) {
        //Salvo na memória
        Colaborador c = new Colaborador(pNome, pCPF, pDtnasc, pSexo, pCep, pRua, pNumero, pBairro, pComplemento, pEstado, pCidade, pCelular1, pCelular2, pTelefone, pRecado, pEmail, pCargo, pDepartamento, pAdmissao, pSalario);
        return ColaboradorDAO.salvarColaborador(c);
    }

    public static boolean excluir(int pID) {
        return ColaboradorDAO.ExcluirColaborador(pID);
    }

    public static boolean atualizar(int pId, String pNome, String pCPF, String pDtnasc, String pSexo, int pCep, String pRua, int pNumero, String pBairro, String pComplemento, String pEstado, String pCidade, int pCelular1, int pCelular2, int pTelefone, int pRecado, String pEmail, String pCargo, String pDepartamento, String pAdmissao, Double pSalario) {

        Colaborador c = new Colaborador(pId, pNome, pCPF, pDtnasc, pSexo, pCep, pRua, pNumero, pBairro, pComplemento, pEstado, pCidade, pCelular1, pCelular2, pTelefone, pRecado, pEmail, pCargo, pDepartamento, pAdmissao, pSalario);

        return ColaboradorDAO.atualizarColaborador(c);

    }

    public static ArrayList<String[]> getColaboradores() {
        ArrayList<Colaborador> colaborador = ColaboradorDAO.getColaboradores();
        ArrayList<String[]> listaColaboradores = new ArrayList<>();

        for (int i = 0; i < colaborador.size(); i++) {
            listaColaboradores.add(new String[]{String.valueOf(colaborador.get(i).getId()),
                colaborador.get(i).getNome(),
                (colaborador.get(i).getCpf()),
                (colaborador.get(i).getDtnasc()),
                (colaborador.get(i).getSexo()),
                String.valueOf(colaborador.get(i).getCep()),
                (colaborador.get(i).getRua()),
                String.valueOf(colaborador.get(i).getNumero()),
                (colaborador.get(i).getBairro()),
                (colaborador.get(i).getComplemento()),
                (colaborador.get(i).getEstado()),
                (colaborador.get(i).getCidade()),
                String.valueOf(colaborador.get(i).getCelular1()),
                String.valueOf(colaborador.get(i).getCelular2()),
                String.valueOf(colaborador.get(i).getTelefone()),
                String.valueOf(colaborador.get(i).getRecado()),
                (colaborador.get(i).getEmail()),
                (colaborador.get(i).getCargo()),
                (colaborador.get(i).getDepartamento()),
                (colaborador.get(i).getAdmissao()),
                String.valueOf(colaborador.get(i).getSalario())});
        }

        return listaColaboradores;

    }

}
