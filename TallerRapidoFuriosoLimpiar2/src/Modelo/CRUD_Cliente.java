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
    
    public boolean insertarCliente(Cliente c){
        
        PreparedStatement ps =  null;
        Connection conn = getConnection();
        
        String sql = "INSERT INTO CLIENTE (codigo_cliente, nombre, apellido_p, apellido_M, direccion, id_comuna)" +
                    "VALUES(?,?,?,?,?,?)";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, c.getRut_Cliente());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getApellidoP());
            ps.setString(4, c.getApellidoM());
            ps.setString(5,c.getDireccion());
            ps.setInt(6, c.getId_comuna());
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
    
    public boolean modificarCliente(Cliente c){
        PreparedStatement ps =  null;
        Connection conn = getConnection();
        
        String sql = "UPDATE CLIENTE SET codigo_cliente=?, nombre=?, apellido_P=?, apellido_M=?, direccion=?, id_comuna=? "+
                     "where codigo_cliente=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, c.getRut_Cliente());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getApellidoP());
            ps.setString(4, c.getApellidoM());
            ps.setString(5,c.getDireccion());
            ps.setInt(6, c.getId_comuna());
            ps.setString(7, c.getRut_Cliente());
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
    
    public boolean eliminarCliente(Cliente c){
        PreparedStatement ps =  null;
        Connection conn = getConnection();
        
        String sql = "DELETE FROM CLIENTE where codigo_cliente=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, c.getRut_Cliente());
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
    
    public boolean seleccionarCliente(Cliente c){
        PreparedStatement ps =  null;
        ResultSet rs = null;
        Connection conn = getConnection();
        
        String sql = "SELECT * FROM CLIENTE where codigo_cliente=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, c.getRut_Cliente());
            rs = ps.executeQuery();
            
            if(rs.next()){
                c.setRut_Cliente(rs.getString("codigo_cliente"));
                c.setNombre(rs.getString("nombre"));
                c.setApellidoP(rs.getString("apellido_p"));
                c.setApellidoM(rs.getString("apellido_m"));
                c.setDireccion(rs.getString("direccion"));
                c.setId_comuna(Integer.parseInt(rs.getString("id_comuna")));
                return true;
            }
            
            return false;
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