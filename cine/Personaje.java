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
public class Personaje {
    private String nombreEnPelicula;
    private Actor actor;
    private Rol rol;
    
    /**
     * Constructor vacio
     */
    
    public Personaje(){
    }
    
    /**
     * Este constructor incluye todos los atributos de la clase Personaje
     * 
     * @param nombreEnPelicula
     * @param actor
     * @param rol 
     */
    public Personaje(String nombreEnPelicula,Actor actor,Rol rol){
        this.nombreEnPelicula=nombreEnPelicula;
        this.actor=actor;
        this.rol=rol;
    }
    
    // A continuación se listan todos los métodos de seteo 
    // de cada atributo de la clase
    
    public String getNombreEnPelicula() {
        return nombreEnPelicula;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {
        this.nombreEnPelicula = nombreEnPelicula;
    }

    public Actor getPersonaje() {
        return actor;
    }

    public void setPersonaje(Actor actor) {
        this.actor = actor;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return nombreEnPelicula + " interpretado por " + actor;
    }
    
    
}