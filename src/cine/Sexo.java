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
public class Sexo {
    private String nombre;
    
    public Sexo(String nombre){
    this.nombre=nombre;
    }    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
}
