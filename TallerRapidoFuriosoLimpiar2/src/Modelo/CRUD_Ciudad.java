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
import java.util.Vector;

/**
 *
 * *
 * @author RenéIgnacio
 */
public class CRUD_Ciudad extends ConexionBD {
    public boolean insertarCiudad(Ciudad c){
        
        PreparedStatement ps =  null;
        Connection conn = getConnection();
        
        String sql = "INSERT INTO CIUDAD (id_ciudad, nombre_ciudad)" +
                    "VALUES(?,?)";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getCod_ciudad());
            ps.setString(2, c.getNombre_ciudad());
            
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
    
    public boolean modificarComuna(Ciudad c){
        PreparedStatement ps =  null;
        Connection conn = getConnection();
        
        String sql = "UPDATE CIUDAD SET id_ciudad=?, nombre_ciudad=?"+
                     "where id_ciudad=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getCod_ciudad());
            ps.setString(2, c.getNombre_ciudad());
          
            ps.setInt(3, c.getCod_ciudad());
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
    
    public boolean eliminarCliente(Ciudad c){
        PreparedStatement ps =  null;
        Connection conn = getConnection();
        
        String sql = "DELETE FROM CIUDAD where id_ciudad=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getCod_ciudad());
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
    
    public boolean seleccionarComuna(Ciudad c){
        PreparedStatement ps =  null;
        ResultSet rs = null;
        Connection conn = getConnection();
        
        String sql = "SELECT * FROM CIUDD where id_ciudad=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getCod_ciudad());
            rs = ps.executeQuery();
            
            if(rs.next()){
                c.setCod_ciudad(Integer.parseInt(rs.getString("id_ciudad")));
                c.setNombre_ciudad(rs.getString("nombre_ciudad"));
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
