/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionDeReservas.entidad;

import java.io.Serializable;
import java.util.*;  

public class Complejo implements Serializable {
    
    private String nombre;
    private String direccion;
    private boolean vestuario;
    private boolean parrillero;
    private boolean estacionamiento;
    private Integer horaDeApertura;
    private Integer horaDeCierre;
    private List<Cancha> listaCanchas;
    private double costoHorarioEspecial;
    private double costoDiaEspecial;
    private double horarioEspecial;
    

    public Complejo(String nombre, String direccion, boolean vestuario, boolean parrillero, boolean estacionamiento, Integer horaDeApertura, Integer horaDeCierre, List<Cancha> listaCanchas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.vestuario = vestuario;
        this.parrillero = parrillero;
        this.estacionamiento = estacionamiento;
        this.horaDeApertura = horaDeApertura;
        this.horaDeCierre = horaDeCierre;
        this.listaCanchas = listaCanchas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isVestuario() {
        return vestuario;
    }

    public void setVestuario(boolean vestuario) {
        this.vestuario = vestuario;
    }

    public boolean isParrillero() {
        return parrillero;
    }

    public void setParrillero(boolean parrillero) {
        this.parrillero = parrillero;
    }

    public boolean isEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(boolean estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public Integer getHoraDeApertura() {
        return horaDeApertura;
    }

    public void setHoraDeApertura(Integer horaDeApertura) {
        this.horaDeApertura = horaDeApertura;
    }

    public Integer getHoraDeCierre() {
        return horaDeCierre;
    }

    public void setHoraDeCierre(Integer horaDeCierre) {
        this.horaDeCierre = horaDeCierre;
    }

    public List<Cancha> getListaCanchas() {
        return listaCanchas;
    }

    public double getCostoHorarioEspecial() {
        return costoHorarioEspecial;
    }

    public void setCostoHorarioEspecial(double costoHorarioEspecial) {
        this.costoHorarioEspecial = costoHorarioEspecial;
    }

    public double getCostoDiaEspecial() {
        return costoDiaEspecial;
    }

    public void setCostoDiaEspecial(double costoDiaEspecial) {
        this.costoDiaEspecial = costoDiaEspecial;
    }

    public double getHorarioEspecial() {
        return horarioEspecial;
    }

    public void setHorarioEspecial(double horarioEspecial) {
        this.horarioEspecial = horarioEspecial;
    }
    
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + " Direccion: " + direccion;
    }
  
    
    
    
    
}
