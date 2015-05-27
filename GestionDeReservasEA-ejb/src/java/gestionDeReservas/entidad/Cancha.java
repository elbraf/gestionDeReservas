/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionDeReservas.entidad;

import java.io.Serializable;
        
public abstract class  Cancha {
    
    private Integer numero;
    private Integer largo;
    private Integer ancho;
    private Integer precio;
    private Complejo complejo;

    public  Cancha() {
    }
    
    public Cancha(Integer numero, Integer largo, Integer ancho, Integer precio, Complejo complejo) {
        this.numero = numero;
        this.largo = largo;
        this.ancho = ancho;
        
        this.precio = precio;
        this.complejo = complejo;
    }

   
    
    

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }


    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Complejo getComplejo() {
        return complejo;
    }

    public void setComplejo(Complejo complejo) {
        this.complejo = complejo;
    }
    
    
    @Override
    public String toString(){
        
        
        return ("Cancha numero: " + this.numero + "\n" + "Precio: " + precio +
                " Dimensiones: Largo: " + this.largo + " m. Ancho: " +
                 this.ancho + "m. ");
        
    }
    
}

