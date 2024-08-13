/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrobd;

import cadastrobd.model.util.ConectorBD;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author mrjoa
 */
public class CadastroBDTeste {
    
     
     public static void main(String[] args) {
        ConectorBD conector = new ConectorBD();
        Connection connection = conector.getConnection();
        System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
        conector.closeConnection();
    }
    
    
}
