package Model;
//@author victor.maoliveira
public class Cliente {
    
    private int id;
    private String nome;
    private String cpf;
    private String datanasc;
    private String cep;
    private String rua;
    private String numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String cel1;
    private String cel2;
    private String tel;
    private String recado;
    private String email;
    private int sexo;
    private int estado;

    public Cliente(String pNome, String pCPF, String pCEP, String pBairro, String pRua, String pNumero, String pComp, String pCidade, String pDataNasc, int pSexo, int pEstado, String pCel1, String pCel2, String pEmail, String pRecado, String pTelefone) {
        this.nome = pNome;
        this.cpf = pCPF;
        this.cep = pCEP;
        this.bairro = pBairro;
        this.rua = pRua;
        this.complemento = pComp;
        this.cidade = pCidade;
        this.datanasc = pDataNasc;
        this.sexo = pSexo;
        this.estado = pEstado;
        this.cel1 = pCel1;
        this.cel2 = pCel2;
        this.email = pEmail;
        this.recado = pRecado;
        this.tel = pTelefone;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String pCPF) {
        this.cpf = pCPF;
    }
    
    public int getSexo() {
        return sexo;
    }

    public void setSexo(int pSexo) {
        this.sexo = pSexo;
    }
    
    public int getEstado() {
        return estado;
    }

    public void setEstado(int pEstado) {
        this.estado = pEstado;
    }
    
        public String getDataNasc() {
        return cpf;
    }

    public void setDataNasc(String pDataNasc) {
        this.datanasc = pDataNasc;
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
    
    public String getCEP() {
        return cep;
    }

    public void setCEP(String pCEP) {
        this.cep = pCEP;
    }
    
    public String getRua() {
        return rua;
    }

    public void setRua(String pRua) {
        this.rua = pRua;
    }
   
    public String getNumero() {
        return numero;
    }

    public void setNumero(String pNumero) {
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
    
    public String getCelular1() {
        return cel1;
    }

    public void setCelular1(String pCel1) {
        this.cel1 = pCel1;
    }
    
    public String getCelular2() {
        return cel2;
    }

    public void setCelular2(String pCel2) {
        this.cel2 = pCel2;
    }
    
    public String getTelefone() {
        return tel;
    }

    public void setTelefone(String pTel) {
        this.tel = pTel;
    }
    
    public String getRecado() {
        return recado;
    }

    public void setRecado(String pRecado) {
        this.recado = pRecado;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String pEmail) {
        this.email = pEmail;
    }

}
