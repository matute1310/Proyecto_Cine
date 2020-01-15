/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Calvento Matias
 */

public class Funcion {
    private int diaSemana;
    private int duracion;
    private LocalTime horaInicio;
    private Integer numero;
    private List<Entrada> entradas;
    private Pelicula pelicula;
    private Sala sala;

    //  Constructor vacio
    public Funcion(){this.entradas=new ArrayList<>();}
    /**
     * Constructor Completo
     * 
     * @param diaSemana
     * @param duracion
     * @param horaInicio
     * @param numero
     * @param pelicula
     * @param sala 
     */
    public Funcion(int diaSemana,int duracion, LocalTime horaInicio, Integer numero, Pelicula pelicula,  Sala sala){
        this.diaSemana = diaSemana;
        this.duracion = duracion;
        this.horaInicio = horaInicio;
        this.numero = numero;
        this.pelicula = pelicula;
        this.sala = sala;
        this.entradas=new ArrayList<>();
    }
     /**
    * permite saber si la funcion esta en curso 
    * @return verdadero si la funcion se encuentra dentro del rango de aquellas que estan en curso
    */
    public boolean estaEnCurso(){
        LocalDateTime ahora = LocalDateTime.now();
            int diaDeHoy = ahora.getDayOfWeek().getValue();
            LocalTime horaActual = ahora.toLocalTime();
            //.plus agrega cantidad a minutos o horas dentro de un LocalTime usando la clase ChronoUnit decidimos a donde sumar.
            LocalTime horaFin = this.horaInicio.plus(this.duracion, ChronoUnit.MINUTES);
        
        if (diaDeHoy==this.diaSemana && 
            horaActual.isAfter(this.horaInicio)&&
            horaActual.isBefore(horaFin))
            return true;
        return false;
    }
    
    /**
    * indica si hay lugar disponible en la funcion bajo una cantidad pasada por parametro.
    * @return verdadero si la disponibilidad de la sala es mayor o igual a la cantidad ingresada
    * @param cant de lugares a consultar
    */
    public boolean hayLugar(int cant){
        return this.calcularDisponibilidad()>=cant;
    }
    
    /**
    * indica si hay al menos 1 lugar disponible en la funcion
    * @return verdadero si la disponibilidad de la sala es mayor o igual 1
    */
    public boolean hayLugar(){
        
        return calcularDisponibilidad()>0;
       //SE PUED USAR SOLO EL RETURN POR QUE LA RESPUESTA A ESA SENTENCIA ES VERDADERO.
        }
    
    /**
     * muestra como un string por pantalla el dia y la hora de la funcion 
     *
     */
    public String mostrarDiaHora(){
        String dia="";
        switch (diaSemana){
            case 1: dia="Lunes"; break;
            case 2: dia="Martes"; break;
            case 3: dia="Miercoles"; break;
            case 4: dia="Jueves"; break;
            case 5: dia="Viernes"; break;
            case 6: dia="Sábado"; break;
            case 7: dia="Domingo";break;
        }
                    
        return this.diaSemana+"/"+this.horaInicio.toString();
    
    }
    
    // A continuación se listan todos los métodos de seteo
    // de cada atributo de la clase
    
    public void setDiaSemana(int diaSemana){
        this.diaSemana=diaSemana;
    }
   
    public void setDuracion(int duracion){
        this.duracion=duracion;
    }
  
    
    public void setHoraInicio(LocalTime horaInicio){
        this.horaInicio=horaInicio;
    }
   
    public void setNumero(Integer numero){
        this.numero=numero;
    }
  
    public void setEntradas(List<Entrada> entradas){
        this.entradas=entradas;
    }
    /**
     * agrega un objeto Entrada a la lista de entradas
     * @param entrada 
     */
    public void addEntrada(Entrada entrada){
        this.entradas.add(entrada);
    }
    
    /**
     * @conbina 2 listas entradas
     * @param pentradas 
     */
    public void addEntradas(List<Entrada> pentradas){
        this.entradas.addAll(pentradas);
    }
   
    
    public void setPelicula(Pelicula pelicula){
    this.pelicula=pelicula;
    }
    
    
    public void setSala(Sala sala){
    this.sala=sala;
    }
   
    
    public Sala getSala(){
    return sala;
    }
    
    
    public Pelicula getPelicula(){
    return pelicula;
    }
    
    
    public List<Entrada> getEntradas(){
    return entradas;
    }
    
    
    public Integer getNumero(){
    return numero;
    }
   
    
    public LocalTime getHoraInicio(){
    return horaInicio;
    }
   
    
    public int getDuracion(){
    return duracion;
    }
   
    
    public int getDiaSemana(){
    return diaSemana;
    }
    
    
    public int calcularDisponibilidad(){
    return this.capacidadSala()- this.entradas.size();
    }
  
    
    public int capacidadSala(){
    return this.sala.getCapacidad();
    }
    
    
    
}
