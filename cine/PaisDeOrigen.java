/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author Calvento Matias
 */
public class PaisDeOrigen {
    private String idioma;
    private String nombre;
    
    /**
     * Constructor vacio
     */
    public PaisDeOrigen() {
    }
    /**
     * Este constructor incluye todos los parametros de la clase PaisDeOrigen
     * 
     * @param idioma
     * @param nombre 
     */
    
    public PaisDeOrigen(String idioma,String nombre){
        this.idioma=idioma;
        this.nombre=nombre;
    }
    
    // A continuación se listan todos los métodos de seteo 
    // de cada atributo de la clase
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getIdioma(){
        return idioma;
    }
    public void setIdioma(String idioma){
        this.idioma=idioma;
    }
    @Override
    public String toString() {
        return this.nombre;
    }
}
