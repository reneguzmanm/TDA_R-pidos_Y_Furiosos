/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;

/**
 *
 * @author RenéIgnacio
 */
public class Controlador_Cliente extends ConexionBD { 
    
    public boolean cargar(Cliente c){
        PreparedStatement ps =  null;
        Connection conn = getConnection();
        
        String sql = "INSERT INTO CLIENTE (codigo_cliente, nombre, apellido_p, apellido_M, direccion, id_comuna)" +
                    "VALUES(?,?,?,?,?,?)";
        try{
            ps = conn.prepareStatement(sql);
            return true;
        }catch(SQLException e){
            return false;
        }
        
    }
}
