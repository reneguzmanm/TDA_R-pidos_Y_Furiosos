/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author RenéIgnacio
 */
public class CRUD_Comuna extends ConexionBD {
   
    public boolean insertarComuna(Comuna c){
        
        PreparedStatement ps =  null;
        Connection conn = getConnection();
        
        String sql = "INSERT INTO COMUNA (id_comuna, id_ciudad, nombre_comuna)" +
                    "VALUES(?,?,?)";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getCod());
            ps.setInt(2, c.getCod_ciudad());
            ps.setString(3, c.getNombre_comuna());
            
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
    
    public boolean modificarComuna(Comuna c){
        PreparedStatement ps =  null;
        Connection conn = getConnection();
        
        String sql = "UPDATE COMUNA SET id_comuna=?, id_ciudad=?, nombre_comuna=?"+
                     "where id_comuna=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getCod());
            ps.setInt(2, c.getCod_ciudad());
            ps.setString(3, c.getNombre_comuna());
          
            ps.setInt(4, c.getCod());
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
    
    public boolean eliminarCliente(Comuna c){
        PreparedStatement ps =  null;
        Connection conn = getConnection();
        
        String sql = "DELETE FROM Comuna where id_comuna=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getCod());
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
    
    public boolean seleccionarComuna(Comuna c){
        PreparedStatement ps =  null;
        ResultSet rs = null;
        Connection conn = getConnection();
        
        String sql = "SELECT * FROM COMUNA where id_comuna=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getCod());
            rs = ps.executeQuery();
            
            if(rs.next()){
                c.setCod(Integer.parseInt(rs.getString("id_comuna")));
                c.setCod_ciudad(Integer.parseInt(rs.getString("id_ciudad")));
                c.setNombre_comuna(rs.getString("nombre_comuna"));
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
