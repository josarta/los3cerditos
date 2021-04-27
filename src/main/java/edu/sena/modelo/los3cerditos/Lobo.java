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
public class Lobo extends Animal {

    private String fuerza;

    public Lobo() {
    }

    public Lobo(String fuerza) {
        this.fuerza = fuerza;
    }

    public Lobo(String personalidad, String fuerza) {
        super.setPersonalidad(personalidad);
        this.fuerza = fuerza;
    }

    public String soplar(Cerdo cerdo) {
        return "Sopla ZZZZZ la casa de " + cerdo.getCasa().getMaterial() + " siendo el dueño " + cerdo.getNombre();
    }

    public  String empujar(Cerdo cerdo){
        return "El lobo con su fuerza : " +this.fuerza +" empuja la puerta de la casa de " +cerdo.getCasa().getMaterial() + "Con una resistenacia " + cerdo.getCasa().getResistencia();
    }
        
    public String enganar(Cerdo cerdo){
       return "Engañando -> " + cerdo.getNombre() + " Que toca el instrumento "+ cerdo.getInstrumento();
    }

    public String getFuerza() {
        return fuerza;
    }

    public void setFuerza(String fuerza) {
        this.fuerza = fuerza;
    }

}
