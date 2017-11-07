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
public class Comuna {
    private int cod;
    private String nombre_comuna;
    private Ciudad ciudad;
    
    public Comuna nueva_comuna(int cod_co, int cod_ci, String nom_comuna, String nom_ciudad){
        this.setCod(cod_co);
        this.setNombre_comuna(nom_comuna);
        this.getCiudad().nuevaCiudad(cod_ci, nom_ciudad);
        return this;
    }

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the nombre_comuna
     */
    public String getNombre_comuna() {
        return nombre_comuna;
    }

    /**
     * @param nombre_comuna the nombre_comuna to set
     */
    public void setNombre_comuna(String nombre_comuna) {
        this.nombre_comuna = nombre_comuna;
    }

    /**
     * @return the ciudad
     */
    public Ciudad getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
}
