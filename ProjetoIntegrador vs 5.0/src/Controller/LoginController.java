/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.LoginDAO;
import Model.Login;
import java.sql.SQLException;

/**
 *
 * @author gabriela.vsmarques
 */
public class LoginController {
    
    public static boolean Salvar(String pUsuario,String pSenha) {
        Login p =  new Login(pUsuario, pSenha);
        return LoginDAO.Salvar(p);
    }

    public static boolean Atualizar(String pUsuario,String pSenha) throws ClassNotFoundException, SQLException {
        Login p =  new Login(pUsuario, pSenha);
        return LoginDAO.Atualizar(p);
    }
       
    
}
