/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.time.*;
import java.util.*;


/**
 *
 * @author Calvento Matias
 */
public class Programacion {
    private LocalDate fechaFin;
    private LocalDate fechaInicio;
    private LocalDateTime fechaHoraCreada;
    private List<Funcion> funciones;
    
    //constructor vacio
    public Programacion(){
      this.funciones=new ArrayList<>();
    }
    
    /**
     * Constructor completo
     * 
     * @param fechaInicio
     * @param fechaFin
     * @param fechaHoraCreada
     * @param funciones 
     */
    public Programacion(LocalDate fechaInicio, LocalDate fechaFin, LocalDateTime fechaHoraCreada, List<Funcion> funciones) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaHoraCreada = fechaHoraCreada;
        this.funciones = funciones;
        this.funciones = new ArrayList<>();
    }
    
    /**
    * chequea si la programacion esta completa.
    * @return verdadero si la programacion esta completa 
    */
    
    public boolean estaCompleta(){
        return false;
    }
    /**
    * chequea si la funcion inicio
    * @param funcion
    * @return verdadero si la Funcion inicio
    */
    public boolean estaIniciadaFuncion(Funcion funcion){
        if(funcion.estaEnCurso());
        return true;
    }
    /**
    * chequea si la funcion esta vigente en la fecha actual
    * @return verdadero si esta vigente
    */

    public boolean estaVigente(){
        LocalDate hoy = LocalDate.now();
 
        return  ((hoy.isAfter(this.fechaInicio)||hoy.isEqual(this.fechaInicio))
            &&(hoy.isBefore(this.fechaFin)|| hoy.isEqual(this.fechaInicio)));
    }
     
    /**
    * Muestra por pantalla una cadena de String con todos los valores contenidos en los atributos de esta Clase.
    * la fecha inicio fecha fin y los datos de todas las funciones.
    * @return
    */
 
    public String mostrarProgramacion(){
        String prog = "Programacion del "+fechaInicio.toString()+" al "+ fechaFin.toString()+":";
        for(int i=1;i<=funciones.size();i++){
            prog = prog + funciones.get(i).mostrarDiaHora()+"."+
            funciones.get(i).getPelicula().getNombre()+". Sala "+
            funciones.get(i).getSala().getNumero()+".";
        }                       
        return prog;
    }
    /**
     * Chequea si el dia de semana pasado por parametro existe funcion vigente
     * @param diaSemana
     * @return devuelve verdadero si existe funcion el dia pasado por parametro
     */
    public boolean HayFuncion(int diaSemana){ 
        int i=1; boolean hayFuncion=false ;
    
        while(!hayFuncion && i<=this.funciones.size()){
            hayFuncion =   diaSemana == funciones.get(i).getDiaSemana();
            i++;}
        return hayFuncion;
    }   
    
    // A continuación se listan todos los métodos 
    // de seteo de cada atributo de la clase Programacion
    
    public void setFechaFin(LocalDate fechaFin){
        this.fechaFin=fechaFin;
    }

    public void setFechaHoraCreada(LocalDateTime fechaHoraCreada){
        this.fechaHoraCreada=fechaHoraCreada;
    }

    public void setfechaInicio(LocalDate fechaInicio){
        this.fechaInicio=fechaInicio;
    }

    public void setFunciones(List<Funcion> funciones){
        this.funciones=funciones;
    }

    public List<Funcion> getFunciones(){
        return funciones;
    }

    public LocalDate getFechaFin(){
        return fechaFin;
    }

    public LocalDateTime getFechaHoraCreada(){
            return fechaHoraCreada;
    }

    public LocalDate getFechaInicio(){
        return fechaInicio;
    }
    
}
