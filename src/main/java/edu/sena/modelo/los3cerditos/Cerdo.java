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
public class Cerdo extends Animal {

    private String instrumento;
    private Casa casa;

    public Cerdo() {
    }

    public Cerdo(String instrumento, Casa casa) {
        this.instrumento = instrumento;
        this.casa = casa;
    }

    public Cerdo(String nombre, String personalidad, String vestimenta, String instrumento) {
        super.setNombre(nombre);
        super.setPersonalidad(personalidad);
        super.setVestimenta(vestimenta);
        this.instrumento = instrumento;
    }

    public String tocarInstrumento() {
        return "El cerdo : " + super.getNombre() + " toca el instrumento : " + this.instrumento;
    }

    public String cantar() {
        return "Quiene le tema al lobo feroz cantado por " + super.getNombre() + " con su personalidad " + super.getPersonalidad();

    }

    public String bailar() {
        return "EL cerdo -> " + super.getNombre() + " baila " + super.getPersonalidad();
    }

    public String construir() {
        return super.getNombre() + " Construye una casa de " + this.casa.getMaterial() + ", Que tiene una resistencia : " + this.casa.getResistencia();
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

}
