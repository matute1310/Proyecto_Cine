/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;
import java.math.BigDecimal;
import java.time.LocalDateTime;
/**
 *
 * @author Calvento Matias
 */
public abstract class Entrada {
    protected LocalDateTime fechaHoraFuncion,fechaHoraVenta;
    protected BigDecimal precioCobrado;
    protected Funcion funcion;
    
    /**
     * Constructor vacio
     */
    public Entrada(){
    }
    
    /**
     * Constructor Completo
     * 
     * @param fechaHoraFuncion
     * @param fechaHoraTransaccion
     * @param funcion
     * @param precio
     */
    public Entrada(LocalDateTime fechaHoraFuncion, LocalDateTime fechaHoraTransaccion, BigDecimal precio, Funcion funcion){
	this.fechaHoraFuncion=fechaHoraFuncion;
	this.fechaHoraVenta=fechaHoraTransaccion;
	this.precioCobrado=precio;
	this.funcion=funcion;
    }
     
    /**
     * chequea si la entrada fue o no anulada.
     * @return verdadero si la entrada fue anulada
     */
  
    public abstract boolean estaAnulada();

    @Override
    public abstract String toString();
    
    // A continuación se listan todos los métodos de seteo

    public void setFechaHoraFuncion(LocalDateTime fechaHoraFuncion){
        this.fechaHoraFuncion=fechaHoraFuncion;
    }
    
    public void setFechaHoraVenta(LocalDateTime fechaHoraVenta){
        this.fechaHoraVenta=fechaHoraVenta;
    }
    
    public void setPrecioCobrado(BigDecimal precioCobrado){
        this.precioCobrado=precioCobrado;
    }
            
    public void setFuncion(Funcion funcion){
        this.funcion=funcion;
    }
    
    public Funcion getFuncion(){
        return funcion;
    }
    public LocalDateTime getFechaHoraFuncion(){
        return fechaHoraFuncion;
    }
    public LocalDateTime getFechaHoraVenta(){
        return fechaHoraVenta;
    }
    public BigDecimal getPrecioCobrado(){
    return precioCobrado;
    }
}
    

