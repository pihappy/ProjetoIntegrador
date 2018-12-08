
package Model;

/**
 *
 * @author milena.sgalvao
 */
public class Relatorio {
    
    private String psqcliente;
    private int dtInicio;
    private int dtFim;
    private String clienteVenda;
    private int totalVendas;
    private int totalVendasPeriodo;

    public Relatorio() {
        
        
    }

    public Relatorio (String psqcliente, int dtInicio, int dtFim, String clienteVenda, int totalVendas, int totalVendasPeriodo) {
     
        this.psqcliente = psqcliente;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.clienteVenda = clienteVenda;
        this.totalVendas = totalVendas; 
        this.totalVendasPeriodo = totalVendasPeriodo;
        
        
    }
   

    public String getpsqCliente() {
        return psqcliente;
    }

    public void setbscCliente(String cliente) {
        this.psqcliente = cliente;
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