/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rhrsoluciones.java.web.facturamvc.bean;

import com.rhrsoluciones.java.web.facturamvc.modelo.Cliente;
import com.rhrsoluciones.java.web.facturamvc.modelo.Conexion;
import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;




/**
 *
 * @author Rmirabal
 */
@ManagedBean
@SessionScoped
public class ClienteBean extends Conexion{
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void Guardar() throws SQLException{  
       
            PreparedStatement pst = con.prepareStatement("INSERT INTO cliente (nombre,apellido) VALUES (?,?)");
            pst.setString(1, cliente.getNombre());
            pst.setString(2, cliente.getApellido());
            pst.executeUpdate();
    }
    
    
    @PostConstruct
    public void init() {
        cliente = new Cliente();
    }
    
    
   
    
    
    
}
