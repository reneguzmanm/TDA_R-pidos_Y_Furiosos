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
public class CRUD_Cliente extends ConexionBD { 
    
    public boolean insertar(Cliente c){
        PreparedStatement ps =  null;
        Connection conn = getConnection();
        
        String sql = "INSERT INTO CLIENTE (codigo_cliente, nombre, apellido_p, apellido_M, direccion, id_comuna)" +
                    "VALUES(?,?,?,?,?,?)";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getCodCliente());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getApellidoP());
            ps.setString(4, c.getApellidoM());
            ps.setString(5,c.getDireccion());
            ps.setInt(6, c.getComuna().getCod());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }   finally{
                try{
                    conn.close();
                }catch(SQLException e){
                    System.err.println(e);
                }
            }

    }
    
    public boolean modificar(Cliente c){
        PreparedStatement ps =  null;
        Connection conn = getConnection();
        
        String sql = "UPDATE CLIENTE SET codigo_cliente=?, nombre=?, apellido_P=?, apellido_M=?, direccion=?, id_comuna=? "+
                     "where codigo_cliente=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getCodCliente());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getApellidoP());
            ps.setString(4, c.getApellidoM());
            ps.setString(5,c.getDireccion());
            ps.setInt(6, c.getComuna().getCod());
            ps.setInt(7, c.getCodCliente());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }   finally{
                try{
                    conn.close();
                }catch(SQLException e){
                    System.err.println(e);
                }
            }

    }
    
    public boolean eliminar(Cliente c){
        PreparedStatement ps =  null;
        Connection conn = getConnection();
        
        String sql = "DELETE FROM CLIENTE where=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getCodCliente());
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }   finally{
                try{
                    conn.close();
                }catch(SQLException e){
                    System.err.println(e);
                }
            }

    }
}
