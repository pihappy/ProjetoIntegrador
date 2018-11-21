/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import Model.*;
import java.util.ArrayList;

/**
 *
 * @author victor.maoliveira
 */
public class SimulaDB {
    
    private static SimulaDB mockdb;
    
    private final ArrayList<Cliente> listaClientes;
    
    
    private SimulaDB(){
    
        listaClientes = new ArrayList<Cliente>();
    }
    
    public static synchronized SimulaDB getInstance(){
        if(mockdb == null)
            mockdb = new SimulaDB();
        
        return mockdb;
    }
    
    public boolean SalvarCliente(Cliente c)
    {
        listaClientes.add(c);
        
        return true;
    }
    
    public ArrayList<Cliente> getClientes()
    {
        return this.listaClientes;
    }
    
    
    public boolean AtualizarCliente(Cliente p)
    {
        for(Cliente item: listaClientes)
        {
            if(item.getId() == p.getId())
            {
                item.setNome(p.getNome());
                item.setCPF(p.getCPF());
            }
        }
            
        return true;
    }
    
    public boolean ExcluirCliente(int i)
    {
        listaClientes.remove(i);
        
        return true;
    }
    
    
}