/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


/**
 *
 * @author RenéIgnacio
 */
public class Controlador_Diagnostico {
    
    public boolean revDiagnostico(String total){
        
        
        try{            
            Integer.parseInt(total);
           
        }
        catch(NumberFormatException e){
            return false;
        }
        return true;
    
    }
}
