/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionDeReservas.entidad;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
public abstract class Reserva {
    
    protected Cancha cancha;
    protected Date fecha;
    protected Integer hora;
    protected boolean confirmada;
    protected List<ServicioExtra> extras;

    public  Reserva() {
    }

    
    public Reserva(Cancha cancha, Date Fecha, Integer hora, boolean confirmada) {
        this.cancha = cancha;
        this.fecha = Fecha;
        this.hora = hora;
        this.confirmada = confirmada;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date Fecha) {
        this.fecha = Fecha;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }
    
    

    public List<ServicioExtra> getExtras() {
        return extras;
    }
    
    abstract public double calcularPrecio();

    
    @Override
    public String toString(){
        return "Complejo: " + cancha.getComplejo().getNombre()
                + " Cancha: " + cancha.getNumero() + " Fecha: " + fecha +
                " Hora: " + hora + " Direccion: " 
                + cancha.getComplejo().getDireccion();
    }
  
}
    
    
    
    
    

