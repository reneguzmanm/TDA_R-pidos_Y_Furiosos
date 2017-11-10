package Modelo;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RenéIgnacio
 */
public class Ciudad {
    private int cod_ciudad;
    private String nombre_ciudad;
    

    /**
     * @return the cod_ciudad
     */
    public int getCod_ciudad() {
        return cod_ciudad;
    }

    /**
     * @param cod_ciudad the cod_ciudad to set
     */
    public void setCod_ciudad(int cod_ciudad) {
        this.cod_ciudad = cod_ciudad;
    }

    /**
     * @return the nombre_ciudad
     */
    public String getNombre_ciudad() {
        return nombre_ciudad;
    }

    /**
     * @param nombre_ciudad the nombre_ciudad to set
     */
    public void setNombre_ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }
    
    
    public Vector<Ciudad> mostrarCiudad(){
        
      
        PreparedStatement ps = null;
        ResultSet rs = null;    
        ConexionBD conn = new ConexionBD();
        Connection con = conn.getConnection();
        
        Vector<Ciudad> v = new Vector<Ciudad>();
        Ciudad ci = null;
        
        
        try{

            String sql = "SELECT * FROM CIUDAD";
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            ci = new Ciudad();
            ci.setCod_ciudad(0);
            ci.setNombre_ciudad("Seleccione ciudad");
            v.add(ci);
            
            while(rs.next()){
                
                ci.setCod_ciudad(rs.getInt("id_ciudad"));
                ci.setNombre_ciudad(rs.getString("nombre_ciudad"));
                v.add(ci);
            }
            
            rs.close();
            
        }
        catch(SQLException e){
            System.err.println(e);
        }
        
        return v;
    }    
}
