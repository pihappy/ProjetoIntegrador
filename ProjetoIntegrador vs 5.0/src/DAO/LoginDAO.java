/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import Model.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author victor.maoliveira
 */
public class LoginDAO {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SERVIDOR = "localhost";
    private static final String BASEDADOS = "projeto";
    private static final String LOGIN = "root";
    private static final String SENHA = "";
    private static String url = "";
    private static Connection conexao;
    
    
    
    public static ArrayList<Login> getLogin()
    {
        ArrayList<Login> listaLogin = new ArrayList<Login>();
        
        try {
            //return SimulaDB.getInstance().getClientes();
            Class.forName(DRIVER);
            url = "jdbc:mysql://" + "localhost:3306/" + "projeto";
            conexao = DriverManager.getConnection(url,"root","");
            Statement comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM cliente;");
            while(rs.next())
            {
                Login l = new Login();
                l.setUsuario(rs.getString("usuario"));
                l.setSenha(rs.getString("senha"));
                listaLogin.add(l);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            listaLogin = null;
        } finally{
            try {
                conexao.close();
            } catch (SQLException ex) {
                listaLogin = null;
            }
        }
        
        return listaLogin;
    }
    
}
