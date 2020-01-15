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
public class Reserva extends Entrada {
    private Integer nroReserva;
    private LocalDateTime fechaHoraCaducidad;    

    //Constructor
    public Reserva(LocalDateTime fechaHoraF,LocalDateTime fechaHoraT, BigDecimal precio, 
            Funcion funcion, Integer nroReserva, LocalDateTime fechaHoraCaducidad){
	super(fechaHoraF, fechaHoraT, precio, funcion);
	this.nroReserva=nroReserva;
	this.fechaHoraCaducidad=fechaHoraCaducidad;
    }
    /** Chequea si la reserva esta anulada
     * 
     * @return devuelve verdadero si el valor de nroReserva es negativo
     */
    @Override
    public boolean estaAnulada(){
	return nroReserva < 0;
    }

    @Override
    public String toString() {
        String salida = " ";
        salida += "Nro de Reserva: "+nroReserva.toString()+".";
        salida += "Fecha y hora de Reserva: "+fechaHoraVenta.toString()+"." ;
        salida += "Pelicula: "+ funcion.getPelicula().getNombre()+".";
        salida += "Fecha y hora de la funcion: "+fechaHoraFuncion.toString()+"Hs.";
        salida += "Precio a cobrar: "+precioCobrado.toString()+".";
        salida += "Fecha y hora de caducidad: "+fechaHoraCaducidad.toString()+".";
        return salida;
    }  
   
}
