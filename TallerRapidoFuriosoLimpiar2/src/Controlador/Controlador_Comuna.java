/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CRUD_Comuna;
import Modelo.Comuna;
import Modelo.ConexionBD;
import Vista.Usuario.Registrar_Usuario;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author RenéIgnacio
 */
public class Controlador_Comuna {
    
    private Comuna com;
    private CRUD_Comuna crud_cl;
    private Registrar_Usuario frmReg;
    
}
