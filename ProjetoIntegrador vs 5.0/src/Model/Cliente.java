package Model;
//@author victor.maoliveira
public class Cliente {
    
    private int id;
    private String nome;
    private String cpf;
    private int cep;
    private String rua;
    private int numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private int cel1;
    private int cel2;
    private int tel;
    private int recado;
    private String email;

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String pCPF) {
        this.cpf = pCPF;
    }
    
     public Cliente() {
    }

    public Cliente(int id, String pNome, String pCPF) {
        this.id = id;
        this.nome = pNome;
        this.cpf = pCPF;
    }
    
    public Cliente(String pNome, String pCPF) {
        this.nome = pNome;
        this.cpf = pCPF;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String pNome) {
        this.nome = pNome;
    }
    
    public int getCEP() {
        return cep;
    }

    public void setCEP(int pCEP) {
        this.cep = pCEP;
    }
    
    public String getRua() {
        return rua;
    }

    public void setRua(String pRua) {
        this.rua = pRua;
    }
   
    public int getNumero() {
        return numero;
    }

    public void setNumero(int pNumero) {
        this.numero = pNumero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String pBairro) {
        this.bairro = pBairro;
    }
    
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String pComp) {
        this.complemento = pComp;
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String pCidade) {
        this.cidade = pCidade;
    }
    
    public int getCelular1() {
        return cel1;
    }

    public void setCelular1(int pCel1) {
        this.cel1 = pCel1;
    }
    
    public int getCelular2() {
        return cel2;
    }

    public void setCelular2(int pCel2) {
        this.cel2 = pCel2;
    }
    
    public int getTelefone() {
        return tel;
    }

    public void setTelefone(int pTel) {
        this.tel = pTel;
    }
    
    public int getRecado() {
        return recado;
    }

    public void setRecado(int pRecado) {
        this.recado = pRecado;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String pEmail) {
        this.email = pEmail;
    }

}
