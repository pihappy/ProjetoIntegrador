/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import Model.Produto;
import Model.Colaborador;
import Model.*;
import java.util.ArrayList;

/**
 *
 * @author victor.maoliveira
 */
public class SimulaDB {

    private static SimulaDB mockdb;

    private final ArrayList<Cliente> listaClientes;
    private final ArrayList<Produto> listaProdutos; // Simulação da tabela de Produtos
    private final ArrayList<Colaborador> listaColaborador; //Simulação da tabela de colaboradores

    private SimulaDB() {

        listaClientes = new ArrayList<Cliente>();
        listaProdutos = new ArrayList<Produto>();
        listaColaborador = new ArrayList<Colaborador>();
    }

    public static synchronized SimulaDB getInstance() {
        if (mockdb == null) {
            mockdb = new SimulaDB();
        }

        return mockdb;
    }

    public boolean SalvarCliente(Cliente c) {
        listaClientes.add(c);

        return true;
    }

    public ArrayList<Cliente> getClientes() {
        return this.listaClientes;
    }

    public boolean AtualizarCliente(Cliente p) {
        for (Cliente item : listaClientes) {
            if (item.getId() == p.getId()) {
                item.setNome(p.getNome());
                item.setCPF(p.getCPF());
            }
        }

        return true;
    }

    public boolean ExcluirCliente(int i) {
        listaClientes.remove(i);

        return true;
    }

    public boolean salvarProduto(Produto p) {

        listaProdutos.add(p);

        return true;
    }

    public boolean atualizarProduto(Produto p) {

        for (Produto item : listaProdutos) {
            if (item.getCodigoProduto() == p.getCodigoProduto()) {
                item.setDescricaoProduto(p.getDescricaoProduto());
                item.setQuantidadeProduto(p.getQuantidadeProduto());
                item.setValorUni(p.getValorUni());
                item.setCategoriaProduto(p.getCategoriaProduto());
            }
        }

        return true;

    }

    public boolean excluirProduto(int codigoProduto) {

        listaProdutos.remove(codigoProduto);

        return true;
    }

    public ArrayList<Produto> getProdutos() {
        return this.listaProdutos;
    }

    public ArrayList<Colaborador> getColaborador() {
        return listaColaborador;
    }

    public boolean salvarColaborador(Colaborador c) {
        return listaColaborador.add(c);
    }

    public boolean atualizarColaborador(Colaborador c) {
        for (Colaborador item : listaColaborador) {
            if (item.getId() == c.getId()) {
                item = c;
            }
        }

        return true;

    }

    public boolean excluirColaborador(int pID) {
        listaColaborador.remove(pID);
        return true;
    }
}
