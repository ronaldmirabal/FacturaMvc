/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rhrsoluciones.java.web.facturamvc.modelo;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Rmirabal
 */
public class Conexion {
    public static final String USERNAME = "root";
    public static final String PASSWORD = "173001";
    public static final String HOST = "localhost";
    public static final String PORT = "3306";
    public static final String DATABASE = "db_facturamvc";
    public static final String CLASSNAME = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost/"+DATABASE+"?useTimezone=true&serverTimezone=UTC&useSSL=false";
    
     public java.sql.Connection con;
     
       public Conexion() {
  
        try {
           Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexion Exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error" + e.toString());
        }
}

   

   

    
        
      
}
