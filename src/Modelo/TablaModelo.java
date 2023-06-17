/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
/**
 *
 * @author Pablo
 */
public class TablaModelo {
    
    public static boolean AgregarDatos(String nombre)
    {
        String mus = "insert into a values(?)";
        
        try {
            PreparedStatement st = Conexion.getConexion().prepareStatement(mus);
            
            st.setString(1,nombre);
            
            st.executeUpdate();
            
            
        } catch (Exception e) {
        }
        
        return true;
    }
    
}
