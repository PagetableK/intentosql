/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Pablo
 */
public class Conexion {
    public static Connection getConexion()
    {
        String CConexion = "jdbc:sqlserver://localhost:54103;"
                + "databaseName=mus;"
                + "user=1234;"
                + "password=1234;"
                + "encrypt=true;trustServerCertificate=true";
        
        try {
            Connection con = DriverManager.getConnection(CConexion);
            return con;
        } catch (Exception e) {
            System.out.println("Error al conectar a la base");
            return null;
        }
    }
}
