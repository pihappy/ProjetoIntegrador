/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ColaboradorDAO;
import Model.Colaborador;
import java.util.ArrayList;

/**
 *
 * @author mikael.asilva3
 */
public class AtualizarExcluirColaboradorController {

    public static boolean salvar(String pNome, int pCPF, String pDtnasc, int pSexo, int pCep, String pRua, int pNumero, String pBairro, String pComplemento, int pEstado, String pCidade, int pCelular1, int pCelular2, int pTelefone, int pRecado, String pEmail, int pCargo, String pDepartamento, String pAdmissao, int pSalario) {
        //Salvo na memória
        Colaborador c = new Colaborador(pNome, pCPF, pDtnasc, pSexo, pCep, pRua, pNumero, pBairro, pComplemento, pEstado, pCidade, pCelular1, pCelular2, pTelefone, pRecado, pEmail, pCargo, pDepartamento, pAdmissao, pSalario);
        return ColaboradorDAO.salvarColaborador(c);
    }

    public static boolean excluir(int pID) {
        return ColaboradorDAO.ExcluirColaborador(pID);
    }

    public static boolean atualizar(int pId, String pNome, int pCPF, String pDtnasc, int pSexo, int pCep, String pRua, int pNumero, String pBairro, String pComplemento, int pEstado, String pCidade, int pCelular1, int pCelular2, int pTelefone, int pRecado, String pEmail, int pCargo, String pDepartamento, String pAdmissao, int pSalario) {

        Colaborador c = new Colaborador(pId, pNome, pCPF, pDtnasc, pSexo, pCep, pRua, pNumero, pBairro, pComplemento, pEstado, pCidade, pCelular1, pCelular2, pTelefone, pRecado, pEmail, pCargo, pDepartamento, pAdmissao, pSalario);

        return ColaboradorDAO.atualizarColaborador(c);

    }

    public static ArrayList<String[]> getColaboradores() {
        ArrayList<Colaborador> colaborador = ColaboradorDAO.getColaboradores();
        ArrayList<String[]> listaColaboradores = new ArrayList<>();

        for (int i = 0; i < colaborador.size(); i++) {
            listaColaboradores.add(new String[]{String.valueOf(colaborador.get(i).getId()), colaborador.get(i).getNome(), String.valueOf(colaborador.get(i).getCpf()), String.valueOf(colaborador.get(i).getDtnasc()), String.valueOf(colaborador.get(i).getSexo()), String.valueOf(colaborador.get(i).getCep()), String.valueOf(colaborador.get(i).getRua()), String.valueOf(colaborador.get(i).getNumero()), String.valueOf(colaborador.get(i).getBairro()), String.valueOf(colaborador.get(i).getComplemento()), String.valueOf(colaborador.get(i).getEstado()), String.valueOf(colaborador.get(i).getCidade()), String.valueOf(colaborador.get(i).getCelular1()), String.valueOf(colaborador.get(i).getCelular2()), String.valueOf(colaborador.get(i).getTelefone()), String.valueOf(colaborador.get(i).getRecado()), String.valueOf(colaborador.get(i).getEmail())});
           

        }

        return listaColaboradores;

    }

}
