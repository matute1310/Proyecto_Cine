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
public class HorarioFuncion {
    private int diaDeSemana;
    private int duracionIntervalo;
    private int duracionPublicidad;
    private Date horaPrimeraFuncion;
    private Date horaUltimaFuncion;
    private boolean esTrasnoche;
    
    public HorarioFuncion(int diaDeSemana,Date horaPrimeraFuncion,Date horaUltimaFuncion){
        this.diaDeSemana=diaDeSemana;
        this.horaPrimeraFuncion=horaPrimeraFuncion;
        this.horaUltimaFuncion=horaUltimaFuncion;
    }
    
    /**
     * muestra por pantalla con los valores de los atributos en HorarioFuncion
     * @return cadena de string con los datos 
     */
    public String MostrarHorarioFuncion(){
        String salida="";
        salida = salida+ mostrarDiaDeSemana()+".";
        salida = salida+ "primer funcion a las "+this.horaPrimeraFuncion.toString()+".";
        salida = salida+ "ultima funcion a las "+this.horaUltimaFuncion.toString();
        if(esTrasnoche)
        salida= salida+"(trasnoche)";
        salida = salida+"publicidad de"+this.getDuracionPublicidad()+"minutos.";
        salida=salida +"Intervalo de "+ this.duracionIntervalo+" minutos.";
        return salida;
    }
    /**
     * Muestra a travez de un String el dia de la semana en el que se da la funcion
     * @return devuelve el dia de la semana en un String 
     */
    public String mostrarDiaDeSemana(){
        String dia=" ";
        switch(diaDeSemana) {
            case 1: dia ="Lunes";break;
            case 2: dia ="Martes";break;
            case 3:dia ="Miercoles";break;
            case 4:dia ="Jueves";break;
            case 5:dia ="Viernes";break;
            case 6:dia ="Sabado";break;
            case 7:dia ="Domingo";break;
        }   
        return dia;
    }
    
    // Se listan, a continuacion, todos los métodos de seteo 
    // de cada atributo de la clase 
    
    public void setDiaDeSemana(int diaDeSemana){
        this.diaDeSemana=diaDeSemana;
    }
    public void setDuracionIntervalo(int duracionIntervalo){
        this.duracionIntervalo=duracionIntervalo;
    }
    public void setDuracionPublicidad(int duracionPublicidad){
        this.duracionPublicidad=duracionPublicidad;
    }
    public void setHoraPrimeraFuncion(Date horaPrimeraFuncion){
        this.horaPrimeraFuncion=horaPrimeraFuncion;
    }
    public void setHoraUltimaFuncion(Date horaUltimaFuncion){
        this.horaUltimaFuncion=horaUltimaFuncion;
    }
    public void setEsTrasnoche(boolean esTrasnoche){
        this.esTrasnoche=esTrasnoche;
    }
    public boolean getEsTrasnoche(){
        return esTrasnoche;
    }
    
    public Date getHoraUltimaFuncion(){
        return horaUltimaFuncion;
    }
    
    public Date getHoraPrimeraFuncion(){
        return horaPrimeraFuncion;
    }
    
    public int getDuracionIntervalo(){
        return duracionIntervalo;
    }
    
    public int getDuracionPublicidad(){
        return duracionPublicidad;
    }
    
    public int getDiaDeSemana(){
        return diaDeSemana;
    }
    
    
}
