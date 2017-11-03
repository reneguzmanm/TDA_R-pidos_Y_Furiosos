/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Jose
 */
public class ConexionBD {
       public String bd="rapido_y_furiosodb";
    public String url="jdbc:mysql://localhost/"+bd;
    public String user="root";
    public String pass="";
    private static Connection conn;


    public Connection getConnection(){
        this.conn=null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conn =DriverManager.getConnection(this.url,this.user,this.pass);
            System.out.println("Hubo conexion");
        } catch (ClassNotFoundException |   SQLException e) {
            System.err.println("No hubo conexion "+e);
        }
        return conn;
    }
    
}
