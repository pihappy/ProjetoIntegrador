package Model;

/**
 *
 * @author gabriela.vsmarques
 */
public class Produto {

    private int codigoProduto;
    private String descricaoProduto;
    private int quantidadeProduto;
    private double valorUni;
    private String categoriaProduto;

    public Produto() {

    }

    public Produto(int codigoProduto, String descricaoProduto, int quantidadeProduto,
            double valorUni, String categoriaProduto) {

    }

    public Produto(int codigoProduto, String descricaoProduto, String categoriaProduto) {

    }

    public int getCodigoProduto() {
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

    public void setCodigoProduto(int codigoProduto) {
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
