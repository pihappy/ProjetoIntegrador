/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Colaborador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mikael.asilva3
 */
public class ColaboradorDAO {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SERVIDOR = "localhost";
    private static final String BASEADOS = "pihappycolaborador";
    private static final String LOGIN = "root";
    private static final String SENHA = "adminadmin";
    private static String url = "";
    private static Connection conexao;

    public static boolean salvarColaborador(Colaborador c) {
        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "pihappyColaborador";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO colaborador(Nome, CPF, DtNasc, Sexo, Rua, NumRua, Bairro, Complemento, Estado, Cidade, Celular1, Celular2, Telefone, Recado, Email, Cargo, Departamento, Admissao, Salario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, )");;
            comando.setString(1, c.getNome());
            comando.setString(2, c.getCpf());
            comando.setString(3, c.getDtnasc());
            comando.setString(4, c.getSexo());
            comando.setString(5, c.getCep());
            comando.setString(6, c.getRua());
            comando.setInt(7, c.getNumero());
            comando.setString(8, c.getBairro());
            comando.setString(9, c.getComplemento());
            comando.setString(10, c.getEstado());
            comando.setString(11, c.getCidade());
            comando.setString(12, c.getCelular1());
            comando.setString(13, c.getCelular2());
            comando.setString(14, c.getTelefone());
            comando.setString(15, c.getRecado());
            comando.setString(16, c.getEmail());
            comando.setString(17, c.getCargo());
            comando.setString(18, c.getDepartamento());
            comando.setString(19, c.getAdmissao());
            comando.setDouble(20, c.getSalario());

            int linhasAfetadas = comando.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (ClassNotFoundException e) {
            retorno = true;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                retorno = false;
            }
        }
        return retorno;
    }

    public static boolean atualizarColaborador(Colaborador c) {
        return SimulaDB.getInstance().atualizarColaborador(c);
    }

    public static boolean ExcluirColaborador(int pID) {
        return SimulaDB.getInstance().excluirColaborador(pID);
    }

    public static ArrayList<Colaborador> getColaboradores() {
        //Simulo uma consulta no banco de dados (SELECT ID,Nome,CPF FROM TabelaXYZ)
        return SimulaDB.getInstance().getColaborador();
    }

}
