/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Pablo
 */
public class TablaControlador {
    
    public String nombre;
    
    public boolean AgregarDatos(){return Modelo.TablaModelo.AgregarDatos(nombre);}
            
    
}
