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
public class Compra extends Entrada {
    private Integer nroTicket;
        
    /**
     * Constructor
     * @param nroTicket
     * @param fechaHoraF
     * @param fechaHoraT
     * @param precio
     * @param funcion
     * 
     */
    public Compra(Integer nroTicket, LocalDateTime fechaHoraF, LocalDateTime fechaHoraT, BigDecimal precio, Funcion funcion){
        super(fechaHoraF, fechaHoraT, precio, funcion);
        this.nroTicket=nroTicket;
    }
    /** Chequea si la reserva esta anulada
     * 
     * @return devuelve verdadero si el valor de nroReserva es negativo
     */
    @Override
    public boolean estaAnulada() {
        return nroTicket<0;
    }
    
    @Override
    public String toString() {
        String salida = " ";
        salida += "Nro de ticket: "+nroTicket.toString()+".";
        salida += "Fecha y hora de compra: "+fechaHoraVenta.toString()+".";
        salida += "Pelicula: "+ funcion.getPelicula().getNombre()+".";
        salida += "Fecha y hora de la funcion: "+fechaHoraFuncion.toString()+"Hs.";
        salida += "Precio cobradio "+precioCobrado.toString()+".";
        return salida;
    }
}