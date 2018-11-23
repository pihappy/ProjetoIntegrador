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

}
