/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco_Dados;

/**
 *
 * @author CGInformatica
 */
;
import java.sql.Connection;
import java.sql.DriverManager;



public class ConnectionFactory {

    private static String sqlString = "jdbc:mysql://localhost:3306/cems";
    private static String usuario = "root";
    private static String senha = "17072010";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(sqlString, usuario, senha);
    }

    public static void closeConnection(Connection connection) throws Exception {
        connection.close();
    }

    //Somente para testar se a conexão esta OK no botão de Login
    public static void testConnection() throws Exception {
        Connection conn = getConnection();
    }

    //Somente para testar se a conexão esta OK
    /*public static void main(String args[]) throws Exception {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Conexão OK!");
        } else {
            System.out.println("Conexão falhou!");
        }
    }*/
}
