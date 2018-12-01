/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Mikael
 */
public class Colaborador {

    private int id;
    private String nome;
    private int cpf;
    private String dtnasc;
    private String sexo;
    private int cep;
    private String rua;
    private int numero;
    private String bairro;
    private String complemento;
    private String estado;
    private String cidade;
    private int celular1;
    private int celular2;
    private int telefone;
    private int recado;
    private String email;
    private String cargo;
    private String departamento;
    private String admissao;
    private float salario;

    public Colaborador() {
        //Construtor Vazio
    }

    public Colaborador(String nome, int cpf, String dtnasc, String sexo, int cep, String rua, int numero, String bairro, String complemento, String estado, String cidade, int celular1, int celular2, int telefone, int recado, String email, String cargo, String departamento, String admissao, float salario) {
        //Construtor sem Id
        this.nome = nome;
        this.cpf = cpf;
        this.dtnasc = dtnasc;
        this.sexo = sexo;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.estado = estado;
        this.cidade = cidade;
        this.celular1 = celular1;
        this.celular2 = celular2;
        this.telefone = telefone;
        this.recado = recado;
        this.email = email;
        this.cargo = cargo;
        this.departamento = departamento;
        this.admissao = admissao;
        this.salario = salario;
    }
    public Colaborador(int id, String nome, int cpf, String dtnasc, String sexo, int cep, String rua, int numero, String bairro, String complemento, String estado, String cidade, int celular1, int celular2, int telefone, int recado, String email, String cargo, String departamento, String admissao, float salario) {
        //Construtor com Id
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dtnasc = dtnasc;
        this.sexo = sexo;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.estado = estado;
        this.cidade = cidade;
        this.celular1 = celular1;
        this.celular2 = celular2;
        this.telefone = telefone;
        this.recado = recado;
        this.email = email;
        this.cargo = cargo;
        this.departamento = departamento;
        this.admissao = admissao;
        this.salario = salario;
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
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getDtnasc() {
        return dtnasc;
    }
    public void setDtnasc(String dtnasc) {
        this.dtnasc = dtnasc;
    }
    
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;    }
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCelular1() {
        return celular1;
    }
    public void setCelular1(int celular1) {
        this.celular1 = celular1;
    }
    
    public int getCelular2() {
        return celular2;
    }
    public void setCelular2(int celular2) {
        this.celular2 = celular2;
    }
    
    public int getRecado(){
        return recado;
    }
    public void setRecado(int recado){
        this.recado = recado;
    }

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String getAdmissao(){
        return admissao;
    }
    public void setAdmissao(String admissao){
        this.admissao = admissao;
    }
    
    public float getSalario(){
     return salario;   
    }
    public void setSalario(float salario){
        this.salario = salario;
    }

}
