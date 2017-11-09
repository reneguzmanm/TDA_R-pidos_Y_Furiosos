/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CRUD_Cliente;
import Modelo.Cliente;
import Vista.Usuario.Registrar_Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author RenéIgnacio
 */
public class Controlador_Cliente implements ActionListener {
    
    private Cliente cl;
    private CRUD_Cliente crud_cl;
    private Registrar_Usuario frmReg;
    
    public Controlador_Cliente(Cliente cl, CRUD_Cliente crud_cl, Registrar_Usuario frmReg){
        this.cl = cl;
        this.crud_cl = crud_cl;
        this.frmReg = frmReg;
        this.frmReg.btn_Limpiar.addActionListener(this);
        this.frmReg.btn_Registrar.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == frmReg.btn_Registrar){
            cl.setRut_Cliente(frmReg.txt_RutCliente.getText());
            cl.setNombre(frmReg.txt_Nombre.getText());
            cl.setApellidoP(frmReg.txt_Apellido_Paterno.getText());
            cl.setApellidoM(frmReg.txt_Apellido_Materno.getText());
            cl.setDireccion(frmReg.txt_Direccion.getText());
            
        }
    }
}
