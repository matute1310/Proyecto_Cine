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
public class Genero {
    private String nombre;
    
    /**
     * constructor vacio
     */
    public Genero(){
    }
    /**
     * constructor completo
     * @param nombre 
     */
    public Genero(String nombre){
        this.nombre=nombre;
    }
    
    //Se listan a continuacion los metodos de seteo de los atributos de la clase
    //
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
