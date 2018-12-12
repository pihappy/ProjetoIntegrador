package Model;

/**
 *
 * @author gabriela.vsmarques
 */
public class Produto {

    private String codigoProduto;
    private String descricaoProduto;
    private int quantidadeProduto;
    private double valorUni;
    private String categoriaProduto;

    public Produto() {

    }

    public Produto(String codigoProduto, String descricaoProduto, int quantidadeProduto,
            double valorUni, String categoriaProduto) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorUni = valorUni;
        this.categoriaProduto = categoriaProduto;
    }

    public Produto(String codigoProduto, String descricaoProduto, String categoriaProduto) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.categoriaProduto = categoriaProduto;
    }

    public Produto(String descricaoProduto, int quantidadeProduto,
            double valorUni, String categoriaProduto) {
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorUni = valorUni;
        this.categoriaProduto = categoriaProduto;

    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public double getValorUni() {
        return valorUni;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public void setValorUni(double valorUni) {
        this.valorUni = valorUni;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

}
