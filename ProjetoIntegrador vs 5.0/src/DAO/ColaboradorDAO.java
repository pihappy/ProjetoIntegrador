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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO colaborador Nome = ?, CPF = ?, DtNasc = ?, Sexo = ?, Rua = ?, NumRua = ?, Bairro = ?, Complemento = ?, Estado = ?, Cidade = ?, Celular1 = ?, Celular2 = ?, Telefone = ?, Recado = ?, Email = ?, Cargo = ?, Departamento = ?, Admissao = ?, Salario = ? WHERE IdColaborador = ?;");;
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
            comando.setString(20, c.getSalario());

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
        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "pihappyColaborador";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("UPDATE colaborador SET (Nome, CPF, DtNasc, Sexo, Rua, NumRua, Bairro, Complemento, Estado, Cidade, Celular1, Celular2, Telefone, Recado, Email, Cargo, Departamento, Admissao, Salario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, )");;
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
            comando.setString(20, c.getSalario());

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

    public static boolean ExcluirColaborador(int pIdColaborador) {

        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "pihappyColabhorador";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("DELETE FROM colaborador WHERE IdColaborador = ?");
            comando.setInt(1, pIdColaborador);

            int linhasAfetadas = comando.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (ClassNotFoundException ex) {
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

    public static ArrayList<Colaborador> getColaboradores() {
        ArrayList<Colaborador> listaColaborador = new ArrayList<Colaborador>();

        try {
            //return SimulaDB.getInstance().getClientes();
            Class.forName(DRIVER);
            url = "jdbc:mysql://" + "localhost:3306/" + "pihappyColaborador";
            conexao = DriverManager.getConnection(url, "root", "");
            Statement comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM cliente;");
            while (rs.next()) {
                Colaborador c = new Colaborador();
                c.setId(rs.getInt("Id"));
                c.setNome(rs.getString("Nome"));
                c.setCpf(rs.getString("CPF"));
                c.setDtnasc(rs.getString("DtNasc"));
                c.setSexo(rs.getString("Sexo"));
                c.setCep(rs.getString("CEP"));
                c.setRua(rs.getString("Rua"));
                c.setNumero(rs.getInt("Numero"));
                c.setBairro(rs.getString("Bairro"));
                c.setComplemento(rs.getString("Complemento"));
                c.setEstado(rs.getString("Estado"));
                c.setCidade(rs.getString("Cidade"));
                c.setCelular1(rs.getString("Celular1"));
                c.setCelular2(rs.getString("Celular2"));
                c.setTelefone(rs.getString("Telefone"));
                c.setRecado(rs.getString("Recado"));
                c.setEmail(rs.getString("Email"));
                c.setCargo(rs.getString("Cargo"));
                c.setDepartamento(rs.getString("Depto"));
                c.setAdmissao(rs.getString("Admissao"));
                c.setSalario(rs.getString("Salario"));
                listaColaborador.add(c);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            listaColaborador = null;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                listaColaborador = null;
            }
        }

        return listaColaborador;
    }
    
    public static ArrayList<Colaborador> Pesquisar(Colaborador p) {
        ArrayList<Colaborador> listaColaborador = new ArrayList<>();

        try {

            Class.forName(DRIVER);
            url = "jdbc:mysql://" + "localhost:3306/" + "pihappyColaborador";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM colaborador WHERE id LIKE ? OR nome LIKE ? OR CPF LIKE ?;");
            comando.setString(1, p.getId() + "%");
            comando.setString(2, p.getNome() + "%");
            comando.setString(3, p.getCpf() + "%");

            ResultSet rs = comando.executeQuery();
            
            while (rs.next()) {
                
                Colaborador c = new Colaborador();
                c.setId(rs.getInt("Id"));
                c.setNome(rs.getString("Nome"));
                c.setCpf(rs.getString("CPF"));
                c.setDtnasc(rs.getString("DtNasc"));
                c.setSexo(rs.getString("Sexo"));
                c.setCep(rs.getString("CEP"));
                c.setRua(rs.getString("Rua"));
                c.setNumero(rs.getInt("Numero"));
                c.setBairro(rs.getString("Bairro"));
                c.setComplemento(rs.getString("Complemento"));
                c.setEstado(rs.getString("Estado"));
                c.setCidade(rs.getString("Cidade"));
                c.setCelular1(rs.getString("Celular1"));
                c.setCelular2(rs.getString("Celular2"));
                c.setTelefone(rs.getString("Telefone"));
                c.setRecado(rs.getString("Recado"));
                c.setEmail(rs.getString("Email"));
                c.setCargo(rs.getString("Cargo"));
                c.setDepartamento(rs.getString("Depto"));
                c.setAdmissao(rs.getString("Admissao"));
                c.setSalario(rs.getString("Salario"));
                listaColaborador.add(c);
            }
            
        } catch (SQLException ex) {
            listaColaborador = null;
        } catch (ClassNotFoundException ex) {
            listaColaborador = null;
        }
            
        finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                listaColaborador = null;
            }
        }

        return listaColaborador;
    }
}
