/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Colaborador;
import java.util.ArrayList;

/**
 *
 * @author mikael.asilva3
 */
public class ColaboradorDAO {

    public static boolean salvarColaborador(Colaborador c) {
        return SimulaDB.getInstance().salvarColaborador(c);
    }

    public static boolean atualizarColaborador(Colaborador c) {
        return SimulaDB.getInstance().atualizarColaborador(c);
    }
public static boolean ExcluirColaborador (int pID){
    return SimulaDB.getInstance().excluirColaborador(pID);
}

    public static ArrayList<Colaborador> getColaboradores()
    {
        //Simulo uma consulta no banco de dados (SELECT ID,Nome,CPF FROM TabelaXYZ)
        return SimulaDB.getInstance().getColaborador();
    }
    
}
