/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.*;


/**
 *
 * @author Calvento Matias
 */
public class Pelicula {
    private Date añoEstreno;
    private Date fechaIngreso;
    private boolean disponible;
    private String nombre;
    private String tituloOriginal;
    private int duracion;
    private List<Funcion> funciones;
    private List<Personaje> personajes;
    private PaisDeOrigen paisDeOrigen; 
    private Genero genero;
    private Calificacion calificacion;
    /**
     * Constructor vacio
     */
    public Pelicula(){
    this.funciones=new ArrayList<>();
    this.personajes=new ArrayList<>();
    }
     /**
     * constructor completo de la clase Pelicula
     * 
     * @param añoEstreno
     * @param fechaIngreso
     * @param disponible
     * @param duracion
     * @param nombre
     * @param tituloOriginal
     * @param paisDeOrigen
     * @param personajes
     * @param funciones
     * @param genero
     * @param calificacion 
     */
    public Pelicula(Date añoEstreno,Date fechaIngreso, boolean disponible, int duracion, String nombre,
        String tituloOriginal, PaisDeOrigen paisDeOrigen, List<Personaje> personajes,
        List<Funcion> funciones, Genero genero, Calificacion calificacion){
       
        this.añoEstreno=añoEstreno;
        this.fechaIngreso=fechaIngreso;
        this.disponible=disponible;
        this.duracion=duracion;
        this.nombre=nombre;
        this.tituloOriginal=tituloOriginal;
        this.paisDeOrigen=paisDeOrigen;
        this.personajes=personajes;
        this.funciones=funciones;
        this.genero=genero;
        this.calificacion=calificacion;
        this.funciones=new ArrayList<>();
        this.personajes=new ArrayList<>();
        
         
    }
    
   
    
    /**
     * Calcula la duracion de la funcion de una pelicula en un cine para un HorarioFuncion determinado.
     * @param horarioFuncion
     * @return cantidad de minutos totales de la pelicula en Funcion
     */
    public int calcularDuracionEnFuncion(HorarioFuncion horarioFuncion){
        return this.getDuracion()+horarioFuncion.getDuracionPublicidad()+horarioFuncion.getDuracionIntervalo();
    }
    
    /**
     * Consultamos si la pelicula esta disponible
     * @return verdadero si la pelicula esta disponible
     */
    
    public boolean estaDisponible(){
        return this.getDisponible();
    }
  
    /**
    * consulta si la pelicula se encuentra en cartelera.
    * @param progVigente
    * @return verdadero si la pelicula esta en cartelera 
    */
    
    public boolean estaEnCartelera(Programacion progVigente){
            for(Iterator<Funcion> itFunciones= progVigente.getFunciones().iterator();itFunciones.hasNext();){
              if(this.equals(itFunciones.next().getPelicula())){
                return true;
              }
           }
        return false;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
    }
    
    // METODO QUE SOBRESCRIBE EL EQUALS DE OBJECT lo usamos para igualar la pelicula a una ingresada por parametro.
   
    @Override
    public boolean equals(Object o){
        Pelicula pl = (Pelicula) o;
        if (this.añoEstreno==pl.añoEstreno &&
            this.duracion==pl.getDuracion() &&
            this.fechaIngreso.equals(pl.getFechaIngreso()) &&
            this.nombre.equals(pl.getNombre()) &&
            this.tituloOriginal.equals(pl.getTituloOriginal()) &&
            this.disponible==pl.getDisponible())
        return true;
        else
        return false;                                    
    }
    
    /**
     * Consulta las funciones habilitadas de una programacion vigente pasada por parametro y las devuelve como String
     * @param progVigente
     * @return devuelve las funciones como String 
     */
    public String mostrarFuncionesHabilitadas(Programacion progVigente){
        String salida= "";
          for(Iterator<Funcion> itFunciones= progVigente.getFunciones().iterator();itFunciones.hasNext();){
               if(this.equals(itFunciones.next().getPelicula())){
               salida = salida+itFunciones.next().mostrarDiaHora();
                }
           }             
        return salida; 
    }
    
    // A continuación se listan todos los métodos
    // de seteo de cada atributo de la clase Pelicula
    
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    public void setDisponible(boolean disponible){
    this.disponible=disponible;
    }
    public void setAñoEstreno(Date añoEstreno){
    this.añoEstreno=añoEstreno;
    }
    public void setDuracion(int duracion){
    this.duracion=duracion;
    }
    public void setFechaIngreso(Date fechaIngreso){
    this.fechaIngreso=fechaIngreso;
    }
    public void setTituloOriinal(String tituloOriginal){
    this.tituloOriginal=tituloOriginal;
    }
    public void setPaisOrigen(PaisDeOrigen paisDeOrigen){
    this.paisDeOrigen=paisDeOrigen;
    }
    public void setGenero(Genero genero){
    this.genero=genero;
    }
    public void setCalificacion(Calificacion calificacion){
    this.calificacion=calificacion;
    }
    public String getNombre(){
    return nombre;
    }
    public PaisDeOrigen getPaisDeOrigen(){
    return paisDeOrigen;
    }
    public Genero getGenero(){
    return genero;
    }
    public Calificacion getCalificacion(){
    return calificacion;
    }
        public Boolean getDisponible(){
    return disponible;
    }
    public int getDuracion(){
    return duracion;
    }
    public Date getFechaIngreso(){
    return fechaIngreso;
    }
    public String getTituloOriginal(){
    return tituloOriginal;
    }
    public Date getAñoEstreno(){
    return this.añoEstreno;
    }
             
    
    
}
