/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author Matias Calvento
 */
public class Calificacion {
    private String nombre;
    
    /**
     * Constructor vacio
     */
    public Calificacion() {
    }
    /**
     * Este constructor incluye todos atributos de la clase Calificacion
     * 
     * @param nombre 
     */
        
    public Calificacion(String nombre){
         this.nombre = nombre;
    }
    
    // A continuación se listan todos los métodos de seteo
    // de cada atributo de la clase
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
   
    @Override
    public String toString() {
        return this.nombre;
    }
    
}
