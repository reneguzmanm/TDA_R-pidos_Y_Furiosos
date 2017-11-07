package Modelo;

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
    
    
    
    public Ciudad nuevaCiudad(int cod, String nom){
        this.setCod_ciudad(cod);
        this.setNombre_ciudad(nom);
        return this;
    }

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
}
