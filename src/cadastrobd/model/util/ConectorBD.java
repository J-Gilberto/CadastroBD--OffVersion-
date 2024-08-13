/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrobd.model.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author mrjoa
 */
public class ConectorBD {
    
  public static void main(String[] args) {
        getConnection();
        
    }
    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                // URL de conexão atualizada para incluir o banco de dados
                String url = "jdbc:sqlserver://localhost\\DESKTOP-3F3K0EB:1433;databaseName=loja;encrypt=true;trustServerCertificate=true;";
                String user = "loja";
                String password = "loja";
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Banco de Dados Conectado com Sucesso");
            } catch (SQLException e) {
                System.out.println("Erro no Banco de Dados");
                throw new RuntimeException("Erro ao obter conexao com o banco de dados: " + e.getMessage(), e);
            }
        }
        return conn;       
    }

    public static void closeStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar o statement: " + e.getMessage(), e);
        }
    }

    public static void closeResultSet(ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar o resultSet: " + e.getMessage(), e);
        }
    }

    public static void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados: " + e.getMessage(), e);
        }
    }

    void close(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
