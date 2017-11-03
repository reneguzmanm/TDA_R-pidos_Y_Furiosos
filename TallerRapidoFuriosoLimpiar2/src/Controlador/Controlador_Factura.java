/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author RenéIgnacio
 */
public class Controlador_Factura {
    
    public boolean revisarDatosIngresados(String mano_obra, String fecha, String iva, String neto, String total){
    
        
        
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        formateador.setLenient(false);
        try
        {
           Date hoy = formateador.parse(fecha);          
        }
        catch (ParseException e)
        {
           return false;
        } 
        
        try{
            Integer.parseInt(mano_obra);
            Integer.parseInt(iva);
            Integer.parseInt(neto);
            Integer.parseInt(total);
           
        }
        catch(NumberFormatException e){
            return false;
        }
        return true;
    }
}
