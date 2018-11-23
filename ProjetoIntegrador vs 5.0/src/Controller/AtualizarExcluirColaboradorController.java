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
        Colaborador p = new Colaborador(pNome, pCPF, pDtnasc, pSexo, pCep, pRua, pNumero, pBairro, pComplemento, pEstado, pCidade, pCelular1, pCelular2, pTelefone, pRecado, pEmail, pCargo, pDepartamento, pAdmissao, pSalario);
        return ColaboradorDAO.salvar(p);
    }

    public static boolean excluir(int pID) {
        return ColaboradorDAO.excluir(pID);
    }

    public static boolean atualizar(int pId, String pNome, int pCPF, String pDtnasc, int pSexo, int pCep, String pRua, int pNumero, String pBairro, String pComplemento, int pEstado, String pCidade, int pCelular1, int pCelular2, int pTelefone, int pRecado, String pEmail, int pCargo, String pDepartamento, String pAdmissao, int pSalario) {

        Colaborador p = new Colaborador(pId, pNome, pCPF, pDtnasc, pSexo, pCep, pRua, pNumero, pBairro, pComplemento, pEstado, pCidade, pCelular1, pCelular2, pTelefone, pRecado, pEmail, pCargo, pDepartamento, pAdmissao, pSalario);

        return ColaboradorDAO.atualizar(p);

    }

//    public static ArrayList<String[]> getClientes() {
//        ArrayList<Cliente> clientes = ClienteDAO.getClientes();
//        ArrayList<String[]> listaClientes = new ArrayList<>();
//
//        for (int i = 0; i < clientes.size(); i++) {
//            listaClientes.add(new String[]{String.valueOf(clientes.get(i).getId()), clientes.get(i).getNome(), String.valueOf(clientes.get(i).getCPF())});
//
//        }
//
//        return listaClientes;
//
//    }

}


