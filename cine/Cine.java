/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Matias Calvento
 */
public class Cine {
    private String direccion,nombre;
    private Date fechaInauguracion;
    private float precioEntrada;
    private List<Sala> sala;
    private List<HorarioFuncion> horariosFunciones;
    private List<Programacion> programaciones;

    /**
     * Este constructor incluye solo el atributo sala
     * 
     * @param salas
     */    
    public Cine(List<Sala> salas){
    this.sala=salas;
    this.programaciones=new ArrayList<>();
    this.horariosFunciones=new ArrayList<>();
    }

    /**
     * Constructor completo
     * 
     * @param direccion
     * @param fechaInauguracion
     * @param nombre
     * @param sala
     * @param horariosFunciones
     * @param programaciones
     */    
     public Cine(String direccion, Date fechaInauguracion, String nombre, List<Sala> sala, List<HorarioFuncion> horariosFunciones, List<Programacion> programaciones) {
        this.direccion = direccion;
        this.fechaInauguracion = fechaInauguracion;
        this.nombre = nombre;
        this.sala = sala;
        this.horariosFunciones = horariosFunciones;
        this.programaciones = programaciones;
    }
     
    /**
    * muestra los atributos del cine
    * @return cadena de strings con los datos 
    */
    public String mostrarCine(){
        return "Nombre: "+getNombre()+"."+" Precio entrada: "+getPrecioEntrada()+
               ". Direccion: "+getDireccion()+" Funciones: "+mostrarInfoHorariosFuncion();
}
   /**
    * muestra la informacion de los horarios de funcion recorre la lista y devuelve los datos
    *@return cadena de strings q contiene los datos de cada objeto dentro de la lista de HorarioFuncion
    */
    public String mostrarInfoHorariosFuncion(){
        String salida = " ";
        for (Iterator<HorarioFuncion> itHorariosFunciones=horariosFunciones.iterator(); itHorariosFunciones.hasNext();)
            salida += itHorariosFunciones.next().MostrarHorarioFuncion();
        return salida;
    }
    /**
     * Obtenemos la Programacion vigente para este Cine
     * 
     * @return devuelve la programacion vigente en caso de existir, en caso de no existir devuelve null
     */
    public Programacion obtenerProgramacionVigente () {
        Programacion vigente = null;
        
        Iterator<Programacion> it = programaciones.iterator();
            while (it.hasNext()) {
                Programacion p = it.next();
            
                if (p.estaVigente()) {
                    vigente = p;
                break;
            }
        }
        
        return vigente;
    }
    
    //A continuación se listan todos los métodos de seteo de cada atributo de la clase.

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setFechaInauguracion(Date fechaInauguracion){
        this.fechaInauguracion=fechaInauguracion;
    }
    
    public void setPrecioEntrada(float precioEntrada){
        this.precioEntrada=precioEntrada;
    }
    
    public void setSala(List<Sala> sala){
        this.sala=sala;
    }
    
    public void setProgramaciones(List<Programacion> programaciones){
        this.programaciones=programaciones;
    }
    
    public void setHorariosFunciones(List<HorarioFuncion> horariosFunciones)
    {   this.horariosFunciones=horariosFunciones;}
      
    public String getNombre(){
        return nombre;
    }  
    public String getDireccion(){
        return direccion;
    }
      
    public float getPrecioEntrada(){
        return precioEntrada;
    }
      
    public Date getFechaInauguracion(){
        return fechaInauguracion;
    }
      
    public List<Sala> getSala(){
        return sala;
    }
    
    public List<Programacion> getProgramaciones(){
        return programaciones;
    }
    
    public List<HorarioFuncion> getHorariosFunciones(){
        return horariosFunciones;
    }
    
    public void addHorarioFunciones(HorarioFuncion horarioFunciones){
    this.horariosFunciones.add(horarioFunciones);
    }  
    
}
