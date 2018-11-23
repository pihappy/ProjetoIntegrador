/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author milena.sgalvao
 */
public class Relatorio {
    
    private String cliente;
    private int dtInicio;
    private int dtFim;
    private String clienteVenda;
    private int totalVendas;
    private int totalVendasPeriodo;

    public Relatorio() {
        
        
    }

    public Relatorio (String cliente, int dtInicio, int dtFim, String clienteVenda, int totalVendas, int totalVendasPeriodo) {
     
        this.cliente = cliente;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.clienteVenda = clienteVenda;
        this.totalVendas = totalVendas; 
        this.totalVendasPeriodo = totalVendasPeriodo;
        
        
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(int dtInicio) {
        this.dtInicio = dtInicio;
    }

    public int getDtFim() {
        return dtFim;
    }

    public void setDtFim(int dtFim) {
        this.dtFim = dtFim;
    }

    public String getClienteVenda() {
        return clienteVenda;
    }

    public void setClienteVenda(String clienteVenda) {
        this.clienteVenda = clienteVenda;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public int getTotalVendasPeriodo() {
        return totalVendasPeriodo;
    }

    public void setTotalVendasPeriodo(int totalVendasPeriodo) {
        this.totalVendasPeriodo = totalVendasPeriodo;
    }

}
