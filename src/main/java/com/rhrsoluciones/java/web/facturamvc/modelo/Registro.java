/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rhrsoluciones.java.web.facturamvc.modelo;

import com.rhrsoluciones.java.web.facturamvc.modelo.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rmirabal
 */
public class Registro extends Conexion{
    public boolean  Guardar(String nombre, String apellido){       
        try {
                    
            PreparedStatement pst = con.prepareStatement("INSERT INTO cliente (nombre,apellido) VALUES (?,?)");
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.executeUpdate();
            System.out.println("Registro Guardado");
            return true;
        } catch (SQLException e) {
            System.out.println("Error" + e.toString());
            return false;
        }
    }
    
   
    
    
}
