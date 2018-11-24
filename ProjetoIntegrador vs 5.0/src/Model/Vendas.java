package Model;

/**
 *
 * @author gabriela.vsmarques
 */
public class Vendas {
    
    // Parte de dados do Cliente
    private int id;
    private String Nome;
    private String CPF;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
     public String getNome() {
        return Nome;
    }
     
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
     
    
    
    //Parte de Produtos
    private int codigoProduto;
    private String descricaoProduto;
    private int quantidadeProduto;
    private double valorUni;
    private String categoriaProduto;
    
    
     public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public double getValorUni() {
        return valorUni;
    }

    public void setValorUni(double valorUni) {
        this.valorUni = valorUni;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    //Parte de Pagamento
    private String formPag;
    
     public String getFormPag() {
        return formPag;
    }

    public void setFormPag(String formPag) {
        this.formPag = formPag;
    }

    public Vendas(){

    }
    
    public Vendas(int Id, String Nome, String CPF,int codigoProduto, String descricaoProduto, int quantidadeProduto, 
            double valorUni, String categoriaProduto, String formPag){
    
    }
    
    
}
