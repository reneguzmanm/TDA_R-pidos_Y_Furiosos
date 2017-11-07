/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author RenéIgnacio
 */
public class Cliente {
    private int codCliente;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String direccion;
    private Comuna comuna;
    
    public Cliente nuevo_cliente(int cod, String nom, String apeP, String apeM,String dir, int cod_ci, String nom_ci, int cod_co, String nom_co){
        this.setCodCliente(cod);
        this.setNombre(nom);
        this.setApellidoP(apeP);
        this.setApellidoM(apeM);
        this.setDireccion(dir);
        this.getComuna().nueva_comuna(cod_co,cod_ci,nom_co,nom_ci);
        
        return this;
    }

    /**
     * @return the codCliente
     */
    public int getCodCliente() {
        return codCliente;
    }

    /**
     * @param codCliente the codCliente to set
     */
    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidoP
     */
    public String getApellidoP() {
        return apellidoP;
    }

    /**
     * @param apellidoP the apellidoP to set
     */
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    /**
     * @return the apellidoM
     */
    public String getApellidoM() {
        return apellidoM;
    }

    /**
     * @param apellidoM the apellidoM to set
     */
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the comuna
     */
    public Comuna getComuna() {
        return comuna;
    }

    /**
     * @param comuna the comuna to set
     */
    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }
    
}