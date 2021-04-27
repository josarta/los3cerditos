/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.modelo.los3cerditos;

/**
 *
 * @author Josarta
 */
public class Animal {

    private String nombre;
    private String personalidad;
    private String vestimenta;

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public String getVestimenta() {
        return vestimenta;
    }

    public void setVestimenta(String vestimenta) {
        this.vestimenta = vestimenta;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", personalidad=" + personalidad + ", vestimenta=" + vestimenta + '}';
    }

    
    
}
