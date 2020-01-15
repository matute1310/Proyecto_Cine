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
public class Rol {
    private String nombre;
    
    /**
    * Constructor completo
    * 
    * @param nombre
    */
    public Rol(String nombre){
        this.nombre=nombre;
    }
    
    // A continuación se listan todos los métodos 
    // de seteo de cada atributo de la clase
    
     public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
}
