/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionDeReservas.entidad;


public class ReservaF5 extends Reserva {
    
   @Override
   public double calcularPrecio(){
       
       double precio = cancha.getPrecio();
       
       for(ServicioExtra extra : extras){
           
           precio += extra.getPrecio();
       }
       
       if(this.hora > cancha.getComplejo().getHorarioEspecial())
           precio += cancha.getComplejo().getCostoHorarioEspecial();
       
       
       
       return precio;
      
   }
  
    
}
