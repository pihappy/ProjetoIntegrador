/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author victor.maoliveira
 */
public class Login {
    private String usuario;
    private String senha;
    private String tipo;
    
    public Login(String pUsuario, String pSenha, String pTipo){
        this.usuario = pUsuario;
        this.senha = pSenha;
        this.tipo = pTipo;
    }

    public Login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public void setUsuario(String pUsuario){
        this.usuario = pUsuario;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String pSenha){
        this.senha = pSenha;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String pTipo){
        this.tipo = pTipo;
    }
}
